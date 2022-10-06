package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Operaciones;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import java.awt.Toolkit;

public class VentanaPrincipalNew extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel frmPrincipal;
	private JTextField txtResultado;
	private JButton btnRestar;
	private JButton btnMultiplicar;
	private JButton btnDividir;
	private JButton btnIgual;
	private JButton btnUno;
	private JButton btnDos;
	private JButton btnTres;
	private JButton btnCuatro;
	private JButton btnCinco;
	private JButton btnSeis;
	private JButton btnSiete;
	private JButton btnOcho;
	private JButton btnNueve;
	private JButton btnCero;
	private JButton btnComa;
	private JButton btnLimpiar;
	private JButton btnBorrar;
	private JButton btnMod;
	private JButton btnAux;
	private Operaciones op;
	private String numeroArmado;
	private String numeroArmado2;
	private String operador;
	/**
	 * Create the frame.
	 */
	KeyListener listener = new KeyListener() {
		@Override
		public void keyPressed(KeyEvent e) {
			//System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));
			String n = KeyEvent.getKeyText(e.getKeyCode());
			if ((e.getKeyCode() == KeyEvent.VK_5) && ((e.getModifiersEx() & KeyEvent.SHIFT_DOWN_MASK) != 0)) {
				n = "%";
			}
			switch (n) {
			case "Enter":
				asignarOperacion("=");
				break;
			case "Escape":
				asignarOperacion("C");
				break;
			case "Backspace":
				asignarOperacion("<-");
				break;
			case "%": 
				asignarOperacion("%");
				break;
			default :
				asignarOperacion(String.valueOf(e.getKeyChar()));
			}
		}
		
		@Override
		public void keyTyped(KeyEvent e) {}

		@Override
		public void keyReleased(KeyEvent e) {}
	};
	
	public VentanaPrincipalNew() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipalNew.class.getResource("/recursos/calculator.png")));
		addKeyListener(listener);
		setFocusable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(275,410);
		frmPrincipal = new JPanel();
		frmPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		frmPrincipal.setLayout(null);
		setContentPane(frmPrincipal);
		setResizable(false);
		setTitle("Calculadora v2.0");
		setLocationRelativeTo(null);
		colocarElementos();
	}

	private void colocarElementos() {
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtResultado.setColumns(10);
		txtResultado.setBounds(10, 11, 238, 43);
		frmPrincipal.add(txtResultado);
		
		JButton btnSumar = new JButton("+");
		btnSumar.setLocation(198, 248);
		btnSumar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSumar.setSize(50, 50);
		btnSumar.addActionListener(this);
		btnSumar.addKeyListener(listener);
		frmPrincipal.add(btnSumar);
		
		btnRestar = new JButton("-");
		btnRestar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRestar.setBounds(198, 187, 50, 50);
		btnRestar.addActionListener(this);
		btnRestar.addKeyListener(listener);
		frmPrincipal.add(btnRestar);
		
		btnMultiplicar = new JButton("*");
		btnMultiplicar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMultiplicar.setBounds(198, 126, 50, 50);
		btnMultiplicar.addActionListener(this);
		btnMultiplicar.addKeyListener(listener);
		frmPrincipal.add(btnMultiplicar);
		
		btnDividir = new JButton("/");
		btnDividir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDividir.setBounds(198, 65, 50, 50);
		btnDividir.addActionListener(this);
		btnDividir.addKeyListener(listener);
		frmPrincipal.add(btnDividir);
		
		btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIgual.setBounds(198, 309, 50, 50);
		btnIgual.addActionListener(this);
		btnIgual.addKeyListener(listener);
		frmPrincipal.add(btnIgual);
		
		btnComa = new JButton(",");
		btnComa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnComa.setBounds(70, 309, 50, 50);
		btnComa.addActionListener(this);
		btnComa.addKeyListener(listener);
		frmPrincipal.add(btnComa);
		
		btnLimpiar = new JButton("C");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLimpiar.setBounds(10, 65, 110, 50);
		btnLimpiar.addActionListener(this);
		btnLimpiar.addKeyListener(listener);
		frmPrincipal.add(btnLimpiar);
		
		btnBorrar = new JButton("<-");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBorrar.setBounds(135, 312, 50, 50);
		btnBorrar.addActionListener(this);
		btnBorrar.addKeyListener(listener);
		frmPrincipal.add(btnBorrar);
		
		btnMod = new JButton("%");
		btnMod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMod.setBounds(135, 65, 50, 50);
		btnMod.addActionListener(this);
		btnMod.addKeyListener(listener);
		frmPrincipal.add(btnMod);
		
		btnUno = new JButton("1");
		btnUno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnUno.setBounds(10, 126, 50, 50);
		btnUno.addActionListener(this);
		btnUno.addKeyListener(listener);
		frmPrincipal.add(btnUno);
		
		btnDos = new JButton("2");
		btnDos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDos.setBounds(70, 126, 50, 50);
		btnDos.addActionListener(this);
		btnDos.addKeyListener(listener);
		frmPrincipal.add(btnDos);
		
		btnTres = new JButton("3");
		btnTres.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTres.setBounds(135, 126, 50, 50);
		btnTres.addActionListener(this);
		btnTres.addKeyListener(listener);
		frmPrincipal.add(btnTres);
		
		btnCuatro = new JButton("4");
		btnCuatro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCuatro.setBounds(10, 187, 50, 50);
		btnCuatro.addActionListener(this);
		btnCuatro.addKeyListener(listener);
		frmPrincipal.add(btnCuatro);
		
		btnCinco = new JButton("5");
		btnCinco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCinco.setBounds(70, 187, 50, 50);
		btnCinco.addActionListener(this);
		btnCinco.addKeyListener(listener);
		frmPrincipal.add(btnCinco);
		
		btnSeis = new JButton("6");
		btnSeis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSeis.setBounds(135, 187, 50, 50);
		btnSeis.addActionListener(this);
		btnSeis.addKeyListener(listener);
		frmPrincipal.add(btnSeis);
		
		btnSiete = new JButton("7");
		btnSiete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSiete.setBounds(10, 248, 50, 50);
		btnSiete.addActionListener(this);
		btnSiete.addKeyListener(listener);
		frmPrincipal.add(btnSiete);
		
		btnOcho = new JButton("8");
		btnOcho.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOcho.setBounds(70, 248, 50, 50);
		btnOcho.addActionListener(this);
		btnOcho.addKeyListener(listener);
		frmPrincipal.add(btnOcho);
		
		btnNueve = new JButton("9");
		btnNueve.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNueve.setBounds(135, 248, 50, 50);
		btnNueve.addActionListener(this);
		btnNueve.addKeyListener(listener);
		frmPrincipal.add(btnNueve);
		
		btnCero = new JButton("0");
		btnCero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCero.setBounds(10, 309, 50, 50);
		btnCero.addActionListener(this);
		btnCero.addKeyListener(listener);
		frmPrincipal.add(btnCero);
		
		limpiarVariables();
	}

	private void asignarOperacion(String textoOp) {
		switch (textoOp) {
		case "+":
			operador="+";
			numeroArmado2=numeroArmado;
			numeroArmado="";
			break;
		case "-":
			operador="-";
			numeroArmado2=numeroArmado;
			numeroArmado="";
			break;
		case "*":
			operador="*";
			numeroArmado2=numeroArmado;
			numeroArmado="";
			break;
		case "/":
			operador="/";
			numeroArmado2=numeroArmado;
			numeroArmado="";
			break;
		case "%":
			operador="%";
			numeroArmado2=numeroArmado;
			numeroArmado="";
			break;
		case "=":
			txtResultado.setText(realizarOperacion(operador));
			limpiarVariables();
			break;
		case "<-":
			borrarDigito();
			txtResultado.setText(numeroArmado);
			break;
		case ",":
			numeroArmado +=".";
			break;
		case "C":
			limpiarCamposTxt();
			limpiarVariables();
			break;
		default:
			armarNumero(textoOp);
			txtResultado.setText(numeroArmado);
		}
	}

	private void borrarDigito() {
		char[] arrayNro = numeroArmado.toCharArray();
		numeroArmado = "";
		for (int i= 0; i < arrayNro.length-1; i++) {
			numeroArmado += arrayNro[i];
		}
	}

	private String realizarOperacion(String opcionOperador) {
		String resultado ="";
		switch (opcionOperador) {
		case "+":
			resultado = op.sumar(numeroArmado, numeroArmado2);
			break;
		case "-":
			resultado = op.restar(numeroArmado2, numeroArmado);
			break;
		case "*":
			resultado = op.multiplicar(numeroArmado, numeroArmado2);
			break;
		case "/":
			resultado = op.dividir(numeroArmado2, numeroArmado);
			break;
		case "%":
			resultado = op.modulo(numeroArmado2, numeroArmado);
			break;
		}
		return resultado;
	}

	private void limpiarVariables() {
		numeroArmado="";
		numeroArmado2="";
		operador="";
		op=new Operaciones();
	}

	private void limpiarCamposTxt() {
		txtResultado.setText("");
	}

	private void armarNumero(String numero) {
		numeroArmado += numero;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		btnAux = (JButton) e.getSource();
		asignarOperacion(btnAux.getText());
		
	}
}
