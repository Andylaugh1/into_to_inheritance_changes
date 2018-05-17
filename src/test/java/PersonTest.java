import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void before(){
        person = new Person("Colin", "E21");
    }

    @Test
    public void hasName(){
        assertEquals("Colin", person.getName());
    }

    @Test
    public void hasCohort(){
        assertEquals("E21", person.getCohort());
    }

    @Test
    public void canChangeName(){
        person.setName("John");
        assertEquals("John", person.getName());
    }

    @Test
    public void canChangeCohort(){
       person.setCohort("E20");
       assertEquals("E20", person.getCohort());
    }

    @Test
    public void canTalk(){
        assertEquals("I love Java", person.talk("Java"));
    }


}
