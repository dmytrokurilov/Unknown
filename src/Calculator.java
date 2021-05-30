import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.pattern.NotANumber;


public class Calculator {

    private static final Logger log = LogManager.getLogger();

    public float executor () throws IOException {
        Inputter inputter = new Inputter();
        System.out.println("Input first operand");
        Float operand1 = inputter.inputOperand();
        log.info("executor(): " + "first operand typed by user: " + operand1);
        System.out.println("Input operator");
        String operator = inputter.inputOperator();
        log.info("executor(): " + "operator typed by user: " + operator);
        System.out.println("Input second operand");
        float operand2 = inputter.inputOperand();
        log.info("executor(): " + "second operand typed by user: " + operand2);
        float result = equationSolution(operand1, operator, operand2);
        return result;
    }

    protected float equationSolution (float operand1, String operator, float operand2) throws IOException {

        float result = 0;
        if (operator.equals("+")) {
            result = addition(operand1, operand2);
            log.info("equationSolution() " + "addition started successfully " + operand1 + " + " + operand2 + " = " + result);
        }
        else if (operator.equals("-")) {
            result = subtraction(operand1, operand2);
            log.info("equationSolution() " + "subtraction started successfully " + operand1 + " - " + operand2 + " = " + result);
        }
        else if (operator.equals("*")) {
            result = multiply(operand1, operand2);
            log.info("equationSolution() " + "multiplication started successfully " + operand1 + " * " + operand2 + " = " + result);
        }
        else if (operator.equals("/")) {
            result = dividing(operand1, operand2);
            log.info("equationSolution() " + "dividing started successfully " + operand1 + " / " + operand2 + " = " + result);
        }
        else {
            log.error("invalid operator typed by user: " + operator);
        }
        if (operator.equals("/") && operand2 == 0) {
            log.error("user tried dividing by zero");
        }


        return result;


    }

    protected float addition(float operand1, float operand2) { return operand1 + operand2; }

    protected float subtraction(float operand1, float operand2) {
        return operand1 - operand2;
    }

    protected float multiply(float operand1, float operand2) {
        return operand1 * operand2;
    }

    protected float dividing(float operand1, float operand2) {
        return operand1 / operand2;
    }
}
