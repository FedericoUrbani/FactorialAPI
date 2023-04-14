package com.factorialapi.FactorialAPI.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {

public Integer factorialService (Integer n){

    int returnN = 1;
    for (int i=1; i<=n;i++){
        returnN=returnN*i;
    }
    return (Integer) returnN;
}

}
