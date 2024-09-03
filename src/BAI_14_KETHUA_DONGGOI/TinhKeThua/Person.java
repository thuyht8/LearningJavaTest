package BAI_14_KETHUA_DONGGOI.TinhKeThua;

public class Person {
    public String name;
    public int age;
    public float hight;

    public Person (String name, int age, float hight){
        this.name = name;
        this.age = age;
        this.hight = hight;
    }

    public void getInfo (){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hight: " + hight);
    }
}