package org.fedou.katas.foobarqix.application.singleservice;

import org.assertj.core.api.JUnitSoftAssertions;
import org.junit.Rule;
import org.junit.Test;

public class FooBarQixFullShouldOccurTest {

    @Rule
    public JUnitSoftAssertions should = new JUnitSoftAssertions();

    public FooBarQixFull foobarqix = new FooBarQixFull();

    @Test
    public void should_foo_when_3_occurs() {
        should.assertThat(foobarqix.compute(13)).isEqualTo("foo");
    }

    @Test
    public void should_bar_when_5_occurs() {
        should.assertThat(foobarqix.compute(52)).isEqualTo("bar");
    }

    @Test
    public void should_qix_when_7_occurs() {
        should.assertThat(foobarqix.compute(17)).isEqualTo("qix");
    }

    @Test
    public void should_foobar_when_3_then_5_occurs() {
        should.assertThat(foobarqix.compute(13151)).isEqualTo("foobar");
    }

    @Test
    public void should_barfoo_when_5_then_3_occurs() {
        should.assertThat(foobarqix.compute(53)).isEqualTo("barfoo");
    }

    @Test
    public void should_foo_and_qix_in_order_when_3_and_7_occurs() {
        should.assertThat(foobarqix.compute(13171)).isEqualTo("fooqix");
    }

    @Test
    public void should_bar_and_qix_in_order_when_5_and_7_occurs() {
        should.assertThat(foobarqix.compute(15172)).isEqualTo("barqix");
    }

    @Test
    public void should_foo_bar_and_qix_in_order_when_3_5_and_7_occurs() {
        /**
         * possible orders are made of : start with one (3, 5 or 7), then you'll have two possibilities (yz, zy), so :
         * 357 and 375
         * 573 and 537
         * 735 and 753
         * Digits "1" are used as "separators" and when number have unwanted effect, I use a "2".
         */
        should.assertThat(foobarqix.compute(1315171)).isEqualTo("foobarqix");
        should.assertThat(foobarqix.compute(1317151)).isEqualTo("fooqixbar");
        should.assertThat(foobarqix.compute(1513171)).isEqualTo("barfooqix");
        should.assertThat(foobarqix.compute(1517132)).isEqualTo("barqixfoo");
        should.assertThat(foobarqix.compute(1713151)).isEqualTo("qixfoobar");
        should.assertThat(foobarqix.compute(1715131)).isEqualTo("qixbarfoo");
    }
}