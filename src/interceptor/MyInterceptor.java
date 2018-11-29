package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class MyInterceptor implements Interceptor{
	public void init() {}
	
	public String intercept(ActionInvocation ai) throws Exception {
		ValueStack stack=ai.getStack();
		String s=stack.findString("name");
		
		stack.set("name",s.toUpperCase());
		return ai.invoke();//la chuoi thi ra result page <result>welcome.jsp</result>
// la invoke() cua ActionInvocation Interface thi Interceptor hoặc action kế tiếp sẽ được triệu hồi
	}
	
	public void destroy() {}
}
