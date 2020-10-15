package org.rrg.cl.copeuch.service;

import java.util.List;

import org.rrg.cl.copeuch.entities.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
