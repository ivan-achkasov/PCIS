package org.pcis.backend.db.dao.impl;

import java.awt.List;
import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.pcis.backend.db.model.Client;
import org.pcis.backend.db.model.Enumenator;
import org.springframework.beans.factory.annotation.Autowired;


public class StatisticDAO {
	public HashMap<String, String> getMoreUsedSectorByEnumerators(){
		HashMap<String, String> result = new HashMap<String, String>();
		
		
		return result;
	}
	@Autowired
	private SessionFactory sessionFactory;
	
	public void testMethod(){
		Session session = sessionFactory.getCurrentSession();
		List result = (List) session.createCriteria(Enumenator.class)
                .setProjection(Projections.projectionList()
                        .add(Projections.groupProperty("type"))
                        .add(Projections.max("value"))
                        .add(Projections.min("value"))
                        .add(Projections.count("value"))           
                ).list();
		
	}
}
