package com.stephanie.mycapec.models;

import java.util.Date;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import javax.xml.xpath.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="usecase-table")
public class UseCase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String content;

    private Date updated;

    private String mitigation;

    public UseCase() {
        super();
        // TODO Auto-generated constructor stub
    }

    public UseCase(String title, String content, Date updated, String mitigation) {
        super();
        this.title = title;
        this.content = content;
        this.updated = updated;
        this.mitigation = mitigation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMitigation() {

        return mitigation;
    }

    public void setMitigation(String mitigation) {

        this.mitigation = mitigation;

    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }


}
