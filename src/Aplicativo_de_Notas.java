import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Aplicativo_de_Notas {
    private JPanel AplicativoDeNotas;
    private JTextField txtInserirNotas;
    private JButton btnadicionarNota;
    private JButton btncalcular;
    private JTextArea txtaListadeNotas;
    private JLabel lbldigitarnotas;
    private JLabel lblResultado;
    Double aux = 0.0;


    double notas = 0;
    int i = 0;
    double media = 0;
    ArrayList listadeNotas = new ArrayList<>();

    // append Adiciona o conteudo sem apagar o conteúdo anterior
    // aux guarda a soma de todas as notas
    public Aplicativo_de_Notas() {
        btnadicionarNota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notas = Double.parseDouble(txtInserirNotas.getText());
                aux = aux + notas;
                i++;
                listadeNotas.add(i);
                txtaListadeNotas.append(+i + "° nota " + notas + "\n");
            }
        });
        btncalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                media = aux / i;
                if (media >= 7) {
                    lblResultado.setText("Aprovado " + media);
                } else {
                    lblResultado.setText("Reprovado " + media);
                }
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




