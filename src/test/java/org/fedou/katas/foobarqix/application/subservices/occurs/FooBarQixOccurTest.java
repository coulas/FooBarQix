package org.fedou.katas.foobarqix.application.subservices.occurs;

import org.assertj.core.api.JUnitSoftAssertions;
import org.junit.Rule;
import org.junit.Test;

public class FooBarQixOccurTest {

    @Rule
    public JUnitSoftAssertions should = new JUnitSoftAssertions();

    public FooBarQixOccurs occurs = new FooBarQixOccurs();

    @Test
    public void should_return_input_by_default() {
        should.assertThat(occurs.transformOccurences(1)).isEqualTo("");
        should.assertThat(occurs.transformOccurences(2)).isEqualTo("");
    }


    @Test
    public void should_foo_when_3_occurs() {
        should.assertThat(occurs.transformOccurences(3)).isEqualTo("foo");
        should.assertThat(occurs.transformOccurences(13)).isEqualTo("foo");
        should.assertThat(occurs.transformOccurences(31)).isEqualTo("foo");
        should.assertThat(occurs.transformOccurences(131)).isEqualTo("foo");
    }

    @Test
    public void should_bar_when_5_occurs() {
        should.assertThat(occurs.transformOccurences(5)).isEqualTo("bar");
        should.assertThat(occurs.transformOccurences(15)).isEqualTo("bar");
        should.assertThat(occurs.transformOccurences(51)).isEqualTo("bar");
        should.assertThat(occurs.transformOccurences(151)).isEqualTo("bar");
    }

    @Test
    public void should_qix_when_7_occurs() {
        should.assertThat(occurs.transformOccurences(7)).isEqualTo("qix");
        should.assertThat(occurs.transformOccurences(17)).isEqualTo("qix");
        should.assertThat(occurs.transformOccurences(71)).isEqualTo("qix");
        should.assertThat(occurs.transformOccurences(171)).isEqualTo("qix");
    }

    @Test
    public void should_foobar_when_3_then_5_occurs() {
        should.assertThat(occurs.transformOccurences(35)).isEqualTo("foobar");
        should.assertThat(occurs.transformOccurences(13151)).isEqualTo("foobar");
    }

    @Test
    public void should_barfoo_when_5_then_3_occurs() {
        should.assertThat(occurs.transformOccurences(53)).isEqualTo("barfoo");
        should.assertThat(occurs.transformOccurences(15131)).isEqualTo("barfoo");
    }

    @Test
    public void should_foo_and_qix_in_order_when_3_and_7_occurs() {
        should.assertThat(occurs.transformOccurences(13171)).isEqualTo("fooqix");
        should.assertThat(occurs.transformOccurences(17131)).isEqualTo("qixfoo");
    }

    @Test
    public void should_bar_and_qix_in_order_when_5_and_7_occurs() {
        should.assertThat(occurs.transformOccurences(15171)).isEqualTo("barqix");
        should.assertThat(occurs.transformOccurences(17151)).isEqualTo("qixbar");
    }

    @Test
    public void should_foo_bar_and_qix_in_order_when_3_5_and_7_occurs() {
        /** possible orders are made of : start with one (3, 5 or 7), then you'll have two possibilities (yz, zy), so :
         * 357 and 375
         * 573 and 537
         * 735 and 753
         */
        should.assertThat(occurs.transformOccurences(1315171)).isEqualTo("foobarqix");
        should.assertThat(occurs.transformOccurences(1317151)).isEqualTo("fooqixbar");
        should.assertThat(occurs.transformOccurences(1513171)).isEqualTo("barfooqix");
        should.assertThat(occurs.transformOccurences(1517131)).isEqualTo("barqixfoo");
        should.assertThat(occurs.transformOccurences(1713151)).isEqualTo("qixfoobar");
        should.assertThat(occurs.transformOccurences(1715131)).isEqualTo("qixbarfoo");
    }
}