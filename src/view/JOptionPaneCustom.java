package view;

import java.awt.HeadlessException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.getRootFrame;
import javax.swing.UIManager;

/**
 * @author Talles
 */

public class JOptionPaneCustom extends JOptionPane {
    
    public static String showInputDialog(final Object message, String title) throws HeadlessException {
        
        final JOptionPane pane = new JOptionPane(message, QUESTION_MESSAGE,OK_CANCEL_OPTION, null, new Object[]{"OK", "Cancelar"}, null);
        pane.setWantsInput(true);
        pane.setComponentOrientation((getRootFrame()).getComponentOrientation());
        pane.setMessageType(QUESTION_MESSAGE);
        pane.selectInitialValue();
        final JDialog dialog = pane.createDialog(null, title);
        dialog.setVisible(true);
        dialog.dispose();
        final Object value = pane.getInputValue();
        return (value == UNINITIALIZED_VALUE) ?  null : (String) value;
    }
}