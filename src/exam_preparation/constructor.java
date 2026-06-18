package exam_preparation;
class sum{
    String name;
    int id;
    sum(){
        name="rahul verma";
        id=30;
    }
    sum(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id + " "+name);
    }
}
public class constructor {
    public static void main(String[] args){
        sum s=new sum();
        sum s1= new sum(101,"rahul khan");
        s.display();
        s1.display();
    }
}
