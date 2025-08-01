class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) throw new IllegalArgumentException("Operation cannot be null");
        if (operation == "") throw new IllegalArgumentException("Operation cannot be empty");
        switch(operation){
            case "+":
                return operand1 + " " + operation + " " + operand2 + " = " + (operand1+operand2);
            case "*":
                return operand1 + " " + operation + " " + operand2 + " = " + (operand1*operand2);
            case "/":
                try{
                    int result = operand1/operand2;
                    return operand1 + " " + operation + " " + operand2 + " = " + result;
                }
                catch(Exception e){
                    throw new IllegalOperationException("Division by zero is not allowed",  e);
                }
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
    }
}
