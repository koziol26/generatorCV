package pl.akademiakodu.generatorCV.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.generatorCV.model.Person;

@Controller
public class PersonController {

    @GetMapping("/")
    public  String showFrom(ModelMap modelMap){
        modelMap.addAttribute("person", new Person() );
        return "homePage";
    }

}
