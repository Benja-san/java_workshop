public class HelloWorld {


    public static String sayHello(String name, String language) {
            return "Hello I am " + name + " and I'm a " + language + " Developer";
        }

    public static void main(String [] args) {

        System.out.println("Hello World !");

        if(args.length == 2){
            System.out.println(sayHello(args[0], args[1]));
        }
    }

}