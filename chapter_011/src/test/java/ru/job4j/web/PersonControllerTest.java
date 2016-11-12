package ru.job4j.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import ru.job4j.domain.Person;
import ru.job4j.service.PersonService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
@RunWith(SpringRunner.class)
@WebMvcTest(PersonController.class)
public class PersonControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private PersonService service;


    @Test
    @WithMockUser(username="user", roles={"USER"})
    public void whenGetPersonThenPagePerson() throws Exception {
        given(
                this.service.getAll()
        ).willReturn(
                new ArrayList<Person>(
                        Lists.newArrayList(new Person("Petr Arsentev"))
                )
        );
        this.mvc.perform(
                get("/persons").accept(MediaType.TEXT_HTML)
        ).andExpect(
                status().isOk()
        ).andExpect(
                view().name("persons")
        );
    }

    @Test
    @WithMockUser(username="user", roles={"USER"})
    public void whenPostPersonThenAdd() throws Exception {
        this.mvc.perform(
                post("/persons").param("name", "Petr Arsentev")
        ).andExpect(
                status().is3xxRedirection()
        );
        verify(this.service, times(1)).add(new Person("Petr Arsentev"));
    }
}