package startTest;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.xh.commModule.ctrl.comm.BaseAction;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={/*"file:src/main/webapp/WEB-INF/wxiot-servlet.xml",*/ "classpath:spring.xml",  
"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
@WebAppConfiguration
//------------如果加入以下代码，所有继承该类的测试类都会遵循该配置，也可以不加，在测试类的方法上///控制事务，参见下一个实例  
//这个非常关键，如果不加入这个注解配置，事务控制就会完全失效！  
//@Transactional  
//这里的事务关联到配置文件中的事务控制器（transactionManager = "transactionManager"），同时//指定自动回滚（defaultRollback = true）。这样做操作的数据才不会污染数据库！  
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)  
//------------  
public class BaseJunit4Test  extends AbstractJUnit4SpringContextTests{ 
	
	public final static org.slf4j.Logger log = LoggerFactory
			.getLogger(BaseJunit4Test.class); 
	@Autowired
	private BaseAction base;
	@Test
	public void login() throws IOException{
        
		System.out.println(base);
		
		
//		MockHttpServletRequest request = new MockHttpServletRequest();
//		request.addParameter("a", "{\"username\":\"yu\",\"password\":\"\"}");
////		MockHttpSession session = new MockHttpSession();
////		MockHttpServletResponse response = new MockHttpServletResponse();
////		UserBean userBean = new UserBean();
//		userBean.setPassword("");
//		userBean.setUsername("yu");
	}
}  
