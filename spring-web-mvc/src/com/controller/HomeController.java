package com.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.attinad.service.MysqlConnection;

@Controller
public class HomeController {
	
	
	String status ;
	
	@RequestMapping(value="/temp/{value}",method = RequestMethod.GET)
	
	public String read_temp(@PathVariable("value") String value) throws SQLException{
		//logic 
		String v = value;
		System.out.println("value:"+value);
//		MysqlConnection obj = new MysqlConnection();
//		obj.insertTemptoDB();
//		obj.insertData(v);
		return "welcome";
		
		
	}

	@RequestMapping(value="/switch/{status}",method = RequestMethod.GET)
	public void switch_status(@PathVariable("status") String s) {
		//logic 
		status  = s;
		System.out.println("on/off:"+status);

		
	}

	@RequestMapping(value="/switchstatus",method = RequestMethod.GET)
	@ResponseBody
	public String switch_led() {
		//logic 
		System.out.println(status);
		return status;		
	}
	
	
//	@RequestMapping(value="/hooq")
//	public String ingestHooq(){
//		// business logic
//		System.out.println("hooq");
//		return "hooq";
//	}
//	
//	@RequestMapping(value="/erosnow")
//	public String ingestEros(){
//		// business logic
//		return "erosnow";
//	}
//	@RequestMapping(value="/youtube")
//	public String ingestYoutube(){
//		// business logic
//		return "youtube";
//	}	
//	@RequestMapping(value="/sony")
//	public String ingestSony(){
//		// business logic
//		return "sony";
//	}
//	@RequestMapping(value="/dailymotion")
//	public String ingestDailymotion(){
//		// business logic
//		return "dailymotion";
//	}
	
	
}
