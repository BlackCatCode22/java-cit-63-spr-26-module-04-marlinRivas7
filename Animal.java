package marlinR;

public class Animal {

    /* This section store the data we want to get from the animals */
    private String animalName;
    private int age;
    private String species;


    public static int totalAnimals = 0;

    /* in this section, we initialized each object */
    public Animal (String name, String aSpecies, int anAge) {
        System.out.println("\n New animal object was just made. \n ");

        animalName = name;
        species = aSpecies;
        age = anAge;
        totalAnimals++;
    }

    /* this section, allows the program to count the animals being created */
    public Animal() {
        System.out.println("\n New animal object was just made. \n");
        totalAnimals++;
    }

    /* The program to be able to functioned needs to a way to get the information from Animal class
    to the App class, this section allows the communication between both class classes */
    public String getName() {
        return animalName;
    }
    public void setName(String name) {
        this.animalName = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

}