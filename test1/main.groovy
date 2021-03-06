@Grab(group='org.springframework.boot', module='spring-boot-starter-web', version='1.3.3.RELEASE')
import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.stereotype.*
import org.springframework.web.bind.annotation.*

@Controller
// @SpringBootApplication
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
		   

    public static void main(String[] args) throws Exception {
            SpringApplication.run(SampleController.class, args);
    }
}