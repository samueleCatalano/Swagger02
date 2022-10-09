package com.develhope.Swagger02.controller;


import com.develhope.Swagger02.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {


    @GetMapping("/")
    public String welcomeMathMsg(){
        return "Welcome math message";
    }

    @GetMapping(value = "/division-info")
    @ApiOperation(value = "The Division", notes = "Return what is a Division" )
    public ArithmeticOperation divisionInfo(ArithmeticOperation arithmeticOperation){
        return new ArithmeticOperation("Division",2,
                "Division is one of the four basic operations of arithmetic, the ways that numbers are combined to make new numbers. " +
                        "The other operations are addition, subtraction, and multiplication. ",
                new String[]{"Dividend - Dividend is the number that is to be divided by the divisor.",
                        "Divisor - The number by which the dividend is to be divided is called the divisor.",
                        "Quotient - The resultant of the division is called the quotient",
                        "Remainder - The number that is left after division is called the remainder."});
    }

    @GetMapping("/multiplication")
    @ApiOperation(value = "Multiplication", notes = "Return the value of the multiplication")
    public Integer doMultiplication(Integer firstNumber, Integer secondNumber) {
        firstNumber = 2;
        secondNumber = 4;
        return  firstNumber * secondNumber;
        }


    @GetMapping("/square/{n}")
    @ApiOperation(value = "Square", notes = "Return the square of the integer")
    public Integer doSquare(@PathVariable Integer n) {
        n = 2;
        return n * n;
    }
}

