package exam_preparation;
class a{
    int a;
    int b;
}
class b extends a{
   b() {
       a = 10;b=20;
   }
}
class c extends b{
    void sum(){
        System.out.println("Sum is =" +(a+b));
    }
}
public class inheritence {
    public static void main(String[] args){
        c su=new c();
        su.sum();
    }
}
