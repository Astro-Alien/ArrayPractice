package za.ac.cput;
public class Person implements Comparable<Person>{
    private String Name;
    private String Surname;
    private String Gender;
    private int height;
    private float weight;
    //constructor
    public Person(String name, String surname, String gender, int height, float weight) {
        this.Name = name;
        this.Surname = surname;
        this.Gender = gender;
        this.height = height;
        this.weight = weight;
    }
    //Getters
    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getGender() {
        return Gender;
    }

    public int getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }
    //setters
    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Gender='" + Gender + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Person otherName) {

        return this.Name.compareTo(otherName.Name);
    }
}