package nl.novi.javaprogrammeren;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    /*
    Ik heb een applicatie waarin in mensen en hun huisdieren moet bijhouden.
    Van de mensen weet ik hun:
    -  voor- en achternaam
    - bankrekeningnummer
    - telefoonnummer
    - emailadres

    huisdieren kunnen een hond, een parkiet of een kat zijn. Daarvan willen we naam, chipnummer en eventuele
    gezondsheidskwalen weten.
     */

    public static void main(String[] args) {

        Pet pet = new Pet("parkiet", "Pietje", "c");
        pet.setName("Sjaak");

        Pet harry = new Pet("hond", "Harry", "123");
        System.out.println(harry.getName());

        harry.addHealthIssue("bloedneus");
        harry.addHealthIssue("keelpijn");


        harry.addSeveralHealthIssues(Arrays.asList("Polio", "difterie", "tetanus"));

        Person henk = new Person("Henk","Heinrich", 123,061, "henk@gmail.com");

        if(henk.addPet(harry) == true) {
            System.out.println("Harry is toegevoegd");
        }

        System.out.println("Grootte van de list: " + henk.getPetList().size());

        List<Pet> pets = new ArrayList<>();
        Pet p = new Pet("parkiet", "Hansje", "124");
        pets.add(p);
        pets.add(new Pet("parkiet", "Pietje", "123"));

        Person petPerson = new Person("Nick", "Stuivenberg", 123, 06123, "N@n.nl",
                pets);
        petPerson.addOwnerToPets();

        List<Pet> lijstje = petPerson.getPetList();
        Pet firstPet = lijstje.get(0);
        String firstPetName = firstPet.getName();

        // Dit is hetzelfde
        System.out.println(petPerson.getPetList().get(0).getName());
        System.out.println(firstPetName);

        System.out.println(petPerson.toString());


    }
}
