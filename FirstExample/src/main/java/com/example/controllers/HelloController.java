package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 1/11/2018.
 */
@Controller
public class HelloController {

	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "Hello World!";
	}

	@RequestMapping(method = RequestMethod.POST,path = "/user/{data}")
	@ResponseBody
	List<String> getValues(@RequestBody String results, @RequestParam String param,@PathVariable String data){

		List<String> values =new ArrayList<String>();
		values.add("abc");
		values.add("def");
		System.out.println("results is"+results+" parameter is "+param+" data is "+data);
		return values;
	}

}
