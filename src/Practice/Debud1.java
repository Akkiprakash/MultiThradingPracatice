package Practice;

class check{
    public void disp(){
        System.out.println("method Line");
    }
}
public class Debud1 {
    public static void main(String[] args) {
        System.out.println("! st line");

        for(int i=0;i<3;i++){
            System.out.println(i);
        }
        check ch = new check();
        ch.disp();

        System.out.println("code teerminated");
    }
}
