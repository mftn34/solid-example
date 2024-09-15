package com.mtfn.solid_example.liscovSubstitution.best;

public abstract class BaseRepository<T> {

    protected abstract T create(T entity);

    protected abstract T update(T entity);
}