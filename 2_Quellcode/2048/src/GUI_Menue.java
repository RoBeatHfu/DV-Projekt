/******* Adrian ******/

public class GUI_Menue extends javax.swing.JFrame {

	Fields tt;

	public GUI_Menue() {
		initComponents();
	}

	private void initComponents() {

		jButton1 = new javax.swing.JButton(); // Spiel starten
		jLabel1 = new javax.swing.JLabel(); // 2048
		// jLabel2 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton(); // Highscoreliste �ffnen
		jButton3 = new javax.swing.JButton(); // Einstellungen �ffnen
		jButton4 = new javax.swing.JButton(); // Anwendung schlie�en

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("2048 Menue");
		setLocation(new java.awt.Point(0, 0));
		setName("2048");
		setPreferredSize(new java.awt.Dimension(400, 500));
		setResizable(false);
		setType(java.awt.Window.Type.POPUP);

		jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jButton1.setText("Play");
		jButton1.setBackground(new java.awt.Color(0, 136, 82));
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed1(evt);
			}
		});
		jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				keyPressed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 80));
		jLabel1.setForeground(new java.awt.Color(0, 136, 82));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("2048");

		// jLabel2.setIcon(new
		// javax.swing.ImageIcon("https://github.com/RoBeatHfu/DV-Projekt/blob/main/1_Projektskizze/images/background.png"));

		jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
		jButton2.setText("Highscore");
		jButton2.setBackground(new java.awt.Color(153, 153, 153));
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
		jButton3.setText("Settings");
		jButton3.setBackground(new java.awt.Color(153, 153, 153));
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
		jButton4.setText("Quit");
		jButton4.setBackground(new java.awt.Color(153, 153, 153));
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
								.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								// .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1,
								// javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				// .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
				// javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18)
				.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18)
				.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18)
				.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		setVisible(false);
		new GUI_Settings().setVisible(true);

	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void jButton1ActionPerformed1(java.awt.event.ActionEvent evt) {
		setVisible(false);
		GUI_Spiel s1 = new GUI_Spiel();
		s1.tt = this.tt;
		s1.setVisible(true);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

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
			java.util.logging.Logger.getLogger(GUI_Menue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUI_Menue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUI_Menue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUI_Menue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUI_Menue().setVisible(true);
			}
		});
	}

	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;

}
