package com.example.tmp.service.imp;


import com.example.tmp.entity.Application;
import com.example.tmp.repository.ApplicationRepo;
import com.example.tmp.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ApplicationImp implements ApplicationService {
    @Autowired
    private ApplicationRepo applicationRepo;
    public Application addApplication(Application application){

        return applicationRepo.save(application);
    }
    public List<Application> findAllApplication()
    {
        return applicationRepo.findAll();
    }
    public Application updateApplication(Application application){
        return applicationRepo.save(application);
    }
    public Optional<Application> findApplicationById(Integer id){
        return applicationRepo.findApplicationById(id);
    }
    public void deleteApplication(Integer id){
        applicationRepo.deleteById(id);
    }
}
