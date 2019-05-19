package junit.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.StrutsTestCase;
import org.apache.struts2.result.ServletDispatcherResult;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.rmpksoft.demo.action.LoginAction;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestLoginAction extends StrutsTestCase {

	private Map<String, Object> sessionMap;
	private final Integer DEFAULT_USER_ID = Integer.valueOf(1);

	@BeforeAll
	public void setupTest() throws Exception {
		System.out.println("Starting setup.....");
		sessionMap = new HashMap<String, Object>();
		sessionMap.put("username", "pradeep");

		super.setUp();

		assertNotNull(response);
		assertNotNull(request);
		assertNotNull(pageContext);
		assertNotNull(servletContext);
		assertNotNull(dispatcher);
	}

	@Disabled
	@Test
	@DisplayName("Test Action")
	public void test_Hello() throws Exception {
		System.out.println("Starting setup.....");
		ActionProxy actionProxy = getActionProxy("/secure/hello.action");
		String result = actionProxy.execute();
		System.out.println(actionProxy);
		assertEquals(result, "success");
	}

	@Test
	@DisplayName("Test login")
	public void test_login() throws Exception {
		request.setParameter("username", "pradeep");
		request.setParameter("password", "password");

		ActionProxy actionProxy = getActionProxy("/secure/login.action");

		System.out.println(actionProxy);

		LoginAction action = (LoginAction) actionProxy.getAction();

		assertNotNull("The action is null but should not be.", action);

		// set session values...
		actionProxy.getInvocation().getInvocationContext().setSession(sessionMap);

		Map<String, Object> sessionObj = actionProxy.getInvocation().getInvocationContext().getSession();

		String result = actionProxy.execute();
		String responseText = response.getContentAsString();
		System.out.println("Test method name: login, result: " + result + " response: " + responseText);

		ActionInvocation aI = actionProxy.getInvocation();
		ServletDispatcherResult r = (ServletDispatcherResult) aI.getResult();

		assertEquals(r.getLastFinalLocation(), "/loginSuccess.jsp");
	}

	@AfterAll
	public void tearDownTest() throws Exception {
		System.out.println("Starting tearDown.....");
		tearDown();
	}

}