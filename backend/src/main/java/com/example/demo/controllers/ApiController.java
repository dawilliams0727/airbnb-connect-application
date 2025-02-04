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
        projects.add(project);
        project = new HashMap<>();
        project.put("name", "Project 2");
        project.put("description", "This was my second project");
        projects.add(project);
        project = new HashMap<>();
        project.put("name", "Project 3");
        project.put("description", "This was my third project");
        projects.add(project);
        project = new HashMap<>();
        project.put("name", "Project 4");
        project.put("description", "This was my fourth project");
        projects.add(project);


        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @RequestMapping(path="/api/about-me", method = RequestMethod.GET)
    public Map<String, String> aboutMe(){
        Map<String, String> aboutMe = new HashMap<>();
        aboutMe.put("name", "David Williams");
        aboutMe.put("age", "29");
        aboutMe.put("location", "Cleveland, Ohio");
        aboutMe.put("About Me", "Hi, I am an aspiring software developer. I wanted to create this web applicatin to act" +
                "submission for the AirBnb Connect program. I hope this increases my chances!");

        return aboutMe;
    }
}
