import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Created by Julia Galabut on 16.02.2016.
 */
public class BigDecimalTest {
    public static void main(String[] args) {

        BigDecimal sum = new BigDecimal("9999.5555");
        System.out.println("sum = " + sum);
        float multiplier = 0.04f;
        BigDecimal bigmultiplier = new BigDecimal("2.66");
        BigDecimal bigmultiplier2 = new BigDecimal("2.66");
        System.out.println("___________________________________");
//        System.out.println("BigDecimal = 9999.999 * new BigDecimal(float = 0.04f)");
//        BigDecimal commission = sum.multiply(new BigDecimal(multiplier));
//        System.out.println("commission = " + commission);
//
//        System.out.println("___________________________________");
//        System.out.println("BigDecimal.setScale()");
//        commission.setScale(3, BigDecimal.ROUND_UP);
//        System.out.println("commission.setScale= " + commission);

        System.out.println("___________________________________");
        System.out.println("BigDecimal1 = BigDecimal.setScale()");
        BigDecimal commission1 = sum.setScale(3, BigDecimal.ROUND_HALF_UP);
        System.out.println("commission1.setScale= " + commission1);

        System.out.println("___________________________________");
        System.out.println("BigDecimal = roundedBigDecimal*new BigDecimal(float = 0.04f)");
        BigDecimal newDecimalMultiplied = commission1.multiply(new BigDecimal(multiplier));
        System.out.println("newDecimalMultiplied= " + newDecimalMultiplied);

        System.out.println("___________________________________");
        System.out.println("BigDecimal = new BigDecimal(float = 0.04f)*roundedBigDecimal");
        BigDecimal newDecimalMultipliedMixed = new BigDecimal(multiplier).multiply(commission1);
        System.out.println("newDecimalMultipliedMixed= " + newDecimalMultipliedMixed);

        System.out.println("___________________________________");
        System.out.println("BigDecimal = new BigDecimal()*roundedBigDecimal");
        BigDecimal bd1Xbd2 = bigmultiplier.multiply(commission1);
        System.out.println("bd1Xbd2= " + bd1Xbd2);

        System.out.println("___________________________________");
        System.out.println("BigDecimal = roundedBigDecimal*new BigDecimal()");
        MathContext mth = new MathContext(8, RoundingMode.UP);
        BigDecimal bd2Xbd1 = bigmultiplier2.multiply(bigmultiplier);
        Long bd2Xbd3=BigDecimal.valueOf(100).multiply(bd2Xbd1).longValue();
        System.out.println(bd2Xbd3);
        System.out.println("bd2Xbd1= " + bd2Xbd1);

        System.out.println("___________________________________");
        BigDecimal bigDecimalRounded = bigmultiplier.setScale(4, BigDecimal.ROUND_UP);
        System.out.println("Two rounded Decimals: " + commission1 + " * " + bigDecimalRounded);
        BigDecimal bd2Xbd12 = commission1.multiply(bigDecimalRounded).round(MathContext.UNLIMITED);
        System.out.println("bd2Xbd2= " + bd2Xbd12);
    }


}
