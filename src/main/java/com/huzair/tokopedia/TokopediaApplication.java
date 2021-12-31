package com.huzair.tokopedia;

import com.huzair.tokopedia.service.ScrapService;
import com.huzair.tokopedia.utils.ScrapperException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TokopediaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TokopediaApplication.class, args);
		ScrapService service = new ScrapService();
		try {
			String csv = service.downloadProductListCsv();
			System.out.println("Extraction is successfully saved to " + csv);
		} catch (ScrapperException e) {
			System.err.println("Failed. Please try again.");
		}
	}

}
