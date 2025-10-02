public class Dice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1;
        int roll2;
    }

    public int roll(){
        int maxValue = 6;
        int minValue = 1;
        int randomNumber = (int)(Math.random() * maxValue) + minValue;
        System.out.println(randomNumber);
        return randomNumber;
        }
}
