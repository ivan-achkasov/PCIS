package org.pcis.frontend;

import java.util.List;

import org.pcis.backend.db.dao.impl.StatisticDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@Autowired
	StatisticDAO dao;
	
	@RequestMapping("/")
	public ModelAndView test(){
		List<?> list = dao.testMethod();
		return new ModelAndView("test", "List", list);
	}
}
