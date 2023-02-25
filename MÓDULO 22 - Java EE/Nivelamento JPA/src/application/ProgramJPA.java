package application;

import domain.Person;

public class ProgramJPA {
    public static void main(String[] args) {

        Person personOne = new Person(1, "Maycon Cain", "maycon_Cain@gmail.com");
        Person personTwo = new Person(2, "Trevis Colback", "trvis_Colback@hotmailcom");
        Person personThree = new Person(3, "Alan Maknaman", "alan-Mak@gmail.com");
        Person personFour = new Person(4, "Miguel Mandzuk", "miguelMandiz@yahoo.com");
        Person personFive = new Person(5, "Nina Dobrev", "dobrevNina@gmail.com");

        System.out.println(personOne);
        System.out.println(personTwo);
        System.out.println(personThree);
        System.out.println(personFour);
        System.out.println(personFive);

    }
}