package org.fedou.katas.foobarqix.application.subservices;

import org.assertj.core.api.JUnitSoftAssertions;
import org.fedou.katas.foobarqix.application.subservices.multiples.FooBarQixMultiples;
import org.fedou.katas.foobarqix.application.subservices.occurs.FooBarQixOccurs;
import org.junit.Rule;
import org.junit.Test;

public class FooBarQixTest {

    @Rule
    public JUnitSoftAssertions should = new JUnitSoftAssertions();

    public FooBarQix foobarqix = new FooBarQix(new FooBarQixMultiples(), new FooBarQixOccurs());

    @Test
    public void should_return_input_by_default() {
        should.assertThat(foobarqix.compute(1)).isEqualTo("1");
        should.assertThat(foobarqix.compute(2)).isEqualTo("2");
    }

    @Test
    public void should_foofoo_when_3() {
        should.assertThat(foobarqix.compute(3)).isEqualTo("foofoo");
    }
    @Test
    public void should_barbar_when_5() {
        should.assertThat(foobarqix.compute(5)).isEqualTo("barbar");
    }
    @Test
    public void should_qixqix_when_7() {
        should.assertThat(foobarqix.compute(7)).isEqualTo("qixqix");
    }

    @Test
    public void should_foo_when_multiple_only() {
        should.assertThat(foobarqix.compute(3*2)).isEqualTo("foo");
        should.assertThat(foobarqix.compute(5*2)).isEqualTo("bar");
        should.assertThat(foobarqix.compute(7*2)).isEqualTo("qix");
    }

    @Test
    public void should_append_when_occurence_only() {
        should.assertThat(foobarqix.compute(53)).isEqualTo("barfoo");
    }

    @Test
    public void should_append_when_multiple_and_occurence() {
        should.assertThat(foobarqix.compute(35)).isEqualTo("barqixfoobar");
    }

    @Test
    public void should_check_any_case_provided_by_stakeholders() {
        should.assertThat(foobarqix.compute(3*5*7*7)).isEqualTo("foobarqixqixfoobar");
    }
}
