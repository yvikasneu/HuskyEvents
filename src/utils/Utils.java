/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author vikas
 */
public class Utils {
    public static JButton copyButtonStyles(JButton originalButton) {
        JButton clonedButton = new JButton();

        // Copy relevant styles from the original button
        clonedButton.setFont(originalButton.getFont());
        clonedButton.setForeground(originalButton.getForeground());
        clonedButton.setBackground(originalButton.getBackground());
        clonedButton.setBorder(originalButton.getBorder());
        clonedButton.setFocusPainted(originalButton.isFocusPainted());
        clonedButton.setFocusable(originalButton.isFocusable());
        clonedButton.setCursor(originalButton.getCursor());

        // Copy ActionListener(s) from the original button to the cloned button
        ActionListener[] actionListeners = originalButton.getActionListeners();
        for (ActionListener listener : actionListeners) {
            clonedButton.addActionListener(listener);
        }

        return clonedButton;
    }
}
