package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Operaciones;

import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel frmPrincipal;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtResultado;
	private JLabel lblNum1; 
	private JLabel lblNum2; 
	private JLabel lblResultado;
	private JButton btnSumar;
	private JButton btnRestar;
	private JButton btnMultiplicar;
	private JButton btnDividir;
	private JButton btnLimpiar;
	private JButton btnModulo;
	private Operaciones op;
	private Dimension tamPantalla;
	private Rectangle pantalla;
	
	
	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,500);
		/* Toma el tamaño de la pantalla
		tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		pantalla = new Rectangle(tamPantalla);
		setBounds(pantalla);*/
		frmPrincipal = new JPanel();
		frmPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		frmPrincipal.setLayout(null);
		setContentPane(frmPrincipal);
		setResizable(false);
		setTitle("Calculadora");
		setLocationRelativeTo(null);
		colocarElementos();
	}

	private void colocarElementos() {
		
		lblNum1 = new JLabel("Numero 1");
		lblNum1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNum1.setBounds(10, 37, 147, 43);
		frmPrincipal.add(lblNum1);
		
		lblNum2 = new JLabel("Numero 2");
		lblNum2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNum2.setBounds(10, 104, 147, 43);
		frmPrincipal.add(lblNum2);
		
		lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblResultado.setBounds(10, 174, 147, 43);
		frmPrincipal.add(lblResultado);
		
		txtNum1 = new JTextField();		
		txtNum1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtNum1.setBounds(150, 37, 213, 43);
		frmPrincipal.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtNum2.setColumns(10);
		txtNum2.setBounds(150, 104, 213, 43);
		frmPrincipal.add(txtNum2);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtResultado.setColumns(10);
		txtResultado.setBounds(150, 174, 213, 43);
		frmPrincipal.add(txtResultado);
		
		btnSumar = new JButton("Sumar");
		btnSumar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSumar.setBounds(23, 257, 147, 50);
		btnSumar.addActionListener(this);
		frmPrincipal.add(btnSumar);
		
		btnRestar = new JButton("Restar");
		btnRestar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnRestar.setBounds(216, 257, 147, 50);
		btnRestar.addActionListener(this);
		frmPrincipal.add(btnRestar);
		
		btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnMultiplicar.setBounds(23, 329, 147, 50);
		btnMultiplicar.addActionListener(this);
		frmPrincipal.add(btnMultiplicar);
		
		btnDividir = new JButton("Dividir");
		btnDividir.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnDividir.setBounds(216, 329, 147, 50);
		btnDividir.addActionListener(this);
		frmPrincipal.add(btnDividir);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnLimpiar.setBounds(23, 400, 147, 50);
		btnLimpiar.addActionListener(this);
		frmPrincipal.add(btnLimpiar);
		
		btnModulo = new JButton("Modulo");
		btnModulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnModulo.setBounds(216, 400, 147, 50);
		btnModulo.addActionListener(this);
		frmPrincipal.add(btnModulo);
		
		op = new Operaciones();
		op.setVentana(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btnTemp = (JButton) e.getSource();
		switch (btnTemp.getText()) {
			case "Sumar":
				txtResultado.setText(op.sumar(txtNum1.getText(),txtNum2.getText()));
				break;
			case "Restar":
				txtResultado.setText(op.restar(txtNum1.getText(),txtNum2.getText()));
				break;
			case "Multiplicar":
				txtResultado.setText(op.multiplicar(txtNum1.getText(),txtNum2.getText()));
				break;
			case "Dividir":
				txtResultado.setText(op.dividir(txtNum1.getText(),txtNum2.getText()));
				break;
			case "Modulo":
				txtResultado.setText(op.modulo(txtNum1.getText(),txtNum2.getText()));
				break;
			default:
				limpiarCamposTxt();
		}
	}

	private void limpiarCamposTxt() {
		txtNum1.setText("");
		txtNum2.setText("");
		txtResultado.setText("");
	}
}
