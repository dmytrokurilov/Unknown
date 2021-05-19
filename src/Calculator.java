public class Calculator {

    public float executor () {
        Inputter inputter = new Inputter();
        System.out.println("Input first operand");
        float operand1 = inputter.inputOperand();
        System.out.println("Input operator");
        String operator = inputter.inputOperator();
        System.out.println("Input second operand");
        float operand2 = inputter.inputOperand();
        float result = equationSolution(operand1, operator, operand2);
        return result;
    }

    protected float equationSolution (float operand1, String operator, float operand2) {
        float result = 0;
        if (operator.equals("+")) {
            result =  addition(operand1, operand2);
        }
        else if (operator.equals("-")) {
            result =  subtraction(operand1, operand2);
        }
        else if (operator.equals("*")) {
            result =  multiply(operand1, operand2);
        }
        else if (operator.equals("/")) {
            result =  dividing(operand1, operand2);
        }
        return result;
    }

    protected float addition(float operand1, float operand2) {
        return operand1 + operand2;
    }

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
