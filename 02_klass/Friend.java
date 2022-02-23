public class Friend {

    public enum Attitude {
        Sad, Neutral, Happy,
    }

    int happiness = 100;
    String firstInput;
    String userName;
    Attitude attitude;
    int phrases = 0;

    public Friend(String userName,String userInput) {
        this.userName = userName;
        this.firstInput = userInput;
        this.attitude = Attitude.Happy;
        if (firstInput.equals("I like trains")) {
            System.out.println("I like turtles");
        }else if (firstInput.equals("I like turtles"))  {
            System.out.println("I like trains");
        }

    }
    public boolean phraseAnalyser(String userInput){
        boolean containsBad = false;
        if (userInput.equalsIgnoreCase("STATUS")){
            statusCheck();
            return true;
        }
        if (userInput.equalsIgnoreCase("NO") || userInput.equalsIgnoreCase("NOPE") || userInput.equalsIgnoreCase("BYE") || userInput.equalsIgnoreCase("GOODBYE")){
            System.out.println("Goodbye then :)");
            return false;
        }
        phrases += 1;
        String[] goodWords = {"achievement", "exciting", "meditative", "pleasant", "sensible", "adaptable", "flexible", "mediator", "positive", //77 atm
                "sensitive", "ambitious", "focused", "modest", "practical", "sincere", "balanced", "forgiving", "organized", "proactive", "skilled",
                "cheerful", "generous", "original", "productive", "solid", "consistent", "forgiving","genuine", "outgoing","mastered","nice", "professional", "sporty", "cooperative",
                "helpful", "particular", "quality", "thoughtful", "courageous", "insightful", "patient", "quick", "trustworthy", "curious", "interesting",
                "perceptive", "racy", "understanding", "devoted", "inventive", "personable", "responsible", "warm", "good", "cool", "pleasant", "glad",
                "acceptable", "excellent", "exceptional", "favorable", "great", "marvelous", "positive", "satisfactory", "satisfying", "superb",
                "valuable", "wonderful", "honest", "respectable", "able", "efficient", "proper", "reliable", "suitable", "talented"};
        String[] badWords = {"sad", "cold", "bored", "bad", "inactive","cruel","arrogant","cynical","inflexible", //77 atm
                "pessimistic", "thoughtless", "belligerent", "deceitful", "intolerant", "angry", "bewildered", "clumsy",
                "defeated", "embarrassed", "fierce", "transsexual", "trap","greed", "clumsy", "grumpy", "helpless", "jealous", "lazy", "mysterious",
                "nervous", "obnoxious", "panicky", "pitiful", "repulsive", "rude", "scary", "thoughtless", "uptight", "worried",
                "trouble","not", "blue", "brokenhearted", "cast down", "crestfallen", "dejected", "depressed", "despondent", "disconsolate",
                "doleful", "down", "downcast", "downhearted", "down in the mouth", "droopy", "forlorn", "gloomy", "glum", "hangdog",
                "heartbroken", "heartsick", "heartsore", "heavyhearted", "inconsolable", "joyless", "low", "melancholic",
                "melancholy", "miserable", "mournful", "saddened", "sorrowful", "sorry", "unhappy", "woebegone", "woeful", "wretched"};

        userInput = userInput.toLowerCase();
        for (int badWord = 0; badWord < badWords.length; badWord++) {
            if (userInput.contains(badWords[badWord])) {
                happiness -= 10;
                containsBad = true;
            }
            if(userInput.contains(goodWords[badWord])) {
                happiness += 10;
            }
        }
        if (userInput.contains("?") && !containsBad) {
            String[] questionAnswer = {"Dunno","You`re always right", "Not really", "No pain, no gain", "I donn`t really know",
                "Next time I will have an answer", "I guess so...","Yes, yes :)", "Sure", "Alright", "Yea", "Maybe" ,
                "Maybe yes, maybe no","Yes","Yes, yes, yes!", "No", "Brrr","Chills"};
        System.out.println(questionAnswer[randomizer(0,17)]);
        }else if(!containsBad){
            String[] answer = {"OK", "Got it", "Interesting", "I loved that one :)", "You're funny", "Maker is always like that(not really) ;)",
                "Not anymore", "So-so", "Keep it up", "Agreed", "Not really", "Good point", "I am the law, just so you know","Never settle"};
        System.out.println(answer[randomizer(0,12)]);
        }else{
            String[] meh = {"Meh", "Bruh", "Why?", "No way!", "****"};
            System.out.println(meh[randomizer(0,4)]);
        }
        if (phrases == 3) {
            phrases = 0;
            if(happiness > 90){
                attitude = Attitude.Happy;
                System.out.println("٩(◕‿◕｡)۶"); //maybe more variations
            }else if(happiness < 89 && happiness > 40){
                attitude = Attitude.Neutral;
                System.out.println("╮(︶︿︶)╭");
            }else if(happiness < 39 && happiness > 0){
                attitude = Attitude.Sad;
                System.out.println("(╯︵╰,)");
            }
            switch (happiness) {
                case 100:
                    System.out.println("What a nice day to chat :)");
                    break;
                case 90:
                    System.out.println("You`re cool)");
                    break;
                case 80:
                    System.out.println("What a good weather btw");
                case 70:
                    System.out.println("Peace friend!");
                    break;
                case 60:
                    System.out.println("So what plans you got anyway?");
                    break;
                case 50:
                    System.out.println("I think I am going to go soon");
                case 40:
                    System.out.println("Bruh");
                    break;
                case 30:
                    System.out.println("What a nice day to go and do something else");
                    break;
                case 20:
                    System.out.println("I think I will need some time alone");
                    break;
                case 10:
                    System.out.println("I am not in a mood right now");
                    break;
                case 0:
                    System.out.println("...");
                    return false;
            }
        }
        if (happiness < 0){
            System.out.println("-You`re-BAD---BAD---BAD---BAD--bye-");
            return false;
        } else {
            smallTalk();
            return true;
        }
    }

    public void smallTalk() {
        String[] commonPhrases = {"Beautiful day isn't it?", "Can you believe all of this rain we've been having?",
                "It looks like it's going to snow", "It sure would be nice to be in Hawaii right about now",
                "I hear they're calling for thunderstorms all weekend", "We couldn't ask for a nicer day, could we?",
                "How about this weather?", "Did you order this sunshine?", "Did you catch the news today?",
                "Do you have somebody?", "What do you think about this transit strike?",
                "I read in the paper today that 'winter is coming'.",
                "I heard on the radio today that they are finally going to start building the new bridge.",
                "How about those Narva-Trans? Do you think they're going to win anytime soon?",
                "How do you do?", "Have you ever tried the cabbage rolls?",
                "Are you enjoying yourself?", "It looks like you could use another drink ;)",
                "I am pretty nice, huh)?", "I love your eyes ;)", "How do you like the new park?",
                "Nice day to sit behind the computer isn't it?", "I didn't think it would be so busy today.",
                "You look like you've got your hands full", "It looks like we are going to be here a while, huh?",
                "How long have you been here anyway?"};


        // Mb add a method that checks if prog already printed something from the list
        System.out.println(commonPhrases[randomizer(0,24)]);
        String[] extraTopic = {"We can also discuss something else if you want ;)", "If it is ok to discuss that...",
                "Or you have another topic?","I hope you`re cool with that", "That should be a good topic)",
                "I hope you`re interested","Intriguing isn`t it(you don`t have to answer)?",
                "Any literature theme to discuss? I like Love, good versus evil, mortality. Xe-xe","BRB"};
        String extraRandom = extraTopic[randomizer(0,8)];
        System.out.println(extraRandom);
        if (extraRandom.equals("BRB")){
            System.out.println("*A few moments later*");
            System.out.println("I am back");
        }


    }
    public void statusCheck() {
        switch (attitude) {
            case Happy -> System.out.println("I am happy");
            case Neutral -> System.out.println("I am ok");
            case Sad -> System.out.println("Kinda bad right now");
        }
    }
    public int randomizer(int min, int max){
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }
}
