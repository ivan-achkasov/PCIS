package org.pcis.backend.db.dao;

import java.util.List;

public interface EntityDAO<T> {

  T getById(Long id);

  void add(T entity);

  T update(T entity);

  void delete(T entity);

  List<T> getAll();
}
