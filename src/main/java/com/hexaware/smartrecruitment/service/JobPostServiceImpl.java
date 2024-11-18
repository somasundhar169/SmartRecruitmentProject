package com.hexaware.smartrecruitment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.smartrecruitment.entity.JobPost;
import com.hexaware.smartrecruitment.repository.JobPostRepository;

@Service
public class JobPostServiceImpl implements JobPostService {

	@Autowired
    private JobPostRepository jobPostRepository;
 
    public JobPost createJobPost(JobPost jobPost) {
        return jobPostRepository.save(jobPost);
    }
 
    public List<JobPost> getJobPostsByCategory(String category) {
        return jobPostRepository.findByCategory(category);
    }
    
}
