package com.group24.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Blog {
    private String articalTitle;
    @ManyToOne
    private User articleUser;
    private String articleContent;
    @OneToMany
    private List<Comment> articleComment = new ArrayList<>();
    @Id
    private int articleId;
    private Date articleTime;

    public List<Comment> getArticleComment() {
        return articleComment;
    }

    public Date getArticleTime() {
        return articleTime;
    }

    public int getArticleId() {
        return articleId;
    }

    public String getArticalTitle() {
        return articalTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public User getArticleUser() {
        return articleUser;
    }

    public void setArticalTitle(String articalTitle) {
        this.articalTitle = articalTitle;
    }

    public void setArticleComment(ArrayList<Comment> articleComment) {
        this.articleComment = articleComment;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public void setArticleTime(Date articleTime) {
        this.articleTime = articleTime;
    }

    public void setArticleUser(User articleUser) {
        this.articleUser = articleUser;
    }
}
