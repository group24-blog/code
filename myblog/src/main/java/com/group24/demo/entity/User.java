package com.group24.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class User {

    private String name;
    @Id
    private int id;
    private String password;
    private String photo;
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

    public Date getTime() {
        return time;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
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
