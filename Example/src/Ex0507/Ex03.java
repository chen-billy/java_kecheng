package Ex0507;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex03 {
	public static void main(String[] args) {
		// ����������ť
		JButton btn1 = new JButton("ģ̬�Ի���");
		JButton btn2 = new JButton("��ģ̬�Ի���");
		JFrame f = new JFrame("DialogDemo");
		f.setSize(300, 250);
		f.setLocation(300, 200);
		f.setLayout(new FlowLayout());// Ϊ����������ò��ֹ�����
		// ��Container���������Ӱ�ť
		f.add(btn1);
		f.add(btn2);
		// ���õ����رհ�ťĬ�Ϲرմ���
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		final JLabel label = new JLabel();
		final JDialog dialog = new JDialog(f, "Dialog");
		dialog.setSize(220, 150);// ���öԻ����С
		dialog.setLocation(350, 250);// ���öԻ���λ��
		dialog.setLayout(new FlowLayout());// ���ò��ֹ�����
		final JButton btn3 = new JButton("ȷ��");// ������ť����
		dialog.add(btn3);// �ڶԻ��������������Ӱ�ť
		// Ϊ��ģ̬�Ի��򡱰�ť���ӵ����¼�
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ���öԻ���Ϊģ̬
				dialog.setModal(true);
				// ���JDialog������û��������JLabel��ǩ���Ͱ�JLabel��������
				if (dialog.getComponents().length == 1) {
					dialog.add(label);
				}
				// �����޸ı�ǩ������
				label.setText("ģʽ�Ի��򣬵��ȷ�ϰ�ť�ر�");
				// ��ʾ�Ի���
				dialog.setVisible(true);
			}
		});
		// Ϊ����ģ̬�Ի��򡱰�ť���ӵ����¼�
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ���öԻ���Ϊ��ģ̬
				dialog.setModal(false);
				// ���JDialog������û��������JLabel��ǩ���Ͱ�JLabel��������
				if (dialog.getComponents().length == 1) {
					dialog.add(label);
				}
				// �����޸ı�ǩ������
				label.setText("��ģʽ�Ի��򣬵��ȷ�ϰ�ť�ر�");
				// ��ʾ�Ի���
				dialog.setVisible(true);
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.dispose();
			}
		});
	}
}