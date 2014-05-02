/*
 * NewNetworkForm.java
 *
 * Created on __DATE__, __TIME__
 */

package gui;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.print.DocFlavor.READER;
import javax.swing.JOptionPane;

import jxl.read.biff.BiffException;
import dataManager.ReadExcel;
import architecture.Company;
import architecture.Network;
import architecture.Neuron;

/**
 *
 * @author  __USER__
 */
public class NewNetworkForm extends javax.swing.JFrame {

	private String idCompany;
	private BigDecimal cotaError;
	private double learningCnt;
	private int neuronSize, numPatrones;
	private boolean bias;

	/** Creates new form NewNetworkForm */
	public NewNetworkForm() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		buttonGroup2 = new javax.swing.ButtonGroup();
		buttonGroup3 = new javax.swing.ButtonGroup();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		tfIdCompany = new javax.swing.JTextField();
		tfCotaError = new javax.swing.JTextField();
		tfNeuronSize = new javax.swing.JTextField();
		tfCnsLearning = new javax.swing.JTextField();
		sPatrones = new javax.swing.JSpinner();
		sPatrones.setValue(10);
		rbLineal = new javax.swing.JRadioButton();
		rbTangencial = new javax.swing.JRadioButton();
		cbBias = new javax.swing.JCheckBox();
		bCreateNN = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("Identificador empresa: ");

		jLabel2.setText("Factor de aprendizaje:");

		jLabel3.setText("Tama\u00f1o de neurona: ");

		jLabel4.setText("N\u00ba Patrones de aprendizaje: ");

		jLabel5.setText("Cota de error: ");

		jLabel6.setText("Funci\u00f3n: ");

