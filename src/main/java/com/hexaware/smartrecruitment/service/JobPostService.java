package com.hexaware.smartrecruitment.service;

import java.util.List;

import com.hexaware.smartrecruitment.entity.JobPost;

public interface JobPostService {

	public JobPost createJobPost(JobPost jobPost);
	public List<JobPost> getJobPostsByCategory(String category);

}
