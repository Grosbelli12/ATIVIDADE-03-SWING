import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplicativo_de_Notas {
    private JPanel AplicativoDeNotas;
    private JTextField txtInserirNotas;
    private JButton btnadicionarNota;
    private JButton btncalcular;
    private JPanel lblstatus;
    private JTextArea txtaListadeNotas;

    double nota;

    public Aplicativo_de_Notas() {
        btnadicionarNota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 nota = Double.parseDouble(txtInserirNotas.getText());
            }
        });
        btncalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicativo de Notas");
        frame.setContentPane(new Aplicativo_de_Notas().AplicativoDeNotas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}




