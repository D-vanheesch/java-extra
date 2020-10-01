package nl.novi.javaprogrammeren;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    /*
    huisdieren kunnen een hond, een parkiet of een kat zijn. Daarvan willen we naam, chipnummer en eventuele
    gezondsheidskwalen weten.
    */

    private String species;
    private String name;
    private String chipNummer;
    private Person owner;
    private List<String> healthIssues;

    public Pet(String species, String name, String chipNummer) {
        this.species = species;
        this.name = name;
        this.chipNummer = chipNummer;
        healthIssues = new ArrayList<>();
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        // kat, hond, parkiet
        if(species.equalsIgnoreCase("kat")
        || species.equalsIgnoreCase("hond")
        || species.equalsIgnoreCase("parkiet")) {
            this.species = species;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChipNummer() {
        return chipNummer;
    }

    public void setChipNummer(String chipNummer) {
        this.chipNummer = chipNummer;
    }

    public List<String> getHealthIssues() {
        return healthIssues;
    }

    public void setHealthIssues(List<String> healthIssues) {
        this.healthIssues = healthIssues;
    }

    public void addHealthIssue(String healthIssue) {
        healthIssues.add(healthIssue);
    }

    public void addSeveralHealthIssues(List<String> issues) {
        for(String issue : issues) {
            healthIssues.add(issue);
        }
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
