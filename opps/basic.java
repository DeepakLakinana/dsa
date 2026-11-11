package opps;

public class basic {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //createed a object called p1
        p1.setcolor("Blue");;
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);

        BankAccount myacc = new BankAccount();
        myacc.username = "Deepak";
        //myacc.password = "Deepak123" this cannot be done as the password cannot be accessed from the main class
        myacc.setpassword("Deepak123"); //Though this will work
    }
}

class BankAccount{ 
    public String username;//can be accessed easily and by every class
    private String password;//cannot be accessed in any other class
    public void setpassword(String pwd){ 
        password = pwd;
    }

}

class Pen{ 
    String color;
    int tip;

    void setcolor(String newcolor){ 
        color = newcolor;
    }

    void settip(int newtip){ 
        tip = newtip;
    }

}

class Student{ 
    String name;
    int age;
    float percentage;

    void calcpercentage(int math,int phy,int chem){ 
        percentage = ( math + phy + chem) / 3;
    }
}
