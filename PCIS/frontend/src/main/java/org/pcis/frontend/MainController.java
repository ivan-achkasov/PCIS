package org.pcis.frontend;

import java.util.List;

import org.pcis.backend.db.dao.impl.StatisticDAO;
import org.pcis.backend.db.model.TradePoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class MainController {
	
	@Autowired
	StatisticDAO dao;
	
	@RequestMapping("/test")
	public ModelAndView test(){
		List<?> list = dao.testMethod();
		return new ModelAndView("test", "List", list);
	}
	
	@RequestMapping("/home")
	public String homePage(){
		return "adminHome";
	}
	
	@RequestMapping("/getIncomeInfoByTradePoint")
	public ModelAndView getMaxIncomeByTradePointPage(){
		List<?> list = dao.getIncomeInfoByTradePoint();
		return new ModelAndView("getIncomeInfoByTradePoint", "List", list);
	}
	
	@RequestMapping("/getAllInfo")
	public ModelAndView getAllInfo(){
		List<TradePoint> list = dao.getAllTradePoint();
		return new ModelAndView("getAllInfo", "List", list);
	}
}
