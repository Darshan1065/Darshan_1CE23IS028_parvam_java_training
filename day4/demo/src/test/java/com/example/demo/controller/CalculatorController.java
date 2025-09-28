package com.example.demo.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    @PostMapping("/calculate")
    public String calculate(@RequestBody String jsonInput) {
        try {
            // Parse JSON input
            JSONObject jsonObject = new JSONObject(jsonInput);
            double num1 = jsonObject.getDouble("num1");
            double num2 = jsonObject.getDouble("num2");
            String operation = jsonObject.getString("operation");

            // Perform the operation
            double result;
            switch (operation.toLowerCase()) {
                case "add":
                    result = num1 + num2;
                    break;
                case "subtract":
                    result = num1 - num2;
                    break;
                case "multiply":
                    result = num1 * num2;
                    break;
                case "divide":
                    if (num2 == 0) {
                        return "Error: Division by zero is not allowed.";
                    }
                    result = num1 / num2;
                    break;
                default:
                    return "Error: Invalid operation. Use add, subtract, multiply, or divide.";
            }

            // Return the result as JSON
            JSONObject response = new JSONObject();
            response.put("num1", num1);
            response.put("num2", num2);
            response.put("operation", operation);
            response.put("result", result);

            return response.toString();

        } catch (Exception e) {
            return "Error: Invalid input format. Please provide valid JSON.";
        }
    }
}
