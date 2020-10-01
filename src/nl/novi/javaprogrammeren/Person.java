package nl.novi.javaprogrammeren;

/*
    Ik heb een applicatie waarin in mensen en hun huisdieren moet bijhouden.
            Van de mensen weet ik hun:
            -  voor- en achternaam
            - bankrekeningnummer
            - telefoonnummer
            - emailadres
            */


import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private int acountNumber;
    private int phoneNumber;
    private String emailAdress;
    private List<Pet> petList;

    public Person(String firstName, String lastName, int acountNumber, int phoneNumber, String emailAdress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acountNumber = acountNumber;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
        this.petList = new ArrayList<>();
    }

    public Person(String firstName, String lastName, int acountNumber, int phoneNumber, String emailAdress,
                  List<Pet> petList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acountNumber = acountNumber;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
        if(petList.size() > 1 && petList.size() < 5) {
            this.petList = petList;
        } else {
            throw new RuntimeException("Verkeerd aantal huisdieren");
        }

    }

    public boolean addPet(Pet pet){
        return petList.add(pet);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAcountNumber() {
        return acountNumber;
    }

    public void setAcountNumber(int acountNumber) {
        this.acountNumber = acountNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public List<Pet> getPetList() {
        return petList;
    }

    public void addOwnerToPets() {
        for(Pet pet: petList) {
            pet.setOwner(this);
        }
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Mijn naam is ")
                .append(this.getLastName())
                .append(" en ik heb ")
                .append(this.getPetList().size())
                .append(" dieren");
        for(Pet p : petList) {
            sb.append("\n\r").append(p.getName());
        }

        return sb.toString();
    }
}
