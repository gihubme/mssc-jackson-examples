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
                "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":12344586,\"price\":\"12.99\",\"createdDate\":\"2022-06-01T17:+0200\",\"lastUpdatedDate\":\"2022-06-01T17:42:22.142708+02:00\",\"myLocalDate\":\"20220601\",\"beerId\":\"14ab81a7-f7f3-4db4-befd-b365d4480615\"}";
        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

//        with jsonFormatted and deserialiser dto:
//        BeerDto(id=14ab81a7-f7f3-4db4-befd-b365d4480615, beerName=BeerName, beerStyle=Ale, upc=12344586, price=12.99, createdDate=2022-06-01T15:00Z, lastUpdatedDate=2022-06-01T15:42:22.142708Z, myLocalDate=2022-06-01)
        System.out.println(dto);
    }
}
