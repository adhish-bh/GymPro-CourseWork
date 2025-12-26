
import Util.SampleData;
import View.LoginUI;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adhish
 */
public class Main {
    public static void main (String [] args){
        new LoginUI().setVisible(true);
        SampleData.loadSampleData();
        UIManager.put("Button.background", new Color(204, 51, 0));
        UIManager.put("Button.foreground", Color.WHITE);
        UIManager.put("Button.font", new Font("SansSerif", Font.BOLD, 13));

        // === REMOVE BLUE FOCUS OUTLINE (THIS IS THE KEY PART) ===
        UIManager.put("Button.focus", new Color(0, 0, 0, 0)); // transparent
        UIManager.put("Button.focusPainted", false);
        UIManager.put("Button.borderPainted", false);
        UIManager.put("Button.contentAreaFilled", true);
        UIManager.put("Button.opaque", true);

        // Optional: remove focus from all components
        UIManager.put("Focus.color", new Color(0, 0, 0, 0));
        UIManager.put("Focus.border", null);
        
        SwingUtilities.invokeLater(() -> {
            new LoginUI().setVisible(true);
        });
    }
    
}
