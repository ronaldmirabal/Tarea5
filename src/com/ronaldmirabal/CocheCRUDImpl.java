package com.ronaldmirabal;

import interfaces.CocheCRUD;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        String nameofCurrMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();
        System.out.println(nameofCurrMethod);
    }

    @Override
    public void findAll() {
        String nameofCurrMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();
        System.out.println(nameofCurrMethod);
    }

    @Override
    public void delete() {
        String nameofCurrMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();
        System.out.println(nameofCurrMethod);
    }
}
