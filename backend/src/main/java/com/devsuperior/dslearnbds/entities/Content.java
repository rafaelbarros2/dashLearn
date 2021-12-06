package com.devsuperior.dslearnbds.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
public class Content extends Lesson{

    private String testContent;
    private String videoUri;

    public Content() {
    }


    public Content(String testContent, String videoUri) {
        this.testContent = testContent;
        this.videoUri = videoUri;
    }

    public Content(Long id, String title, Integer position, Section section, String testContent, String videoUri) {
        super(id, title, position, section);
        this.testContent = testContent;
        this.videoUri = videoUri;
    }

    public String getTestContent() {
        return testContent;
    }

    public void setTestContent(String testContent) {
        this.testContent = testContent;
    }

    public String getVideoUri() {
        return videoUri;
    }

    public void setVideoUri(String videoUri) {
        this.videoUri = videoUri;
    }
}
