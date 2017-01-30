package com.micropackage.example.account.controller;

import com.micropackage.example.account.model.Account;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lmaitland on 30/01/2017.
 */
@RestController()
@RequestMapping("/api/account/")
public class AccountController {

    List<Account> _accounts = new ArrayList<>();


    @RequestMapping(value = "/index.json", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Account> list() {
        return _accounts;
    }

    @RequestMapping(value = "/index.json", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Account add(Account account) {
        _accounts.add( account );
        return account;
    }

    @RequestMapping(value = "/{index}.json", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity delete(int index) {
        if( _accounts.size() < index ) {
            return ResponseEntity.notFound().build();
        }
        _accounts.remove( index );
        return ResponseEntity.noContent().build();
    }
}
