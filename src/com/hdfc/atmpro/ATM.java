package com.hdfc.atmpro;

import com.hdfc.atmpro.ui.iservice.ICUIService;
import com.hdfc.atmpro.ui.service.CUIService;

public class ATM {
    public static  void main(String[] args)
    {
        ICUIService icuiService = new CUIService();
        icuiService.showCUI();

        }
    }

