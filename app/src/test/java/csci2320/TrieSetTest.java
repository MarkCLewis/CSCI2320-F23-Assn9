package csci2320;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class TrieSetTest {
  @Test void newSetDoesntHaveWord() {
    TrieSet set = new TrieSet();
    assertFalse(set.contains("word"));
  }
}
