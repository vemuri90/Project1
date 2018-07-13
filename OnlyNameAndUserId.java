package com.tprojects.project1.repositories;

import com.tprojects.project1.models.user.User;

/**
 * Interface Used to do reflections on MetaData retrieval from database.
 */
public interface OnlyNameAndUserId {

    String getName();

    User getUser();
}
