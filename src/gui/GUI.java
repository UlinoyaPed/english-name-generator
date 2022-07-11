package gui;

import pack.GeneraName;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Component;

import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI extends JFrame {
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setType(Type.UTILITY);
		setResizable(false);
		setAlwaysOnTop(true);
		setTitle("英文名生成器_GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 350);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(UIManager.getBorder("CheckBoxMenuItem.border"));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel pointout = new JLabel("请输入英文名位数");
		pointout.setHorizontalAlignment(SwingConstants.CENTER);
		pointout.setIcon(new ImageIcon(GUI.class
				.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Background-Color-Black@2x.png")));
		pointout.setFont(new Font("Dialog", Font.BOLD, 35));
		pointout.setBounds(2, 12, 522, 54);
		pointout.setToolTipText("请输入所要生成的英文名位数");
		contentPane.add(pointout);

		JButton copy = new JButton("复制到剪贴板");
		copy.setBounds(346, 219, 132, 28);
		contentPane.add(copy);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(2, 78, 323, 72);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		textArea.setBackground(SystemColor.info);
		textArea.setForeground(SystemColor.windowText);
		textArea.setFont(new Font("Dialog", Font.BOLD, 30));
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);

		JScrollPane scrollPane_result = new JScrollPane();
		scrollPane_result.setBounds(12, 185, 284, 116);
		contentPane.add(scrollPane_result);

		JLabel result = new JLabel("生成结果：");
		result.setAlignmentX(Component.CENTER_ALIGNMENT);
		scrollPane_result.setViewportView(result);
		result.setFont(new Font("Dialog", Font.BOLD, 15));
		result.setVerticalAlignment(SwingConstants.TOP);

		JButton generate = new JButton("开始生成");
		generate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {// 鼠标点击事件
				String text = textArea.getText();
				int len = text.length();
				int num = Integer.parseInt(text);// 字符串转数字
					GeneraName name = new GeneraName();
				

				result.setText("生成结果：\n" + name.generatName(num));
			}
		});

		generate.setBounds(372, 78, 106, 69);
		contentPane.add(generate);

	}
}
