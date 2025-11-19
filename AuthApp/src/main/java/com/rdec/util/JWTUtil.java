package com.rdec.util;

import java.util.Date;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import shadow.com.nimbusds.jwt.proc.ExpiredJWTException;

public class JWTUtil {
	
	static String secret = "thisistopsecret";
	static Algorithm a = Algorithm.HMAC256(secret);
	
	static Date date = new Date();
	static long otpTime = 10 * 60 *1000;
	static long expireTime = date.getTime() + otpTime;
	static Date d = new Date(expireTime);
	
	
	public static void generateJWT() {
		String token = JWT.create()
						  .withSubject("piebytwo014@gmail.com")
						  .withExpiresAt(d)
						  .sign(a);
		System.out.println(token);
						  
	}
	
	public static void verifyJWT(String token) {
			DecodedJWT decode = JWT.require(a)
					.build()
					.verify(token);
	}
	
	public static void main(String s []) {
		generateJWT();
	}
}
