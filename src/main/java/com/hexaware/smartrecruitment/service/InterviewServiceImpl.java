package com.hexaware.smartrecruitment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.smartrecruitment.entity.Interview;
import com.hexaware.smartrecruitment.repository.InterviewRepository;

@Service
public class InterviewServiceImpl implements InterviewService {

	@Autowired
    private InterviewRepository interviewRepository;
 
    public Interview scheduleInterview(Interview interview) {
        return interviewRepository.save(interview);
    }
 
    public List<Interview> getInterviewsByApplicationId(Long applicationId) {
        return interviewRepository.findByApplicationId(applicationId);
    }
}
