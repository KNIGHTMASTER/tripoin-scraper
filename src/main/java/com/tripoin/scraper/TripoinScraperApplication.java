package com.tripoin.scraper;

import com.tripoin.scraper.dto.LinkElementDTO;
import com.tripoin.scraper.service.ISimpleScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TripoinScraperApplication implements CommandLineRunner {

	@Autowired
	private ISimpleScraperService simpleScraperService;

	public static void main(String[] args) {
		SpringApplication.run(TripoinScraperApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		List<LinkElementDTO> linkElementDTOs = simpleScraperService.getLinkElements();
		if (linkElementDTOs != null) {
			if (linkElementDTOs.size() > 0){
				for (LinkElementDTO linkElementDTO : linkElementDTOs) {
					System.out.println(linkElementDTO.toString());
				}
			}
		}
	}
}
