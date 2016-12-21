package org.pcis.frontend;

import org.pcis.backend.db.dao.impl.StatisticDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/test")
	public void test(){
		StatisticDAO dao = new StatisticDAO();
		dao.testMethod();
	}
}
