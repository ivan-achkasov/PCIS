package org.pcis.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

  @RequestMapping("/home")
  public ModelAndView homePage() {
    return new ModelAndView("admin/homeAdmin", "name", "Your name");
  }
}
