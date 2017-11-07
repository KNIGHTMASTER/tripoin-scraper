package com.tripoin.scraper;

import com.tripoin.scraper.dto.ImageElementDTO;
import com.tripoin.scraper.dto.LinkElementDTO;
import com.tripoin.scraper.dto.MetaElementDTO;
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

		List<ImageElementDTO> imageElementDTOs = simpleScraperService.getImageElements();
		if (imageElementDTOs != null) {
			if (imageElementDTOs.size() > 0) {
				for (ImageElementDTO imageElementDTO : imageElementDTOs) {
					System.out.println(imageElementDTO.toString());
				}
			}
		}

		List<MetaElementDTO> metaElementDTOs = simpleScraperService.getMetaElements();
		if (metaElementDTOs != null) {
			if (metaElementDTOs.size() > 0) {
				for (MetaElementDTO metaElementDTO : metaElementDTOs) {
					System.out.println(metaElementDTO.toString());
				}
			}
		}
	}
}
