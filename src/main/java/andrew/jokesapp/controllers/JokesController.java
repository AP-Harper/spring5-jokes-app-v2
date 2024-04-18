package andrew.jokesapp.controllers;

import andrew.jokesapp.services.ChuckNorrisJokesImpl;
import andrew.jokesapp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class JokesController {

    private final JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;

    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("jokes", jokesService.getJoke());
        return  "index";
    }

}
