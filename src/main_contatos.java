import javax.swing.*;

public class main_contatos {
    private JPanel cadastrodecontatos;
    private JTextField txtnome;
    private JTextField txttelefone;
    private JTextField txtemail;
    private JButton btnadicionarcontato;
    private JButton btnlimpar;
    private JList liscontatos;
    private JLabel lblnomes;
    private JLabel lbltelefone;
    private JLabel lblemail;
    private JTextArea txtareastatus;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new main_contatos().cadastrodecontatos);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

