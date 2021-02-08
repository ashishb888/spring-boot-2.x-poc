package takehometest.askgithub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import takehometest.askgithub.models.FavoritesList;
import takehometest.askgithub.service.FavoritesService;

@RestController
public class FavoritesController {

	@Autowired
	private FavoritesService favoritesService;

	@GetMapping("/favorites/{githubUsername}")
	public ResponseEntity<FavoritesList> getFavorites(@PathVariable("githubUsername") String githubUsername) {
		return ResponseEntity.ok(favoritesService.getFavorites(githubUsername));
	}

}
