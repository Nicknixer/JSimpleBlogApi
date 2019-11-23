package blog.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error")
public class AppErrorController implements ErrorController {

    private final static String ERROR_PATH = "/error";

    @GetMapping()
    public String error() {
        return "Error";
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
