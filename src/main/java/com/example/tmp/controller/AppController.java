package com.example.tmp.controller;


import com.example.tmp.entity.Application;
import com.example.tmp.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/application")
public class AppController {
    @Autowired
    private ApplicationService applicationService;

    @GetMapping("/findAllApplication")
    public ResponseEntity<List<Application>> getAllApplication(){
        List<Application> applications = applicationService.findAllApplication();
        return  new ResponseEntity<>(applications, HttpStatus.OK);
    }
    @GetMapping("/findApplicationById/{id}")
    public Optional<Application> getApplication(@PathVariable("id") Integer id){
        Optional<Application> application = applicationService.findApplicationById(id);
        return application;
    }
    @PostMapping("/add")
    public ResponseEntity<Application> addEmployee(@RequestBody Application application) {
        Application newApplication = applicationService.addApplication(application);
        return new ResponseEntity<>(newApplication, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Application> updateEmployee(@PathVariable("id") Integer id, @RequestBody Application application) {
        Optional<Application> applicationEdit = applicationService.findApplicationById(id);
        if(applicationEdit.isPresent()){
            applicationEdit.get().setImage(application.getImage());
            applicationEdit.get().setName(application.getName());
            applicationEdit.get().setImage(application.getImage());
            applicationEdit.get().setOs_type(application.getOs_type());
            applicationEdit.get().setFile_path(application.getFile_path());
            applicationEdit.get().setVersion(application.getVersion());
            applicationEdit.get().setBuild_number(application.getBuild_number());
            applicationEdit.get().setShortdescripti(application.getShortdescripti());
            applicationEdit.get().setDescripti(application.getDescripti());
            Application updateApplication = applicationService.updateApplication(applicationEdit.get());
            return new ResponseEntity<>(updateApplication, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteApplication(@PathVariable("id") Integer id) {
        applicationService.deleteApplication(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
