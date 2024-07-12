package org.pojo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer{
    int min=0,max=3;
	@Override
	public boolean retry(ITestResult result) {
		if(min<max) {
			return true;
		}
		
		return false;
		
		
	}
	
	

}
