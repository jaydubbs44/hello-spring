package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller

public class SkillsController {
@GetMapping("")
@ResponseBody
    public String neutralPath(){
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2>Check out these skills!</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>TypeScript</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
  @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="skills")
    @ResponseBody
    public String helloForm(@RequestParam String name, @RequestParam String First,
                            @RequestParam String Second, @RequestParam String Third){
      return "<html>" +
              "<body>" +
              "<h1>Hello, "+ name + "</h1>" +
              "<h2>Your favorite skills:</h2>" +
              "<ol>" +
              "<li>"+First+"</li>" +
              "<li>"+Second+"</li>" +
              "<li>"+Third+"</li>" +
              "</ol>" +
              "</body>" +
              "</html>";
    }


    @GetMapping("form")
    @ResponseBody
    public String skillsForm(){
            return "<html>" +
                    "<body>" +
                    "<form action='skills' method='post'>" +
                    "<p>Name: </p><input type='text' name='name'>" +
                    "<br><br>"+
                    "<label>Choose your favorite coding language:</label>" +
                    "<select name='First'>" +
                    "<option value='java'>Java</option>" +
                    "<option value='javascript'>JavaScript</option>" +
                    "<option value='type'>TypeScript</option>" +
                    "</select>" +
                    "<br><br>"+
                    "<br><br>"+
                    "<label>Choose your second favorite coding language:</label>" +
                    "<select name='Second'>" +
                    "<option value='java'>Java</option>" +
                    "<option value='javascript'>JavaScript</option>" +
                    "<option value='type'>TypeScript</option>" +
                    "</select>" +
                    "<br><br>"+
                    "<br><br>"+
                    "<label>Choose your third favorite coding language:</label>" +
                    "<select name='Third'>" +
                    "<option value='java'>Java</option>" +
                    "<option value='javascript'>JavaScript</option>" +
                    "<option value='type'>TypeScript</option>" +
                    "</select>" +
                    "<br><br>"+
                    "<input type='submit' value='Submit!'>"+
                    "</form>" +
                    "</body>" +
                    "</html>";
    }

}
