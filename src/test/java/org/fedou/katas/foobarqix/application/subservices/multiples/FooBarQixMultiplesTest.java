package org.fedou.katas.foobarqix.application.subservices.multiples;

import org.assertj.core.api.JUnitSoftAssertions;
import org.junit.Rule;
import org.junit.Test;

public class FooBarQixMultiplesTest {
    @Rule
    public JUnitSoftAssertions should = new JUnitSoftAssertions();

    public FooBarQixMultiples multiples = new FooBarQixMultiples();

    @Test
    public void should_return_input_by_default() {
        should.assertThat(multiples.transformMultiples(1)).isEqualTo("");
        should.assertThat(multiples.transformMultiples(2)).isEqualTo("");
    }

    @Test
    public void should_foo_when_multiple_of_3() {
        should.assertThat(multiples.transformMultiples(3)).isEqualTo("foo");
        should.assertThat(multiples.transformMultiples(3 * 2)).isEqualTo("foo");
    }

    @Test
    public void should_bar_when_multiple_of_5() {
        should.assertThat(multiples.transformMultiples(5)).isEqualTo("bar");
        should.assertThat(multiples.transformMultiples(5 * 2)).isEqualTo("bar");
    }

    @Test
    public void should_qix_when_multiple_of_7() {
        should.assertThat(multiples.transformMultiples(7)).isEqualTo("qix");
        should.assertThat(multiples.transformMultiples(7 * 2)).isEqualTo("qix");
    }

    @Test
    public void should_foobar_when_multpile_of_3_and_5() {
        should.assertThat(multiples.transformMultiples(3 * 5)).isEqualTo("foobar");
        should.assertThat(multiples.transformMultiples(3 * 5 * 2)).isEqualTo("foobar");
    }

    @Test
    public void should_fooqix_when_multpile_of_3_and_7() {
        should.assertThat(multiples.transformMultiples(3 * 7)).isEqualTo("fooqix");
        should.assertThat(multiples.transformMultiples(3 * 7 * 2)).isEqualTo("fooqix");
    }

    @Test
    public void should_barqix_when_multpile_of_5_and_7() {
        should.assertThat(multiples.transformMultiples(5 * 7)).isEqualTo("barqix");
        should.assertThat(multiples.transformMultiples(5 * 7 * 2)).isEqualTo("barqix");
    }

    @Test
    public void should_multiples_when_multpile_of_3_and_5_and_7() {
        should.assertThat(multiples.transformMultiples(3 * 5 * 7)).isEqualTo("foobarqix");
        should.assertThat(multiples.transformMultiples(3 * 5 * 7 * 2)).isEqualTo("foobarqix");
    }
}
