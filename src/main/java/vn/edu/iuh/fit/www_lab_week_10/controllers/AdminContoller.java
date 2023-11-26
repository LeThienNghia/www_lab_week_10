package vn.edu.iuh.fit.www_lab_week_10.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminContoller {
    @GetMapping()
    public String admin(){
        return "this is admin area";
    }
}
