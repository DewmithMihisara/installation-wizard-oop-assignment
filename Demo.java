import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LastPage extends JFrame{
	private JLabel ttl;
	private JLabel discription;
	private JPanel btnPnl;
	private JButton bckBtn;
	private JButton fnshBtn;
	private String Id;
	private String name;
	
	LastPage(){
		initComponents();
	}
	void initComponents(){
		setSize(500,350);
		setTitle("Stup Wizard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		ttl = new JLabel("WELCOME TO ENGENIES ENVIRONMENT SETUP WIZARD");
		ttl.setFont(new Font("Serif", Font.BOLD, 15));
		ttl.setHorizontalAlignment(JLabel.CENTER);
		
		String text ="<html>";
		text +="Your installation requirements has been fulfilled.<br>";
		text +="Click FINISH to complete the installation process.";
		
		discription= new JLabel();
		discription.setText(text);
		
		btnPnl= new JPanel(new FlowLayout(FlowLayout.RIGHT));
		bckBtn=new JButton("Back");
		fnshBtn= new JButton("Finish");
		
		fnshBtn.addActionListener((event) -> {
			setVisible(false);
		});
		
		bckBtn.addActionListener((event) -> {
			NameWindow nameWindow = new NameWindow();
			nameWindow.nameTxt.setText(name);
			if(!nameWindow.nameTxt.getText().equals(" ")){
					  nameWindow.nxtBttn.setEnabled(true);
			}
			nameWindow.setName(name);
			nameWindow.setID(Id);
			nameWindow.setVisible(true);
			setVisible(false);
			
		});
		
		btnPnl.add(bckBtn);
		btnPnl.add(fnshBtn);
		
		add(ttl,BorderLayout.PAGE_START);
		add(discription,BorderLayout.CENTER);
		add(btnPnl,BorderLayout.PAGE_END);
	}
	public void setID(String Id){
		this.Id= Id;
	}
	public void setName(String name){
		this.name= name;
	}
}

class NameWindow extends JFrame{
	private JLabel ttl;
	private JLabel discription;
	private JLabel namelbl;
	static JTextField nameTxt;
	private JButton bckBtn;
	static JButton nxtBttn;
	private JButton cnclBttn;
	private JPanel btnPnl;
	private JPanel disPnl;
	private String Id;
	private String name;
	
	NameWindow(){
		initComponents();
	}
	void initComponents(){
		setSize(500,350);
		setTitle("Stup Wizard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		ttl = new JLabel("WELCOME TO ENGENIES ENVIRONMENT SETUP WIZARD");
		ttl.setFont(new Font("Serif", Font.BOLD, 15));
		ttl.setHorizontalAlignment(JLabel.CENTER);
		
		disPnl = new JPanel(new GridLayout(3,1));
		
		String text ="<html>";
		text +="Fill in the following requirements to continue the<br>";
		text +="installation process.";
		
		discription= new JLabel();
		discription.setText(text);
		namelbl = new JLabel("Enter your name:");
		nameTxt= new JTextField();
		nameTxt.setFont(new Font("Serif", Font.BOLD, 35));
		
		disPnl.add(discription);
		disPnl.add(namelbl);
		disPnl.add(nameTxt);
		
		btnPnl= new JPanel(new FlowLayout(FlowLayout.RIGHT));
		bckBtn=new JButton("Back");
		nxtBttn= new JButton("Next");
		cnclBttn= new JButton("Cancel");
		
		nxtBttn.addActionListener((event) -> {
			LastPage lastPg = new LastPage();
			String Name =nameTxt.getText();
			lastPg.setID(Id);
			lastPg.setName(Name);
			lastPg.setVisible(true);
			setVisible(false);
		});
		
		bckBtn.addActionListener((event) -> {
			
			NicWindow nicWindow = new NicWindow();
			nicWindow.nicTxt.setText(Id);
			if(!nicWindow.nicTxt.getText().equals(" ")){
					  nicWindow.nxtBttn.setEnabled(true);
			}
			nicWindow.setName(name);
			nicWindow.setID(Id);
			nicWindow.setVisible(true);
			setVisible(false);
		});
		
		cnclBttn.addActionListener((event) -> {
			setVisible(false);
		});
		
		nameTxt.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {
                nxtBttn.setEnabled(true);
                if(nameTxt.getText().equals("")){
					  nxtBttn.setEnabled(false);
				}
            }
        });

		nameTxt.addActionListener((event) -> {
			nxtBttn.doClick();
		});
		
		btnPnl.add(bckBtn);
		btnPnl.add(nxtBttn);
		btnPnl.add(cnclBttn);
		
		add(ttl,BorderLayout.PAGE_START);
		add(disPnl,BorderLayout.CENTER);
		add(btnPnl,BorderLayout.PAGE_END);
	}
	public void setID(String Id){
		this.Id= Id;
	}
	public void setName(String name){
		this.name= name;
	}
}

