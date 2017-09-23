/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author Cristian
 */
public class Opcion extends JFrame{
    private JButton boton;
    public static int cont = 0;
    static public String empresa[] = new String[10];
    public Opcion(){
    super("Elije una Empresa");
    this.setBounds(100, 100, 400, 200);
    this.setLayout(null);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    boton = new JButton("Cash-Money");
    boton.setBounds(50, 50, 120, 30);
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cambiar();
            llenarA();
        }

    });
    this.add(boton);
    boton.setVisible(true);
    boton = new JButton("Pro-Pisto");
    boton.setBounds(200, 50, 120, 30);
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cambiar();
            llenarB();
        }

    });
    this.add(boton);
    boton.setVisible(true);
    }
    public void llenarA(){
    String emp = "Cash-Money";
    empresa[cont]= emp;
    cont++;
    }
    public void llenarB(){
    String emp = "Pro-Pisto";
    empresa[cont]= emp;
    cont++;
    }
    public void cambiar(){
        SaldoInicial a = new SaldoInicial();
        a.setVisible(true);
        this.setVisible(false);
    }
}
