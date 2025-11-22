package com.rdec.helper;

import java.util.Properties;

import com.rdec.config.SecretReader;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class EmailOTP {
	
	public static boolean sendRegisterOTP(String to, String userName, String token) {
		String senderEmail =  "piebytwo014@gmail.com";
		String senderPassword = SecretReader.readSecrets("EMAIL_OTP_PASSWORD", "en", "US");
		
		Properties emailProperties = new Properties();
		emailProperties.put("mail.smtp.host", "smtp.gmail.com");
		emailProperties.put("mail.smtp.port", "587");
		emailProperties.put("mail.smtp.auth", "true");
		emailProperties.put("mail.smtp.starttls.enable", "true");
		
		Authenticator emailAuth = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(senderEmail, senderPassword);
			}
		};
		
		Session emailSession = Session.getInstance(emailProperties, emailAuth);
		
		Message emailMsg = new MimeMessage(emailSession);
//						    "http://localhost:8080/AuthApp/VerifyOTPServlet"
		String verifyLink = "http://localhost:8080/AuthApp/VerifyOTPServlet?token="+token;
		try {
			emailMsg.setFrom(new InternetAddress(senderEmail));
			emailMsg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			emailMsg.setSubject("Welcome Onboard!");
//			emailMsg.setText("Namaskar, " + userName+". \n\n"
//							+"Thank you for the registration. 👌 \n\n"
//							+"Please use One Time Password (OTP) : "+OTP+". \n\n"
//							+"Note : Please do not share this OTP with anyone. \n\n"
//							+"If you did not request this OTP, please ignore this mail. \n\n"
//							+"Best Regards, \n"
//							+"Team Sec-D.");
			emailMsg.setText("Namaskar, " + userName+". \n\n"
					+"Thank you for the registration. 👌 \n\n"
					+"Please use the link given below to verify your account. \n\n"
					+"Note : Please do not share this Link with anyone. \n\n"
					+"If you did not request this Link, please ignore this mail. \n\n\n"
					+"<a href="+verifyLink+">"+verifyLink+"</a>"
					+"Best Regards, \n"
					+"Team Sec-D.");
			Transport.send(emailMsg);
			return true;
//			emailMsg.setText("""
//					
//					""");
		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}
}
