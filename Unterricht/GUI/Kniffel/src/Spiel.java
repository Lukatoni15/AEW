import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class Spiel extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField wuerfel1;
	private JTextField wuerfel2;
	private JTextField wuerfel3;
	private JTextField wuerfel4;
	private JTextField wuerfel5;

	private int versuche = 0;
	public Spieler player = new Spieler("test", new Wuerfelbecher());
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Spiel frame = new Spiel();
					frame.setVisible(true);										
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Spiel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("wuerfeln");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(versuche == 3)
				{
					
				}
				else
				{
					Wuerfelbecher becher = player.getWuerfelbecher();
					becher.schuetteln();
					wuerfel1.setText(Integer.toString(becher.gibAugenzahl(0)));
					wuerfel2.setText(Integer.toString(becher.gibAugenzahl(1)));
					wuerfel3.setText(Integer.toString(becher.gibAugenzahl(2)));
					wuerfel4.setText(Integer.toString(becher.gibAugenzahl(3)));
					wuerfel5.setText(Integer.toString(becher.gibAugenzahl(4)));
					versuche++;
				}
			}
		});
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Einer");
		buttonGroup.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnZweier = new JRadioButton("Zweier");
		buttonGroup.add(rdbtnZweier);
		
		JRadioButton rdbtnDreier = new JRadioButton("Dreier");
		buttonGroup.add(rdbtnDreier);
		
		JRadioButton rdbtnVierer = new JRadioButton("Vierer");
		buttonGroup.add(rdbtnVierer);
		
		JRadioButton rdbtnFnfer = new JRadioButton("F\u00FCnfer");
		buttonGroup.add(rdbtnFnfer);
		
		JRadioButton rdbtnSechser = new JRadioButton("Sechser");
		buttonGroup.add(rdbtnSechser);
		
		JRadioButton rdbtnDreierpasch = new JRadioButton("Dreierpasch");
		buttonGroup.add(rdbtnDreierpasch);
		
		JRadioButton rdbtnViererpasch = new JRadioButton("Viererpasch");
		buttonGroup.add(rdbtnViererpasch);
		
		JRadioButton rdbtnFullHouse = new JRadioButton("Full House");
		buttonGroup.add(rdbtnFullHouse);
		
		JRadioButton rdbtnGroeStrae = new JRadioButton("Gro\u00DFe Stra\u00DFe");
		buttonGroup.add(rdbtnGroeStrae);
		
		JRadioButton rdbtnKleineStrae = new JRadioButton("kleine Stra\u00DFe");
		buttonGroup.add(rdbtnKleineStrae);
		
		JRadioButton rdbtnKniffel = new JRadioButton("Kniffel");
		buttonGroup.add(rdbtnKniffel);
		
		JRadioButton rdbtnChance = new JRadioButton("Chance");
		buttonGroup.add(rdbtnChance);
		
		JButton btnNewButton_1 = new JButton("eintragen -->");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				versuche = 0;
				Wuerfelbecher becher = player.getWuerfelbecher();
				becher.resetHalten();
				wuerfel1.setText(null);
				wuerfel2.setText(null);
				wuerfel3.setText(null);
				wuerfel4.setText(null);
				wuerfel5.setText(null);
			}
		});
		
		wuerfel1 = new JTextField();
		wuerfel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				Wuerfelbecher becher = player.getWuerfelbecher();
				becher.halten(0);
			}
		});
		wuerfel1.setEditable(false);
		wuerfel1.setHorizontalAlignment(SwingConstants.CENTER);
		wuerfel1.setFont(new Font("Tahoma", Font.BOLD, 30));
		wuerfel1.setColumns(10);
		
		wuerfel2 = new JTextField();
		wuerfel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				Wuerfelbecher becher = player.getWuerfelbecher();
				becher.halten(1);
			}
		});
		wuerfel2.setEditable(false);
		wuerfel2.setHorizontalAlignment(SwingConstants.CENTER);
		wuerfel2.setFont(new Font("Tahoma", Font.BOLD, 30));
		wuerfel2.setColumns(10);
		
		wuerfel3 = new JTextField();
		wuerfel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				Wuerfelbecher becher = player.getWuerfelbecher();
				becher.halten(2);
			}
		});
		wuerfel3.setEditable(false);
		wuerfel3.setHorizontalAlignment(SwingConstants.CENTER);
		wuerfel3.setFont(new Font("Tahoma", Font.BOLD, 30));
		wuerfel3.setColumns(10);
		
		wuerfel4 = new JTextField();
		wuerfel4.setEditable(false);
		wuerfel4.setHorizontalAlignment(SwingConstants.CENTER);
		wuerfel4.setFont(new Font("Tahoma", Font.BOLD, 30));
		wuerfel4.setColumns(10);
		wuerfel4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				Wuerfelbecher becher = player.getWuerfelbecher();
				becher.halten(3);
			}
		});
		
		wuerfel5 = new JTextField();
		wuerfel5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				Wuerfelbecher becher = player.getWuerfelbecher();
				becher.halten(4);
			}
		});
		wuerfel5.setEditable(false);
		wuerfel5.setHorizontalAlignment(SwingConstants.CENTER);
		wuerfel5.setFont(new Font("Tahoma", Font.BOLD, 30));
		wuerfel5.setColumns(10);
		
		
		Wertungsblock wert = new Wertungsblock();
		JTextArea test = new JTextArea(wert.writeWertungsblock());
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(117)
							.addComponent(btnNewButton)
							.addGap(66))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(wuerfel1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(wuerfel2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(wuerfel3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(wuerfel4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(wuerfel5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(10))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(rdbtnDreier)
									.addGap(252))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(rdbtnVierer)
									.addGap(254))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(rdbtnFnfer)
									.addPreferredGap(ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
									.addComponent(btnNewButton_1)
									.addGap(59))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnDreierpasch)
										.addComponent(rdbtnViererpasch))
									.addGap(224))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnZweier)
										.addComponent(rdbtnSechser)
										.addComponent(rdbtnFullHouse)
										.addComponent(rdbtnKleineStrae)
										.addComponent(rdbtnGroeStrae)
										.addComponent(rdbtnKniffel)
										.addComponent(rdbtnChance)
										.addComponent(rdbtnNewRadioButton))
									.addGap(218)))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(test, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(wuerfel1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
										.addComponent(wuerfel2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
										.addComponent(wuerfel3, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
									.addGap(31)
									.addComponent(btnNewButton)
									.addGap(10)
									.addComponent(rdbtnNewRadioButton)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnZweier)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnDreier)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnVierer))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(wuerfel4, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
									.addComponent(wuerfel5, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnFnfer)
								.addComponent(btnNewButton_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnSechser)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnDreierpasch)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnViererpasch)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnFullHouse)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnKleineStrae)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnGroeStrae)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnKniffel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnChance))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(test, GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE)
							.addGap(22))))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public boolean checkVersuche()
	{
		return versuche == 3;
	}
}
