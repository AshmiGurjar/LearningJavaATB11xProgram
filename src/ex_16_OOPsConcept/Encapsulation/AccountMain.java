package ex_16_OOPsConcept.Encapsulation;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccno(101);
        account.setAmount(4578);
        account.setName("Ashmi Gurjar");

        System.out.println(account.getAccno());
        System.out.println(account.getAmount());
        System.out.println(account.getName());

    }
}
