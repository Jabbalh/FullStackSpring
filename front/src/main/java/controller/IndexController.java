package controller;

import fr.Client;
import fr.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Nico on 09/02/2016.
 */
@Controller
public class IndexController {

    @Autowired
    private IClientService clientService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView model = new ModelAndView("index");
        model.addObject("message","Hello from full statck test application");
        return model;
    }


    @RequestMapping(method = RequestMethod.GET, path = "/log")
    public ModelAndView log(@RequestParam String login){
        ModelAndView model = new ModelAndView("client");
        Client client = clientService.getClient(login);
        model.addObject("client",client);

        return model;
    }

}
