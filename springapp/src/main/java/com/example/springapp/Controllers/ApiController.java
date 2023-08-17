}
public class ApiController {
    @GetMapping("/welcome")
    public String Display()
    {
        return "Welcome";
    }
}
