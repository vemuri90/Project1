package com.tprojects.project1.models.email;

/**
 * Enum provides email addresses to be used for sending emails.
 */
public enum SystemEmailAddrs {

    HOURLY_NOTIFICATION("notification@yourdomain.com"),
    REGISTRATION_SUCCESS("welcome@yourdomain.com")
    ;

    String email;

    SystemEmailAddrs(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
