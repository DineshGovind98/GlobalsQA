package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CandidateDetails;
import testbase.BaseClass;

public class TC001_CandidateDetails extends BaseClass {
	@Test
	public void verifyCandidate() {
		logger.info("Testcase STarted");
		try {
		CandidateDetails cd=new CandidateDetails(driver);
		//cd.uploadFiles();
		cd.name();
		cd.email();
		cd.web();
		cd.selectYears();
		cd.checkBox1();
		cd.checkBox2();
		cd.radioButton();
		cd.textArea();
		cd.submit();
		String msg1=cd.getConfirmationPage();
		if(msg1.equalsIgnoreCase("Message Sent (go back)")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		//Assert.assertTrue(true);
		logger.info("Testcase Finished");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
