package bv.offa.gha.maven;

public class Example {
    private final int value;

    public Example(int value) {
        this.value = value;
    }

    public void run() {
        if (value != 27) {
            throw new IllegalArgumentException("Value is not 27!");
        }
    }

    public int getValue() {
        return value;
    }
}

