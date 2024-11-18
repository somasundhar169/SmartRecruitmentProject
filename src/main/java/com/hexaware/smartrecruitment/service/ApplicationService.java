package com.hexaware.smartrecruitment.service;

import java.util.List;

import com.hexaware.smartrecruitment.entity.Application;

public interface ApplicationService {

	public Application submitApplication(Application application);
	public List<Application> getApplicationsByJobPostId(Long jobPostId);

}
