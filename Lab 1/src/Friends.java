import javax.swing.JOptionPane;

public class Friends {

    public static void main (String[] args) {

        int line = 1;

        String name1 = JOptionPane.showInputDialog("What is the name of friend one?");
        System.out.println(line + "\t" + name1);

        line++;

        String name2 = JOptionPane.showInputDialog("What is the name of friend two?");
        System.out.println(line + "\t" + name2);

        line++;

        String name3 = JOptionPane.showInputDialog("What is the name of friend three?");
        System.out.println(line + "\t" + name3);

    }

}