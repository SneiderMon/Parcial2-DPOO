package presentacion;

import javax.swing.*;

import java.awt.*;

import logica.Parcial; 

public class ventana {

    public static void main ( String[] args ) {
        
        JFrame ventana =new JFrame();
        ventana.setSize (300, 250);
        ventana.setLayout (new BorderLayout());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelCentro =new JPanel(new GridLayout(3, 2, 10, 15) );
        panelCentro.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20) );
         

        JTextField txtA =new JTextField();
        JTextField txtB = new JTextField();
        JTextField txtC = new JTextField();

        panelCentro.add(new JLabel("a:")); panelCentro.add(txtA) ;
        panelCentro.add(new JLabel("b:")); panelCentro.add(txtB) ;
        panelCentro.add(new JLabel("c:")); panelCentro.add(txtC) ;
        ventana.add(panelCentro, BorderLayout.CENTER);

        JPanel panelAbajo = new JPanel(new FlowLayout());
        
        JButton btnCalcular = new JButton("Calcular");
        JLabel lblResultado = new JLabel("Resultado:");
        
        panelAbajo.add(btnCalcular);
        panelAbajo.add(lblResultado);
        ventana.add(panelAbajo, BorderLayout.SOUTH);


        btnCalcular.addActionListener(e -> {
            try {

                double a = Double.parseDouble(txtA.getText());
                double b = Double.parseDouble(txtB.getText());
                double c = Double.parseDouble(txtC.getText());


                String res = new Parcial().calcularFormulaCuadratica(a, b, c);
                

                lblResultado.setText("Resultado: " + res);

            } catch (NumberFormatException ex) {
  
                lblResultado.setText("Error, Ingrese numeros");
            } catch (IllegalArgumentException ex) {

                lblResultado.setText("eerror matematico");
                JOptionPane.showMessageDialog(ventana, ex.getMessage());
            }
        });

        ventana.setVisible(true);
    }
}