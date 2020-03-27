import java.util.Hashtable;

public class IsUnique {
  public static void main(final String[] args) {
    final Boolean result = isUnique("fyuxxxtrw");
    System.out.println("Result: " + result);
  }

  static Boolean isUnique(final String word) {
    final Hashtable<Character, Boolean> hash_table = new Hashtable<Character, Boolean>();
    final char[] chars = word.toCharArray();
    for (final char w : chars) {
      if (hash_table.get(w) != null) {
        return false;
      } else {
        hash_table.put(w, true);
      }
    }
    return true;
  }
}
