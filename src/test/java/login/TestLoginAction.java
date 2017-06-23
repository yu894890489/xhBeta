package login;

import java.io.IOException;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;

import com.xh.commModule.ctrl.login.LoginAction;
import com.xh.commModule.entry.UserBean;

import startTest.BaseJunit4Test;

public class TestLoginAction extends BaseJunit4Test{

	@Test
	public void login() throws IOException{
		MockHttpServletRequest request = new MockHttpServletRequest();
		request.addParameter("a", "{\"username\":\"yu\",\"password\":\"\"}");
		//MockHttpSession session = new MockHttpSession();
		//MockHttpServletResponse response = new MockHttpServletResponse();
		UserBean userBean = new UserBean();
		userBean.setPassword("");
		userBean.setUsername("yu");
		//LoginAction action = new LoginAction();
	}
}
