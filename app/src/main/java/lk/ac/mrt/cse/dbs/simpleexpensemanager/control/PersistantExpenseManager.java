package lk.ac.mrt.cse.dbs.simpleexpensemanager.control;

import android.content.Context;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.control.exception.ExpenseManagerException;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.TransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.DatabaseHelper;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistantAccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistantTransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Account;

public class PersistantExpenseManager extends ExpenseManager{
    private Context context;

    public PersistantExpenseManager(Context context) throws ExpenseManagerException {
        this.context = context;
        setup();
    }
    @Override
    public void setup() throws ExpenseManagerException {
        TransactionDAO transactionDAO = new PersistantTransactionDAO(context);
        setTransactionsDAO(transactionDAO);

        AccountDAO accountDAO = new PersistantAccountDAO(context);
        setAccountsDAO(accountDAO);
    }
}
