package com.aniket.major.global;

import com.aniket.major.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {

    public static List<Product> cart;
    static {
        cart = new ArrayList<Product>();
    }
}
