package GUIS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Main<GUI> {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LIBRARY MANAGEMENT");
		lblNewLabel.setBounds(143, 11, 125, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ADMIN LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AdminLogin adm = new AdminLogin();
			adm.JFRAME.setVisible(true);
			frame.dispose();;
			}
		});
		btnNewButton.setBounds(150, 72, 118, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLibrarianLogin = new JButton("LIBRARIAN LOGIN");
		btnLibrarianLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {LIBRARIAN ll = new LIBRARIAN();
			ll.LibrarianloginFrame.setVisible(true);
			frame.dispose();
			}
		});
		btnLibrarianLogin.setBounds(150, 122, 118, 23);
		frame.getContentPane().add(btnLibrarianLogin);
	}

}
