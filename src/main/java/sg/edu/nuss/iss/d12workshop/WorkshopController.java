package sg.edu.nuss.iss.d12workshop;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WorkshopController {

    //@GetMapping(produces = {"text/html"})
    @RequestMapping(path = {"/workshop"})
    public String generator(Model model) {
        return "workshop";
    }

    @RequestMapping(path = {"/processNumber"})
    public String testResults(
            @RequestParam(name="inputNumber", defaultValue = "1") Integer unit,
            Model model) {
        
        List<Integer> listInt = new LinkedList<>();
        int loopValue = Integer.parseInt(unit.toString());

        int loop = 1;
        while (loop <= loopValue) {
            int result = (int) ((Math.random() * loopValue + 1));

            if (!listInt.contains(Integer.valueOf(result))) {
                listInt.add(Integer.valueOf(result));
                loop++;
            }
               
        }

        for (int i = 0; i < listInt.size(); i++) {
            System.out.println(listInt.get(i));
        }

        // inject data into the page
        model.addAttribute("numbers", listInt);

        // inject into a new html page
        return "workshopresult";
    }

}

