public class MyClass {
    public static void main(String [] args){
        int soma = sum(1,2);
        System.out.println(soma);

        String firstName = "Silverio";
        String lastName = "Neto";
        System.out.println("Nome Completo: " + nomeCompleto(firstName,lastName));
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static String nomeCompleto(String firstName, String lastName){
        return firstName.concat(" ").concat(lastName);
    }
}
