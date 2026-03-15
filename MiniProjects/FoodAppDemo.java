import java.util.Scanner;

class User {
    String name;
    long Ph;
    String username;
    String pass;
    Scanner sc = new Scanner(System.in);

    void login() {
        System.out.println("Login");
        System.out.println("Enter Your username:");
        username = sc.nextLine();
        System.out.println("Enter your password:");
        pass = sc.nextLine();
    }

    void userdetail() {
        System.out.println("Enter Your Name:");
        name = sc.nextLine();
        System.out.println("Enter Your Phone No:");
        Ph = sc.nextLong();
        sc.nextLine(); 
    }

    void logout() {
        System.out.println("Logging Out..");
    }
}

class customer extends User {
    String item;

    void order() {
        System.out.println("What would you like to order?");
        item = sc.nextLine();
    }

    void placeorder() {
        System.out.println("Placing Order: " + item);
    }

    void display() {
        System.out.println();
        System.out.println("--Customer Order Details--");
        System.out.println("Name: " + name);
        System.out.println("Phone no: " + Ph);
        System.out.println("Ordered Item: " + item);
        System.out.println();
    }
}

class deliverypartner extends User {
    String Item_to_deliver;

    void deliver_order(String a) {
        Item_to_deliver = a;
        System.out.println("--Delivery Partner Details:--");
        System.out.println("Name: " + name);
        System.out.println("Phone no: " + Ph);
        System.out.println("Ordered Item to deliver: " + Item_to_deliver);
        System.out.println();
    }
}

class FoodAppDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Enter the role:");
        System.out.println("1) Customer");
        System.out.println("2) Delivery Partner");
        System.out.println();
        choice = sc.nextInt();
        sc.nextLine(); 

        if (choice == 1) {
            customer c = new customer();
            c.login();
            c.userdetail();
            c.order();
            c.display();
        } else if (choice == 2) {
            deliverypartner dp = new deliverypartner();
            dp.login();
            dp.userdetail();
            dp.deliver_order("Pizza");
        } else {
            System.out.println("Enter a valid choice");
        }
        System.out.println("Do you want to log out?");
        System.out.println("press 0 if yes & 1 if no");
        int ans=sc.nextInt();
        if(ans==0)
        {
             customer c = new customer();
             c.logout();
        }
        else if(ans==1)
        {
            System.out.println("User is still logged in");
        }
        else{
             System.out.println("Enter a valid choice");
        }
    }
}