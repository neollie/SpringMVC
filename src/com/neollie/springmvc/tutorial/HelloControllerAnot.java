package com.neollie.springmvc.tutorial;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Equivalent of {@see HelloController} using Spring MVC Anotations.
 * Benefits: <ul>
 * <li>We don't need to inherit (//TODO WHY?)</li>
 * <li>We dont need add mapping to dispatcher configuration ONLY if we use context:component-scan</li>
 * </ul>
 * 
 * @author dzejn
 *
 */
@Controller
public class HelloControllerAnot {

	@RequestMapping("/welcome2")
	ModelAndView hello() {
		ModelAndView view = new ModelAndView("HelloPage");
		view.addObject("welcomeMessage", "Hi, user, welocme to the first Spring MVC Application");
		return view;
	}
}
