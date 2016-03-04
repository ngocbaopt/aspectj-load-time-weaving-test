package foo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

@Aspect
public class ProfilingAspect {

    @Around("methodsToBeProfiled()")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch sw = new StopWatch(getClass().getSimpleName());
        try {
            sw.start(pjp.getSignature().getName());
            return pjp.proceed();
        } finally {
            sw.stop();
            System.out.println(sw.prettyPrint());
        }
    }

    @Pointcut("execution(* foo..*.*(..))")
    public void methodsToBeProfiled(){}
    
    @Before("@annotation(javax.ws.rs.Path)") 
    public void myLog(JoinPoint joinpoint) {
    	System.out.println("Test logging annotation");
    }
    
    @Before("@annotation(org.junit.Test)") 
    public void myLogJUnit(JoinPoint joinpoint) {
    	System.out.println("Test org.junit.Test");
    }
}