package item.controllers;

import item.domain.Dispenser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import item.service.DispenserService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class DispanserController {
    @Autowired
    DispenserService dispenserService;

    @RequestMapping(method = RequestMethod.GET)
    ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("dispensers", dispenserService.getDispanser());
        return modelAndView;
    }

    @RequestMapping(value = "dispenser", method = RequestMethod.POST, consumes = MediaType.ALL_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    ModelAndView addDispanser(
            @RequestParam  String pistol,
            @RequestParam  String engine,
            @RequestParam  String filter,
            @RequestParam  String stopPlug) throws Exception {
        ModelAndView modelAndView = new ModelAndView("index");
        try {
            Dispenser dispenser = new Dispenser();
            dispenser.setPistol(pistol);
            dispenser.setEngine(engine);
            dispenser.setFilter(filter);
            dispenser.setStopPlug(stopPlug);
        } catch (Exception ex) {
            modelAndView.addObject("message", "Failed to add dispenser: " + ex.getMessage());
        }
        modelAndView.addObject("dispensers", dispenserService.getDispanser());
        return modelAndView;
    }


}
