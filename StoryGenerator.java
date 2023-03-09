import java.util.Random;
import java.util.Scanner;


public class StoryGenerator { //MadLibs

    Scanner scn = new Scanner(System.in);
    Random rnd = new Random();
    String story, name, adj1, adj2, noun1, noun2, noun3, adv, randomNums;

    //getters
    public String getStory() {
        return this.story;
    }

    public String getName() {
        return this.name;
    }

    public String getAdj1() {
        return this.adj1;
    }

    public String getAdj2() {
        return this.adj2;
    }

    public String getNoun1() {
        return this.noun1;
    }

    public String getNoun2() {
        return this.noun2;
    }

    public String getNoun3() {
        return this.noun3;
    }

    public String getAdv() {
        return this.adv;
    }

    public String getRandomNums() {
        return this.randomNums;
    }


    //setters
    public void setStory(String story) {
        this.story = story;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdj1(String adj1) {
        this.adj1 = adj1;
    }

    public void setAdj2(String adj2) {
        this.adj2 = adj2;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    public void setAdv(String adv) {
        this.adv = adv;
    }

    public void setRandomNums() {
        int num = Math.abs(rnd.nextInt()) % 100;
        int index = 0;
        int[] numberHolder = new int[3];
        while (index < numberHolder.length) {
            numberHolder[index] = num + index;
            index++;
        }

        randomNums = "not " + numberHolder[0] + ", not " + numberHolder[1] + ", but " + numberHolder[2];
    }

    public void printInstructions() {
        System.out.println("Welcome to the MadLibs game. If you type in " +
                "words, we'll give you a story. Start by typing in a name");
    }

    public void enterName() {
        setName(scn.nextLine());

    }

    public void enterNoun1() {
        System.out.println("Give me a noun");
        setNoun1(scn.nextLine());

    }

    public void enterNoun2() {
        System.out.println("Give me another noun");
        setNoun2(scn.nextLine());

    }

    public void enterNoun3() {
        System.out.println("Give me a last noun");
        setNoun3(scn.nextLine());

    }

    public void enterAdj1() {
        System.out.println("Give me an adjective");
        setAdj1(scn.nextLine());

    }

    public void enterAdj2() {
        System.out.println("Give me another adjective");
        setAdj2(scn.nextLine());

    }

    public void enterAdv() {
        System.out.println("Give me an adverb");
        setAdv(scn.nextLine());
    }

    public void putTogetherTheStory() {
        String story;
        int num = Math.abs(rnd.nextInt()) % 2;
        if (num == 0) {
            story = "Jesse and her best friend" + getName() + " went to Disney World today!"
                    +
                    "They saw a " + getNoun1() + " in a show at the Magic Kingdom"
                    +
                    "and ate a " + getAdj1() + " feast for dinner. The next day I" +
                    " ran " + getAdv() + " to meet Mickey Mouse in his " + getNoun2() +
                    "and then that night I gazed at the " + getRandomNums() + getAdj2() + "fireworks shooting from the" +
                    getNoun3() + ".";
        } else {
            story = "Amanda and her frenemy " + getName() + " went to the zoo last summer. " +
                    "They saw a huge " + getNoun1() + " and a tiny little " + getNoun2() + ", That night"
                    +
                    " they decided to climb " + getAdv() + " into the " + getNoun3() + " to get a closer look."
                    + "The zoo was " + getAdj1() + " at night, but they didn't care.."
                    + "until " + getRandomNums() + " " + getAdj2() + " apes yelled in their faces, making "
                    + "Amanda and " + getName() + " sprint all the way back home.";
        }
        setStory(story);

    }


    public void play() {
        enterName();
        enterNoun1();
        enterAdj1();
        enterAdv();
        enterNoun2();
        enterAdj2();
        enterNoun3();
        setRandomNums();
        putTogetherTheStory();
        System.out.println(getStory());

    }


    public static void main(String[] args) {

        StoryGenerator game = new StoryGenerator();
        game.printInstructions();
        game.play();


    }


}