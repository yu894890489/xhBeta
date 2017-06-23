package login;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xh.commModule.ctrl.comm.BaseAction;

import startTest.BaseJunit4Test;

public class TestBaseAction extends BaseJunit4Test{

	@Autowired
	private BaseAction base;
	
	
	
	@Test
	public void testR(){
		log.info(""+base);
	}
}
