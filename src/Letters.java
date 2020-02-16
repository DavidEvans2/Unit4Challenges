import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;

public class Letters {
    public static void main(String[] args) {
        BigInteger Wis = new BigInteger("5726398");
        BigInteger Cal = new BigInteger("38041430");
        BigInteger Tex = new BigInteger("26059203");

        DecimalFormat df = new DecimalFormat("#,###.####");

        BigInteger WiskyCali = Wis.multiply(Cal);
        System.out.println("There were " + WiskyCali + " letters sent from Wisconsin to California");

        BigInteger CalTex = WiskyCali.multiply(Tex);
        System.out.println("There were also " + CalTex + " copies sent from California to Texas");

        BigDecimal costPerCopy = new BigDecimal("3.23");
        BigDecimal totalCost = costPerCopy.multiply(new BigDecimal(CalTex));
        System.out.println("It's gonna cost around $" + df.format(totalCost));

    }
}
