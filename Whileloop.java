import javax.swing.JOptionPane;
public class Whileloop {
  public static void main(String[] args) {
    int number = (int)(Math.random() * 100);
    int guess = -1;
//mientras
    while(guess != number) {
      guess = Integer.parseInt(JOptionPane.showInputDialog(null,"Guess a magin number between 0 and 100 "));

if (guess == number) {
  JOptionPane.showMessageDialog(null,"YES, the number is" + number);
} else if (guess > number) {
  JOptionPane.showMessageDialog(null, "your guess is too high");

} else {
  JOptionPane.showMessageDialog(null, "your guess is too low");
}
}
}
}
