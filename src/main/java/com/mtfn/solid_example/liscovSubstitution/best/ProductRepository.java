package com.mtfn.solid_example.liscovSubstitution.best;

import com.mtfn.solid_example.liscovSubstitution.models.Product;

public class ProductRepository extends BaseRepository<Product>{
    @Override
    protected Product create(Product entity) {
        return null;
    }

    @Override
    protected Product update(Product entity) {
        return null;
    }

    public void delete(Product product) {

    }
}