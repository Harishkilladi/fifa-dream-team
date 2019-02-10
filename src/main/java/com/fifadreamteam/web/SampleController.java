package com.fifadreamteam.web;

import static com.fifadreamteam.config.APISecurityConfig.API_ROOT_PATH;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(API_ROOT_PATH + "/test")
public class SampleController {

    public ResponseEntity<?> testController() {
        return ResponseEntity.status(HttpStatus.OK).body("Test Working");
    }
}
