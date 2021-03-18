/**
 * 
 */
package lyitlabs.ie.MavenGithubActions;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Sharon
 *
 */
public class HelloTest {
	
	Hello Hello;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		Hello = new Hello("Test");
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link lyitlabs.ie.MavenGithubActions.Hello#getsWhat()}.
	 */
	@Test
	public void testGetsWhat() {
		
		Hello.setsWhat("getTest");		
		assertEquals(Hello.getsWhat(), "getTest");
		
	}

	/**
	 * Test method for {@link lyitlabs.ie.MavenGithubActions.Hello#setsWhat(java.lang.String)}.
	 */
	@Test
	public void testSetsWhat() {
		Hello.setsWhat("setTest");		
		assertEquals(Hello.getsWhat(), "setTest");
	}

}
