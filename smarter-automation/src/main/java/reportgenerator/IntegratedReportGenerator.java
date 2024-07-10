package reportgenerator;



import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.json.support.Status;
import net.masterthought.cucumber.presentation.PresentationMode;

public class IntegratedReportGenerator {

	public static void generateJVMReport() {
		
		File reportOutputDirectory = new File("reports/integrated/report");
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add("jsonreport/login.json");
		jsonFiles.add("jsonreport/search.json");
		jsonFiles.add("jsonreport/CreateNewUser.json");
		jsonFiles.add("jsonreport/EditUser.json");
		jsonFiles.add("jsonreport/Issue.json");
		jsonFiles.add("jsonreport/Department.json");	
		String buildNumber = "1";
		String projectName = "SmartContact";

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		// optional configuration - check javadoc for details
		configuration.addPresentationModes(PresentationMode.RUN_WITH_JENKINS);
		// do not make scenario failed when step has status SKIPPED
		configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
		configuration.setBuildNumber(buildNumber);
		// addidtional metadata presented on main page
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Test Type", "smoke");

		// optionally add metadata presented on main page via properties file
		//List<String> classificationFiles = new ArrayList<>();
		//classificationFiles.add("properties-1.properties");
		//classificationFiles.add("properties-2.properties");
		//configuration.addClassificationFiles(classificationFiles);

		// optionally specify qualifiers for each of the report json files
		        configuration.addPresentationModes(PresentationMode.PARALLEL_TESTING);
		        configuration.setQualifier("cucumber-report-1","First report");
		        configuration.setQualifier("cucumber-report-2","Second report");

		        ReportBuilder reportBuilder=new ReportBuilder(jsonFiles,configuration);
		        Reportable result=reportBuilder.generateReports();
		// and here validate 'result' to decide what to do if report has failed

	}
	
	public static void main(String[] args)  {

		IntegratedReportGenerator rp = new IntegratedReportGenerator();
		IntegratedReportGenerator.generateJVMReport(); 
	}
	
}