		tfIdCompany.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tfIdCompanyActionPerformed(evt);
			}
		});

		tfCotaError.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tfCotaErrorActionPerformed(evt);
			}
		});

		tfNeuronSize.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tfNeuronSizeActionPerformed(evt);
			}
		});

		tfCnsLearning.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tfCnsLearningActionPerformed(evt);
			}
		});

		rbLineal.setText("Lineal");

		rbTangencial.setText("Tangencial");
		
		

		cbBias.setText("Bias");
		cbBias.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cbBiasActionPerformed(evt);
			}
		});

		bCreateNN.setText("Crear Red");
		bCreateNN.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bCreateNNActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(72, 72, 72)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		128,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		tfIdCompany,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		24,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addContainerGap())
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addGroup(
																														javax.swing.GroupLayout.Alignment.LEADING,
																														layout.createSequentialGroup()
																																.addComponent(
																																		jLabel5)
																																.addGap(49,
																																		49,
																																		49)
																																.addComponent(
																																		tfCotaError,
																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																		24,
																																		Short.MAX_VALUE))
																												.addComponent(
																														jLabel4,
																														javax.swing.GroupLayout.Alignment.LEADING))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										sPatrones,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										45,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.LEADING,
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addComponent(
																														cbBias)
																												.addComponent(
																														jLabel6))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																										99,
																										Short.MAX_VALUE)
																								.addComponent(
																										rbLineal)))
																.addGap(18, 18,
																		18)
																.addComponent(
																		rbTangencial)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		bCreateNN)
																.addGap(27, 27,
																		27))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.LEADING,
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel3)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										tfNeuronSize,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										45,
																										Short.MAX_VALUE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel2)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										tfCnsLearning,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										37,
																										Short.MAX_VALUE)))
																.addGap(249,
																		249,
																		249)))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(60, 60, 60)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														tfIdCompany,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel1))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel5)
												.addComponent(
														tfCotaError,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(
														sPatrones,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(
														tfNeuronSize,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(6, 6, 6)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(
														tfCnsLearning,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel6)
												.addComponent(rbLineal)
												.addComponent(rbTangencial))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(cbBias)
								.addContainerGap(47, Short.MAX_VALUE))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(251, Short.MAX_VALUE)
								.addComponent(bCreateNN).addGap(25, 25, 25)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void tfIdCompanyActionPerformed(ActionEvent evt) {
		idCompany = tfIdCompany.getText();
		System.out.print("escribiendo iden");
	}

	private void tfCotaErrorActionPerformed(ActionEvent evt) {
		String stCotaError = tfCotaError.getText();
		cotaError = new BigDecimal(stCotaError); //Manejar errores 
	}

	private void tfNeuronSizeActionPerformed(ActionEvent evt) {
		// TODO add your handling code here:
		String stneuronSize = tfNeuronSize.getText();
		neuronSize = Integer.parseInt(stneuronSize);
	}

	private void tfCnsLearningActionPerformed(ActionEvent evt) {
		String stCnsLearning = tfCnsLearning.getText();
		learningCnt = Double.parseDouble(stCnsLearning);
	}

	private void cbBiasActionPerformed(ActionEvent evt) {
		bias = cbBias.isSelected();
	}

	private void bCreateNNActionPerformed(java.awt.event.ActionEvent evt) {

		System.out.print(tfIdCompany.getText());
		idCompany = tfIdCompany.getText();
		System.out.print("ide" + idCompany);
		
		//si id company no est� entre 0 o 500, y adem�s tiene q tener el formato "000"
		
		if ( (idCompany == null) || (idCompany.equals("")) ){
			JOptionPane.showMessageDialog(this,
					"Error, el campo identificador de empresa est� vacio",
					"Campo requerido", JOptionPane.ERROR_MESSAGE);
		} else {
			
			int auxInt = Integer.parseInt (idCompany);
			
	
			if  (auxInt < 1){
				System.out.print("Menor que ");//
			}
			
			if  (auxInt > 510){
				System.out.print("Mayor que ");//
			}
			
			
//			if ( (idCompany.compareTo("1") == -1) || (idCompany.compareTo("510") < 0)){
//				System.out.print("Se sale del rango");//Tb pilla si metes letras 
//			}
//	
			
			//Si no incluimos los dem�s campos, estos se a�adiran por defecto
			String stCotaError = tfCotaError.getText();
			if ((stCotaError == null) || (stCotaError.equals(""))) {
				tfCotaError.setText("0.001");
				cotaError = new BigDecimal(0.001);

			} else {
				cotaError = new BigDecimal(stCotaError);
			}
			String stneuronSize = tfNeuronSize.getText();
			if ((stneuronSize == null) || (stneuronSize.equals(""))) {
				tfNeuronSize.setText("10");
				neuronSize = 10; //independientemente del bias 

			} else {
				neuronSize = Integer.parseInt(stneuronSize);
			}

			String stCnsLearning = tfCnsLearning.getText();
			if ((stCnsLearning == null) || (stCnsLearning.equals(""))) {
				tfCnsLearning.setText("0.001");
				learningCnt = 0.001;

			} else {
				learningCnt = Double.parseDouble(stCnsLearning);
			}
			numPatrones  = (int) sPatrones.getValue();

			bias = cbBias.isSelected();

			System.out.print("Creando NN con id empresa: " + idCompany
					+ " cota de error " + cotaError + " tama�o de neurona: "
					+ neuronSize + " factor de aprendizaje " + learningCnt
					+ " bias: " + bias +"numero de patrones "+ numPatrones);

		}

				//Creamos la red con todos los datos
		
			ReadExcel excel;
			try {
				excel = new ReadExcel();
				Company p = excel.readCompanyById (idCompany);
				Network n = Network.getInstance(p);
				n.setUpNetwork(cotaError, numPatrones, neuronSize, bias, 2000);
				n.training();
			} catch (BiffException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		

	}

	//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NewNetworkForm().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton bCreateNN;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.ButtonGroup buttonGroup2;
	private javax.swing.ButtonGroup buttonGroup3;
	private javax.swing.JCheckBox cbBias;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JRadioButton rbLineal;
	private javax.swing.JRadioButton rbTangencial;
	private javax.swing.JSpinner sPatrones;
	private javax.swing.JTextField tfCnsLearning;
	private javax.swing.JTextField tfCotaError;
	private javax.swing.JTextField tfIdCompany;
	private javax.swing.JTextField tfNeuronSize;
	// End of variables declaration//GEN-END:variables

}