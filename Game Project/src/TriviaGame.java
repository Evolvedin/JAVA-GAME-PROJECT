/**
 * purpose of the class: Trivia Game blueprint
 * Name:
 * Date:26/07/2023
 * Time:11.40 pm
 * This is just a test!
 */

public class TriviaGame {// defining the class. The pattern state is to difine the order of the questions
    private String playerName;
    private int playerScore;
    private int pattern;

    public TriviaGame() {
    }

    public TriviaGame(String playerName, int playerScore, int pattern) {
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.pattern = pattern;
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

    public void setPattern(int pattern) {
        this.pattern = pattern;
    }

    public int getPattern() {
        return pattern;
    }

    // this methode stores all the possible option that the user can have for the
    // first question
    // It returns an array depending on the pattern (given or random)
    public String[] questionsOne() {
        String patternStrOne = String.valueOf(pattern);
        char patCharOne = patternStrOne.charAt(0);
        int patOne = Character.getNumericValue(patCharOne);
        String category;
        String question;
        String opA;
        String opB;
        String opC;

        switch (patOne) {
            case 1:
                category = "Category: Technology and Science";
                question = "Q1: What year was the very first model of the iPhone released?";
                opA = "A.2005";
                opB = "B.2007";
                opC = "C.2000";
                // B
                break;

            case 2:
                category = "Category: Pop Culture";
                question = "Q1: Night Crawler, member of the X-Men, has what kind of powers?";
                opA = "A.Can Fly";
                opB = "B.Super Strong";
                opC = "C.Can teleport";
                // C
                break;

            case 3:
                category = "Category: Sports";
                question = "Q1: What country won the very first FIFA World Cup in 1930?";
                opA = "A.Uruguay";
                opB = "B.Argentina";
                opC = "C.France";
                // A
                break;

            case 4:
                category = "Category: Geography and History";
                question = "Q1: What is the smallest country in the world?";
                opA = "A.Vatican City";
                opB = "B.Bogotá";
                opC = "C.Berlin";
                // A
                break;

            case 5:
                category = "Category: Music and Literature";
                question = "Q1: Which country did AC/DC originate in?";
                opA = "A.USA";
                opB = "B.Australia";
                opC = "C.England";
                // B
                break;

            case 6:
                category = "Category: Technology and Science";
                question = "Q1: What is the name for the dense, positively charged center of an atom?";
                opA = "A.Electron Cloud";
                opB = "B.Nucleus";
                opC = "C.Proton Center";
                // B
                break;

            case 7:
                category = "Category: Geography and History";
                question = "Q1: Which ancient civilization built the city of Machu Picchu?";
                opA = "A.Ancient Greece";
                opB = "B.Ancient Egypt";
                opC = "C.Inca Empire";
                // C
                break;

            case 8:
                category = "Category: Music and Literature";
                question = "Q1: The book 'Da Vinci Code', was written by whom?";
                opA = "A.Dan Brown";
                opB = "B.Leonardo Da Vinci";
                opC = "C.Ernest Hemingway";
                // A
                break;

            case 9:
                category = "Category: Entertainment";
                question = "Q1: The main character of the famous PlayStation game called 'Crash', it's design is based on which animal";
                opA = "A.Fox";
                opB = "B.Bandicoot";
                opC = "C.Wild Dog";
                // B
                break;

            default:
                category = "Category: error";
                question = "Q1: error";
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
    public char answersOne() {
        String patternStrOne = String.valueOf(pattern);
        char patCharOne = patternStrOne.charAt(0);
        int patOne = Character.getNumericValue(patCharOne);

        char answerOne;

        switch (patOne) {
            case 1:
                answerOne = 'b';
                break;

            case 2:
                answerOne = 'c';
                break;

            case 3:
                answerOne = 'a';
                break;

            case 4:
                answerOne = 'a';
                break;

            case 5:
                answerOne = 'b';
                break;

            case 6:
                answerOne = 'b';
                break;

            case 7:
                answerOne = 'c';
                break;

            case 8:
                answerOne = 'a';
                break;

            case 9:
                answerOne = 'b';
                break;
            default:
                answerOne = 'w';
                break;
        }
        return answerOne;

    }

    public String[] questionsTwo() {
        String patternStrOne = String.valueOf(pattern);
        char patCharTwo = patternStrOne.charAt(1);
        int patTwo = Character.getNumericValue(patCharTwo);
        String category;
        String question;
        String opA;
        String opB;
        String opC;

        switch (patTwo) {
            case 0:
                category = "Category: Technology and Science";
                question = "Q2: What is the chemical symbol for the element gold?";
                opA = "A.Au";
                opB = "B.Go";
                opC = "C.Ag";
                // A
                break;

            case 1:
                category = "Category: Pop Culture";
                question = "Q2: What is the name of the song that Queen Elsa sings as she builds her ice castle in the movie Frozen?";
                opA = "A.Let it go";
                opB = "B.Let it be";
                opC = "C.Into the unknown";
                // A
                break;

            case 2:
                category = "Category: Sports";
                question = "Q2: When Michael Jordan played for the Chicago Bulls, how many NBA Championships did he win?";
                opA = "A.Seven";
                opB = "B.Five";
                opC = "C.Six";
                // C
                break;

            case 3:
                category = "Category: Geography and History";
                question = "Q2: In which year World War I begin?";
                opA = "A.1920";
                opB = "B.1914";
                opC = "C.1916";
                // B
                break;

            case 4:
                category = "Category: Music and Literature";
                question = "Q2: Which song by Luis Fonsi and Daddy Yankee has the most views (of all time) on YouTube?";
                opA = "A.Suavecito";
                opB = "B.Con Calma";
                opC = "C.Despacito";
                // c
                break;

            case 5:
                category = "Category: Technology and Science";
                question = "Q2: What does the acronym \"URL\" stand for?";
                opA = "A.Universal Routing Locator";
                opB = "B.Unified Resource Link";
                opC = "C.Uniform Resource Locator";
                // C
                break;
            case 6:
                category = "Category: Geography and History";
                question = "Q2: Which river is the longest in the world?";
                opA = "A.Amazon River";
                opB = "B.Nile River";
                opC = "C.Yangtze Rive";
                // B
                break;

            case 7:
                category = "Category: Entertainment";
                question = "Q2: What's the famous phrase that Darth Vader says to Luke Skywalker before he cuts his hand off?";
                opA = "A.'Luke, I am your father'";
                opB = "B.'No, I am your father'";
                opC = "C.'Son, I am your father";
                // B
                break;

            case 8:
                category = "Category: Music and Literature";
                question = "Q2: Literature Question: Who wrote the novel \"Pride and Prejudice\"?";
                opA = "A.Emily Bronte";
                opB = "B.Jane Austen";
                opC = "C.Charles Dickens";
                // B
                break;
            case 9:
                category = "Category: Music and Literature";
                question = "Q2: Which composer is known for the composition of \"Symphony No. 9 in D minor, Op. 125,\" commonly referred to as the \"Choral Symphony\"?";
                opA = "A.Wolfgang Amadeus Mozart";
                opB = "B.Ludwig van Beethoven";
                opC = "C.Johann Sebastian Bach";
                // B
                break;

            default:
                category = "Category: error ";
                question = "Q2: error ";
                opA = "A.";
                opB = "B.";
                opC = "C.";
                break;
        }
        String[] questionTwo = new String[5];
        questionTwo[0] = category;
        questionTwo[1] = question;
        questionTwo[2] = opA;
        questionTwo[3] = opB;
        questionTwo[4] = opC;

        return questionTwo;

    }

    public char answersTwo() {
        String patternStrOne = String.valueOf(pattern);
        char patCharTwo = patternStrOne.charAt(1);
        int patTwo = Character.getNumericValue(patCharTwo);

        char answerTwo;

        switch (patTwo) {
            case 1:
                answerTwo = 'a';
                break;

            case 2:
                answerTwo = 'c';
                break;

            case 3:
                answerTwo = 'b';
                break;

            case 4:
                answerTwo = 'c';
                break;

            case 5:
                answerTwo = 'c';
                break;

            case 6:
                answerTwo = 'b';
                break;

            case 7:
                answerTwo = 'b';
                break;

            case 8:
                answerTwo = 'b';
                break;

            case 9:
                answerTwo = 'b';
                break;

            case 0:
                answerTwo = 'a';
                break;
            default:
                answerTwo = 'w';
                break;
        }
        return answerTwo;

    }

    public String[] questionsThree() {
        String patternStrThree = String.valueOf(pattern);
        char patCharThree = patternStrThree.charAt(2);
        int patThree = Character.getNumericValue(patCharThree);
        String category;
        String question;
        String opA;
        String opB;
        String opC;

        switch (patThree) {
            case 0:
                category = "Category: Technology and Science";
                question = "Q3: Which planet is the hottest in the solar system?";
                opA = "A.Venus";
                opB = "B.Earth";
                opC = "C.Mercury";
                // A
                break;

            case 1:
                category = "Category: Pop Culture";
                question = "Q3: Which actor appeared in films 'Face Off' and 'Ghost Rider'?";
                opA = "A.Hugh Jackman";
                opB = "B.Nicholas Cage";
                opC = "C.David Tennant";
                // B
                break;

            case 2:
                category = "Category: Sports";
                question = "Q3: In the 1971 Olympics, Nadia Comaneci was the first gymnast to score a perfect score. What country was she representing?";
                opA = "A.Russia";
                opB = "B.Hungary";
                opC = "C.Romania";
                // C
                break;

            case 3:
                category = "Category: Geography and History";
                question = "Q3: John F. Kennedy was assassinated in which city?";
                opA = "A.Washington D. C.";
                opB = "B.Dallas";
                opC = "C.Albuquerque";
                // B
                break;

            case 4:
                category = "Category: Music and Literature";
                question = "Q3: The book 'Da Vinci Code', was written by whom?";
                opA = "A.Dan Brown";
                opB = "B.Leonardo Da Vinci";
                opC = "C.Ernest Hemingway";
                // A
                break;

            case 5:
                category = "Category: Video Gmaes";
                question = "Q3: In the game series 'Pokémon', which type is strong against Dragon-type Pokémon?";
                opA = "A.Dragon";
                opB = "B.Electric";
                opC = "C.Ghost";
                // A
                break;

            case 6:
                category = "Category: Video Games";
                question = "Q3: In the game \"The Legend of Zelda: Ocarina of Time,\" what instrument does the main character, Link, use to solve puzzles and perform magical actions?";
                opA = "A.Flute";
                opB = "B.Ocarina";
                opC = "C.Harp";
                // B
                break;

            case 7:
                category = "Category: Video Games";
                question = "Q3:  In the game 'Overwatch', which hero is known for his swift movement, and abilities that allow him/her to manipulate time?";
                opA = "A.Tracer";
                opB = "B.Reaper";
                opC = "C.Lúcio";
                // A
                break;

            case 8:
                category = "Category: Video Games";
                question = "Q3:  Which puzzle-platformer game features two characters, named Atlas and P-Body, who must work together to solve intricate challenges using portals?";
                opA = "A.Portal Knights";
                opB = "B.Portal 2";
                opC = "C.Portals of Destiny";
                // B
                break;

            case 9:
                category = "Category: Video Games";
                question = "Q3: Which of the following is a powerful and iconic greatsword weapon found in the \"Dark Souls\" series, known for its unique design and devastating attacks?";
                opA = "A.Moonlight Greatsword";
                opB = "B.Drake Sword";
                opC = "C.Chaos Blade";
                // A
                break;
            default:
                category = "Category: error ";
                question = "Q3: error ";
                opA = "A.";
                opB = "B.";
                opC = "C.";
                break;
        }
        String[] questionThree = new String[5];
        questionThree[0] = category;
        questionThree[1] = question;
        questionThree[2] = opA;
        questionThree[3] = opB;
        questionThree[4] = opC;

        return questionThree;

    }

    public char answersThree() {
        String patternStrThree = String.valueOf(pattern);
        char patCharThree = patternStrThree.charAt(2);
        int patThree = Character.getNumericValue(patCharThree);

        char answerThree;

        switch (patThree) {
            case 1:
                answerThree = 'b';
                break;

            case 2:
                answerThree = 'c';
                break;

            case 3:
                answerThree = 'b';
                break;

            case 4:
                answerThree = 'a';
                break;

            case 5:
                answerThree = 'a';
                break;

            case 6:
                answerThree = 'b';
                break;

            case 7:
                answerThree = 'a';
                break;

            case 8:
                answerThree = 'b';
                break;

            case 9:
                answerThree = 'a';
                break;

            case 0:
                answerThree = 'a';
                break;
            default:
                answerThree = 'w';
                break;
        }
        return answerThree;

    }
}