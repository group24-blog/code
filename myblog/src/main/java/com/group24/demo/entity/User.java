package com.group24.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    private String account;
    private String sex;
    private String name;
    private String password;
    private String photo;
    private String introduction;
    private String email;
    @Temporal(TemporalType.DATE)
    private Date  time;
    @OneToMany(mappedBy = "articleUser")
    private List<Blog> blogs=new ArrayList<>();
    @OneToMany(mappedBy = "commentUser")
    private List<Comment> comments=new ArrayList<>();
    @OneToMany(mappedBy = "friendsUser")
    private List<Friends> friends=new ArrayList<>();

    public List<Blog> getBlogs() {
        return blogs;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Friends> getFriends() {
        return friends;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFriends(List<Friends> friends) {
        this.friends = friends;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
