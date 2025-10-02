public class Dice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1;
        int roll2;
        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;

        //region loop
        for (int i = 0; i < 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            System.out.printf("Roll%d: %d - %d  Sum: %d%n", (i+1), roll1, roll2, sum);

            if (sum == 2) {
                count2++;
            } else if (sum == 4) {
                count4++;
            } else if (sum == 6) {
                count6++;
            } else if (sum == 7) {
                count7++;
            }
        }
        //endregion

        System.out.println("\nNumber of times the sum of two dice was 2: " + count2);
        System.out.println("Number of times the sum of two dice was 4: " + count4);
        System.out.println("Number of times the sum of two dice was 6: " + count6);
        System.out.println("Number of times the sum of two dice was 7: " + count7);

    }

    public int roll(){
        int maxValue = 6;
        int minValue = 1;
        return (int)(Math.random() * maxValue) + minValue;
        }
}
