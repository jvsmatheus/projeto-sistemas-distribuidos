package edu.sistemasdistribuidos.projeto.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import edu.sistemasdistribuidos.projeto.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class JsonManipulation extends JsonSerializer<Optional<?>> {

    private ObjectMapper objectMapper = new ObjectMapper();

    @JsonSerialize(using = JsonManipulation.class)
    public String javaToJson(Object user) throws JsonProcessingException {
        return objectMapper.writeValueAsString(user);
    }

    public User jsonToJava(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, User.class);
    }

    public String jsonNode(String json) throws JsonProcessingException {
        JsonNode jsonNode = objectMapper.readTree(json);
        return jsonNode.get("id").asText();
    }

    @Override
    public void serialize(Optional<?> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {

    }
}
