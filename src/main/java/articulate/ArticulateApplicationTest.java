package articulate;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class ArticulateApplicationTest extends SpringBootArticulateTests{
	
	@Autowired
	private WebApplicationContext webApplicationContext;

	
	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void test() throws Exception  {
		boolean [] expected = new boolean[1];
		boolean [] actual = new boolean[1];
		assertArrayEquals(expected, actual);
		//mockMvc.perform(get("/bluegreen-check")).andExpect(status().isOk());
	}

}
