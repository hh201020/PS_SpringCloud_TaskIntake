package com.pluralsight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	@Autowired
	private TaskProcessor t;
	
	public @ResponseBody String launchTask(@RequestBody String s){
		t.publishRequest(s);
		System.out.println("request made");
		return "success";
	}
}
