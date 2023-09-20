package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
    //Route 1 for /hello
    /*@GetMapping("hello")
    public String hello(){
        return "Hello, Spring!";
    }*/

    //Route 2 for /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye, Spring!";
    }

    //Lives at /hello/hello
    //Handle request for /hello?name=LaunchCode
    @GetMapping("hello")
    public String helloWithParam(@RequestParam String name){
        return "Hello, " + name + "!";
    }

    //Handle request for /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPath(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    // /hello/form
    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello'>" + //submit to /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }


    @GetMapping("message")
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
}
