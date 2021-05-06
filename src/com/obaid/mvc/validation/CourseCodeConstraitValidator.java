package com.obaid.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraitValidator 
implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	public void initialize(CourseCode courseCode) {
		
		coursePrefix= courseCode.value();
	}
	@Override
	public boolean isValid(String code,
			ConstraintValidatorContext constraintValidatorContext) {
		// TODO Auto-generated method stub
		boolean result;
		if (code!=null) {
			result= code.startsWith(coursePrefix);
				
		} else {
			result= true;
		}
	
		
		
		return result;
	}

}
