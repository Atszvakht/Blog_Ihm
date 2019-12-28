import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;
import java.awt.Robot;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.AWTException;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

public class FormEtudiant {
	private JFrame frame;
	private int mxm,mym;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormEtudiant window = new FormEtudiant();
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
	public FormEtudiant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		
		frame.setUndecorated(true);
		frame.setBounds(50, 0, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnX = new JButton("");
		btnX.setLocation(372, 0);
		btnX.setSize(new Dimension(60, 34));
		ImageIcon imgI = new ImageIcon(FormEtudiant.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-error.png"));
		Image my = imgI.getImage();
		Image img=my.getScaledInstance(btnX.getWidth(),btnX.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon imgC = new ImageIcon(img);
		btnX.setIcon(imgC);
		
		JLabel lbl = new JLabel("");
		lbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				mxm=arg0.getX();
				mym=arg0.getY();
			}
		});
		lbl.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x=arg0.getXOnScreen();
				int y=arg0.getYOnScreen();
				frame.setLocation(x-mxm,y-mym);
			}
		});
		lbl.setBounds(0, 0, 1239, 23);
		frame.getContentPane().add(lbl);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnX.setBounds(1238, 0, 42, 23);
		frame.getContentPane().add(btnX);
		
	}

	}
