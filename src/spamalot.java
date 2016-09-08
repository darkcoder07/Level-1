import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class spamalot implements ActionListener{
	JFrame frame = new JFrame();
	static final String FAKE_USERNAME = "wegndciugwsiucglywhdciosw@gmail.com";
	static final String FAKE_PASSWORD = "qwertyuiopl";
	JButton good = new JButton();
	JButton bad = new JButton();
private boolean sendSpam(String recipient, String subject, String content) {
	
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
e.printStackTrace();
return false;
		}
	}

	public static void main(String[] args) {
		spamalot spam = new spamalot();
   spam.Spam();
	}

	public void Spam() {
		
		frame.setVisible(true);
		frame.setSize(800, 800);
		frame.setTitle("SPPAAAAMM YOUUU");
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setVisible(true);
		good.setText("All good");
		bad.setText("BAADD");
        panel.add(bad);
        panel.add(good);
        JTextField text = new JTextField();
        text.setText("Phone number");
        panel.add(text);
        frame.pack();
        //Username: wegndciugwsiucglywhdciosw@gmail.com Password: qwertyuiopl 
        good.addActionListener((ActionListener) this);
        bad.addActionListener((ActionListener) this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (good == e.getSource()) {
			sendSpam("leagueofamazing@gmail.com",":D","Have a nice dayyyy!!");
			good.setText("Message sent! :D (This is the good button)");
			good.setBackground(Color.GREEN);
			frame.pack();
		}
		
		
		if (bad == e.getSource()) {
			bad.setText("Message sent! :D (This is the bad button)");
			sendSpam("leagueofamazing@gmail.com","muahah","You are a very bad person! I'm going to cyberbully you! You shouldn't exist!"
					+ "spamspamspamspamspamspamspamspamspamspamspam" + "Oh, as an afterthought, lemme find a virus....");
			bad.setBackground(Color.GREEN);
			frame.pack();
		}
		
		}
		
	}


