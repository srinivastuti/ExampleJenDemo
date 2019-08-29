package com.demo.sprjen.springjenexm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoJenController {
	@RequestMapping("/check")
	public String getMemo()
	{
		return "Chekcing jenkins";
	}

}
