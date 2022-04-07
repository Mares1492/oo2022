package homework;

public class Main {
    public static void main(String[] args) {
        FictionBook crimeInLameHotel = new FictionBook("English",228,"Pulp fiction",7, "Mikes Wizzarr", "Crime in lame Hotel");
        crimeInLameHotel.giveInfo();

        Workbook mathWorkbook = new Workbook("English",108,"Math", 7, true);
        mathWorkbook.giveInfo();

        LanguageLearningTextbook estonianB2Textbook = new LanguageLearningTextbook("Estonian",342,"Estonian", 9, false, LevelOfLanguage.B2);
        estonianB2Textbook.giveInfo();

        LanguageLearningWorkbook estonianC1Workbook = new LanguageLearningWorkbook("Estonian",420,"Estonian",12,true, LevelOfLanguage.C1);
        estonianC1Workbook.giveInfo();

        ScienceBook rocketScience = new ScienceBook("Russian", 1984, "Rocket Science", 9001, "To the Moon!");
        rocketScience.giveInfo();

        SchoolBook computerScienceForBeginners = new SchoolBook("Mandarin",1331,"Computer Science",10);
        computerScienceForBeginners.giveInfo();

    }
}
