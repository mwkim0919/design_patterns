/**
 * Singleton pattern is used for when you only want to have ONE object!
 * This is Lazy initialization.
 */
public final class LazyGod {
    private static volatile LazyGod instance;

    private LazyGod() {}

    public static LazyGod getInstance() {
        if (instance == null) {
            // This is to make thread-safe.
            synchronized (LazyGod.class) {
                if (instance == null) {
                    instance = new LazyGod();
                }
            }
        }
        return instance;
    }
}