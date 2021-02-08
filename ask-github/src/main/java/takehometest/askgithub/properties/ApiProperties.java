package takehometest.askgithub.properties;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@ConfigurationProperties(prefix = "apis")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApiProperties {
	Map<String, String> github;
}
