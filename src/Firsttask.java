import java.io.IOException;

public class Firsttask {
    static String[] key = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566430860213949463952247371907021798609437027705392171762931767523846748184676694051320005681271452635608277857713427577896091736371787214684409012249534301465495853710507922796892589235420199561121290219608640344181598136297747713099605187072113499999983729780499510597317328160963185950244594553469083026425223082533446850352619311881710100031378387528865875332083814206171776691473035982534904287554687311595628638823537875937519577818577805321712268066130019278766111959092164201989".split("");

    public Firsttask() throws IOException {
        Read in = new Read();
        String chiffrattext = in.readin("mtc3-esslinger-06-onetimepad-cipher.txt");
        dechifftestall(101,chiffrattext);


    }
    //Hilfsmethoden
    public int[] stringtoint(String[] ein){
        int[] aus = new int[ein.length];
        for (int i = 0; i < ein.length; i++){
            aus[i] = Integer.parseInt(ein[i]);
        }
        return aus;
    }
    public int[] tonumbers(String chipher){
        String[] arraychipher = new String[chipher.length()];
        arraychipher = chipher.split("");

        int[] ergebnis = new int[arraychipher.length/2 +1];
        int t;
        for (int i = 0; i < chipher.length(); i++){
            if (i%2 == 0){
                t = i /2;
                switch (arraychipher[i]) {
                    case "A":
                        ergebnis[t] = 0;
                        break;
                    case "B":
                        ergebnis[t] = 1;
                        break;
                    case "C":
                        ergebnis[t] = 2;
                        break;
                    case "D":
                        ergebnis[t] = 3;
                        break;
                    case "E":
                        ergebnis[t] = 4;
                        break;
                    case "F":
                        ergebnis[t] = 5;
                        break;
                    case "G":
                        ergebnis[t] = 6;
                        break;
                    case "H":
                        ergebnis[t] = 7;
                        break;
                    case "I":
                        ergebnis[t] = 8;
                        break;
                    case "J":
                        ergebnis[t] = 9;
                        break;
                    case "K":
                        ergebnis[t] = 10;
                        break;
                    case "L":
                        ergebnis[t] = 11;
                        break;
                    case "M":
                        ergebnis[t] = 12;
                        break;
                    case "N":
                        ergebnis[t] = 13;
                        break;
                    case "O":
                        ergebnis[t] = 14;
                        break;
                    case "P":
                        ergebnis[t] = 15;
                        break;
                    case "Q":
                        ergebnis[t] = 16;
                        break;
                    case "R":
                        ergebnis[t] = 17;
                        break;
                    case "S":
                        ergebnis[t] = 18;
                        break;
                    case "T":
                        ergebnis[t] = 19;
                        break;
                    case "U":
                        ergebnis[t] = 20;
                        break;
                    case "V":
                        ergebnis[t] = 21;
                        break;
                    case "W":
                        ergebnis[t] = 22;
                        break;
                    case "X":
                        ergebnis[t] = 23;
                        break;
                    case "Y":
                        ergebnis[t] = 24;
                        break;
                    case "Z":
                        ergebnis[t] = 25;

                }
            }
        }

        return ergebnis;
    }
    public String inttostring(int[] ein){
        String aus = "";
        for (int i = 0; i < ein.length; i++){
            aus = aus + ein[i];
        }
        return aus;
    }
    //Dechiffmehtoden
    public String dechiff(int[] chipher, int[] key, int offset){
        int[] voraus = new int[chipher.length];
        int zwischen;
        for (int i = 0; i < chipher.length; i++){
           zwischen = (chipher[i] - ((key[i+offset]*10)+key[i+offset+1]))%26;
           voraus[i] = zwischen;
        }
        return inttostring(voraus);
    }
    public void dechifftestall(int durchgänge,String chiffrat){
        for (int i = 0; i <= durchgänge; i++ ){
            System.out.println(dechiff(tonumbers(chiffrat),stringtoint(key),i));
        }
    }

    public static void main (String args[]) throws IOException {
        Firsttask one = new Firsttask();


    }
}
