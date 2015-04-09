package Configuration;

import AddEditPanels.AddEditGlider;
import DataObjects.CurrentDataObjectSet;
import DataObjects.Sailplane;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.awt.Font;

import javax.swing.JButton;

import Communications.Observer;
import Configuration.UnitConversionRate;
import Configuration.UnitLabelUtilities;
import DatabaseUtilities.DatabaseUnitSelectionUtilities;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;

import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class ProfileGliderPanel extends JPanel{
    private CurrentDataObjectSet currentData;
    protected JComboBox emptyWeightComboBox = new JComboBox();
    protected JComboBox maxGrossWeightComboBox = new JComboBox();
    protected JComboBox stallSpeedComboBox = new JComboBox();
    protected JComboBox weakLinkStrengthComboBox = new JComboBox();
    protected JComboBox maxWinchingSpeedComboBox = new JComboBox();
    protected JComboBox maxTensionComboBox = new JComboBox();
    protected JComboBox ballastWeightComboBox = new JComboBox();
    protected JComboBox baggageWeightComboBox = new JComboBox();
    protected JComboBox passengerWeightComboBox = new JComboBox();
      
    /**
     * Creates new form sailplanePanel
     */
    public ProfileGliderPanel() {
        currentData = CurrentDataObjectSet.getCurrentDataObjectSet();
        initComponents();
    }
    
    /**
     * Create the panel.
     */
    public void initComponents() {
        setLayout(new BorderLayout(0, 0));

        JPanel unitsPanel = new JPanel();
        unitsPanel.setBackground(Color.WHITE);
        JScrollPane unitsPanelScrollPane = new JScrollPane();
        add(unitsPanelScrollPane);
        unitsPanel.setPreferredSize(new Dimension(600,400));
        unitsPanelScrollPane.setViewportView(unitsPanel);
        unitsPanelScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_ALWAYS);
        unitsPanelScrollPane.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_ALWAYS);
        
        JLabel emptyWeightLabel = new JLabel("Empty Weight:");
        emptyWeightLabel.setBounds(9, 37, 86, 14);
        emptyWeightComboBox.setBounds(150, 34, 54, 20);
        emptyWeightComboBox.setMaximumSize(new Dimension(32767, 20));
        emptyWeightComboBox.addItem("kg");
        emptyWeightComboBox.addItem("lbs");

        JLabel maxGrossWeightLabel = new JLabel("Max Gross Weight:");
        maxGrossWeightLabel.setBounds(9, 63, 117, 14);

        maxGrossWeightComboBox.setBounds(150, 60, 54, 20);
        maxGrossWeightComboBox.setMaximumSize(new Dimension(32767, 20));
        maxGrossWeightComboBox.addItem("kg");
        maxGrossWeightComboBox.addItem("lbs");

        JLabel indicatedStallSpeedLabel = new JLabel("Indicated Stall Speed:");
        indicatedStallSpeedLabel.setBounds(9, 89, 140, 14);

        stallSpeedComboBox.setBounds(150, 86, 54, 20);
        stallSpeedComboBox.setMaximumSize(new Dimension(32767, 20));
        stallSpeedComboBox.addItem("kph");
        stallSpeedComboBox.addItem("mph");
        stallSpeedComboBox.addItem("m/s");
        stallSpeedComboBox.addItem("kn");

        JLabel weakLinkStrengthLabel = new JLabel("Max Weak Link Strength:");
        weakLinkStrengthLabel.setBounds(280, 63, 150, 14);

        JLabel maxWinchingSpeedLabel = new JLabel("Max Winching Speed:");
        maxWinchingSpeedLabel.setBounds(280, 37, 150, 14);

        weakLinkStrengthComboBox.setBounds(440, 60, 54, 20);
        weakLinkStrengthComboBox.setMaximumSize(new Dimension(32767, 20));
        weakLinkStrengthComboBox.addItem("N");
        weakLinkStrengthComboBox.addItem("lbf");
        weakLinkStrengthComboBox.addItem("kgf");
        weakLinkStrengthComboBox.addItem("daN");

        maxWinchingSpeedComboBox.setBounds(440, 34, 54, 20);
        maxWinchingSpeedComboBox.setMaximumSize(new Dimension(32767, 20));
        maxWinchingSpeedComboBox.addItem("kph");
        maxWinchingSpeedComboBox.addItem("mph");
        maxWinchingSpeedComboBox.addItem("m/s");
        maxWinchingSpeedComboBox.addItem("kn");

        JLabel maxTensionLabel = new JLabel("Max Tension:");
        maxTensionLabel.setBounds(280, 89, 150, 14);

        maxTensionComboBox.setBounds(440, 86, 54, 20);
        maxTensionComboBox.setMaximumSize(new Dimension(32767, 20));
        maxTensionComboBox.addItem("N");
        maxTensionComboBox.addItem("lbf");
        maxTensionComboBox.addItem("kgf");
        maxTensionComboBox.addItem("daN");

        JLabel ballastWeightLabel = new JLabel("Ballast Weight:");
        ballastWeightLabel.setBounds(9, 159, 117, 14);

        JLabel passengerWeightLabel = new JLabel("Total Passenger Weight:");
        passengerWeightLabel.setBounds(280, 159, 150, 14);

        JLabel baggageWeightLabel = new JLabel("Baggage Weight:");
        baggageWeightLabel.setBounds(9, 197, 117, 14);

        ballastWeightComboBox.setBounds(150, 156, 54, 20);
        ballastWeightComboBox.setMaximumSize(new Dimension(32767, 20));
        ballastWeightComboBox.addItem("kg");
        ballastWeightComboBox.addItem("lbs");

        baggageWeightComboBox.setBounds(150, 194, 54, 20);
        baggageWeightComboBox.setMaximumSize(new Dimension(32767, 20));
        baggageWeightComboBox.addItem("kg");
        baggageWeightComboBox.addItem("lbs");

        passengerWeightComboBox.setBounds(440, 156, 54, 20);
        passengerWeightComboBox.setMaximumSize(new Dimension(32767, 20));
        passengerWeightComboBox.addItem("kg");
        passengerWeightComboBox.addItem("lbs");
                
        JLabel label_11 = new JLabel("");
        label_11.setBounds(668, 40, 0, 0);
        unitsPanel.setLayout(null);
        unitsPanel.add(ballastWeightLabel);
        unitsPanel.add(emptyWeightLabel);
        unitsPanel.add(maxGrossWeightLabel);
        unitsPanel.add(indicatedStallSpeedLabel);
        unitsPanel.add(baggageWeightLabel);
        unitsPanel.add(baggageWeightComboBox);
        unitsPanel.add(stallSpeedComboBox);
        unitsPanel.add(emptyWeightComboBox);
        unitsPanel.add(maxGrossWeightComboBox);
        unitsPanel.add(ballastWeightComboBox);
        unitsPanel.add(weakLinkStrengthLabel);
        unitsPanel.add(maxWinchingSpeedLabel);
        unitsPanel.add(maxTensionLabel);
        unitsPanel.add(passengerWeightLabel);
        unitsPanel.add(maxTensionComboBox);
        unitsPanel.add(maxWinchingSpeedComboBox);
        unitsPanel.add(weakLinkStrengthComboBox);
        unitsPanel.add(passengerWeightComboBox);
        unitsPanel.add(label_11);
        
        JLabel label = new JLabel("Glider");
        label.setFont(new Font("Tahoma", Font.PLAIN, 24));
        label.setBounds(9, 0, 140, 31);
        unitsPanel.add(label);
        add(unitsPanelScrollPane);
        
    }   
}
