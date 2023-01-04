package clonecodinghs.hp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/api/hello")
    public String test() {
        return "과연 이것도 될까!!!";
    }

}
