package test.beom.beom;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CONT {

    @GetMapping("b")
    public String bbb(){
        return "범";
    }

    @GetMapping("/bup")
    public String btest(){
        return "version upgrade beom";
    }
}