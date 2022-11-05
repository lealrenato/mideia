package eti.archer.mideia.controller;

import static eti.archer.mideia.core.AppUtil.TAG;

import android.util.Log;

import eti.archer.mideia.core.AppUtil;

public class ClienteController {

    String versaodoapp;
        public ClienteController(){
        this.versaodoapp = AppUtil.versaoDoAplicativo();
        Log.i(TAG, "ClienteController: versão do App "+ versaodoapp);
    }
}
