public class Category {
    private String playerName;
    private int playerScore;
    private int questionIndex;

    public Category() {
    }

    public Category(String playerName, int playerScore, int questionIndex) {
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.questionIndex = questionIndex;
    }

    public void setPlayerName(String playerName) {// methodes, setters and getters
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;

    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setQuestion(int questionIndex) {
        this.questionIndex = questionIndex;
    }

    public int getQuestion() {
        return questionIndex;
    }

    public String[] Science() {

        String category;
        String question;
        String opA;
        String opB;
        String opC;

        switch (questionIndex) {
            case 1, 5:
                category = "Category: Technology and Science";
                question = "Q: What year was the very first model of the iPhone released?";
                opA = "A.2005";
                opB = "B.2007";
                opC = "C.2000";
                // B
                break;

            case 2, 6:
                category = "Category: Technology and Science";
                question = "Q: What is the chemical symbol for the element gold?";
                opA = "A.Au";
                opB = "B.Go";
                opC = "C.Ag";
                // A
                break;

            case 3, 7:
                category = "Category: Technology and Science";
                question = "Q: Which planet is the hottest in the solar system?";
                opA = "A.Venus";
                opB = "B.Earth";
                opC = "C.Mercury";
                // A
                break;

            case 4, 8:
                category = "Category: Technology and Science";
                question = "Q: What is the name for the dense, positively charged center of an atom?";
                opA = "A.Electron Cloud";
                opB = "B.Nucleus";
                opC = "C.Proton Center";
                // B
                break;

            case 9, 0:
                category = "Category: Technology and Science";
                question = "Q: What does the acronym \"URL\" stand for?";
                opA = "A.Universal Routing Locator";
                opB = "B. Unified Resource Link";
                opC = "C.Uniform Resource Locator";
                // C
                break;

            default:
                category = "Category: Technology and Science";
                question = "Q: error";
                opA = "A.";
                opB = "B.";
                opC = "C.";
                break;
        }
        String[] questionOne = new String[5];
        questionOne[0] = category;
        questionOne[1] = question;
        questionOne[2] = opA;
        questionOne[3] = opB;
        questionOne[4] = opC;

        return questionOne;

    }

    // this methode stores all the possible answers depending on the question
    // It returnes the answer depending on the pattern (given or random)
    public char answersSc() {
        char answerOne;

        switch (questionIndex) {
            case 1, 5:
                answerOne = 'b';
                break;

            case 2, 6:
                answerOne = 'a';
                break;

            case 3, 7:
                answerOne = 'a';
                break;

            case 4, 8:
                answerOne = 'b';
                break;

            case 9, 0:
                answerOne = 'c';
                break;

            default:
                answerOne = 'w';
                break;
        }
        return answerOne;

    }

    public String[] History() {

        String category;
        String question;
        String opA;
        String opB;
        String opC;

        switch (questionIndex) {
            case 1, 5:
                category = "Category: Geography and History";
                question = "Q: What is the smallest country in the world?";
                opA = "A.Vatican City";
                opB = "B.Bogotá";
                opC = "C.Berlin";
                // A
                break;

            case 2, 6:
                category = "Category: Geography and History";
                question = "Q: In which year World War I begin?";
                opA = "A.1920";
                opB = "B.1914";
                opC = "C.1916";
                // B
                break;

            case 3, 7:
                category = "Category: Geography and History";
                question = "Q: John F. Kennedy was assassinated in which city?";
                opA = "A.Washington D. C.";
                opB = "B.Dallas";
                opC = "C.Albuquerque";
                // B
                break;

            case 4, 8:
                category = "Category: Geography and History";
                question = "Q: Which ancient civilization built the city of Machu Picchu?";
                opA = "A.Ancient Greece";
                opB = "B.Ancient Egypt";
                opC = "C.Inca Empire";
                // C
                break;

            case 9, 0:
                category = "Category: Geography and History";
                question = "Q: Which river is the longest in the world?";
                opA = "A.Amazon River";
                opB = "B.Nile River";
                opC = "C.Yangtze Rive";
                // B
                break;

            default:
                category = "Category: Geography and History";
                question = "Q: error";
                opA = "A.";
                opB = "B.";
                opC = "C.";
                break;
        }
        String[] questionArray = new String[5];
        questionArray[0] = category;
        questionArray[1] = question;
        questionArray[2] = opA;
        questionArray[3] = opB;
        questionArray[4] = opC;

        return questionArray;

    }

    // this methode stores all the possible answers depending on the question
    // It returnes the answer depending on the pattern (given or random)
    public char answersH() {
        char answerOne;

        switch (questionIndex) {
            case 1, 5:
                answerOne = 'a';
                break;

            case 2, 6:
                answerOne = 'b';
                break;

            case 3, 7:
                answerOne = 'b';
                break;

            case 4, 8:
                answerOne = 'c';
                break;

            case 9, 0:
                answerOne = 'b';
                break;

            default:
                answerOne = 'w';
                break;
        }
        return answerOne;

    }

    public String[] Entertainment() {

        String category;
        String question;
        String opA;
        String opB;
        String opC;

        switch (questionIndex) {
            case 1, 5:
                category = "Category: Entertainment";
                question = "Q: Night Crawler, member of the X-Men, has what kind of powers?";
                opA = "A.Can Fly";
                opB = "B.Super Strong";
                opC = "C.Can teleport";
                // C
                break;

            case 2, 6:
                category = "Category: Entertainment";
                question = "Q: What is the name of the song that Queen Elsa sings as she builds her ice castle in the movie Frozen?";
                opA = "A.Let it go";
                opB = "B.Let it be";
                opC = "C.Into the unknown";
                // A
                break;

            case 3, 7:
                category = "Category: Entertainment";
                question = "Q: Which actor appeared in films 'Face Off' and 'Ghost Rider'?";
                opA = "A.Hugh Jackman";
                opB = "B.Nicholas Cage";
                opC = "C.David Tennant";
                // B
                break;

            case 4, 8:
                category = "Category: Entertainment";
                question = "Q: The main character of the famous PlayStation game called 'Crash', it's design is based on which animal";
                opA = "A.Fox";
                opB = "B.Bandicoot";
                opC = "C.Wild Dog";
                // B
                break;

            case 9, 0:
                category = "Category: Entertainment";
                question = "Q: What's the famous phrase that Darth Vader says to Luke Skywalker before he cuts his hand off?";
                opA = "A.'Luke, I am your father'";
                opB = "B.'No, I am your father'";
                opC = "C.'Son, I am your father";
                // B
                break;

            default:
                category = "Category: Entertainment";
                question = "Q: error";
                opA = "A.";
                opB = "B.";
                opC = "C.";
                break;
        }
        String[] questionOne = new String[5];
        questionOne[0] = category;
        questionOne[1] = question;
        questionOne[2] = opA;
        questionOne[3] = opB;
        questionOne[4] = opC;

        return questionOne;

    }

    // this methode stores all the possible answers depending on the question
    // It returnes the answer depending on the pattern (given or random)
    public char answersEn() {
        char answerOne;

        switch (questionIndex) {
            case 1, 5:
                answerOne = 'c';
                break;

            case 2, 6:
                answerOne = 'a';
                break;

            case 3, 7:
                answerOne = 'b';
                break;

            case 4, 8:
                answerOne = 'b';
                break;

            case 9, 0:
                answerOne = 'b';
                break;

            default:
                answerOne = 'w';
                break;
        }
        return answerOne;

    }

    public String[] Music() {

        String category;
        String question;
        String opA;
        String opB;
        String opC;

        switch (questionIndex) {
            case 1, 5:
                category = "Category: Music and Literature";
                question = "Q: Which country did AC/DC originate in?";
                opA = "A.USA";
                opB = "B.Australia";
                opC = "C.England";
                // B
                break;

            case 2, 6:
                category = "Category: Music and Literature";
                question = "Q: Which song by Luis Fonsi and Daddy Yankee has the most views (of all time) on YouTube?";
                opA = "A.Suavecito";
                opB = "B.Con Calma";
                opC = "C.Despacito";
                // c
                break;

            case 3, 7:
                category = "Category: Music and Literature";
                question = "Q: The book 'Da Vinci Code', was written by whom?";
                opA = "A.Dan Brown";
                opB = "B.Leonardo Da Vinci";
                opC = "C.Ernest Hemingway";
                // A
                break;

            case 4, 8:
                category = "Category: Music and Literature";
                question = "Q: Which composer is known for the composition of \"Symphony No. 9 in D minor, Op. 125,\" commonly referred to as the \"Choral Symphony\"?";
                opA = "A.Wolfgang Amadeus Mozart";
                opB = "B.Ludwig van Beethoven";
                opC = "C.Johann Sebastian Bach";
                // B
                break;

            case 9, 0:
                category = "Category: Music and Literature";
                question = "Q: Literature Question: Who wrote the novel \"Pride and Prejudice\"?";
                opA = "A.Emily Bronte";
                opB = "B.Jane Austen";
                opC = "C.Charles Dickens";
                // B
                break;

            default:
                category = "Category: Music and Literature";
                question = "Q: error";
                opA = "A.";
                opB = "B.";
                opC = "C.";
                break;
        }
        String[] questionOne = new String[5];
        questionOne[0] = category;
        questionOne[1] = question;
        questionOne[2] = opA;
        questionOne[3] = opB;
        questionOne[4] = opC;

        return questionOne;

    }

    // this methode stores all the possible answers depending on the question
    // It returnes the answer depending on the pattern (given or random)
    public char answersMu() {
        char answerOne;

        switch (questionIndex) {
            case 1, 5:
                answerOne = 'b';
                break;

            case 2, 6:
                answerOne = 'c';
                break;

            case 3, 7:
                answerOne = 'a';
                break;

            case 4, 8:
                answerOne = 'b';
                break;

            case 9, 0:
                answerOne = 'b';
                break;

            default:
                answerOne = 'w';
                break;
        }
        return answerOne;

    }
}
