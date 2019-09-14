package org.fedou.katas.foobarqix.application.singleservice;

import org.assertj.core.api.JUnitSoftAssertions;
import org.junit.Rule;
import org.junit.Test;

public class FooBarQixFullShouldMultipleTest {
    @Rule
    public JUnitSoftAssertions should = new JUnitSoftAssertions();

    public FooBarQixFull foobarqix = new FooBarQixFull();

    @Test
    public void should_foo_when_multiple_of_3() {
        should.assertThat(foobarqix.compute(3 * 2)).isEqualTo("foo");
    }

    @Test
    public void should_bar_when_multiple_of_5() {
        should.assertThat(foobarqix.compute(5 * 2)).isEqualTo("bar");
    }

    @Test
    public void should_qix_when_multiple_of_7() {
        should.assertThat(foobarqix.compute(7 * 2)).isEqualTo("qix");
    }

    /**
     * 60 as a number does not mean anything, using 3 * 5 * 4 makes tests more understandable and maintainable.
     */
    @Test
    public void should_foobar_when_multpile_of_3_and_5() {
        should.assertThat(foobarqix.compute(3 * 5 * 4)).isEqualTo("foobar");
    }

    @Test
    public void should_fooqix_when_multpile_of_3_and_7() {
        should.assertThat(foobarqix.compute(3 * 7)).isEqualTo("fooqix");
    }

    @Test
    public void should_barqix_when_multpile_of_5_and_7() {
        should.assertThat(foobarqix.compute(5 * 7 * 4)).isEqualTo("barqix");
    }

    @Test
    public void should_foobarqix_when_multpile_of_3_and_5_and_7() {
//        IntStream.range(1, 10).forEach(
//                n -> should.assertThat(foobarqix.compute(3 * 5 * 7 * n)).describedAs("" + n).isEqualTo("foobarqix")
//        );
        should.assertThat(foobarqix.compute(3 * 5 * 7 * 2)).isEqualTo("foobarqix");
    }
}