class NicWindow extends JFrame{
	private JLabel ttl;
	private JLabel discription;
	private JLabel nxt;
	private JLabel nic;
	static JTextField nicTxt;
	private JButton bckBtn;
	static JButton nxtBttn;
	private JButton cnclBttn;
	private JPanel btnPnl;
	private JPanel disPnl;
	private String Id;
	private String name;
	
	NicWindow() {
		initComponents();
	}
	
	void initComponents(){
		setSize(500,350);
		setTitle("Stup Wizard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		ttl = new JLabel("WELCOME TO ENGENIES ENVIRONMENT SETUP WIZARD");
		ttl.setFont(new Font("Serif", Font.BOLD, 15));
		ttl.setHorizontalAlignment(JLabel.CENTER);
		
		disPnl = new JPanel(new GridLayout(4,1));
		
		String text ="<html>";
		text +="This Engenies environment setup wizard will install the<br>";
		text +="Engenis software on your computer.<br>";
		text += "To continue,";
		
		discription= new JLabel();
		discription.setText(text);
		nic = new JLabel("Enter your NIC number:");
		nicTxt= new JTextField();
		nicTxt.setFont(new Font("Serif", Font.BOLD, 35));
		nxt = new JLabel("click NEXT to continue...");
		
		disPnl.add(discription);
		disPnl.add(nic);
		disPnl.add(nicTxt);
		disPnl.add(nxt);
		
		btnPnl= new JPanel(new FlowLayout(FlowLayout.RIGHT));
		bckBtn=new JButton("Back");
		nxtBttn= new JButton("Next");
		cnclBttn= new JButton("Cancel");
		
		nicTxt.addActionListener((event) -> {
			nxtBttn.doClick();
		});
		
		nxtBttn.addActionListener((NameWindow) -> {
			NameWindow nameWindow = new NameWindow();
			String ID = nicTxt.getText();
			nameWindow.setID(ID);
			nameWindow.setName(name);
			nameWindow.setVisible(true);
			setVisible(false);
		});
		
		bckBtn.addActionListener((event) -> {
			MainWindow main = new MainWindow();
			main.setVisible(true);
			setVisible(false);
		});
		
		cnclBttn.addActionListener((event) -> {
			setVisible(false);
		});
		
		nicTxt.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e){}

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {
                nxtBttn.setEnabled(true);
                if(nicTxt.getText().equals("")){
					  nxtBttn.setEnabled(false);

				}
            }
        });
		
		btnPnl.add(bckBtn);
		btnPnl.add(nxtBttn);
		btnPnl.add(cnclBttn);
		
		add(ttl,BorderLayout.PAGE_START);
		add(disPnl,BorderLayout.CENTER);
		add(btnPnl,BorderLayout.PAGE_END);
		
	}
	public void setID(String Id){
		this.Id= Id;
	}
	public void setName(String name){
		this.name= name;
	}
}

class MainWindow extends JFrame {
	private JLabel ttl;
	private JLabel discription;
	private JLabel nxt;
	private JButton nxtBttn;
	private JButton cnclBttn;
	private JPanel btnPnl;
	private JPanel disPnl;
	
	MainWindow() {
		initComponents();
	}

	void initComponents() {
		setSize(500,350);
		setTitle("Stup Wizard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		ttl = new JLabel("WELCOME TO ENGENIES ENVIRONMENT SETUP WIZARD");
		ttl.setFont(new Font("Serif", Font.BOLD, 15));
		ttl.setHorizontalAlignment(JLabel.CENTER);
		
		disPnl = new JPanel(new GridLayout(2,1));
		
		String text ="<html>";
		text +="This wizard will guide you through the installation of the <br>";
		text +="ENGENIES software...";
	
		discription= new JLabel();
		discription.setText(text);
		nxt = new JLabel("click NEXT to continue...");
		
		btnPnl= new JPanel(new FlowLayout(FlowLayout.RIGHT));
		nxtBttn= new JButton("Next");
		cnclBttn= new JButton("Cancel");
		
		
		nxtBttn.addActionListener((event) -> {
			nxtBttn.setEnabled(false);
			NicWindow nicWindo = new NicWindow();
			nicWindo.setVisible(true);
			setVisible(false);
		});

		cnclBttn.addActionListener((event) -> {
			System.exit(0);
		});
		
		btnPnl.add(nxtBttn);
		btnPnl.add(cnclBttn);
		
		disPnl.add(discription);
		disPnl.add(nxt);
		
		add(ttl,BorderLayout.PAGE_START);
		add(disPnl,BorderLayout.CENTER);
		add(btnPnl,BorderLayout.PAGE_END);
		
	}
}

class Demo {
	public static void main(String args[]) {
		new MainWindow().setVisible(true);
	}	
}
