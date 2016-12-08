package org.pcis.backend.db.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pcis.backend.db.dao.EntityDAO;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class EntityDAOImpl<T> implements EntityDAO<T> {

  @Autowired
  SessionFactory sessionFactory;

  public T getById(Long id) {
    return getSession().get(getGenericClass(), id);
  }

  public void add(T entity) {
    getSession().save(entity);
  }

  public T update(T entity) {
    // TODO Auto-generated method stub
    return null;
  }

  public void delete(T entity) {
    // TODO Auto-generated method stub

  }

  public List<T> getAll() {
    // TODO Auto-generated method stub
    return null;
  }

  protected Session getSession() {
    return sessionFactory.getCurrentSession();
  }

  private Class<? extends T> getGenericClass() {
    return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
  }

  protected Criteria getGenericCriteria() {
    return getSession().createCriteria(getGenericClass());
  }

}
