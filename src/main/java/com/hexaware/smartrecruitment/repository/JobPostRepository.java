package com.hexaware.smartrecruitment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.smartrecruitment.entity.JobPost;


public interface JobPostRepository extends JpaRepository<JobPost, Long> {
	List<JobPost> findByCategory(String category);
}
