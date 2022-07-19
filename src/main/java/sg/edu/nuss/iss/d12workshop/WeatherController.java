package sg.edu.nuss.iss.d12workshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = {"/weather"})
public class WeatherController {
    
    // method for query string
    @GetMapping
    public String weather(
        @RequestParam(required = true) String city, 
        @RequestParam(name="units", defaultValue="kilometers") String units,
        Model model) {

        model.addAttribute("city", city);
        model.addAttribute("units", units);

        return "weather";
        
    }

}