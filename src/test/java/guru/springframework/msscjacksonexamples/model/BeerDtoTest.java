package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;


@JsonTest
class BeerDtoTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();
        String jsonStr = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonStr);
    }

    @Test
    void testDeserializeDto() throws IOException {
        String json =
                "{\"beerId\":\"bc7c07bb-a4fe-4abf-bc90-b3b25d1f2206\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":12344586,\"price\":12.99,\"createdDate\":\"2022-05-31T20:03:30.066722+02:00\",\"lastUpdatedDate\":\"2022-05-31T20:03:30.068245+02:00\"}";
        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

//        with jsonFormatted dto:
//        {"beerName":"BeerName","beerStyle":"Ale","upc":12344586,"price":"12.99","createdDate":"2022-06-01T17:+0200","lastUpdatedDate":"2022-06-01T17:31:25.391265+02:00","beerId":"cd655525-b5f0-4252-a367-c5a01d0297f3"}
        System.out.println(dto);
    }
}
