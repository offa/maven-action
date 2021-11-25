package bv.offa.gha.maven;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExampleTest {

    @Test
    void runAcceptsValue() {
        final Example example = new Example(27);
        assertThat(example.getValue()).isEqualTo(27);
        assertDoesNotThrow(example::run);
    }

    @Test
    void runFailsOnInvalidValue() {
        final Example example = new Example(28);
        assertThat(example.getValue()).isEqualTo(28);
        assertThrows(IllegalArgumentException.class, example::run);
    }
}