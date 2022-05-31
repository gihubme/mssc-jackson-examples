package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@JsonTest
@ActiveProfiles("kebab")
public class BeerDtoKebabCase extends BaseTest{
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testKebab() throws JsonProcessingException {
        BeerDto dto =getDto();
        String json = objectMapper.writeValueAsString(dto);
        System.out.println(json);
//{"id":"f2a4a8b7-af75-4721-ad6c-e618d9a88fb1","beer-name":"BeerName","beer-style":"Ale","upc":12344586,"price":12.99,"created-date":"2022-05-31T20:24:29.656573+02:00","last-updated-date":"2022-05-31T20:24:29.657432+02:00"}
    }
}
