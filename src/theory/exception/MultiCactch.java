package theory.exception;

import java.time.LocalDate;

public class MultiCactch {
    class Cow implements AutoCloseable {
        protected LocalDate n;
        public Cow(LocalDate n) { this.n = n; }
        public void close() {
            throw new RuntimeException("X");
        }
    }

    public void moo() {
        try (var mooooo = new Cow(LocalDate.now())) {
            throw new RuntimeException("W");
        } catch (NullPointerException | IllegalArgumentException e) {
            throw new RuntimeException("Y");
        } finally {
            throw new RuntimeException("Z");
        }
    }

    public static void main(String... league) {
        new MultiCactch().moo();
    }
}
