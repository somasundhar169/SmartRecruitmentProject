package com.hexaware.smartrecruitment.service;

import java.util.List;

import com.hexaware.smartrecruitment.entity.Application;
import com.hexaware.smartrecruitment.entity.Interview;

public interface InterviewService {

	public Interview scheduleInterview(Interview interview);
	public List<Interview> getInterviewsByApplicationId(Long applicationId);

}
