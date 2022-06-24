
/*******Adrian******/

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUI_Spiel extends javax.swing.JFrame implements KeyListener {

	Fields fieldSpiel;
	int punkte;
	int feld1;

	public GUI_Spiel() {

		// refresh des Spielfelds nach jedem Zug!!!
		initComponents();

		// aktivieren des keyListeners
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		punkte = fieldSpiel.getScore(); 
		feld1 = fieldSpiel.getValue(0);
	}

	// Überschreibt die Tastatureingaben Verarbeitung
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("Moving Right");
			fieldSpiel.fusion('r');
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("Moving Left");
			fieldSpiel.fusion('l');
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("Moving Down");
			fieldSpiel.fusion('b');
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("Moving Up");
			fieldSpiel.fusion('t');
		}
		System.out.println();

	}

	// Die Methode muss auch aufgeführt sein
	@Override
	public void keyReleased(KeyEvent e) {
	}

	// Die Methode muss auch aufgeführt sein
	@Override
	public void keyTyped(KeyEvent e) {
	}

	void initComponents() {

		jLabel0 = new javax.swing.JLabel(); // 2048
		jButton3 = new javax.swing.JButton(); // zur�ck zum Men�
		jLabel1 = new javax.swing.JLabel(); // Feld1
		jLabel2 = new javax.swing.JLabel(); // Feld2
		jLabel3 = new javax.swing.JLabel(); // Feld3
		jLabel4 = new javax.swing.JLabel(); // Feld4
		jLabel5 = new javax.swing.JLabel(); // Feld5
		jLabel6 = new javax.swing.JLabel(); // Feld6
		jLabel7 = new javax.swing.JLabel(); // Feld7
		jLabel8 = new javax.swing.JLabel(); // Feld8
		jLabel9 = new javax.swing.JLabel(); // Feld9
		jLabel10 = new javax.swing.JLabel(); // Feld10
		jLabel11 = new javax.swing.JLabel(); // Feld11
		jLabel12 = new javax.swing.JLabel(); // Feld12
		jLabel13 = new javax.swing.JLabel(); // Feld13
		jLabel14 = new javax.swing.JLabel(); // Feld14
		jLabel15 = new javax.swing.JLabel(); // Feld15
		jLabel16 = new javax.swing.JLabel(); // Feld16
		jLabelScore = new javax.swing.JLabel(); // FeldScore

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("2048");
		setLocation(new java.awt.Point(0, 0));
		setName("2048");
		setPreferredSize(new java.awt.Dimension(620, 620));
		setResizable(false);

		jLabel0.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 80));
		jLabel0.setForeground(new java.awt.Color(0, 136, 82));
		jLabel0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel0.setText("2048");

		jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12));
		jButton3.setBackground(new java.awt.Color(153, 153, 153));
		jButton3.setText("Back to Menu");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel1.setOpaque(true);
		jLabel1.setBackground(new java.awt.Color(153, 153, 153));
		jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		//jLabel1.setText("0");
		jLabel1.setText(""+feld1);
		jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel2.setOpaque(true);
		jLabel2.setBackground(new java.awt.Color(153, 153, 153));
		jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("0");
		jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel3.setOpaque(true);
		jLabel3.setBackground(new java.awt.Color(153, 153, 153));
		jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("0");
		jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel4.setOpaque(true);
		jLabel4.setBackground(new java.awt.Color(153, 153, 153));
		jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel4.setText("0");
		jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel5.setOpaque(true);
		jLabel5.setBackground(new java.awt.Color(153, 153, 153));
		jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel5.setText("0");
		jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel6.setOpaque(true);
		jLabel6.setBackground(new java.awt.Color(153, 153, 153));
		jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel6.setText("0");
		jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel7.setOpaque(true);
		jLabel7.setBackground(new java.awt.Color(153, 153, 153));
		jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setText("0");
		jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel8.setOpaque(true);
		jLabel8.setBackground(new java.awt.Color(153, 153, 153));
		jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel8.setText("0");
		jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel9.setOpaque(true);
		jLabel9.setBackground(new java.awt.Color(153, 153, 153));
		jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel9.setText("0");
		jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel10.setOpaque(true);
		jLabel10.setBackground(new java.awt.Color(153, 153, 153));
		jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel10.setText("0");
		jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel11.setOpaque(true);
		jLabel11.setBackground(new java.awt.Color(153, 153, 153));
		jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel11.setText("0");
		jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel12.setOpaque(true);
		jLabel12.setBackground(new java.awt.Color(153, 153, 153));
		jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel12.setText("0");
		jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel13.setOpaque(true);
		jLabel13.setBackground(new java.awt.Color(153, 153, 153));
		jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel13.setText("0");
		jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel14.setOpaque(true);
		jLabel14.setBackground(new java.awt.Color(153, 153, 153));
		jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel14.setText("0");
		jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel15.setOpaque(true);
		jLabel15.setBackground(new java.awt.Color(153, 153, 153));
		jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel15.setText("0");
		jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel16.setOpaque(true);
		jLabel16.setBackground(new java.awt.Color(153, 153, 153));
		jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel16.setText("0");
		jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabelScore.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18));
		jLabelScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabelScore.setText(""+punkte);
		jLabelScore.setToolTipText("");
		jLabelScore.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SCORE",
				javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP,
				new java.awt.Font("Arial Rounded MT Bold", 1, 18), new java.awt.Color(0, 136, 82)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(88, 88, 88)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(102, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
						.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(26, 26, 26)
						.addComponent(jLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 290,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(20, 20, 20)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup().addGap(16, 16, 16).addComponent(jLabelScore,
								javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addContainerGap(253, Short.MAX_VALUE)));

		pack();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		setVisible(false);
		new GUI_Menue().setVisible(true);
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GUI_Spiel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUI_Spiel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUI_Spiel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUI_Spiel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				GUI_Spiel s1 = new GUI_Spiel();
				s1.setVisible(true);
			}
		});
	}

	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel0;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabelScore;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;

	public void setValue(int index, int value) {
		switch (index) {
		case 0:
			jLabel1.setText("" + value);
			break;
		case 1:
			jLabel2.setText("" + value);
			break;
		case 2:
			jLabel3.setText("" + value);
			break;
		case 3:
			jLabel4.setText("" + value);
			break;
		case 4:
			jLabel5.setText("" + value);
			break;
		case 5:
			jLabel6.setText("" + value);
			break;
		case 6:
			jLabel7.setText("" + value);
			break;
		case 7:
			jLabel8.setText("" + value);
			break;
		case 8:
			jLabel9.setText("" + value);
			break;
		case 9:
			jLabel10.setText("" + value);
			break;
		case 10:
			jLabel11.setText("" + value);
			break;
		case 11:
			jLabel12.setText("" + value);
			break;
		case 12:
			jLabel13.setText("" + value);
			break;
		case 13:
			jLabel14.setText("" + value);
			break;
		case 14:
			jLabel15.setText("" + value);
			break;
		case 15:
			jLabel16.setText("" + value);
			break;
		}
	}
}
