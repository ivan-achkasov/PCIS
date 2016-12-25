package org.pcis.backend.db.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.iterators.ArrayListIterator;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.pcis.backend.db.model.Income;
import org.pcis.backend.db.model.TradePoint;
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
		List<?> result = session.createCriteria(Income.class).setProjection(Projections.projectionList()
				.add(Projections.groupProperty("tradePoint.id")).add(Projections.sum("value"))).list();
		return result;
	}

	@Transactional(readOnly = true)
	public List<?> getIncomeInfoByTradePoint() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Income.class);
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.groupProperty("tradePoint"));
		projectionList.add(Projections.max("value"));
		projectionList.add(Projections.min("value"));
		projectionList.add(Projections.sum("value"));
		projectionList.add(Projections.avg("value"));
		criteria.setProjection(projectionList);
		List<?> listIncomes = criteria.list();
		return listIncomes;
	}
	
	@Transactional(readOnly = true)
	public List<TradePoint> getAllTradePoint(){
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(TradePoint.class);
		List<TradePoint> listIncomes = criteria.list();
		Set<TradePoint> tmpSet = new HashSet<TradePoint>(listIncomes);
		listIncomes = new ArrayList<TradePoint>(tmpSet);
		Collections.sort(listIncomes, new Comparator<TradePoint>() {

			@Override
			public int compare(TradePoint o1, TradePoint o2) {
				return (int) (o1.getId() - o2.getId());
			}
		});
		return listIncomes;
	}
}
