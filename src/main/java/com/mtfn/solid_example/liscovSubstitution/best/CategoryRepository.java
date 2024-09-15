package com.mtfn.solid_example.liscovSubstitution.best;

import com.mtfn.solid_example.liscovSubstitution.models.Category;

public class CategoryRepository extends BaseRepository<Category> {
    @Override
    protected Category create(Category entity) {
        return null;
    }

    @Override
    protected Category update(Category entity) {
        return null;
    }


    public void delete(Category category) {

    }
}