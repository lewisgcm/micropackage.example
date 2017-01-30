package com.micropackage.example.account.api;

import com.micropackage.example.account.model.Account;

import java.util.List;
import java.util.concurrent.Future;

/**
 * Created by lmaitland on 30/01/2017.
 */
public interface AccountService {
    Future<List<Account>> list();
    Future<Account> add(Account account);
    Future<Boolean> delete(int i);
}
