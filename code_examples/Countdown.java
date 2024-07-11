public class Countdown {
    public static void main(String[] args) throws java.lang.InterruptedException {
        int t = 10;
        while (t > 0) {
            Thread.sleep(1000); // wait 1 second
            System.out.println(t);
            t--;
        }
    }
}
