package GUIS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;

public class BookListFrame {

	JFrame Books;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookListFrame window = new BookListFrame();
					window.Books.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookListFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Books = new JFrame();
		Books.setTitle("BOOKS");
		Books.setBounds(100, 100, 857, 483);
		Books.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Books.getContentPane().setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel AvailBooks = new JLabel("AVAILABLE BOOKS");
		AvailBooks.setFont(new Font("Agency FB", Font.BOLD, 31));
		AvailBooks.setHorizontalAlignment(SwingConstants.CENTER);
		Books.getContentPane().add(AvailBooks);
		
		JLabel label = new JLabel("");
		Books.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		Books.getContentPane().add(label_1);
		
		JLabel lblBookTitles = new JLabel("BOOK TITLES :");
		lblBookTitles.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookTitles.setFont(new Font("Agency FB", Font.BOLD, 15));
		Books.getContentPane().add(lblBookTitles);
		
		JLabel lblAuthors = new JLabel("AUTHORS :");
		lblAuthors.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthors.setFont(new Font("Agency FB", Font.BOLD, 15));
		Books.getContentPane().add(lblAuthors);
		
		JLabel lblNumOfCompies = new JLabel("NUM. OF COPIES :");
		lblNumOfCompies.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumOfCompies.setFont(new Font("Agency FB", Font.BOLD, 15));
		Books.getContentPane().add(lblNumOfCompies);
		
		JLabel Noli = new JLabel("Noli Me Tangere");
		Noli.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Noli.setHorizontalAlignment(SwingConstants.CENTER);
		Books.getContentPane().add(Noli);
		
		JLabel JR = new JLabel("JOSE RIZAL");
		JR.setHorizontalAlignment(SwingConstants.CENTER);
		JR.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Books.getContentPane().add(JR);
		
		JLabel Copy = new JLabel("4");
		Copy.setHorizontalAlignment(SwingConstants.CENTER);
		Copy.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Books.getContentPane().add(Copy);
		
		JLabel ElFili = new JLabel("El Filibusterismo");
		ElFili.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ElFili.setHorizontalAlignment(SwingConstants.CENTER);
		Books.getContentPane().add(ElFili);
		
		JLabel Author2 = new JLabel("JOSE RIZAL");
		Author2.setHorizontalAlignment(SwingConstants.CENTER);
		Author2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Books.getContentPane().add(Author2);
		
		JLabel Copies = new JLabel("2");
		Copies.setHorizontalAlignment(SwingConstants.CENTER);
		Copies.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Books.getContentPane().add(Copies);
		
		JLabel MIA = new JLabel("Mi Ultimo Adios");
		MIA.setFont(new Font("Times New Roman", Font.BOLD, 15));
		MIA.setHorizontalAlignment(SwingConstants.CENTER);
		Books.getContentPane().add(MIA);
		
		JLabel Jr1 = new JLabel("JOSE RIZAL");
		Jr1.setHorizontalAlignment(SwingConstants.CENTER);
		Jr1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Books.getContentPane().add(Jr1);
		
		JLabel NOC = new JLabel("5");
		NOC.setHorizontalAlignment(SwingConstants.CENTER);
		NOC.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Books.getContentPane().add(NOC);
	}

}
