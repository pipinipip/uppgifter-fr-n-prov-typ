package me.pipinipip;
// gjort 2019-11-14 av Elon Nygren
import javax.swing.*;

public class uppgift1 {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog ("Vad heter du");
        String S = s.toUpperCase();
        JOptionPane.showMessageDialog(null, "Lycka till " + S + "!");

    }
}
