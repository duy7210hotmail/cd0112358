import java.util.Objects;

public class Pair<K, V> {

  private final K key;
  private final V value;

  /**
   * Convenience method for creating an appropriately typed Pair
   * @param key the first object of the pair
   * @param value the second object of the pair
   * @return a Pair that is templatized with the types of _key and _value
   */
  public static <K, V> Pair <K, V> create(K key, V value) {
    return new Pair<K, V>(key, value);
  }

  /**
   * Contructor for initialization Pair class
   * @param key. Object
   * @param value. Object
   * @return instance of Pair. Object
   */
  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

  /**
   * Override method equals: that compare two Object (instance of Pair)
   *
   * @param Object o: the {@link Pair} to which this one is to be checked for
   * equality
   *
   * @return true if the underlinng object of the Pair are both considered equal
   */
  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof Pair)) {
      return false;
    }

    Pair <?, ?> pair = (Pair<?, ?>) o;
    return Objects.equals(pair.getKey(), key) && Objects.equals(pair.getValue(), value);
  }

  /**
   * Compute a hash code using the hash codes of the underling objects
   * @return a hashcode of the pair
   */
  @Override
  public int hashCode() {
    return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
  }
}
