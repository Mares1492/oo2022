
//Kodutöö | 18.02

import java.util.Scanner;

public class ArabicToRoman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number that you would like to convert to roman numerals(from 1 to 3999): ");
        /*int userInput = 9001;
        while (userInput > 4000 || userInput < 0) {
            userInput = input.nextInt();
            if (userInput > 4000 || userInput < 0){
                System.out.println("You have entered the wrong number, please try again");
            }
        }*/
        int[] testArr = {4,9,394,444,494,949,999,2497,3999};
        for (int userInput:testArr) {
            System.out.println("------------------------------------");
            System.out.printf("Converting %s into roman...%n" , userInput);
            String output = String.format("%s in Roman numerals is: ", userInput);
            System.out.println(output + getRomanNumeral(userInput)); //vastus
        }
    }

    public static String getRomanNumeral(int number) {
        if (number == 9001){
            return "It's over 9000!!!";
        }
        int tempNumber = number; // number, mis muutub
        char[] romanNumerals = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] arabicNumbers = {1, 5, 10, 50, 100, 500, 1000};
        int romanNumeralsInArr = 0; //mitu rooma numbri läks sisse
        char[] tempArr = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',' ', ' ', ' ', ' ', ' '};//Nii palju on vaja 3334 konverteerimiseks
        while(tempNumber > 0) { //igaks juhuks tehtud
            for (int arrPosition = arabicNumbers.length - 1; arrPosition >= 0; arrPosition--) {
                int loopCounter = 0;
                int levelNumber = tempNumber;
                while ((tempNumber - arabicNumbers[arrPosition]) >= 0) { //töötab nii palju, kui on võimalik, aga mitte rohkem, kui 4 korda
                    System.out.println("------------------------------------");
                    System.out.printf("Before the loop tempNumber is %s %n", tempNumber);
                    tempArr[romanNumeralsInArr] = romanNumerals[arrPosition];
                    romanNumeralsInArr += 1;
                    loopCounter += 1;
                    tempNumber -= arabicNumbers[arrPosition];
                    if (loopCounter > 3) {
                        System.out.printf("Roman numerals in tempArr(before format): %s %n", romanNumeralsInArr);
                        System.out.printf("At the moment numerals array index is %s %n", arrPosition);
                        System.out.printf("Before the formatting tempNumber is %s %n", tempNumber);
                        System.out.println("tempNumber before the loop was: " + levelNumber);
                        System.out.println("At the moment tempArr contains: ");
                        for (int i = 0; i < tempArr.length; i++) {
                            System.out.println(tempArr[i]);
                        }
                        tempArr[romanNumeralsInArr-1] = ' ';
                        tempArr[romanNumeralsInArr - 2] = ' ';
                        if (romanNumeralsInArr < 5  || (romanNumeralsInArr >= 5 && tempArr[romanNumeralsInArr - 5] != romanNumerals[arrPosition+1] )) { // Rooma numbrite spetsiifika
                            tempArr[romanNumeralsInArr - 3] = romanNumerals[arrPosition+1];
                            tempArr[romanNumeralsInArr - 4] = romanNumerals[arrPosition];
                            romanNumeralsInArr = romanNumeralsInArr - 2;
                        }else {
                            tempArr[romanNumeralsInArr - 3] = ' ';
                            tempArr[romanNumeralsInArr - 4] = romanNumerals[arrPosition + 2];
                            tempArr[romanNumeralsInArr - 5] = romanNumerals[arrPosition];
                            romanNumeralsInArr = romanNumeralsInArr - 3;
                        }

                        loopCounter = 0;
                        System.out.println("----------Formatting---------");
                        System.out.println();
                        System.out.printf("Roman numerals in tempArr(after format): %s %n", romanNumeralsInArr);
                    }
                    System.out.println("At the moment tempArr contains: ");
                    for (int i = 0; i < tempArr.length; i++) {
                        System.out.println(tempArr[i]);
                    }
                    System.out.printf("Roman numerals in tempArr: %s %n", romanNumeralsInArr);
                    System.out.printf("After the loop tempNumber is %s %n", tempNumber);
                }
            }
            if (tempNumber == 0) {
                System.out.printf("Roman numerals in the final array: %s %n", romanNumeralsInArr);
                StringBuilder answer = new StringBuilder();
                for (char numeral : tempArr) {
                    answer.append(numeral);
                }
                return answer.toString();
            }
        }
        return "Whoops";
    }
}

