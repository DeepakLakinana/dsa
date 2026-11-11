package opps;

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Deepak";
        s1.roll = 10;

        Student s2 = new Student("Nihaar");
        Student s3 = new Student("11");
        //Student s4 = new Student("manjunath",15) this will give error as we dont have a constructor which take 2 parameters

        Student s5 = new Student(s1);
        System.out.println(s5.name +" " + s5.roll);
    }
}

class Student{ 
    String name;
    int roll;

    Student(){ 
        System.out.println("Constructor was called...");
    }

    Student(String name){ 
        this.name = name;
    }

    Student(int roll){ 
        this.roll = roll;
    }

    //since there are 3 constructors with same name ,this is constructor overloading and also example of polymorphism

    Student(Student s){ 
        this.name = s.name;
        this.roll = s.roll;
    }
}
