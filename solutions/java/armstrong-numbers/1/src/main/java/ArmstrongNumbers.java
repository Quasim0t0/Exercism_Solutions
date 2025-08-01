class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        char[] digits=Integer.toString(numberToCheck).toCharArray();
        int number=0;
        for (char i : digits){
            number+= Math.pow(Integer.parseInt((String.valueOf(i))), digits.length);
        }
        return (number==numberToCheck) ? true : false;

    }

}