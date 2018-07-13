package com.tprojects.project1.models.view.user;

import com.tprojects.project1.models.user.Role;
import com.tprojects.project1.models.user.User;

import java.util.List;

/**
 * Public representation of User.
 */
public class UserView {

    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private Role roles;

    public UserView(User user) {
        username = user.getUsername();
        email = user.getEmail();
        firstName = user.getFirstName();
        lastName = user.getLastName();
        roles = user.getRoles();
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Role getRoles() {
        return roles;
    }
}
