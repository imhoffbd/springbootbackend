package de.itconsultingimhoff.testprojects.springbootbackend.supplier;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SupplierControllerIntegrationAuthTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getSuppliersUnauthenticated_shouldFailWith403() throws Exception {
        mvc.perform(get("/supplier").contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isForbidden());
    }

    @WithMockUser("spring")
    @Test
    public void getSuppliersAuthenticated_shouldSucceed() throws Exception {
        mvc.perform(get("/supplier").contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
