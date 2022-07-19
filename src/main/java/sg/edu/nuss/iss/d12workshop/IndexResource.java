package sg.edu.nuss.iss.d12workshop;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// create controller class
@Controller
// set the request mapping to the path, / for e.g localhost:8080/
@RequestMapping(path= {"/indexresource", "/indexresource.html"})
public class IndexResource {

    // 
    @GetMapping(produces = {"text/html"})
    public String index(Model model) {
        model.addAttribute("currTime", (new Date()).toString());
        Calendar cal = Calendar.getInstance();
        model.addAttribute("currHour", cal.get(Calendar.HOUR_OF_DAY));
        return "indexresource";
    }
    
}
