package me.umbrella.grana.api.security.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class GeraSenhaBCryptPasswordEncoder {
	
	public static void main(String[] args)  {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("admin"));
	}
}
