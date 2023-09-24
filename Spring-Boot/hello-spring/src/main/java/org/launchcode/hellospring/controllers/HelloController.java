package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("hello")
public class HelloController {
    //Route 1 for /hello
    /*@GetMapping("hello")
    public String hello(){
        return "Hello, Spring!";
    }*/

    //Route 2 for /hello/goodbye
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye, Spring!";
    }

    //Lives at /hello/hello
    //Handle request for /hello?name=LaunchCode
    @GetMapping("hello")
    public String helloWithParam(@RequestParam String name, Model model){
        String greet = "Hello, " + name + "!";
        model.addAttribute("greet", greet);
        return "hello";
    }

    //Handle request for /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPath(@PathVariable String name, Model model){
        String greet = "Hello, " + name + "!";
        model.addAttribute("greet", greet);
        return "hello";
    }

    // /hello/form
    @GetMapping("form")
    public String helloForm(){
        return "form";
    }


    @GetMapping("message")
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String language){
        if(name == null || name.isEmpty()){
            name = "World";
        }
        return createMessage(name, language);
    }

    public static String createMessage(String name, String language){
        if(language.equals("english")){
            return "Hello " + name + "!";
        }
        else if(language.equals("spanish")){
            return "Hola " + name + "!";
        }
        else if(language.equals("french")){
            return "Bonjour " + name + "!";
        }
        else if(language.equals("japanese")){
            return "Konnichiwa " + name + "!";
        }
        else {
            return "Hallo " + name + "!";
        }
    }

    //Exercises
    @GetMapping("exercise")
    @ResponseBody
    public String exerciseForm(){
        return "<html>" +
                "<body>" +
                "<form action='message'>" +
                "<input type='text' name='name'>" +
                "<select name='language' id='language-select'>" +
                "<option value=''>Please select an option</option>" +
                "<option value='english'>English</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='french'>French</option>" +
                "<option value='japanese'>Japanese</option>" +
                "<option value='dutch'>Dutch</option>" +
                "</select>"+
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names = new ArrayList<>();
        names.add("Lambert");
        names.add("Stephen");
        names.add("Adam");
        model.addAttribute("names", names);
        return "hello-list";
    }
}
