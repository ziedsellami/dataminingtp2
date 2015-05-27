

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

import java.awt.GridBagLayout;

import javax.swing.JComboBox;

import java.awt.GridBagConstraints;

import javax.swing.JLabel;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Input extends JFrame implements ActionListener {

	private JPanel contentPane;
	JComboBox comboBox;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox_1;
	private JLabel lblDoors;
	private JComboBox comboBox_2;
	private JLabel lblPersons;
	private JComboBox comboBox_3;
	private JLabel lblNewLabel_2;
	private JLabel lblSafety;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JButton btnResultat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Input frame = new Input();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Input() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Buying");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		 comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 1;
		contentPane.add(comboBox, gbc_comboBox);
		comboBox.addItem("vhigh");
		comboBox.addItem("high");
		comboBox.addItem("med");
		comboBox.addItem("low");
		
		
		lblNewLabel_1 = new JLabel("Maint");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 2;
		contentPane.add(comboBox_1, gbc_comboBox_1);
		comboBox_1.addItem("vhigh");
		comboBox_1.addItem("high");
		comboBox_1.addItem("med");
		comboBox_1.addItem("low");
		
		lblDoors = new JLabel("Doors");
		GridBagConstraints gbc_lblDoors = new GridBagConstraints();
		gbc_lblDoors.anchor = GridBagConstraints.EAST;
		gbc_lblDoors.insets = new Insets(0, 0, 5, 5);
		gbc_lblDoors.gridx = 0;
		gbc_lblDoors.gridy = 3;
		contentPane.add(lblDoors, gbc_lblDoors);
		
		comboBox_2 = new JComboBox();
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 3;
		contentPane.add(comboBox_2, gbc_comboBox_2);
		comboBox_2.addItem("2");
		comboBox_2.addItem("3");
		comboBox_2.addItem("4");
		comboBox_2.addItem("5");
	
		
		lblPersons = new JLabel("Persons");
		GridBagConstraints gbc_lblPersons = new GridBagConstraints();
		gbc_lblPersons.anchor = GridBagConstraints.EAST;
		gbc_lblPersons.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersons.gridx = 0;
		gbc_lblPersons.gridy = 4;
		contentPane.add(lblPersons, gbc_lblPersons);
		
		comboBox_3 = new JComboBox();
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 1;
		gbc_comboBox_3.gridy = 4;
		contentPane.add(comboBox_3, gbc_comboBox_3);
		
		comboBox_3.addItem("2");
		comboBox_3.addItem("4");
		comboBox_3.addItem("5");
		
		
		
		lblNewLabel_2 = new JLabel("Lug_boot");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 5;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		comboBox_4 = new JComboBox();
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.gridx = 1;
		gbc_comboBox_4.gridy = 5;
		contentPane.add(comboBox_4, gbc_comboBox_4);// small, med, big.
		comboBox_4.addItem("small");
		comboBox_4.addItem("med");
		comboBox_4.addItem("big");
		
		lblSafety = new JLabel("Safety");
		GridBagConstraints gbc_lblSafety = new GridBagConstraints();
		gbc_lblSafety.anchor = GridBagConstraints.EAST;
		gbc_lblSafety.insets = new Insets(0, 0, 5, 5);
		gbc_lblSafety.gridx = 0;
		gbc_lblSafety.gridy = 6;
		contentPane.add(lblSafety, gbc_lblSafety);
		
		comboBox_5 = new JComboBox();
		GridBagConstraints gbc_comboBox_5 = new GridBagConstraints();
		gbc_comboBox_5.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_5.gridx = 1;
		gbc_comboBox_5.gridy = 6;
		contentPane.add(comboBox_5, gbc_comboBox_5);//low, med, high.
		comboBox_5.addItem("low");
		comboBox_5.addItem("med");
		comboBox_5.addItem("high");
		
		btnResultat = new JButton("Resultat");
		GridBagConstraints gbc_btnResultat = new GridBagConstraints();
		gbc_btnResultat.gridx = 1;
		gbc_btnResultat.gridy = 7;
		contentPane.add(btnResultat, gbc_btnResultat);
		btnResultat.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnResultat)
		{
			//System.out.println(comboBox.getSelectedIndex()+1);
			Algorithme algorithme= new Algorithme(comboBox.getSelectedIndex()+1 ,comboBox_1.getSelectedIndex()+1, Float.parseFloat((String) comboBox_2.getSelectedItem()), Float.parseFloat((String) comboBox_3.getSelectedItem()), comboBox_4.getSelectedIndex()+1, comboBox_5.getSelectedIndex()+1);
			Value id3 = algorithme.id3();
			Value chaid = algorithme.chaid();
			JOptionPane.showMessageDialog(this,"Pour ID3 la classe est "+id3.value+" avec accuracy = "+id3.acuuracy +" on unacc ="+id3.rs.unacc+" on acc = "+id3.rs.acc +" on good"+id3.rs.good+" on vgood= " +id3.rs.vgood+"\n"+"Pour Chaid la classe est "+chaid.value+" avec accuracy = "+chaid.acuuracy +" on unacc ="+chaid.rs.unacc+" on acc = "+chaid.rs.acc +" on good"+chaid.rs.good+" on vgood= " +chaid.rs.vgood, "Résultat complete",
					JOptionPane.INFORMATION_MESSAGE);
						
		}
		
			
	}

}
