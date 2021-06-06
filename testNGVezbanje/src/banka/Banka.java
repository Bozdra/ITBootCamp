package banka;
import java.util.ArrayList;
import java.util.List;

public class Banka {
    private List<Account> accounts;

    public Banka(){
        accounts = new ArrayList<>();
    }

    public Account openAccount(String name){
        Account account = new Account(name);
        accounts.add(account);
        return account;
    }

    public void closeAccount(Account account)
    {
        accounts.remove(account);
    }

    public boolean transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
        Account from = getAccount(accountNumberFrom);
        if(from!=null)
            from.setAmount(from.getAmount()-amount);
        Account to = getAccount(accountNumberTo);
        if(to!=null)
            to.setAmount(to.getAmount()+amount);        // vec si popravio to umesto from
        return true;
    }

    public void payInMoney(String accountNumber, Double amount){
        Account account = getAccount(accountNumber);
        if(account!=null)
            account.setAmount(account.getAmount()+amount);   }

    public Account getAccount(String accountNumber){
        for(Account acc:accounts) {
            if(acc.getNumber()==accountNumber)
                return acc;
        }
        /*for(int i =0; i<accounts.size(); i++) {
        	Account acc = accounts.get(i);
        	if(acc.getNumber()==accountNumber)
                return acc;
        }*/
    
        return null;
    }


    public Double getSumMoney(Banka bank){
        Double res=0d;
        for (int i = 0; i < accounts.size(); i++) {
            res+=accounts.get(i).getAmount();
        }
        return res;
    }

    public void reset(){
        accounts.clear();
    }

}
