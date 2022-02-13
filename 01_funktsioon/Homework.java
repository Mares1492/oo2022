import java.util.Scanner;

public class Homework {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number that you would like to convert to roman numerals: ");
        int userInput = input.nextInt();
        String output = String.format("%s in Roman numerals is: ", userInput);
        System.out.println(output + getRomanNumeral(userInput)); //vastus
    }
    public static String getRomanNumeral(int number) {
        char[] romanNumerals = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] arabicNumbers = {1, 5, 10, 50, 100, 500, 1000};
        int tempNumber = number; // number, mis muutub
        int romanNumeralsCounterInList = 0; //mitu rooma numbri läksid sisse
        char[] tempArr = new char[20];
        for (int arrPosition = 0; arrPosition < arabicNumbers.length; arrPosition++) {
            System.out.printf("At the moment array positions are %s %n", arrPosition);
            if (number == arabicNumbers[arrPosition]) {
                return romanNumerals[arrPosition] + "";
            } else if (tempNumber < arabicNumbers[arrPosition]) {
                int loopCounter = 0;
                while (tempNumber > 0 || loopCounter <= 3) {
                    if (tempNumber == 0) {
                        StringBuilder answer = new StringBuilder();
                        for (char numeral : tempArr) {
                            answer.append(numeral);
                        }
                        return answer.toString();
                    }
                    System.out.printf("Before the loop tempNumber is %s %n", tempNumber);
                    if (tempNumber > 0) {
                        while ((tempNumber - arabicNumbers[arrPosition - 1]) < 0) {
                            arrPosition -= 1;
                            loopCounter = 0;
                        }
                    }
                    if (arrPosition > 0) {
                        tempArr[romanNumeralsCounterInList] = romanNumerals[arrPosition - 1];
                        romanNumeralsCounterInList += 1;
                        tempNumber -= arabicNumbers[arrPosition - 1];
                    } else {
                        tempArr[romanNumeralsCounterInList] = romanNumerals[arrPosition];
                        romanNumeralsCounterInList += 1;
                        tempNumber -= arabicNumbers[arrPosition];
                    }

                    System.out.printf("After the loop tempNumber is %s %n", tempNumber);
                    loopCounter += 1;
                    System.out.printf("At the moment while is %s loops long %n", loopCounter);
                    System.out.println("At the moment tempArr contains: ");
                    for (int i = 0; i < tempArr.length; i++) {
                        System.out.println(tempArr[i]);
                    }
                }
                if (loopCounter >= 3) {
                    tempNumber = number;
                    for (int arrPositionForNeg = 0; arrPositionForNeg < arabicNumbers.length; arrPositionForNeg++) {
                        if (tempNumber < arabicNumbers[arrPositionForNeg]) {
                            char tempBiggy = romanNumerals[arrPositionForNeg];
                            return "Siin";
                        }
                    }
                }
            }
        }
        return  "Ooops, there is nothing to return";
    }

}


