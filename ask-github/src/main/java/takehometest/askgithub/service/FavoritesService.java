package takehometest.askgithub.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;

import takehometest.askgithub.models.FavoritesList;
import takehometest.askgithub.properties.ApiProperties;

@Service
public class FavoritesService {

	@Autowired
	private ApiProperties ap;
	@Autowired
	private RestTemplate restTemplate;

	public FavoritesList getFavorites(String githubUsername) {
		try {
			JsonNode node = restTemplate.getForObject(ap.getGithub().get("url"), JsonNode.class, githubUsername);
			List<String> favorites = new ArrayList<>();

			node.forEach(r -> {
				favorites.add(r.get("full_name").asText());
			});

			return new FavoritesList(githubUsername, favorites);
		} catch (RestClientException e) {
			throw e;
		}
	}
}
