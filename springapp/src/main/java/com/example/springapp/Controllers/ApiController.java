import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDay1App {
	@GetMapping("/welcome")
	public String Welcome()
	{
		return "Welcome";
	}
}
