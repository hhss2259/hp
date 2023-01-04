package clonecodinghs.hp.controller;


import clonecodinghs.hp.dto.DefaultRes;
import clonecodinghs.hp.dto.StatusCode;
import clonecodinghs.hp.dto.Validation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoinController {

    @GetMapping("/api/idCheck/{id}")
    public ResponseEntity idCheck(@PathVariable String id) {
        return new ResponseEntity(DefaultRes.res(StatusCode.forbidden, "아이디 중복체크 실패",new Validation(false)), HttpStatus.FORBIDDEN);
    }
}
