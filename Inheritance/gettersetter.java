// Getter and Setter methods are used to access and modify private data members of a class safely and correctly
// Getter: decides what to return
// Setter: decides what value is allowed

class gettersetter {

    private int id;

    // Setter method 
    public void setId(int id) {
        this.id = id;
    }

    // Getter method
    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        gettersetter s = new gettersetter ();
        
        s.setId(101);              // setting value
        System.out.println(s.getId()); // getting value
    }
}
