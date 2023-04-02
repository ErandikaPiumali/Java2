public class StrIn {
    void display ( double a){
        System.out.println("Double!");
    }
    void display(String b){
        System.out.println("String!");

    }

    public static void main(String[] args) {
        StrIn sti= new StrIn();
        sti.display("Erandika");
        sti.display(45.34);

    }

}
