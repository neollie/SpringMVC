package com.neollie.springmvc.tutorial.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.neollie.springmvc.tutorial.domain.Car;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/get")
	ModelAndView get() {
		ModelAndView view = new ModelAndView("UserViewPage");
		HashMap<String, String> user = new HashMap<>();
		user.put("name", "dzejn doe");
		user.put("age", "32 unfortunately :(");
		user.put("about", "programme");
		view.addAllObjects(user);
		return view;
	}

	@RequestMapping("/put/{name}/{age}/{about}")
	ModelAndView put(@PathVariable("name") String name, @PathVariable("age") String age,
			@PathVariable("about") String about) {
		ModelAndView view = new ModelAndView("UserViewPage");
		HashMap<String, String> user = new HashMap<>();
		user.put("name", name);
		user.put("age", age);
		user.put("about", about);
		view.addAllObjects(user);
		return view;
	}

	/**
	 * Showing same example as {@see UserController#put(String, String, String)
	 * using map. In order to use @PathVariable with map you have to add
	 * <mvc:annotation-driven/> to dispatcher configuration.
	 * 
	 * @param pathVars
	 * @return
	 */
	@RequestMapping("/put2/{name}/{age}/{about}")
	ModelAndView put2(@PathVariable Map<String, String> pathVars) {
		ModelAndView view = new ModelAndView("UserViewPage");
		HashMap<String, String> user = new HashMap<>();
		user.put("name", pathVars.get("name"));
		user.put("age", pathVars.get("age"));
		user.put("about", pathVars.get("about"));
		view.addAllObjects(user);
		return view;
	}

	/**
	 * Shows how to write and handle an html form in a spring MVC application. In
	 * addition to @RequestParam annotation in detail.
	 * 
	 * @return
	 */
	@RequestMapping(value = "/createUserForm.html", method = RequestMethod.GET)
	public ModelAndView getCreateForm() {
		return new ModelAndView("CreateUserForm");
	}

	@RequestMapping(value = "/put3", method = RequestMethod.POST)
	public ModelAndView put3(@RequestParam("name") String name) {
		return new ModelAndView("CreateUserSuccess").addObject("name", name);
	}
	
	/**
	 * Show that we can also accept RequestParam s at once.
	 */
	@RequestMapping(value = "/put4", method = RequestMethod.POST)
	public ModelAndView put4(@RequestParam Map<String,String> params) {
		return new ModelAndView("CreateUserSuccess").addObject("name", params.get("name"));
	}
	

}
