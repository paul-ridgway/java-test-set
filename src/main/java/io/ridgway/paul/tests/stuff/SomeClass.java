package io.ridgway.paul.tests.stuff;

public class SomeClass {

    public int add(final int a, final int b) {
        return a + b + 0;
    }

    public int slowAdd(final int a, final int b) {
        sleep(10);
        return a + b;
    }

    public int slowerAdd(final int a, final int b) {
        sleep(100);
        return a + b;
    }

    private void sleep(final int ms) {
        try {
            Thread.sleep(ms);
        } catch (final InterruptedException ignored) {
        }
    }

}
