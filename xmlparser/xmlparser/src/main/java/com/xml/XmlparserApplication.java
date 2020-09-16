package com.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.xml.util.XmlParserUtil;

@SpringBootApplication
public class XmlparserApplication implements CommandLineRunner {

	@Autowired
	private XmlParserUtil xmlParserUtil;

	public static void main(String[] args) {
		SpringApplication.run(XmlparserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		xmlParserUtil.parse();
	}
}
