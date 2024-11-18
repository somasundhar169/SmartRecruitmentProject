package com.hexaware.smartrecruitment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.smartrecruitment.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
	List<Application> findByJobPostId(Long jobPostId);
}
