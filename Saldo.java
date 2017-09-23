/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author crist
 */
public class Saldo extends JFrame{
    private JButton boton;
    private JLabel label;
    private Date fecha;
    public Saldo(){
        super("Saldo Actual");
        this.setBounds(100, 100, 500, 400);
        this.setLayout(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        Calendar cal = Calendar.getInstance(); 
        Date fecha = cal.getTime(); 
        DateFormat formatter = DateFormat.getTimeInstance(); 
        label = new JLabel();
        label.setText(( formatter.format( fecha ) ));
        label.setBounds(15, 15, 100, 30);
        this.add(label);
        label.setVisible(true);
        label = new JLabel(Opcion.empresa[TransfEstud.numerous]);
        label.setBounds(400, 15, 80, 30);
        this.add(label);
        label.setVisible(true);
        label = new JLabel("Saldo Actual");
        label.setBounds(15, 65, 120, 30);
        this.add(label);
        label.setVisible(true);
        String sald = Integer.toString(SaldoInicial.Saldo[TransfEstud.numerous]);
        label = new JLabel("Q "+sald+".00");
        label.setBounds(150, 65, 100, 30);
        this.add(label);
        label.setVisible(true);
        boton = new JButton("Regresar");
        boton.setBounds(200, 115, 100, 30);
        boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        reg();
        
        }

    });
        this.add(boton);
        boton.setVisible(true);
    }
    public void reg(){
    Principal a = new Principal();
    a.setVisible(true);
    this.setVisible(false);
    }
}
