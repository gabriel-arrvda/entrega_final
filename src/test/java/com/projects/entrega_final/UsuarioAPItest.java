package com.projects.entrega_final;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@RunWith(SpringRunner.class)
@ComponentScan(basePackages = {"com.projects.entrega_final"})
@SpringBootTest
@AutoConfigureMockMvc


public class UsuarioAPItest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testUsuarioController() throws Exception{
    	final String expectedNome = "Joaquim Pereira";
    	final String expectedEmail = "joaquimp@universidade.br";
        final String expectedSenha = "D3v0ps";
        mockMvc
            .perform(MockMvcRequestBuilders.post("/usuarios").contentType(MediaType.APPLICATION_JSON).content("{\"email\":\"joaquimp@universidade.br\",\"nome\":\"Joaquim Pereira\",\"senha\":\"D3v0ps\"}"))
            .andExpect(MockMvcResultMatchers.status().is(201))
            .andExpect((ResultMatcher) jsonPath("nome").value(expectedNome))
            .andExpect((ResultMatcher) jsonPath("email").value(expectedEmail))
            .andExpect((ResultMatcher) jsonPath("senha").value(expectedSenha));
    }
    
}