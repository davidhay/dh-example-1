package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TimeController {
	
	@RequestMapping("/time")
	@ResponseBody
	public String showTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String time = sdf.format(new Date());
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("<meta http-equiv=\"refresh\" content=\"2\">");
		String msg = String.format("The time NOW is %s", time);
		sb.append(msg);
		return sb.toString();
	}

}
