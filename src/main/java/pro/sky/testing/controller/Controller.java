package pro.sky.testing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.testing.service.CalculService;

@RestController
@RequestMapping(path = "/calculator")

public class Controller {
    private final CalculService calculService;

    public Controller(CalculService calculService){
        this.calculService = calculService;
    }

    @GetMapping()
    public String hello(){
        return calculService.hello();
    }
    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer num1,
                       @RequestParam(value = "num2", required = false) Integer num2
    ) {
        return generationMassage(num1,  num2, "+", calculService.plus(num1, num2));
    }
    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer num1,
                        @RequestParam(value = "num2", required = false) Integer num2
    ) {
        return generationMassage(num1,  num2, "-", calculService.minus(num1, num2));
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2
    ) {
        return generationMassage(num1,  num2, "*", calculService.multiply(num1, num2));
    }
    @GetMapping("/divide")
    public String divide(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2
    ) {
        return generationMassage(num1,  num2, "/", calculService.divide(num1, num2));
    }
    private String generationMassage(Integer num1, Integer num2, String operation, Integer result){
        return String.format("%d %s %d = %d", num1, operation, num2, result);
    }
}