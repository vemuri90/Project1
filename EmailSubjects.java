package com.tprojects.project1.models.email;

/**
 * Enum provides Email subjects template.
 */
public enum EmailSubjects {

    HOURLY_UPDATES("Your hourly update!"),
    REGISTRATION_SUCCESS("Registration Successful"),
    ;

    String subject;

    EmailSubjects(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
