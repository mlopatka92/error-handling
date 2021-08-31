class ErrorHandling {

    static void main(String[] args) {
        if (args.size() < 2) {
            println("You need to pass two numbers");
            System.exit(1);
        }

        try {
            def res = div(args[0] as Integer, args[1] as Integer);
            println(res);
        } catch (Exception e){
            println("Exception caught: $e")
        }
    }

    static def div(a,b) {
        return a / b;
    }
}
