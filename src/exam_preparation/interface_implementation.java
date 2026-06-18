package exam_preparation;
interface client{
    void webdeg();
    void werdev();
}
class rajtech implements client {
    public void webdeg() {
        System.out.println("Hi web page has been design ");
    }

    public void werdev() {
        System.out.println("Web development done");
    }
}
public class interface_implementation {
    public static  void main(String[] args){
        rajtech raj=new rajtech();
        raj.webdeg();
        raj.werdev();
    }
}
