package com.group24.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@Data
public class Comment {
    @ManyToOne
    private Blog blog;
    private String commentContent;
    @Id
    private String commentId;
    private Date commentTime;
    @ManyToOne
    private User commentUser;

    public Blog getBlog() {
        return blog;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public String getCommentId() {
        return commentId;
    }

    public User getCommentUser() {
        return commentUser;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public void setCommentUser(User commentUser) {
        this.commentUser = commentUser;
    }
}
