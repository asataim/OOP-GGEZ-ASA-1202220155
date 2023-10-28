public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();


        Account pertama = new Account("Asa", "0000000000",100000.0);
        Account kedua = new Account("Ikhtiar", "0000000001",200000.0);
        Account ketiga = new Account("Ucup", "0000000002",300000.0);

        bank.addAccount(pertama);
        bank.addAccount(kedua);
        bank.addAccount(ketiga);

        System.out.println("\nDaftar Semua Akun dalam Bank :");
        for (Account account : bank.getAllAccounts()) {
            System.out.println("Saldo akun " + account.getName() + " : " + account.getBalance());
        }

        pertama.deposit(50000.0);
        kedua.withdraw(20000.0);

        System.out.println("\nSaldo akun " + pertama.getName() + " setelah menyetor : " + pertama.getBalance());
        System.out.println("Saldo akun " + kedua.getName() + " setelah menyetor : " + kedua.getBalance());
 
        String accountDihapus = "ucup";
        bank.removeAccount(accountDihapus);


        System.out.println("\nDaftar semua akun dalam bank: ");
        for (Account account : bank.getAllAccounts()) {
            System.out.println("Nama: " + account.getName() + ", Nomor Akun: " + account.getAccountNumber() + ", Saldo: " + account.getBalance());
        }

        System.out.println("\n");
    }
}