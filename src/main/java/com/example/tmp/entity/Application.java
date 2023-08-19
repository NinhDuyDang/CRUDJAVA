package com.example.tmp.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Application implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Integer id;
    private String name;
    private  String image;
    private String os_type;
    private  String file_path;
    private float version;
    private float build_number;
    private String shortdescripti;
    private String descripti;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOs_type() {
        return os_type;
    }

    public void setOs_type(String os_type) {
        this.os_type = os_type;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    public float getBuild_number() {
        return build_number;
    }

    public void setBuild_number(float build_number) {
        this.build_number = build_number;
    }

    public String getShortdescripti() {
        return shortdescripti;
    }

    public void setShortdescripti(String shortdescripti) {
        this.shortdescripti = shortdescripti;
    }

    public String getDescripti() {
        return descripti;
    }

    public void setDescripti(String descripti) {
        this.descripti = descripti;
    }

    public void setApplicationCode(String toString) {
    }
}
