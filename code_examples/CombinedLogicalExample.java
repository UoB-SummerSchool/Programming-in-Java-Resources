public class CombinedLogicalExample {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean hasHomework = false;
        boolean isHoliday = false;

        // Using !, ||, and && together
        if (isWeekend && (!hasHomework || isHoliday)) {
            System.out.println("You can relax and enjoy your day.");
        } else {
            System.out.println("You need to finish your homework.");
        }
    }
}
