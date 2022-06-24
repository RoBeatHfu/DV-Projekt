/******* Adrian ******/

public class GUI_Manual extends javax.swing.JFrame {

	public GUI_Manual() {
		initComponents();
	}

	private void initComponents() {

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("2048 Manual");
		setLocation(new java.awt.Point(200, 100));
		setName("2048 Manual");
		setPreferredSize(new java.awt.Dimension(620, 620));
		setResizable(false);

		jButton3 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();

		jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12));
		jButton3.setText("Back to Menu");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 80));
		jLabel1.setForeground(new java.awt.Color(0, 136, 82));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Manual");

		jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText(
				"<html><body>At the beginning, there are two random tiles on the board, each with a 2 or a 4. <br>Using the arrow keys (up, down, right, left) the player moves the tiles on the board, with each turn moving as far as possible, as if they were sliding on the tilted board in the respective direction.<br>Two tiles with the same number next to each other, <br> they merge into a tile with the sum of the two tiles.<br>Additionally, with each move in an empty field, a random tile with a 2 or 4 is created. <br> <br>The goal of the game is to make a tile with the number 2048.</body<>/html>");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(65, 65, 65)
						.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(92, Short.MAX_VALUE))
				.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(24, 24, 24).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(27, Short.MAX_VALUE)));

		pack();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

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
			java.util.logging.Logger.getLogger(GUI_Manual.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUI_Manual.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUI_Manual.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUI_Manual.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUI_Manual().setVisible(true);
			}
		});
	}

	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;

}
