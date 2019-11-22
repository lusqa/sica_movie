package br.edu.uni7.sicamovie.ui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.edu.uni7.sicamovie.persistence.Queries;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private String[] filmsPrizeAnExibitionCountColumns = { "ID", "Nome Português", "Nome Original", "Diretor",
			"Ano de Lançamento", "Descrição", "Sinopse", "Quantidade de Prêmios", "Quantidade de Exibições" };

	private String[] roomsAndExibitionCountColumns = { "ID", "Nome", "Capacidade", "Quantidade de Exibições até Hoje" };

	private String[] roomsAndTicketsCountColumns = { "ID", "Nome", "Capacidade", "Quantidade de Ingressos em Julho",
			"Inteiras", "Meias" };

	private JPanel bottomPanel;
	private JPanel tablePanel;

	private Queries queries;

	public MainFrame() {
		setTitle("Sica Movie");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(getBottomPanel(), BorderLayout.SOUTH);
		getContentPane().add(getTablePanel(), BorderLayout.CENTER);

		addWindowListener(new MainFrameWindowAdapter());
		
		System.out.println("Iniciando BD");
		getQueries().getDbContext();
		System.out.println("BD Iniciado");
	}

	public JPanel getTablePanel() {
		if (tablePanel == null) {
			tablePanel = new JPanel();
			tablePanel.setLayout(new BorderLayout());
		}
		return tablePanel;
	}

	public JPanel getBottomPanel() {
		if (bottomPanel == null) {
			GridBagLayout gridBagLayout = new GridBagLayout();
			bottomPanel = new JPanel(gridBagLayout);

			JButton btnNewButton = new JButton("Ver premiações e exibições");
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
			gbc_btnNewButton.gridx = 0;
			gbc_btnNewButton.gridy = 0;
			bottomPanel.add(btnNewButton, gbc_btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Object[][] values = getQueries().getFilmsPrizesAndExibitions();
//						Object[][] values = {{new Integer(1), "a", "b", "c", "d", "e", "f", new Integer(1), new Integer(1)}};
					JTable table = new JTable(values, filmsPrizeAnExibitionCountColumns);
					JScrollPane scrollPane = new JScrollPane(table);

					getTablePanel().removeAll();
					getTablePanel().add(scrollPane, BorderLayout.CENTER);

					getContentPane().revalidate();
					getContentPane().repaint();

				}
			});

			JButton btnNewButton_1 = new JButton("Ver exibições das salas");
			GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
			gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
			gbc_btnNewButton_1.gridx = 1;
			gbc_btnNewButton_1.gridy = 0;
			bottomPanel.add(btnNewButton_1, gbc_btnNewButton_1);
			btnNewButton_1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Object[][] values = getQueries().getRoomsAndExibitions();
//						Object[][] values = {{new Integer(1), "a", "b", "c", "d", "e", "f", new Integer(1), new Integer(1)}};
					JTable table = new JTable(values, roomsAndExibitionCountColumns);
					JScrollPane scrollPane = new JScrollPane(table);

					getTablePanel().removeAll();
					getTablePanel().add(scrollPane, BorderLayout.CENTER);

					getContentPane().revalidate();
					getContentPane().repaint();

				}
			});

			JButton btnNewButton_2 = new JButton("Ver ingressos vendidos em Julho");
			GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
			gbc_btnNewButton_2.gridx = 2;
			gbc_btnNewButton_2.gridy = 0;
			bottomPanel.add(btnNewButton_2, gbc_btnNewButton_2);
			btnNewButton_2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Object[][] values = getQueries().getTicketsFromRoomCount();
//						Object[][] values = {{new Integer(1), "a", "b", "c", "d", "e", "f", new Integer(1), new Integer(1)}};
					JTable table = new JTable(values, roomsAndTicketsCountColumns);
					JScrollPane scrollPane = new JScrollPane(table);

					getTablePanel().removeAll();
					getTablePanel().add(scrollPane, BorderLayout.CENTER);

					getContentPane().revalidate();
					getContentPane().repaint();

				}
			});
		}
		return bottomPanel;
	}

	private Queries getQueries() {
		if (queries == null) {
			queries = new Queries();
		}
		return queries;
	}

	private class MainFrameWindowAdapter extends WindowAdapter {
		public void windowClosing(WindowEvent winEvt) {
			if (queries != null) {
				try {
					queries.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				queries = null;
			}
		}
	}
}
