package org.o7planning.tutorial.helloosgi.mathservice.impl;

import org.o7planning.tutorial.helloosgi.mathservice.MathService;

public class MathServiceImpl implements MathService {
 
    @Override
    public int sum(int a, int b) {
        return a+ b;
    }

}
