package com.DevOpsTest.Test.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/")
    public String index() {
        return "이걸 바꾸기만해도? 빌드와 배포가 자동으로~?";
    }

    @PostMapping ("/")
    public String ind() {
        return "테스트";
    }

}
