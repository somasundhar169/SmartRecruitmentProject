package com.hexaware.smartrecruitment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.smartrecruitment.entity.Application;
import com.hexaware.smartrecruitment.entity.Interview;

public interface InterviewRepository extends JpaRepository<Interview,Long > {
	List<Interview> findByApplicationId(Long applicationId);
}
