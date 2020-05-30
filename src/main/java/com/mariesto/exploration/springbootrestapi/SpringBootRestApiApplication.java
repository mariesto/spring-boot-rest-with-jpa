package com.mariesto.exploration.springbootrestapi;

import com.mariesto.exploration.springbootrestapi.domain.Difficulty;
import com.mariesto.exploration.springbootrestapi.domain.Region;
import com.mariesto.exploration.springbootrestapi.domain.TourPackage;
import com.mariesto.exploration.springbootrestapi.helper.TourFromFile;
import com.mariesto.exploration.springbootrestapi.service.TourPackageService;
import com.mariesto.exploration.springbootrestapi.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestApiApplication implements CommandLineRunner {

	@Autowired
	private TourPackageService tourPackageService;
	@Autowired
	private TourService tourService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		createTourPackage();

		TourFromFile.importTourData().forEach(t-> tourService.createTourWithDefinedParam(t.title, t.description, Integer.parseInt(t.price), t.length, t.keywords, Difficulty.valueOf(t.difficulty), Region.findByLabel(t.region), t.packageType));
	}

	private void createTourPackage(){
		tourPackageService.createTourPackage(new TourPackage("BC", "Backpack Cal"));
		tourPackageService.createTourPackage(new TourPackage("CC", "California Calm"));
		tourPackageService.createTourPackage(new TourPackage("CH", "California Hot springs"));
		tourPackageService.createTourPackage(new TourPackage("CY", "Cycle California"));
		tourPackageService.createTourPackage(new TourPackage("DS", "From Desert to Sea"));
		tourPackageService.createTourPackage(new TourPackage("KC", "Kids California"));
		tourPackageService.createTourPackage(new TourPackage("NW", "Nature Watch"));
		tourPackageService.createTourPackage(new TourPackage("SC", "Snowboard Cali"));
		tourPackageService.createTourPackage(new TourPackage("TC", "Taste of California"));
		System.out.println("Number of tours packages = " + tourPackageService.total());
	}
}
