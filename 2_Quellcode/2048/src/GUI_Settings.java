/*******Adrian******/


public class GUI_Settings extends javax.swing.JFrame {


	public GUI_Settings() {
		initComponents();
	}


	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jButtonManual = new javax.swing.JButton();
		// jButton2 = new javax.swing.JButton();
		jButtonMenu = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("2048 Settings");
		setPreferredSize(new java.awt.Dimension(400, 500));
		setResizable(false);

		jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 80)); 
		jLabel1.setForeground(new java.awt.Color(0, 136, 82));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Settings");

		jButtonManual.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); 
		jButtonManual.setBackground(new java.awt.Color(153, 153, 153));
		jButtonManual.setText("Manual");
		jButtonManual.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonManualActionPerformed(evt);
			}
		});


		jButtonMenu.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); 
		jButtonMenu.setText("Back to Menu");
		jButtonMenu.setBackground(new java.awt.Color(153, 153, 153));
		jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonMenuActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
								.addComponent(jButtonManual, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))    
						.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jButtonManual, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);

		pack();
	}     

	private void jButtonManualActionPerformed(java.awt.event.ActionEvent evt) { 
		new GUI_Manual().setVisible(true);
	}                                        


	private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
			java.util.logging.Logger.getLogger(GUI_Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUI_Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUI_Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUI_Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUI_Settings().setVisible(true);
			}
		});
	}

	private javax.swing.JButton jButtonManual;
	// private javax.swing.JButton jButton2;
	private javax.swing.JButton jButtonMenu;
	private javax.swing.JLabel jLabel1;

}
