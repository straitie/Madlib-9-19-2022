
/**
 * Write a description of class MadLib here.
 *
 * @Eden Straitiff
 * @9-16-2022
 */
import java.util.Scanner;

public class MadLib
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String nameUser = input.nextLine();
        System.out.println("Enter the date.");
        System.out.print("day: ");
        int day = input.nextInt();
        input.nextLine();
        System.out.print("month:");
        int month = input.nextInt();
        System.out.print("year:");
        int year = input.nextInt();
        input.nextLine();
        System.out.println("Please respond to the following prompts to make a Madlib");
        //all words
        System.out.println("2 Names: ");
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        System.out.println("6 Adjectives");
        String adjective1 = input.nextLine();
        String adjective2 = input.nextLine();
        String adjective3 = input.nextLine();
        String adjective4 = input.nextLine();
        String adjective5 = input.nextLine();
        String adjective6 = input.nextLine();
        System.out.println("5 Past Tense Verbs: ");
        String pastTenseVerb1 = input.nextLine();
        String pastTenseVerb2 = input.nextLine();
        String pastTenseVerb3 = input.nextLine();
        String pastTenseVerb4 = input.nextLine();
        String pastTenseVerb5 = input.nextLine();
        System.out.println("5 Plural Nouns: ");
        String pluralNoun1 = input.nextLine();
        String pluralNoun2 = input.nextLine();
        String pluralNoun3 = input.nextLine();
        String pluralNoun4 = input.nextLine();
        String pluralNoun5 = input.nextLine();
        System.out.println("2 -ing Verbs: ");
        String ingVerb1 = input.nextLine();
        String ingVerb2 = input.nextLine();
        System.out.println("2 Adverbs: ");
        String adverb1 = input.nextLine();
        String adverb2 = input.nextLine();
        System.out.println("6 Nouns: ");
        String noun1 = input.nextLine();
        String noun2 = input.nextLine();
        String noun3 = input.nextLine();
        String noun4 = input.nextLine();
        String noun5 = input.nextLine();
        String noun6 = input.nextLine();
        System.out.println("2 Verbs: ");
        String verb1 = input.nextLine();
        String verb2 = input.nextLine();
        System.out.println("1 Animal: ");
        String animal1 = input.nextLine();
        
        //Madlib
        System.out.println(nameUser + ", " + month + "/" + day + "/" + year);
        System.out.println(name1 + " and " + name2 + " went on a " + adjective1 + " camping trip. ");
        System.out.println("They " + pastTenseVerb1 + " their " + adjective2 + " " + pluralNoun1 + " and started " + ingVerb1 + " " + adverb1 + " to build a " + noun1 + ". ");
        System.out.println("They knew they needed to " + verb1 + " a lot of " + pluralNoun2 + " before it became to " + adjective3 + " so they " + pastTenseVerb2 + " very " + adverb2 + ". ");
        System.out.println("For a snack they decided to make " + pluralNoun3 + " on a " + noun2 + " and cook up a can of " + pluralNoun4 + ". ");
        System.out.println("As it got dark outside, " + name2 + " heard a " + animal1 + " make a sound in the woods! ");
        System.out.println(name1 + " was scared and " + pastTenseVerb3 + " a " + noun3 + "! ");
        System.out.println("Outside, " + name2 + " " + pastTenseVerb4 + " a " + noun4 + " from inside the tent. ");
        System.out.println("The " + animal1 + " " + pastTenseVerb5 + " but not before " + ingVerb2 + " over all the " + adjective4 + " " + noun5 + "! ");
        System.out.println("When the morning came, " + name1 + " and " + name2 + " left to go " + verb2 + " up a " + adjective5 + " " + noun6 + " and gather " + pluralNoun5 + ". ");
        System.out.println("It truly was a " + adjective6 + " camping trip!");
    } 
}
