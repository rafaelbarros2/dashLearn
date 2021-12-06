package com.devsuperior.dslearnbds.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
public class Content extends Lesson{

    private String textContent;
    private String videoUri;

    public Content() {
    }


    public Content(String textContent, String videoUri) {
        this.textContent = textContent;
        this.videoUri = videoUri;
    }

    public Content(Long id, String title, Integer position, Section section, String textContent, String videoUri) {
        super(id, title, position, section);
        this.textContent = textContent;
        this.videoUri = videoUri;
    }

    public String getTestContent() {
        return textContent;
    }

    public void setTestContent(String testContent) {
        this.textContent = testContent;
    }

    public String getVideoUri() {
        return videoUri;
    }

    public void setVideoUri(String videoUri) {
        this.videoUri = videoUri;
    }
}
