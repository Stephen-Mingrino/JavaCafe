public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double  dripCoffeePrice = 1.99;
        double Latte = 3.99;
        double cappuccino = 2.99;
    
        // Customer name variables (add yours below)
        String customer1 = "Noah";
        String customer2 = "Jimmy";
        String customer3 = "Sam";
        String customer4 = "Cindhuri";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false; 
        boolean isReadyOrder2 = true; 
        if (isReadyOrder1) {
            System.out.println("Your order is not ready");
        }
        else if (isReadyOrder2) {
            System.out.println("Your order is ready");
        }
        else{
            System.out.println("Your order is ready");
        }
        
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1);
        System.out.println(customer1 + isReadyOrder2 + displayTotalMessage + cappuccino );
        System.out.println(generalGreeting + customer3);
        System.out.println(customer3 +  Latte * 2 +  isReadyOrder2);// im trying to ge spaces but its not really working out
        System.out.println(generalGreeting + customer2);
        System.out.println(customer2);
        System.out.println(Latte - dripCoffeePrice); 
        
        // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
    }
}
