package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String languageList() {
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Python</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String displayForm() {
        return "<html>" +
                    "<body>" +
                        "<form  method='post' action='listLanguages'>" +
                            "<label>Name:</label>" +
                            "<input type='text' name='name'><br>" +
                            "<label>My favorite language:</label>" +
                            "<select name='first'>" +
                                "<option>Java</option>" +
                                "<option>JavaScript</option>" +
                                "<option>Python</option>" +
                            "</select><br>" +
                            "<label>My second favorite language:</label>" +
                            "<select name='second'>" +
                                "<option>Java</option>" +
                                "<option>JavaScript</option>" +
                                "<option>Python</option>" +
                            "</select><br>" +
                            "<label>My third favorite language:</label>" +
                            "<select name='third'>" +
                                "<option>Java</option>" +
                                "<option>JavaScript</option>" +
                                "<option>Python</option>" +
                            "</select><br>" +
                            "<button type='submit'>Submit</button>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }
}
