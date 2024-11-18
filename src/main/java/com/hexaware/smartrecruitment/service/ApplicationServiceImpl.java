package com.hexaware.smartrecruitment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.smartrecruitment.entity.Application;
import com.hexaware.smartrecruitment.repository.ApplicationRepository;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
    private ApplicationRepository applicationRepository;
 
    public Application submitApplication(Application application) {
        return applicationRepository.save(application);
    }
 
    public List<Application> getApplicationsByJobPostId(Long jobPostId) {
        return applicationRepository.findByJobPostId(jobPostId);
    }

}
