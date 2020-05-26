package com.ashsoft;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodByeController {
    @RequestMapping("/")
    public String sayGoodbye()
    {
    	return "GoodBye!";
    }
}
