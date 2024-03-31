package cakes;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class CatalogControllerTest {

	@Autowired
	  private MockMvc mockMvc;
	  
	  @Test
	  public void testHomePage() throws Exception {
	    mockMvc.perform(get("/catalog"))
	      .andExpect(status().isOk())
	      .andExpect(view().name("catalog"))
	      .andExpect(content().string(
	          containsString("Our cakes...")));
	  }
	
}
