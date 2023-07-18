// package com.springMVC.springdemo.mvc.validation;
//
// import java.lang.annotation.ElementType;
// import java.lang.annotation.Retention;
// import java.lang.annotation.RetentionPolicy;
// import java.lang.annotation.Target;
//
// import javax.validation.Constraint;
// import javax.validation.Payload;
//
//
// @Constraint(validatedBy = CourseCodeConstraintValidator.class)
// @Target({ElementType.METHOD, ElementType.FIELD})
// @Retention(RetentionPolicy.RUNTIME)
// public @interface CourseCode {
//
// 	// define the default course code
// 	public String value() default "COURSE";
//
// 	// define default error message
// 	public String message() default "must start with 'COURSE'";
//
// 	public Class<?>[] groups() default {};
//
// 	public Class<? extends Payload>[] payload() default {};
// }
//
//