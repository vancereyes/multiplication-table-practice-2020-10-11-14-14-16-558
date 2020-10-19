package com.tw;
public class MultiplicationTable {


    public String createMultiplicationTable(int firstNum, int secondNum) {
        boolean isValid = firstIsSmallerThanSecond(firstNum, secondNum);
        boolean inRange = inRange1To100(firstNum, secondNum);
        boolean isPassed = isValid && inRange;
        return printMultiplicationTable(firstNum, secondNum, isPassed);
    }
    public boolean inRange1To100 ( int firstNum, int secondNum){
        return (firstNum >= 1 && firstNum <= 1000) && (secondNum >= 1 && secondNum <= 1000);
    }

    public boolean firstIsSmallerThanSecond ( int firstNum, int secondNum){
        return (firstNum <= secondNum);
    }

    public String printMultiplicationTable(int firstNum, int secondNum, boolean isPassed) {
        if (isPassed) {
            String table = "";

            for (int a = firstNum; a <= secondNum; a++) {
                for (int b = firstNum; b <= a; b++) {
                    table += b + "*";
                    table += a + "=";
                    table += a * b;
                    if (a != b) {
                        table += "  ";
                    }
                }
                table += "\r\n";
            }
            return table.trim();
        }
        return null;
    }


}
