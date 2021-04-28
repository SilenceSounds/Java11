/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import bean.Suma;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Xan-T
 */
@Controller
@RequestMapping("/view.htm")
public class ViewController {
    //Siempre string
    
    @RequestMapping(method = RequestMethod.POST)
    public String recibir(@RequestParam("n1") String Num1, @RequestParam("n2") String Num2, Model model){
        
        
        Suma suma = new Suma(Num1, Num2);
        model.addAttribute("suma", suma);
        return "resultado";
    }
}
