package org.brijframework.support.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Type;

import org.brijframework.util.support.Access;
import org.brijframework.util.support.Constants;

@Target({ ElementType.FIELD , ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Property {
	
	String id() default Constants.DEFAULT;

	Access access() default Access.PUBLIC;

	String value()  default "";
	
	String[] mappedKeys() default {};
	
	boolean required() default false;
	
	Class<?> type() default Type.class;
}
