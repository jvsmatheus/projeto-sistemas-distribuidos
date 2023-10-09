package edu.sistemasdistribuidos.projeto;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.sistemasdistribuidos.projeto.controllers.UserController;
import edu.sistemasdistribuidos.projeto.models.User;
import edu.sistemasdistribuidos.projeto.utils.JsonManipulation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static edu.sistemasdistribuidos.projeto.utils.JsonManipulation.*;

import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class ProjetoApplication {
	public static void main(String[] args) throws JsonProcessingException {
		ConfigurableApplicationContext context = SpringApplication.run(ProjetoApplication.class, args);
		UserController userController = context.getBean(UserController.class);
		JsonManipulation jsonManipulation = new JsonManipulation();

//		Optional<User> user = userController.findById(UUID.fromString("5b00ccfe-e1e5-40c6-8cfb-466b42a8131a"));
////		System.out.println(user);
//		String json = jsonManipulation.javaToJson(user);
//		System.out.println(json);
//		final var objectMapper = new ObjectMapper();
//		final var json = objectMapper.writeValueAsString(users);
//		System.out.println(json);
//		json.lines().filter();
////		JsonNode rootNode = objectMapper.readTree(json);
////
////		if (rootNode.isObject()) {
////			Map<String, Object> map = objectMapper.convertValue(rootNode, Map.class);
////			for (Map.Entry<String, Object> entry : map.entrySet()) {
////				System.out.println(entry.getKey() + " = " + entry.getValue());
////			}
////		} else if (rootNode.isArray()) {
////			List<Map<String, Object>> listOfMaps = objectMapper.convertValue(rootNode, new TypeReference<List<Map<String, Object>>>() {});
////
////			for (Map<String, Object> list : listOfMaps) {
////				System.out.println(list);
////			}
////		}

	}
}

