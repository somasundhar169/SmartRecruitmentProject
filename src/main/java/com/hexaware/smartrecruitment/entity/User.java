package com.hexaware.smartrecruitment.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private Set<String> role; 
    @OneToMany(mappedBy = "user")
    private List<JobPost> jobPosts;
	
    public User(String username, String password, Set<String> role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}
    
    
    
    
}