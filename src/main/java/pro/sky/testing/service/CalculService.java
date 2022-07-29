package pro.sky.testing.service;

import org.springframework.stereotype.Service;
import pro.sky.testing.exeption.ZeroExeption;

@Service
public class CalculService implements CalculatorService{
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }

    public Integer plus(Integer num1, Integer num2) {
        return num1+num2;
    }

    public Integer minus(Integer num1, Integer num2) {
        return num1-num2;
    }
    public Integer multiply(Integer num1, Integer num2) {
        return num1*num2;
    }

    public Integer divide(Integer num1, Integer num2) {
        if(num2 == 0){
            throw  new ZeroExeption();
        }
        return num1/num2;
    }

}