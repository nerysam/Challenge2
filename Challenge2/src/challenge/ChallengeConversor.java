package challenge;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ChallengeConversor {

	public static void main(String[] args) {
		
		JFrame seleccionJframe = new JFrame("Seleccione su conversor");
		JFrame dHMiJFrame = new JFrame("Seleccione su conversor");
		JFrame dMMiJFrame = new JFrame("Seleccione su conversor");
		
		JTextField dMTextField = new JTextField();
		JComboBox dMComboBox = new JComboBox();
		dMComboBox.setModel(new DefaultComboBoxModel(
				new String[] { "Convertir de Quetzales a Dolares", "Convertir de Quetzales a Euros",
						"Convertir de Quetzales a Libras Esterlinas", "Convertir de Quetzales a Yen Japonés",
						"Convertir de Quetzales a Won Sur-Coreano", "Convertir de Dolares a Quetzales ",
						"Convertir de Euros a Quetzales ", "Convertir de Libras Esterlinas a Quetzales ",
						"Convertir de Yen Japonés a Quetzales ", "Convertir de Won Sur-Coreano a Quetzales " }));

		// Confirmar si quieres finalizar el programa
		JFrame confirmarJFrame = new JFrame("Cerrar el programa");
		confirmarJFrame.setLocation(new Point(600, 300));
		confirmarJFrame.setSize(350, 150);
		confirmarJFrame.getContentPane().setLayout(null);

		JLabel confirmarLblNewLabel = new JLabel("¿Desea cerrar el programa?");
		confirmarLblNewLabel.setBounds(21, 38, 289, 14);
		confirmarLblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		confirmarLblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		confirmarLblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		confirmarJFrame.getContentPane().add(confirmarLblNewLabel);

		JButton confirmarBtnNewButton = new JButton("Si");
		confirmarBtnNewButton.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		confirmarJFrame.dispose();
	    		JOptionPane.showMessageDialog(null, "El programa ha finalizado");
	    	}
	    });
		confirmarBtnNewButton.setBounds(49, 76, 97, 27);
		confirmarJFrame.getContentPane().add(confirmarBtnNewButton);

		JButton confirmarbtnNewButton_1 = new JButton("No\r\n");
		confirmarbtnNewButton_1.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		confirmarJFrame.dispose();
	    		seleccionJframe.setVisible(true);
	    	}
	    });
		confirmarbtnNewButton_1.setBounds(186, 76, 97, 27);
		confirmarJFrame.getContentPane().add(confirmarbtnNewButton_1);

		// Error
		JFrame errorJFrame = new JFrame("Seleccione su conversor");
		errorJFrame.setLocation(new Point(600, 300));
		errorJFrame.setSize(350, 150);
		errorJFrame.getContentPane().setLayout(null);

		JLabel errorLblNewLabel = new JLabel("Valor inválido, solo se aceptan valores numericos");
		errorLblNewLabel.setBounds(26, 37, 289, 14);
		errorLblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		errorLblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		errorLblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		errorJFrame.getContentPane().add(errorLblNewLabel);

		JButton errorBtnNewButton = new JButton("Ok");
		errorBtnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				errorJFrame.dispose();
				seleccionJframe.setVisible(true);
			}
		});
		errorBtnNewButton.setBounds(111, 76, 97, 27);
		errorJFrame.getContentPane().add(errorBtnNewButton);

		// Resultado de conversor de moneda
		JFrame resultadoJFrame = new JFrame("Seleccione su conversor");
		resultadoJFrame.setSize(400, 225);
		resultadoJFrame.setLocation(new Point(600, 300));
		resultadoJFrame.getContentPane().setLayout(null);
		
		JLabel lblTuValorEs = new JLabel();		
		lblTuValorEs.setPreferredSize(new Dimension(190, 50));
		lblTuValorEs.setFont(new Font("Arial", Font.BOLD, 15));
		lblTuValorEs.setBounds(27, 22, 283, 50);
		resultadoJFrame.getContentPane().add(lblTuValorEs);

		JLabel lbldeseaRealizarOtra = new JLabel();
		lbldeseaRealizarOtra.setText("¿Desea realizar otra operación?");
		lbldeseaRealizarOtra.setPreferredSize(new Dimension(190, 50));
		lbldeseaRealizarOtra.setFont(new Font("Arial", Font.BOLD, 12));
		lbldeseaRealizarOtra.setBounds(98, 89, 190, 50);
		resultadoJFrame.getContentPane().add(lbldeseaRealizarOtra);

		JButton btnSi = new JButton("Si");
		btnSi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultadoJFrame.dispose();
				dMMiJFrame.setVisible(true);
			}
		});
		btnSi.setBounds(27, 149, 97, 27);
		resultadoJFrame.getContentPane().add(btnSi);

		JButton btnNo = new JButton("No");
		btnNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultadoJFrame.dispose();
				confirmarJFrame.setVisible(true);
			}
		});
		btnNo.setBounds(147, 149, 97, 27);
		resultadoJFrame.getContentPane().add(btnNo);

		JButton btnMenu = new JButton("Menu");
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultadoJFrame.dispose();
				seleccionJframe.setVisible(true);
			}
		});
		btnMenu.setBounds(267, 149, 97, 27);
		resultadoJFrame.getContentPane().add(btnMenu);

		// Resultado de conversor de tiempo
		JFrame tResultadoJFrame = new JFrame("Seleccione su conversor");
		tResultadoJFrame.setSize(400, 225);
		tResultadoJFrame.setLocation(new Point(600, 300));
		tResultadoJFrame.getContentPane().setLayout(null);

		JLabel tLblTuValorEs = new JLabel();
		tLblTuValorEs.setText("Tu tiempo es de : ");
		tLblTuValorEs.setPreferredSize(new Dimension(190, 50));
		tLblTuValorEs.setFont(new Font("Arial", Font.BOLD, 15));
		tLblTuValorEs.setBounds(27, 22, 283, 50);
		tResultadoJFrame.getContentPane().add(tLblTuValorEs);

		JLabel tLbldeseaRealizarOtra = new JLabel();
		tLbldeseaRealizarOtra.setText("¿Desea realizar otra operación?");
		tLbldeseaRealizarOtra.setPreferredSize(new Dimension(190, 50));
		tLbldeseaRealizarOtra.setFont(new Font("Arial", Font.BOLD, 12));
		tLbldeseaRealizarOtra.setBounds(98, 89, 190, 50);
		tResultadoJFrame.getContentPane().add(tLbldeseaRealizarOtra);

		JButton tBtnSi = new JButton("Si");
		tBtnSi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tResultadoJFrame.dispose();
				dHMiJFrame.setVisible(true);
			}
		});
		tBtnSi.setBounds(27, 149, 97, 27);
		tResultadoJFrame.getContentPane().add(tBtnSi);

		JButton tBtnNo = new JButton("No");
		tBtnNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tResultadoJFrame.dispose();
				confirmarJFrame.setVisible(true);
			}
		});
		tBtnNo.setBounds(147, 149, 97, 27);
		tResultadoJFrame.getContentPane().add(tBtnNo);

		JButton tBtnMenu = new JButton("Menu");
		tBtnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tResultadoJFrame.dispose();
				seleccionJframe.setVisible(true);
			}
		});
		tBtnMenu.setBounds(267, 149, 97, 27);
		tResultadoJFrame.getContentPane().add(tBtnMenu);

		// Datos de conversor de moneda
		dMMiJFrame.setSize(400, 225);
		dMMiJFrame.setLocation(new Point(600, 300));
		dMMiJFrame.getContentPane().setLayout(null);

		JLabel dMLblNewLabel = new JLabel();
		dMLblNewLabel.setText("Ingresa la cantidad de dinero a convertir :");
		dMLblNewLabel.setPreferredSize(new Dimension(190, 50));
		dMLblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		dMLblNewLabel.setBounds(10, 0, 348, 50);
		dMMiJFrame.getContentPane().add(dMLblNewLabel);

		
		dMTextField.setBounds(10, 37, 366, 32);
		dMMiJFrame.getContentPane().add(dMTextField);
		dMTextField.setColumns(10);

		JLabel dMLblNewLabel_1 = new JLabel();
		dMLblNewLabel_1.setText("Ingrese el tipo de moneda que desea convertir :");
		dMLblNewLabel_1.setPreferredSize(new Dimension(190, 50));
		dMLblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		dMLblNewLabel_1.setBounds(10, 68, 348, 50);
		dMMiJFrame.getContentPane().add(dMLblNewLabel_1);

		
		dMComboBox.setBounds(10, 106, 366, 32);
		dMMiJFrame.getContentPane().add(dMComboBox);

		JButton dMBtnNewButton = new JButton("Ok");
		dMBtnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!validar(dMTextField.getText().trim()) || dMTextField.getText().equals("")) {
					dMMiJFrame.dispose();
					errorJFrame.setVisible(true);			
				} 
				else {
					dMMiJFrame.dispose();
					resultadoJFrame.setVisible(true);
					
					double agarrarTexto = Double.parseDouble(dMTextField.getText());
					
					if(dMComboBox.getSelectedIndex() == 0) {
						double calculo = agarrarTexto * 0.13;
						BigDecimal aprox = new BigDecimal(calculo).setScale(2, RoundingMode.HALF_UP);
						lblTuValorEs.setText("Tu valor es de : " + aprox);
					}
					if (dMComboBox.getSelectedIndex() == 1) {
						double calculo = agarrarTexto * 0.12;
						BigDecimal aprox = new BigDecimal(calculo).setScale(2, RoundingMode.HALF_UP);
						lblTuValorEs.setText("Tu valor es de : " + aprox);
					}
					if(dMComboBox.getSelectedIndex() == 2) {
						double calculo = agarrarTexto * 0.10;
						BigDecimal aprox = new BigDecimal(calculo).setScale(2, RoundingMode.HALF_UP);
						lblTuValorEs.setText("Tu valor es de : " + aprox);
					}
					if (dMComboBox.getSelectedIndex() == 3) {
						double calculo = agarrarTexto * 16.75;
						BigDecimal aprox = new BigDecimal(calculo).setScale(2, RoundingMode.HALF_UP);
						lblTuValorEs.setText("Tu valor es de : " + aprox);
					}
					if(dMComboBox.getSelectedIndex() == 4) {
						double calculo = agarrarTexto * 166.02;
						BigDecimal aprox = new BigDecimal(calculo).setScale(2, RoundingMode.HALF_UP);
						lblTuValorEs.setText("Tu valor es de : " + aprox);
					}
					if (dMComboBox.getSelectedIndex() == 5) {
						double calculo = agarrarTexto * 7.81;
						BigDecimal aprox = new BigDecimal(calculo).setScale(2, RoundingMode.HALF_UP);
						lblTuValorEs.setText("Tu valor es de : " + aprox);
					}
					if(dMComboBox.getSelectedIndex() == 6) {
						double calculo = agarrarTexto * 8.42;
						BigDecimal aprox = new BigDecimal(calculo).setScale(2, RoundingMode.HALF_UP);
						lblTuValorEs.setText("Tu valor es de : " + aprox);
					}
					if (dMComboBox.getSelectedIndex() == 7) {
						double calculo = agarrarTexto * 9.55;
						BigDecimal aprox = new BigDecimal(calculo).setScale(2, RoundingMode.HALF_UP);
						lblTuValorEs.setText("Tu valor es de : " + aprox);
					}
					if(dMComboBox.getSelectedIndex() == 8) {
						double calculo = agarrarTexto * 0.060;
						BigDecimal aprox = new BigDecimal(calculo).setScale(2, RoundingMode.HALF_UP);
						lblTuValorEs.setText("Tu valor es de : " + aprox);
					}
					if (dMComboBox.getSelectedIndex() == 9) {
						double calculo = agarrarTexto * 0.0060;
						BigDecimal aprox = new BigDecimal(calculo).setScale(2, RoundingMode.HALF_UP);
						lblTuValorEs.setText("Tu valor es de : " + aprox);
					}
					
				}
				
			}
		});
		dMBtnNewButton.setBounds(75, 151, 97, 27);
		dMMiJFrame.getContentPane().add(dMBtnNewButton);

		JButton dMBtnNewButton_1 = new JButton("Cancelar");
		dMBtnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dMMiJFrame.dispose();
				confirmarJFrame.setVisible(true);
			}
		});
		dMBtnNewButton_1.setBounds(207, 151, 97, 27);
		dMMiJFrame.getContentPane().add(dMBtnNewButton_1);

		// Datos de conversor de tiempo
		dHMiJFrame.setSize(400, 225);
		dHMiJFrame.setLocation(new Point(600, 300));
		dHMiJFrame.getContentPane().setLayout(null);

		JLabel dHLblNewLabel = new JLabel();
		dHLblNewLabel.setText("Ingresa la cantidad de tiempo a convertir :");
		dHLblNewLabel.setPreferredSize(new Dimension(190, 50));
		dHLblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		dHLblNewLabel.setBounds(10, 0, 348, 50);
		dHMiJFrame.getContentPane().add(dHLblNewLabel);

		JTextField dHTextField = new JTextField();
		dHTextField.setBounds(10, 37, 366, 32);
		dHMiJFrame.getContentPane().add(dHTextField);
		dHTextField.setColumns(10);

		JLabel dHLblNewLabel_1 = new JLabel();
		dHLblNewLabel_1.setText("Ingrese las medidas de tiempo que desea convertir :");
		dHLblNewLabel_1.setPreferredSize(new Dimension(190, 50));
		dHLblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		dHLblNewLabel_1.setBounds(10, 68, 348, 50);
		dHMiJFrame.getContentPane().add(dHLblNewLabel_1);

		JComboBox dHComboBox = new JComboBox();
		dHComboBox.setModel(new DefaultComboBoxModel(new String[] { "Convertir de Segundos a Minutos",
				"Convertir de Segundos a Horas", "Convertir de Segundos a Dias", "Convertir de Minutos a Segundos",
				"Convertir de Minutos a Horas", "Convertir de Minutos a Dias", "Convertir de Horas a Segundos",
				"Convertir de Horas a Minutos", "Convertir de Horas a Dias", "Convertir de Dias a Segundos",
				"Convertir de Dias a Minutos", "Convertir de Dias a Horas" }));
		dHComboBox.setBounds(10, 106, 366, 32);
		dHMiJFrame.getContentPane().add(dHComboBox);

		JButton dHBtnNewButton = new JButton("Ok");
		dHBtnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!validar(dHTextField.getText().trim()) || dHTextField.getText().equals("")) {
					dHMiJFrame.dispose();
					errorJFrame.setVisible(true);			
				} else {
					dHMiJFrame.dispose();
					tResultadoJFrame.setVisible(true);
					
					double agarrarTexto = Double.parseDouble(dHTextField.getText());
					
					if(dHComboBox.getSelectedIndex() == 0) {
						double calculo1 = agarrarTexto * 0.0166667;
						BigDecimal aprox1 = new BigDecimal(calculo1).setScale(4, RoundingMode.HALF_UP);
						tLblTuValorEs.setText("Tu tiempo es de : " + aprox1);
						System.out.println(aprox1);
					}
					if (dHComboBox.getSelectedIndex() == 1) {
						double calculo = agarrarTexto * 0.00027777833333;
						BigDecimal aprox = new BigDecimal(calculo).setScale(4, RoundingMode.HALF_UP);
						tLblTuValorEs.setText("Tu tiempo es de : " + aprox);
					}
					if(dHComboBox.getSelectedIndex() == 2) {
						double calculo = agarrarTexto * 1.1574083333e-5;
						BigDecimal aprox = new BigDecimal(calculo).setScale(5, RoundingMode.HALF_UP);
						tLblTuValorEs.setText("Tu tiempo es de : " + aprox);
					}
					if (dHComboBox.getSelectedIndex() == 3) {
						double calculo = agarrarTexto * 60;
						BigDecimal aprox = new BigDecimal(calculo).setScale(4, RoundingMode.HALF_UP);
						tLblTuValorEs.setText("Tu tiempo es de : " + aprox);
					}
					if(dHComboBox.getSelectedIndex() == 4) {
						double calculo = agarrarTexto * 0.0166667;
						BigDecimal aprox = new BigDecimal(calculo).setScale(4, RoundingMode.HALF_UP);
						tLblTuValorEs.setText("Tu tiempo es de : " + aprox);
					}
					if (dHComboBox.getSelectedIndex() == 5) {
						double calculo = agarrarTexto * 0.000694444;
						BigDecimal aprox = new BigDecimal(calculo).setScale(4, RoundingMode.HALF_UP);
						tLblTuValorEs.setText("Tu tiempo es de : " + aprox);
					}
					if(dHComboBox.getSelectedIndex() == 6) {
						double calculo = agarrarTexto * 3600;
						BigDecimal aprox = new BigDecimal(calculo).setScale(4, RoundingMode.HALF_UP);
						tLblTuValorEs.setText("Tu tiempo es de : " + aprox);
					}
					if (dHComboBox.getSelectedIndex() == 7) {
						double calculo = agarrarTexto * 60;
						BigDecimal aprox = new BigDecimal(calculo).setScale(4, RoundingMode.HALF_UP);
						tLblTuValorEs.setText("Tu tiempo es de : " + aprox);
					}
					if(dHComboBox.getSelectedIndex() == 8) {
						double calculo = agarrarTexto * 0.0416667;
						BigDecimal aprox = new BigDecimal(calculo).setScale(4, RoundingMode.HALF_UP);
						tLblTuValorEs.setText("Tu tiempo es de : " + aprox);
					}
					if (dHComboBox.getSelectedIndex() == 9) {
						double calculo = agarrarTexto * 86400;
						BigDecimal aprox = new BigDecimal(calculo).setScale(4, RoundingMode.HALF_UP);
						tLblTuValorEs.setText("Tu tiempo es de : " + aprox);
					} 
					if (dHComboBox.getSelectedIndex() == 10) {
						double calculo = agarrarTexto * 1440;
						BigDecimal aprox = new BigDecimal(calculo).setScale(4, RoundingMode.HALF_UP);
						tLblTuValorEs.setText("Tu tiempo es de : " + aprox);
					}
					if (dHComboBox.getSelectedIndex() == 11) {
						double calculo = agarrarTexto * 24;
						BigDecimal aprox = new BigDecimal(calculo).setScale(4, RoundingMode.HALF_UP);
						tLblTuValorEs.setText("Tu tiempo es de : " + aprox);
					}
					
				} 			
				
			}
		});
		dHBtnNewButton.setBounds(75, 151, 97, 27);
		dHMiJFrame.getContentPane().add(dHBtnNewButton);

		JButton dHBtnNewButton_1 = new JButton("Cancelar");
		dHBtnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dHMiJFrame.dispose();
				confirmarJFrame.setVisible(true);
			}
		});
		dHBtnNewButton_1.setBounds(207, 151, 97, 27);
		dHMiJFrame.getContentPane().add(dHBtnNewButton_1);

		// Seleccion del conversor
		seleccionJframe.setLocation(new Point(600, 300));
		seleccionJframe.setSize(400, 176);
		seleccionJframe.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("  Selecciona tu tipo de conversor :   ");
		lblNewLabel.setBounds(0, 0, 386, 50);
		lblNewLabel.setPreferredSize(new Dimension(164, 50));
		lblNewLabel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		seleccionJframe.getContentPane().add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(10, 54, 366, 27);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Conversor de Moneda", "Conversor de Tiempo" }));
		comboBox.setName("");
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		seleccionJframe.getContentPane().add(comboBox);

		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valores = comboBox.getSelectedIndex();

				switch (valores) {
				case 0:
					seleccionJframe.dispose();
					dMMiJFrame.setVisible(true);
					break;

				case 1:
					seleccionJframe.dispose();
					dHMiJFrame.setVisible(true);
					break;
				}
			}
		});
		btnNewButton.setBounds(75, 102, 97, 27);
		seleccionJframe.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seleccionJframe.dispose();
				confirmarJFrame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(197, 102, 97, 27);
		seleccionJframe.getContentPane().add(btnNewButton_1);

		JPanel miJPanel = new JPanel();
		miJPanel.setSize(300, 300);

		seleccionJframe.setVisible(true);

	}

	public static boolean validar(String datos) {
		return datos.matches("[0-9,.]*");
	}

}