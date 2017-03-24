package common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import vo.MemberVO;

@Aspect
@Component
public class LoginCheckAspect {
	
	@Pointcut(value="execution(public * *(..))") //Aspect-J 표현식 
    public void anyPublicMethod() {}

    @Around("anyPublicMethod() && @annotation(loginCheck)")
    public Object logAction(ProceedingJoinPoint pjp, LoginCheck loginCheck) throws Throwable {
    	
    	System.out.println("Before");
    	
    	HttpServletRequest request = null;
        HttpServletResponse response = null;
        for ( Object o : pjp.getArgs() ){
            if ( o instanceof HttpServletRequest ) {
                request = (HttpServletRequest)o;
            }
            if ( o instanceof HttpServletResponse ) {
                response = (HttpServletResponse)o;
            }
        }
        
        HttpSession session = request.getSession();
        MemberVO sessionVO = (MemberVO)session.getAttribute("member");
    	
        if(sessionVO == null || "".equals(sessionVO)){
        	return "login";
        }
        
        Object obj = pjp.proceed();
        System.out.println("After");
        
        return obj;
    }
}
