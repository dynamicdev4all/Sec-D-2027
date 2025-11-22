package com.rdec.util;

import java.util.Date;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import shadow.com.nimbusds.jwt.proc.ExpiredJWTException;

public class JWTUtil {
	
	static String secret = "thisistopsecret";
	static Algorithm a = Algorithm.HMAC256(secret);
	
	
	//this stores current date and current time.
	static Date currentDateTime = new Date();
	// this is the time duration in which the token will expire.
	static long expireTime = 10 * 60 *1000; // this is 10 mins in mili sec
	// this variable store current time
	static long currentTime = currentDateTime.getTime();
	// this is the future date/time on which the token will expire
	static Date expireDateTime = new Date(currentTime + expireTime);
	
	
	public static String generateJWT(String email, String name, int OTP) {
		
		String token = JWT.create()
						  .withSubject(email)
						  .withIssuer("SEC-D")
						  .withClaim("userName", name)
						  .withClaim("otp", OTP)
						  .withIssuedAt(currentDateTime)
						  .withExpiresAt(expireDateTime)
						  .sign(a);
		return token;
						  
	}
	
	public static void verifyJWT(String token) {
		try {
			DecodedJWT decode = JWT.require(a)
					.build()
					.verify(token);
			System.out.println("The Token is Valid");
			System.out.println("The email add is " + decode.getSubject());
			System.out.println("Issuer name is " + decode.getIssuer());
			System.out.println("User name is " + decode.getClaim("userName"));
			System.out.println("The OTP is " + decode.getClaim("otp"));
			System.out.println("Token was created at " + decode.getIssuedAt());
			System.out.println("Token will expire at" + decode.getExpiresAt());
		} catch (Exception e) {
			System.out.println("The Token is expired");
		}
			
	}
	
	public static void main(String s []) {
//		generateJWT("piebytwo014@gmail.com", "Ayush Singh", 123456);
		
		String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJwaWVieXR3bzAxNEBnbWFpbC5jb20iLCJpc3MiOiJTRUMtRCIsInVzZXJOYW1lIjoiQXl1c2ggU2luZ2giLCJvdHAiOjEyMzQ1NiwiaWF0IjoxNzYzNzg1NDgyLCJleHAiOjE3NjM3ODU2NjJ9.awg7xJo9J5TRyteCAg2v_OCmSYsc0UjeOE72YdxN2OQ";
		verifyJWT(token);
	}
}
