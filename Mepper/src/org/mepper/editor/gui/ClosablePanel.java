/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CloseablePanel.java
 *
 * Created on 2010-12-26, 22:55:10
 */

package org.mepper.editor.gui;

import java.awt.event.MouseAdapter;

import javax.swing.Icon;

import org.zhiwu.app.AppManager;
import org.zhiwu.utils.AppResources;

/**
 *
 * @author root
 */
public class ClosablePanel extends javax.swing.JPanel {

    /** Creates new form CloseablePanel */
    public ClosablePanel(String title, final ClosableTabbedPane observer,final int tabIndex, Icon icon) {
        initComponents();
        
        AppResources r=AppManager.getResources();
        infoIcon.setIcon(icon);
        closeIcon.setIcon(r.getImageIcon("closable.panel.close"));
        info.setText(title);
        closeIcon.addMouseListener(new MouseAdapter() {
        	@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
        		observer.removeTabAt(observer.indexOfTabComponent(ClosablePanel.this));
        	};
		});
        validate();
        repaint();
    }


	/** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoIcon = new javax.swing.JLabel();
        closeIcon = new javax.swing.JLabel();
        info = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout(2, 0));
        add(infoIcon, java.awt.BorderLayout.LINE_START);
        add(closeIcon, java.awt.BorderLayout.LINE_END);

        info.setText("text");
        add(info, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeIcon;
    private javax.swing.JLabel info;
    private javax.swing.JLabel infoIcon;
    // End of variables declaration//GEN-END:variables

}