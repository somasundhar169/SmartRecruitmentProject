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

import com.hexaware.smartrecruitment.entity.JobPost;
import com.hexaware.smartrecruitment.service.JobPostService;

@RestController
@RequestMapping("/api/job-post")
public class JobPostController {

	@Autowired
    private JobPostService jobPostService;
 
    @PostMapping
    public ResponseEntity<JobPost> createJobPost(@RequestBody JobPost jobPost) {
        return ResponseEntity.ok(jobPostService.createJobPost(jobPost));
    }
 
    @GetMapping("/category/{category}")
    public ResponseEntity<List<JobPost>> getJobPostsByCategory(@PathVariable String category) {
        return ResponseEntity.ok(jobPostService.getJobPostsByCategory(category));
    }
    
}
