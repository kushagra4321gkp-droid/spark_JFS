package Reflection_API;

class POJO {
    public int id;           // public field -> OK
    public String name;

    public POJO(int id, String name) {   // parameterized constructor -> OK
        this.id = id;
        this.name = name;
    }

    public void display() {             // methods -> allowed
        System.out.println(id + " " + name);
    }
}

public class TestPOJO {
    public static void main(String[] args) {
        POJO p = new POJO(10, "Kushagra");
        p.display();
    }
}

