package packone;

/**
 *
 * @author paranoidandroid
 */
import java.util.Scanner;

public abstract class Classp {

    //Variables de tipo string
    protected int one, filth;
    Scanner in = new Scanner(System.in);

    public void Lyrcs() {

        int flag = 0;
        int sele = 0;
        do {
            do {
                System.out.println("-----------------------------------------");
                System.out.println("Lyrics de canciones");
                System.out.println("-----------------------------------------");
                System.out.println("E S C O J E");
                System.out.println("-----------------------------------------");
                System.out.println("                          1.One Metallica");
                System.out.println("           2.seed of filth Six feed under");
                System.out.println("                                 3.Me voy");
                System.out.println("-----------------------------------------");
                sele = in.nextInt();

                if (sele >= 1 && sele <= 2) {
                    flag = 1;

                } else {
                    System.out.println("---------");
                    System.out.println("e r r o r");
                    System.out.println("---------");

                }

            } while (flag == 0);

            if (sele == 1) {
                Classp msj = new Variable();
                msj.Letras();

            } else if (sele == 2) {
                Classp msj = new Variabledos();
                msj.Letras();

            } else if (sele == 3) {

                System.out.println("Adios");
                flag = 2;

            }
        } while (flag != 2);
    }

    public void Varuno() {
        one = in.nextInt();

    }

    public void Vados() {
        filth = in.nextInt();

    }

    public abstract void Letras();

}
