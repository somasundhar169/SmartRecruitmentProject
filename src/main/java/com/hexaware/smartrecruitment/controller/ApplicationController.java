package com.hexaware.smartrecruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.smartrecruitment.entity.Application;
import com.hexaware.smartrecruitment.service.ApplicationService;
import com.hexaware.smartrecruitment.service.InterviewService;


@RestController
@RequestMapping("/api/application")
public class ApplicationController {

	@Autowired
    private ApplicationService applicationService;
 
    @PostMapping
    public ResponseEntity<Application> submitApplication(@RequestBody Application application) {
        return ResponseEntity.ok(applicationService.submitApplication(application));
    }
}
