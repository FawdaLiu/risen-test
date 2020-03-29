package com.fawda.xpath;

public abstract class RootNode {

    protected String name;

    public RootNode(String name) {
        this.name = name;
    }

    public abstract void show();
}