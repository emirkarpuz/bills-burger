public class Addition {
    private boolean lettuce;
    private boolean onion;
    private boolean pickle;
    private boolean tomato;

    public Addition(boolean lettuce, boolean onion, boolean pickle, boolean tomato) {
        this.lettuce = lettuce;
        this.onion = onion;
        this.pickle = pickle;
        this.tomato = tomato;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isPickle() {
        return pickle;
    }

    public boolean isTomato() {
        return tomato;
    }
}
