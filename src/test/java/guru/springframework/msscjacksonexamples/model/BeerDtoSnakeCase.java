package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@JsonTest
@ActiveProfiles("snake")
public class BeerDtoSnakeCase extends BaseTest{
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSnake() throws JsonProcessingException {
        BeerDto dto =getDto();
        String json = objectMapper.writeValueAsString(dto);
        System.out.println(json);
//{"id":"df7e3ba5-d6ab-45db-99d5-aba4159f8ef2","beer_name":"BeerName","beer_style":"Ale","upc":12344586,"price":12.99,"created_date":"2022-05-31T20:14:35.377225+02:00","last_updated_date":"2022-05-31T20:14:35.377973+02:00"}
    }
}
