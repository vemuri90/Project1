package com.tprojects.project1.models.email;

/**
 * Enum providing Email notification templates.
 */
public enum EmailMessages {

    NEW_ITEMS_IN_PAST_HOUR("Dear %s!, \nFollowing are the file names you uploaded in past hour %s"),
    ;

    String msg;

    EmailMessages(String msg) {
        this.msg = msg;
    }

    public String getMsg(String ...args) {
        return String.format(msg, args);
    }
}
