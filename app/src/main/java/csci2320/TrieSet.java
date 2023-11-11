package csci2320;

import java.util.Iterator;
import java.util.List;

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

  /**
   * Returns an iterator that goes through this set.
   */
  @Override
  public Iterator<String> iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
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
   * "id" should be in the returned list.
   */
  public List<String> validSuffixes(String str) {
    // TODO: Implement this.
    throw new UnsupportedOperationException();
  }
}
