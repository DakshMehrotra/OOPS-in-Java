class parent{
    private String str= "I am private";

    String display(){
        return str;
    }
}

class child extends parent{
    void display(){
        System.out.println(str);
    }
}

public class c1_public_class {
    public static void main(String[] args){
        parent p1 = new parent();
        child c1 = new child();

        String s1 = p1.display();
        System.out.println(s1);
        // c1.display();
    }    
}
