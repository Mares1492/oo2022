/*

See on demo, kus ma proovisin enda algoritmi. Töö on failis 'ArabicToRoman'!

 */
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
        int romanNumeralsInList = 0; //mitu rooma numbri läksid sisse
        char[] tempArr = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
        int loopCounter = 0;
        while (tempNumber > 0) {
            for (int arrPosition = arabicNumbers.length - 1 ; arrPosition >= 0 ; arrPosition--) {
                System.out.printf("At the moment array position is %s %n", arrPosition);
                int initPos = arrPosition;
                if (number == arabicNumbers[arrPosition]) {
                    return romanNumerals[arrPosition] + "";
                } else if (tempNumber < arabicNumbers[arrPosition]) {
                    loopCounter = 0;
                    while (tempNumber > 0 || loopCounter <= 3) {
                        if (tempNumber == 0) {
                            StringBuilder answer = new StringBuilder();
                            for (char numeral : tempArr) {
                                answer.append(numeral);
                            }
                            System.out.printf("At the moment while is %s loops long %n", loopCounter);
                            return answer.toString();
                        }
                        System.out.println("------------------------------------");
                        System.out.printf("Before the loop tempNumber is %s %n", tempNumber);
                        if (tempNumber > 0) {
                            while ((tempNumber - arabicNumbers[arrPosition - 1]) < 0) {
                                arrPosition -= 1;
                            }

                        }
                        if (arrPosition > 0) {
                            tempArr[romanNumeralsInList] = romanNumerals[arrPosition - 1];
                            romanNumeralsInList += 1;
                            tempNumber -= arabicNumbers[arrPosition - 1];
                        } else {
                            tempArr[romanNumeralsInList] = romanNumerals[arrPosition];
                            romanNumeralsInList += 1;
                            tempNumber -= arabicNumbers[arrPosition];
                        }

                        if (loopCounter > 3) {
                            System.out.printf("Roman numerals in answer(before format): %s %n", romanNumeralsInList);
                            System.out.printf("At the moment array position is %s %n", arrPosition);
                            System.out.printf("At the moment Initial position is %s %n", initPos);
                            tempArr[romanNumeralsInList-1] = ' ';
                            tempArr[romanNumeralsInList - 2] = ' ';
                            tempArr[romanNumeralsInList - 3] = ' ';
                            tempArr[romanNumeralsInList - 4] = romanNumerals[arrPosition+1];
                            tempArr[romanNumeralsInList - 5] = romanNumerals[arrPosition-1];
                            tempNumber += arabicNumbers[arrPosition+1] + arabicNumbers[arrPosition-1];
                            romanNumeralsInList = romanNumeralsInList - 3;
                            loopCounter = 0;
                            System.out.printf("Roman numerals in answer(after format): %s %n", romanNumeralsInList);
                        }
                        System.out.println("At the moment tempArr contains: ");
                        for (int i = 0; i < tempArr.length; i++) {
                            System.out.println(tempArr[i]);
                        }
                        System.out.printf("Roman numerals in answer: %s %n", romanNumeralsInList);
                        System.out.printf("After the loop tempNumber is %s %n", tempNumber);
                        loopCounter += 1;
                        System.out.printf("At the moment while is %s loops long %n", loopCounter);

                    }
                }
            }
        }
        return  "Ooops, there is nothing to return";
    }

}

