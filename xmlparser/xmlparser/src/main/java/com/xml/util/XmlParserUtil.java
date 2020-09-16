package com.xml.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;

import com.xml.model.Data;

@Component
public class XmlParserUtil {

	private final List<Data> xmlDataCollection = new ArrayList<>();

	public void parse() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Stream<Path> files;
		try {
			files = Files.list(
					Paths.get("C:\\Users\\RohitSharma\\Desktop\\xmlparser\\xmlparser\\src\\main\\resources\\xml"));
			files.forEach(path -> {
				try {
					Data data = (Data) jaxbUnmarshaller.unmarshal(path.toFile());
					xmlDataCollection.add(data);
				} catch (JAXBException e) {
					e.printStackTrace();
				}
			});
			files.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Data> getXMLSeriesData() {
		return xmlDataCollection;
	}
}
