import java.util.Scanner;
public class Percobaan2 {
    static int hitungPangkat(int x, int y){
        if (y == 0){
            return(1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc15.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc15.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}
