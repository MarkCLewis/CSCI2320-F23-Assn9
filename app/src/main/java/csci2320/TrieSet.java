package csci2320;

import java.util.Iterator;
import java.util.Set;

public class TrieSet implements Iterable<String> {
  // TODO: Add your Node and private data here.

  /**
   * Adds a string to the set.
   */
  public void add(String str) {
    // TODO: Implement this.
    throw new UnsupportedOperationException();
  }

  /**
   * Removes a string from the set.
   * @return true if it was removed. false if it wasn't found.
   */
  public boolean remove(String str) {
    // TODO: Implement this.
    throw new UnsupportedOperationException();
  }

  /**
   * Tells if a value is in the set.
   */
  public boolean contains(String str) {
    // TODO: Implement this.
    throw new UnsupportedOperationException();
  }

  // I'm giving you this iterator because you didn't really want to write one yourself.
  // private class TrieIterator implements Iterator<String> {
  //   private StringBuilder prefix = new StringBuilder();
  //   private Stack<Iterator<Map.Entry<Character, Node>>> stack = new Stack<>();

  //   public TrieIterator() {
  //     pushFirst(root);
  //   }

  //   private void pushFirst(Node n) {
  //     var iter = n.children.entrySet().iterator();
  //     stack.push(iter);
  //     if (!n.keyNode) {
  //       var entry = iter.next();
  //       prefix.append(entry.getKey().charValue());
  //       pushFirst(entry.getValue());
  //     }
  //   }

  //   private void advance() {
  //     if (stack.peek().hasNext()) {
  //       var iter = stack.peek();
  //       var entry = iter.next();
  //       prefix.append(entry.getKey().charValue());
  //       pushFirst(entry.getValue());
  //     } else {
  //       stack.pop();
  //       if (!stack.isEmpty()) {
  //         prefix.deleteCharAt(prefix.length() - 1);
  //         advance();
  //       }
  //     }
  //   }

  //   @Override
  //   public boolean hasNext() {
  //     return !stack.isEmpty();
  //   }

  //   @Override
  //   public String next() {
  //     var ret = prefix.toString();
  //     advance();
  //     return ret;
  //   }
  // }

  /**
   * Returns an iterator that goes through this set.
   */
  @Override
  public Iterator<String> iterator() {
    // return new TrieIterator();
    throw new UnsupportedOperationException();
  }

  /**
   * Returns the longest prefix of the given string that is in the set.
   */
  public String longestPrefix(String str) {
    // TODO: Implement this.
    throw new UnsupportedOperationException();
  }

  /**
   * Returns a list of all suffixes of the given string for strings in the set. Only return the
   * suffix, not the complete word. So if "valid" is in the set and the string is "val" then
   * "id" should be in the returned list. If the prefix is valid, the return set should include
   * the empty string.
   */
  public Set<String> validSuffixes(String str) {
    // TODO: Implement this.
    throw new UnsupportedOperationException();
  }
}
