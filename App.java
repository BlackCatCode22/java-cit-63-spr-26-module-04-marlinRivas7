package marlinR;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to the Zoo program! \n\n");
        System.out.println("\n\n The number of animals is: " + Animal.totalAnimals);

        /* These are the local variables*/
        String name;
        int age;
        String species;

        /* it stores the animals objects by using ArrayList*/
        ArrayList<Animal> animals = new ArrayList<>();

        /* It allows to access outside documents, such as the arriving animals list doc
         that have the information we'll need for the program */
        String filePath = "C:\\Users\\marli\\Downloads\\arrivingAnimals.txt";
        File doc = new File(filePath);


        try (Scanner list = new Scanner(doc)) {
            while (list.hasNextLine()) {
                String line = list.nextLine();

                /* this loop separates each part of information, such as age by using commas */
                String[] parts = line.split(", ");

                /* it does a check if the line has at least one part */
                if (parts.length >= 1 ) {
                    String ageAndSpecies = parts[0];
                    System.out.println("age and species: " + ageAndSpecies);

                    /* if the line has more between 0 and 5 parts, it will break down each part into more lines,
                     for example, one line for age and another one for the name */
                    String[] theParts = ageAndSpecies.split(" ");
                    for (int i=0; i<5; i++) {
                        System.out.println("theParts[" + i + "] is " + theParts[i]);
                    }

                    age = Integer.parseInt(theParts[0]);
                    species = theParts[4];

                    /* it makes a new animal with the information acquired */
                    Animal myAnimal = new Animal ("name needed", species, age);

                    animals.add(myAnimal);
                }
                System.out.println("The number of animals is: " + Animal.totalAnimals);
            }
        }

        /* It will print the following text if there is something wrong with file */
        catch (FileNotFoundException e) {
            System.out.println("File not found " + filePath);
            e.printStackTrace();
        }
        
        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println("Animal name: " + animal.getName() + ", Age: " + animal.getAge() + " Species: " + animal.getSpecies());
        }

        /* it gives us the final count of animals being created after the information has been updated */
        System.out.println("Number of animals is: " + Animal.totalAnimals);
    }
}