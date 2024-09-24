class Database {
    static String dbName;

    static {
        dbName = "MainDB"; // static block
    }

    void display() {
        System.out.println("Database: " + dbName);
    }

    public static void main(String[] args) {
        Database db = new Database();
        db.display();
    }
}

