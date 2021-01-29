package com.LMM.project.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller("boardController")
public class boardControllerImpl  implements boardController{

	//@Autowired
	
	
	private ModelAndView main(HttpServletRequest request, HttpServletResponse response)throws Exception {
	
		String viewName = (String)request.getAttribute("viewName");
		mav.setViewName(viewName);
	
		return mav;
	}
	
	
}
