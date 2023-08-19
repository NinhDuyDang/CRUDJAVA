package com.example.tmp.service;

import com.example.tmp.entity.Application;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ApplicationService {
    public Application addApplication(Application application);
    public List<Application> findAllApplication();
    public Application updateApplication(Application application);
    public Optional<Application> findApplicationById(Integer id);
    public void deleteApplication(Integer id);

}
