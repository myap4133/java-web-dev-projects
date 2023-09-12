package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void unbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void sendEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void sendStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Balance"));
    }

    @Test
    public void unbalancedPairReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void sendOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void sendClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void sendStringWithBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Bed[Bath]"));
    }

    @Test
    public void sendStringWithBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Bed[B]ath["));
    }

    @Test
    public void sendStringNumberReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("99"));
    }

    @Test
    public void sendDifferentTypesOfBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{([())}]"));
    }

    @Test
    public void sendConcatenatedStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Bed" + "[" + "Bath["));
    }
}