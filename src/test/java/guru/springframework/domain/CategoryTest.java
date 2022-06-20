package guru.springframework.domain;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// This is a plain Junit 4 test.
public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() throws Exception {
    }

    @Test
    public void getRecipes() throws Exception {
    }

}