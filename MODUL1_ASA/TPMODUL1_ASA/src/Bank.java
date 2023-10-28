import java.util.ArrayList;
import java.util.List;

class Bank {
    private List<Account> accountList;

    public Bank() {
        accountList = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void removeAccount(String accountName) {
        for (Account account : accountList) {
            if (account.getName().equals(accountName)) {
                accountList.remove(account);
                System.out.println("\nAkun " + accountName + " berhasil dihapus!");
                return;
            }
        }
        System.out.println("Akun " + accountName + "tidak ditemukan");
    }

    public Account getAccount(String accountName) {
        for (Account account : accountList) {
            if (account.getName().equals(accountName)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getAllAccounts() {
        return accountList;
    }
}