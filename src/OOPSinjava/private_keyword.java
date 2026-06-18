package OOPSinjava;

public class private_keyword {
    public static class rahul {
        int rol;
        private String name;
    }

    public static void main(String[] args1) {
        rahul n = new rahul();
        n.rol = 24;
        n.name = "Gaurav";
        System.out.println(n.rol);
        System.out.println(n.name);
    }
}
