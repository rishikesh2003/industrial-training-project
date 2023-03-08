package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.ApiModel;

public interface ApiRepository extends JpaRepository<ApiModel, Integer>{

}
