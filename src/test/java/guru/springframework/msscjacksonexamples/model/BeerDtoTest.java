package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@JsonTest
class BeerDtoTest extends BaseTest{

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto=getDto();
        String jsonStr = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonStr);
    }
    @Test
    void testDeserializeDto() throws IOException{
        String json="{\"id\":\"bc7c07bb-a4fe-4abf-bc90-b3b25d1f2206\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":12344586,\"price\":12.99,\"createdDate\":\"2022-05-31T20:03:30.066722+02:00\",\"lastUpdatedDate\":\"2022-05-31T20:03:30.068245+02:00\"}";
        BeerDto dto = objectMapper.readValue(json, BeerDto.class);
        System.out.println(dto);
    }
}
