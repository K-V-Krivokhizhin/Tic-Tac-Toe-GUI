package com.company;

import javax.swing.JFrame;


public class GameWindow extends JFrame {
    public GameWindow(){
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,318,340);
        setResizable(false);
        add(new GameField());
        setVisible(true);
    }
}
