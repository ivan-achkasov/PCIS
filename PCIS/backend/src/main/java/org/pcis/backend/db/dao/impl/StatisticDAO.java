package org.pcis.backend.db.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.pcis.backend.db.model.Enumenator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StatisticDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(readOnly = true)
	public List<?> testMethod() {
		Session session = sessionFactory.getCurrentSession();
		List<?> result = session.createCriteria(Enumenator.class).setProjection(
				Projections.projectionList().add(Projections.groupProperty("type")).add(Projections.max("value")))
				.list();
		return result;
	}
}
