package runner;

import controller.ControlAutomata;
import modules.AutomataPila.controller.ControllerAP;
import modules.RegularGrammar.controller.ControllerGrammar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp {
    public static void main(String[] args) {
        JFrame window = new JFrame("JFLAP LENGUJES FORMALES");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        JButton button1 = new JButton("Gramaticas");
        JButton button2 = new JButton("Automatas de Pila");
        JButton button3 = new JButton("Expresiones Regulares");
        JButton button4 = new JButton("Automatas Finitos");
        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ControllerGrammar();
            }
        };
        ActionListener listener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ControllerAP();
            }
        };
        ActionListener listener3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Este código se ejecutará cuando se haga clic en el botón
                //Para Expresiones regulares
            }
        };
        ActionListener listener4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ControlAutomata();
            }
        };
        button1.addActionListener(listener1);
        button2.addActionListener(listener2);
        button3.addActionListener(listener3);
        button4.addActionListener(listener4);

        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        window.add(panel);
        window.setVisible(true);

    }
    
}
