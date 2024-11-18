package com.hexaware.smartrecruitment.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Application {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status; // Submitted, In Progress, Accepted, Rejected
    private String resumePath; // Path to stored resume
 
    @ManyToOne
    @JoinColumn(name = "job_post_id")
    private JobPost jobPost;
 
    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private User candidate;

}