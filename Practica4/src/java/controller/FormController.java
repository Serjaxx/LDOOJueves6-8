package controller;

import modelo.Persona;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


public class FormController {    
    @RequestMapping(value="form.htm", method=RequestMethod.GET)
    public ModelAndView form(){
        return new ModelAndView("form", "command", new Persona());
    }
   
    @RequestMapping(value="form.htm",method=RequestMethod.POST)
    public String form(Persona per, ModelMap model){
        model.addAttribute("nombre", per.getNombre());
        model.addAttribute("apellidos", per.getApellidos());
        model.addAttribute("email", per.getEmail());
        model.addAttribute("password", per.getPassword());
        model.addAttribute("nacimiento", per.getNacimiento());
        return "exito";
    }
}
