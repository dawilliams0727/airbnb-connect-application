package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class ApiController {
    public ApiController() {
    }

    @RequestMapping(path="/api/hello", method = RequestMethod.GET)
    public ResponseEntity<String> sayHello(){
        ResponseEntity<String> hello = new ResponseEntity<>("Hello", HttpStatus.OK);
        return hello;
    }

    @RequestMapping(path="/api/projects", method = RequestMethod.GET)
    public ResponseEntity<List<Map<String, String>>> listProjects(){
        List<Map<String, String>> projects = new ArrayList<>();
        Map<String, String> project = new HashMap<>();
        project.put("name", "Project 1");
        project.put("description", "This was my first project");
        project.put("repoUrl",  "https://www.github.com/dawilliams0727");
        projects.add(project);

        project = new HashMap<>();
        project.put("name", "Project 2");
        project.put("description", "This was my second project");
        project.put("repoUrl",  "https://www.github.com/dawilliams0727");
        projects.add(project);

        project = new HashMap<>();
        project.put("name", "Project 3");
        project.put("description", "This was my third project");
        project.put("repoUrl",  "https://www.github.com/dawilliams0727");
        projects.add(project);

        project = new HashMap<>();
        project.put("name", "Project 4");
        project.put("description", "This was my fourth project");
        project.put("repoUrl",  "https://www.github.com/dawilliams0727");
        projects.add(project);


        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @RequestMapping(path="/api/about-me", method = RequestMethod.GET)
    public Map<String, String> aboutMe(){
        Map<String, String> aboutMe = new HashMap<>();
        aboutMe.put("name", "David Williams");
        aboutMe.put("age", "29");
        aboutMe.put("location", "Cleveland, Ohio");
        aboutMe.put("About Me", "Hi, I am an aspiring software developer. I wanted to create this web application to act" +
                "submission for the AirBnb Connect program. I hope this increases my chances!");

        return aboutMe;
    }

    @RequestMapping(path="/api/essays", method = RequestMethod.GET)
    public List<Map<String, String>> getEssays(){
        final String LOREM_IPSUM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris commodo, odio a " +
                "faucibus faucibus, justo diam pellentesque ligula, nec efficitur leo diam sit amet elit." +
                " Donec iaculis lectus ligula. Curabitur sed condimentum dolor. Pellentesque molestie posuere risus " +
                "accumsan vulputate. Fusce posuere, massa consectetur sagittis elementum, metus ex dapibus quam," +
                " at molestie nunc justo et elit. Nullam dignissim ligula ut pretium semper. Vivamus pharetra fringilla " +
                "ipsum. Fusce a sollicitudin elit. Cras tellus diam, venenatis eget nisl volutpat, imperdiet commodo" +
                " libero. Donec sit amet velit sollicitudin, molestie felis ut, aliquet magna.";

        List<Map<String, String>> essays = new ArrayList<>();
        Map<String, String> essay = new HashMap<>();
        essay.put("id", "1");
        essay.put("prompt", "Which Airbnb Core Value most resonates with your personal story and how does that make" +
                " you a unique addition to the company?");
        essay.put("response", LOREM_IPSUM);
        essays.add(essay);
        essay = new HashMap<>();
        essay.put("id", "2");
        essay.put("prompt", "How did you get interested in engineering and why did you choose this path? What impact " +
                "would this apprenticeship have on your future as a software engineer and how would you leverage this" +
                " opportunity to get there?");
        essay.put("response", LOREM_IPSUM);
        essays.add(essay);
        essay = new HashMap<>();
        essay.put("id", "3");
        essay.put("prompt", "What is one of the most challenging (personal or professional) things you worked on" +
                " or had to overcome?");
        essay.put("response", LOREM_IPSUM);
        essays.add(essay);

        return essays;
    }
}
