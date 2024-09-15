package com.mtfn.solid_example.liscovSubstitution.best;

import com.mtfn.solid_example.liscovSubstitution.models.User;

public class UserRepository extends BaseRepository<User> {
    @Override
    protected User create(User entity) {
        return null;
    }

    @Override
    protected User update(User entity) {
        return null;
    }

    public User getByEmail(String email) {
        return new User();
    }
}