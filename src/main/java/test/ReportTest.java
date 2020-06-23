package test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class ReportTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Report");
		File reportOutputDirectory = new File("target/demo");
		List<String> jsonFiles = new ArrayList();
		jsonFiles.add("E:\\Benz\\api-automation-restassured-master\\ev-services-testsuite\\target\\report\\smoke\\json-report.json");
		// jsonFiles.add("cucumber-report-2.json");

		String buildNumber = "1";
		String projectName = "cucumberProject";

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		// optional configuration
		configuration.setBuildNumber(buildNumber);
		// addidtional metadata presented on main page
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "Firefox");
		configuration.addClassifications("Branch", "release/1.0");

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		Reportable result = reportBuilder.generateReports();
		// and here validate 'result' to decide what to do
		// if report has failed features, undefined steps etc
		System.out.println("End");
	}

}
