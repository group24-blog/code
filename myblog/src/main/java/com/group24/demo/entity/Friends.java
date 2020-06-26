package com.group24.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Data
public class Friends {
    @Id
    private int friendId;
    @ManyToOne
    private User friendsUser;

    public int getFriendId() {
        return friendId;
    }

    public User getFriendsUser() {
        return friendsUser;
    }

    public void setFriendId(int friendId) {
        this.friendId = friendId;
    }

    public void setFriendsUser(User friendsUser) {
        this.friendsUser = friendsUser;
    }
}
