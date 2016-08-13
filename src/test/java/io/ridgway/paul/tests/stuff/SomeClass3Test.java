package io.ridgway.paul.tests.stuff;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SomeClass3Test {

    private SomeClass someClass;

    @Before
    public void setUp() throws Exception {
        someClass = new SomeClass();
    }

    @Test
    public void add() throws Exception {
        assertThat(someClass.add(1, 3)).isEqualTo(4);
    }

    @Test
    public void slowAdd1() throws Exception {
        assertThat(someClass.slowAdd(1, 3)).isEqualTo(4);
    }

    @Test
    public void slowAdd2() throws Exception {
        assertThat(someClass.slowAdd(1, 3)).isEqualTo(4);
    }

    @Test
    public void slowAdd3() throws Exception {
        assertThat(someClass.slowAdd(1, 3)).isEqualTo(4);
    }

    @Test
    public void slowAdd4() throws Exception {
        assertThat(someClass.slowAdd(1, 3)).isEqualTo(4);
    }

    @Test
    public void slowAdd5() throws Exception {
        assertThat(someClass.slowAdd(1, 3)).isEqualTo(4);
    }

    @Test
    public void slowAdd6() throws Exception {
        assertThat(someClass.slowAdd(1, 3)).isEqualTo(4);
    }

    @Test
    public void slowAdd7() throws Exception {
        assertThat(someClass.slowAdd(1, 3)).isEqualTo(4);
    }

    @Test
    public void slowAdd8() throws Exception {
        assertThat(someClass.slowAdd(1, 3)).isEqualTo(4);
    }

    @Test
    public void slowAdd9() throws Exception {
        assertThat(someClass.slowAdd(1, 3)).isEqualTo(4);
    }

    @Test
    public void slowAdd10() throws Exception {
        assertThat(someClass.slowAdd(1, 3)).isEqualTo(4);
    }

}