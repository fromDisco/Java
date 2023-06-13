package Association;

public class Association {
    private String name;
    private Friend friend;
    private boolean hasFriend;

    // Constructors
    Association(String name) {
        this.name = name;
        this.friend = new Friend(this, "Best friend");
        this.hasFriend = true;
    }

    Association(Friend friend, String name) {
        this.name = name;
        this.friend = friend;
        this.hasFriend = true;
    }

    // Setters / Getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Friend getFriend() {
        return this.friend;
    }

    public void setFriendMotto(String motto) {
        this.friend.setMotto(motto);
    }

    public void setHasFriend(boolean hasAsscociation) {
        this.hasFriend = hasAsscociation;
    }

    public String toString() {
        return getClass().getName() + "{" +
                "name = " + this.name + ", " +
                "friend = " + this.friend +
                "}";
    }
}
