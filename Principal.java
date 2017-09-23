package proyecto1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USUARIO
 */
public class Principal extends JFrame{
    private JLabel imagen;
    private JButton boton;
    private JMenuBar ayuda;
    
    
    public Principal(){
    
    super("Tipo de Transacción");
    this.setBounds(100, 10, 600, 350);
    this.setLayout(null);
    ayuda = new JMenuBar();
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    boton = new JButton("Saldo Actual");
    boton.setBounds(15, 20, 150, 70);
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        actual();
        
        }

    });
    this.add(boton);
    boton.setVisible(true);
    boton = new JButton("Transferencia Estudiantes");
    boton.setBounds(185, 20, 150, 70);
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        estudiante();
        
        }

    });
    this.add(boton);
    boton.setVisible(true);
    boton = new JButton("Tranferencia Libre");
    boton.setBounds(355, 20, 150, 70);
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        libre();
        
        }

    });
    this.add(boton);
    this.add(boton);
    boton.setVisible(true);
    boton = new JButton("Re-impresion");
    boton.setBounds(15, 110, 150, 70);
    this.add(boton);
    boton.setVisible(true);
    boton = new JButton("Grafica de Pie");
    boton.setBounds(185, 110, 150, 70);
    this.add(boton);
    boton.setVisible(true);
    boton = new JButton("Grafica de Barras");
    boton.setBounds(355, 110, 150, 70);
    this.add(boton);
    boton.setVisible(true);
    boton = new JButton("Retiro de Efectivo");
    boton.setBounds(15, 200, 150, 70);
    this.add(boton);
    boton.setVisible(true);
    boton = new JButton("Salir");
    boton.setBounds(185, 200, 150, 70);
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        salir();
        SaldoInicial.saldo = 0;
        
        }

    });
    this.add(boton);
    boton.setVisible(true);
    }
    public void actual(){
    Saldo a = new Saldo();
    a.setVisible(true);
    this.setVisible(false);
    }
    public void estudiante(){
    TransfEstud a = new TransfEstud();
    a.setVisible(true);
    this.setVisible(false);
    }
    public void salir(){
    Inicio j = new Inicio();
    j.setVisible(true);
    this.setVisible(false);
    }
    public void libre(){
    TransfLibre k = new TransfLibre();
    k.setVisible(true);
    this.setVisible(false);
    }
    
}

