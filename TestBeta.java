import org.apache.commons.math3.distribution.BetaDistribution;


public class TestBeta {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double x;
        double b;
        BetaDistribution beta = new BetaDistribution(40.0, 40.0);
        for (int i = 0; i < 10; i++) {
            x = Math.random();
            b = beta.inverseCumulativeProbability(x);
            System.out.println(b);
        }
    }
}