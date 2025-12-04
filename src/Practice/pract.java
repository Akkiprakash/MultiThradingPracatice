package Practice;


interface akki{
   public int maxi(int a ,int b);
}
public class pract {
    public static void main(String[] args) {
        akki max = (a,b)->Math.max(a,b);
//        akki max = Math::max; /// alter we can also use thus
        System.out.println(max.maxi(3,4));
    }
}
