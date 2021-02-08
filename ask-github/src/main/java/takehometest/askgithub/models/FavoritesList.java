package takehometest.askgithub.models;

import lombok.Value;

import java.util.List;

@Value
public class FavoritesList {
    String username;
    List<String> favorites;
}
