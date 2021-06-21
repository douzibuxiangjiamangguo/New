package my;

import javax.swing.JFrame;

public class FirstDemo	
{
	private static void createGUI()
	{
		// JFrame指 一个窗口，构造方法的参数为窗口标题
		// 语法：因为MyFrame是JFrame的子类，所以可以这么写
		JFrame frame = new MyFrame("First Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// 设置窗口的其他参数，如窗口大小
		frame.setSize(1700, 1100);
		
		// 显示窗口
		frame.setVisible(true);
		frame.setTitle("Main page");
	}
	
	public static void main(String[] args)
	{
		// 此段代码间接地调用了 createGUI()，具体原理在 Swing高级篇 里讲解
		// 初学者先照抄此代码框架即可
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				createGUI();
			}
		});

	}
}
