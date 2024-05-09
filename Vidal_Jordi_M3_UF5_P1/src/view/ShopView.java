package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Shop;

import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;

public class ShopView extends JFrame implements ActionListener, KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Shop shop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopView frame = new ShopView();
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
	public ShopView() {
		
		shop = new Shop();
		shop.loadInventory();
		setTitle("MiTienda.com");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Mi Tienda.com");
		lblNewLabel.setBounds(163, 10, 121, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pulse o seleccione una opción:");
		lblNewLabel_1.setBounds(115, 47, 190, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton contarcaja = new JButton("1. Contar Caja");
		contarcaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion = 1;
	            CashView cashView = new CashView(shop);
	            cashView.setVisible(true);
			}
		});
		contarcaja.setBounds(124, 70, 157, 21);
		contentPane.add(contarcaja);
		contarcaja.addKeyListener(this);
		
		JButton añadirproducto = new JButton("2. Añadir producto");
		añadirproducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion = 2;
	            ProductView productView = new ProductView(shop, opcion);
	            productView.setVisible(true);
			}
		});
		añadirproducto.setBounds(124, 101, 157, 21);
		contentPane.add(añadirproducto);
		añadirproducto.addKeyListener(this);
		
		JButton añadirstock = new JButton("3. Añadir Stock");
		añadirstock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion = 3;
	            ProductView productView = new ProductView(shop, opcion);
	            productView.setVisible(true);
			}
		});
		añadirstock.setBounds(124, 132, 157, 21);
		contentPane.add(añadirstock);
		añadirstock.addKeyListener(this);
		
		JButton eliminarproducto = new JButton("9. Eliminar Producto");
		eliminarproducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion = 9;
	            ProductView productView = new ProductView(shop, opcion);
	            productView.setVisible(true);
			}
		});
		eliminarproducto.setBounds(124, 163, 157, 21);
		contentPane.add(eliminarproducto);
		eliminarproducto.addKeyListener(this);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		char key = e.getKeyChar();
		switch(key) {
		case '1':
			int opcion = 1;
            CashView cashView = new CashView(shop);
            cashView.setVisible(true);
            break;
		case '2':
			opcion = 2;
            ProductView productView = new ProductView(shop, opcion);
            productView.setVisible(true);
            break;
		case '3':
			opcion = 3;
            productView = new ProductView(shop, opcion);
            productView.setVisible(true);
            break;
		case '9':
			opcion = 9;
            productView = new ProductView(shop, opcion);
            productView.setVisible(true);
            break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
