package za.ac.cput;


import java.util.ArrayList;
import java.util.Collections;


public class TestPerson {
    public static void arrayList(){
        ArrayList<Person> op = new ArrayList<>();
        //adding fields to Person object
        op.add(new Person("Sisipho", "Mvimvi", "female", 160, 60.5f));
        op.add(new Person("Sean", "Trainor", "male", 183, 80.0f));
        op.add(new Person("Amy", "Johnston", "female", 200, 90.0f));
        op.add(new Person("Amir", "Karbelkar", "male", 182, 72.0f));
        op.add(new Person("Chris", "Mbuyi", "male", 195, 75.5f));

        Collections.sort(op);

        //loop through and display sorted list
        for(int i = 0; i < op.size();i++)
        {
            System.out.println(op.get(i)+ " ");
        }

    }
    public static void main(String[] args) {

        arrayList();
    }
}