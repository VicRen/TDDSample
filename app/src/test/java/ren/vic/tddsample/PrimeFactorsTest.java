package ren.vic.tddsample;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimeFactorsTest {

    @Test
    public void factors() {
        assertThat(factorsOf(1), is(Collections.<Integer>emptyList()));
        assertThat(factorsOf(2), is(Collections.singletonList(2)));
        assertThat(factorsOf(3), is(Collections.singletonList(3)));
        assertThat(factorsOf(4), is(Arrays.asList(2, 2)));
        assertThat(factorsOf(5), is(Collections.singletonList(5)));
        assertThat(factorsOf(6), is(Arrays.asList(2, 3)));
        assertThat(factorsOf(7), is(Collections.singletonList(7)));
        assertThat(factorsOf(8), is(Arrays.asList(2, 2, 2)));
        assertThat(factorsOf(9), is(Arrays.asList(3, 3)));
        assertThat(factorsOf(2 * 2 * 3 * 5 * 7 * 11 * 11 * 13), is(Arrays.asList(2, 2, 3, 5, 7, 11, 11, 13)));
    }

    private List<Integer> factorsOf(int number) {
        int remainder = number;
        List<Integer> factors = new ArrayList<>();
        int divisors = 2;
        while (remainder > 1) {
            while (remainder % divisors == 0) {
                factors.add(divisors);
                remainder /= divisors;
            }
            divisors++;
        }
        return factors;
    }
}
