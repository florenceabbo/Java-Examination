import java.util.ArrayList;

//Question 1 iv

import java.util.ArrayList;
public class Animals {


    private ArrayList<String>animals;

    public Animals() {  //Initialised attributes of class Animals
        this.animals = new ArrayList<String>();
    }
    public void addAnimals(String animal){
        animals.add(animal);
    }

    public ArrayList<String> getAnimals() {
        return animals;
    }
}
