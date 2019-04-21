/**
 * Singleton pattern is used for when you only want to have ONE object!
 * This is Eager initialization.
 */
public class EagerGod {
    private EagerGod() {}

    private static class EagerGodHolder {
        private static final EagerGod INSTANCE = new EagerGod();
    }

    public static EagerGod getInstance() {
        return EagerGodHolder.INSTANCE;
    }
}