package com.expo.gi.springgidemo.cor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@RequestMapping("/hai")
	public String getMessage()
	{
		return "Hai jenkins";
	}

}
