package org.example.kogito.model;

public final class Person
{
    private final String name;
    private final int age;
    private boolean adult;

    public Person(String name, int age, boolean adult)
    {
        this.name = name;
        this.age = age;
        this.adult = adult;
    }

    public String name() {return name;}

    public int age() {return age;}

    public boolean adult() {return adult;}

    public void adult(boolean isAdult) {this.adult = isAdult;}

    @Override
    public String toString()
    {
        return "Person [name=" + name + ", age=" + age + ", adult=" + adult + "]";
    }
}
