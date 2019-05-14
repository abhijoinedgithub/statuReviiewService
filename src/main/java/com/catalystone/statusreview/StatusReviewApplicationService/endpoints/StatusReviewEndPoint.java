package com.catalystone.statusreview.StatusReviewApplicationService.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusReviewEndPoint {

	@RequestMapping("/statusreview")
	public String getMessage() {
		return "Yes, it works!!!!";
	}
}
