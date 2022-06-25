
/******* Adrian ******/

import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.prefs.Preferences;


public class GUI_Menue extends javax.swing.JFrame {


	private javax.swing.JButton jButtonPlay;
	private javax.swing.JButton jButtonHighscore;
	private javax.swing.JButton jButtonSettings;
	private javax.swing.JButton jButtonQuit;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;

	Fields fieldsMenue;
	GUI_Spiel s1;
	
	
	public GUI_Menue() {
		System.out.println("GUI_Menue");
		initComponents();
	}

	private void initComponents() {
		

		jLabel1 = new javax.swing.JLabel(); // 2048
		// jLabel2 = new javax.swing.JLabel();
		jButtonPlay = new javax.swing.JButton(); // Spiel starten
		jButtonHighscore = new javax.swing.JButton(); // Highscoreliste �ffnen
		jButtonSettings = new javax.swing.JButton(); // Einstellungen �ffnen
		jButtonQuit = new javax.swing.JButton(); // Anwendung schlie�en

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("2048 Menue");
		setLocation(new java.awt.Point(0, 0));
	//setLocation(new java.awt.Point(x));
		setName("2048");
		setPreferredSize(new java.awt.Dimension(400, 500));
		setResizable(false);
		setType(java.awt.Window.Type.POPUP);
		
    //Point x = getLocationOnScreen();

		jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 80));
		jLabel1.setForeground(new java.awt.Color(0, 136, 82));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("2048");

		// jLabel2.setIcon(new
		// javax.swing.ImageIcon("https://github.com/RoBeatHfu/DV-Projekt/blob/main/1_Projektskizze/images/background.png"));


		jButtonPlay.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36));
		jButtonPlay.setText("Play");
		jButtonPlay.setBackground(new java.awt.Color(0, 136, 82));
		jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonPlayActionPerformed1(evt);
			}
		});

		jButtonPlay.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				keyPressed(evt);
			}
		});


		jButtonHighscore.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
		jButtonHighscore.setText("Highscore");
		jButtonHighscore.setBackground(new java.awt.Color(153, 153, 153));
		jButtonHighscore.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonHighscoreActionPerformed(evt);
			}
		});

		jButtonSettings.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
		jButtonSettings.setText("Settings");
		jButtonSettings.setBackground(new java.awt.Color(153, 153, 153));
		jButtonSettings.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonSettingsActionPerformed(evt);
			}
		});

		jButtonQuit.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
		jButtonQuit.setText("Quit");
		jButtonQuit.setBackground(new java.awt.Color(153, 153, 153));
		jButtonQuit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonQuitActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
								.addComponent(jButtonQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButtonSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButtonHighscore, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButtonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
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
				.addComponent(jButtonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18)
				.addComponent(jButtonHighscore, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18)
				.addComponent(jButtonSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18)
				.addComponent(jButtonQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}

	private void jButtonSettingsActionPerformed(java.awt.event.ActionEvent evt) {
		setVisible(false);
		new GUI_Settings().setVisible(true);

	}

	private void jButtonQuitActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void jButtonPlayActionPerformed1(java.awt.event.ActionEvent evt) {
		setVisible(false);
		s1 = new GUI_Spiel();
		s1.fieldSpiel = fieldsMenue;
		s1.updateFields();
		s1.setVisible(true);
	}

	private void jButtonHighscoreActionPerformed(java.awt.event.ActionEvent evt) {

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
}
