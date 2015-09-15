package com.neollie.springmvc.tutorial.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.neollie.springmvc.tutorial.domain.Car;

@Controller
@RequestMapping("/car")
public class CarController {
	
	@RequestMapping(value="/createCarForm.html", method=RequestMethod.GET)
	public ModelAndView getCreateCarForm() {
		return new ModelAndView("/car/CreateCarForm");
	}
	
	
	/**
	 * Shows binding of request params to object that is passed directly to the view
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView create(@RequestParam Map<String,String> params) {
		// bind request params to object 
		Car car = new Car();
		car.setCarModel(params.get("carModel"));
		car.setMaxSpeed(params.get("maxSpeed"));
		
		// Bind car object to view
		// Bindign works automatically because in view because we use property names exactly same as in Car class
		ModelAndView view = new ModelAndView("/car/CreateCarSuccess")
				.addObject("car", car);
		return view;
	}
	
	/**
	 * Show shortcut version of previous {@link #create(Map)} using @ModelAttribute .
	 * We don't need bind params to car instance, nor pass it to model as it IS model attribute.
	 * Spring extracts all request params and bind it to model 
	 */
	@RequestMapping(value="/create2", method = RequestMethod.POST)
	public ModelAndView create2(@ModelAttribute("car") Car car) {
		return new ModelAndView("/car/CreateCarSuccess");
	}
}
