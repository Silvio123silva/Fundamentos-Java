package Jokenpo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class jokenpo extends JFrame {

	private JPanel contentPane;
	private JButton btnPedra;
	private JButton btnPapel;
	private JButton btnTesoura;
	private JLabel lblCompt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jokenpo frame = new jokenpo();
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
	public jokenpo() {
		addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent e) {

			}
		});
		setResizable(false);
		setTitle("JoKenPo");
		setIconImage(Toolkit.getDefaultToolkit().getImage(jokenpo.class.getResource("/Icones/jogo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEscolha = new JLabel("ESCOLHAS");
		lblEscolha.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEscolha.setBounds(124, 11, 115, 14);
		contentPane.add(lblEscolha);

		JLabel lblComputador = new JLabel("COMPUTADOR");
		lblComputador.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblComputador.setBounds(98, 159, 126, 14);
		contentPane.add(lblComputador);

		lblCompt = new JLabel("");
		lblCompt.setIcon(new ImageIcon(jokenpo.class.getResource("/Icones/compt.png")));
		lblCompt.setBounds(130, 196, 67, 64);
		contentPane.add(lblCompt);

		btnPedra = new JButton("");
		btnPedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 1;
				jogar();
			}
		});
		btnPedra.setIcon(new ImageIcon(jokenpo.class.getResource("/Icones/rock.png")));
		btnPedra.setBounds(10, 41, 89, 92);
		contentPane.add(btnPedra);

		btnPapel = new JButton("");
		btnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 2;
				jogar();
			}
		});
		btnPapel.setIcon(new ImageIcon(jokenpo.class.getResource("/Icones/paper.png")));
		btnPapel.setBounds(120, 41, 89, 92);
		contentPane.add(btnPapel);

		btnTesoura = new JButton("");
		btnTesoura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 3;
				jogar();
			}
		});
		btnTesoura.setIcon(new ImageIcon(jokenpo.class.getResource("/Icones/scissors.png")));
		btnTesoura.setBounds(227, 41, 89, 92);
		contentPane.add(btnTesoura);

		lblVde = new JLabel("");
		lblVde.setBounds(85, 271, 153, 26);
		contentPane.add(lblVde);

		panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setForeground(Color.BLACK);
		panel.setBounds(0, 308, 338, 120);
		contentPane.add(panel);
		panel.setLayout(null);

		lblVj = new JLabel("");
		lblVj.setBounds(95, 27, 172, 25);
		panel.add(lblVj);

		lblCj = new JLabel("");
		lblCj.setBounds(95, 63, 172, 25);
		panel.add(lblCj);

	}// fim do construtor

	int jogador;

	private JLabel lblVde;
	private JPanel panel;
	private JLabel lblVj;
	private JLabel lblCj;

	int pj;
	int pc;

	/* Jogo */
	private void jogar() {

			int computador = (int) (Math.random() * 3 + 1);

			switch (computador) {
			case 1:
				lblCompt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/rock.png")));
				break;
			case 2:
				lblCompt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/paper.png")));
				break;
			case 3:
				lblCompt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/scissors.png")));
				break;
			}

			if (jogador == computador) {
				lblVde.setText("EMPATE"); 
			} else {
				if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
						|| (jogador == 3 && computador == 2)) {
					lblVde.setText("JOGADOR VENCEU");
					lblVj.setText("Pontos do Jogador: " + ++pj);
				} else {
					lblVde.setText("COMPUTADOR VENCEU");
					lblCj.setText("Pontos do Computador: " + ++pc);
				}
			}
			
				if (pj == 3 && pj > pc) {
					JOptionPane.showMessageDialog(null, "JOGADOR GANHOU O JOGO");
				} else if (pc == 3 && pc > pj){
					JOptionPane.showMessageDialog(null, "COMPUTADOR GANHOU O JOGO");
				}else {}
			
	}// fim JOGAR

}// fim da principal
