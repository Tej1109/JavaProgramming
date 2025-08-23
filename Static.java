public class Static {
    public static void main(String[] args) {
        Friend friend = new Friend("John");
        Friend friend1 = new Friend("John 2");

        System.out.println(Friend.numOfFriends); // its 2 because numOfFriends belongs directly to class
        Friend.showFriends();
    }
}
