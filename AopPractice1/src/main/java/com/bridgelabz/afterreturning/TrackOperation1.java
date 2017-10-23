package com.bridgelabz.afterreturning;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
public class TrackOperation1 {
	@AfterReturning(  
            pointcut = "execution(* Operation1.*(..))",  
            returning= "result")  
              
  public void myadvice(JoinPoint jp,Object result)//it is advice (after returning advice)  
  {  
      System.out.println("additional concern");  
      System.out.println("Method Signature: "  + jp.getSignature());  
      System.out.println("Result in advice: "+result);  
      System.out.println("end of after returning advice...");  
  }    
}
