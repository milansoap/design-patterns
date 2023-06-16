package org.example;

import org.example.context.TextProcessor;
import org.example.types.OutputFormat;

import java.util.List;


// DYNAMIC STRATEGY.
// Strategy pattern is used where we want to use different variants of an algorithm within an object and be
// able to switch from one algorithm to another during runtime.
// In this example we implemented ways of transforming a certain text to either HTML or Markdown.
// We call the context (in this case the text processor). We assing the concrete Strategy in the function setOutputFormat.
// based on the strategy we are changing the strategy of converting strings to a certain output.
// ConcreteStrategy implements interface Strategy(in our case ListStrategy)
// On implementing different ConcreteStrategy we start using a different implementation of main interface or an algorithm.

public class Main {
    public static void main(String[] args) {
        TextProcessor tp = new TextProcessor(OutputFormat.MARKDOWN);
        tp.appendList(List.of("liberte", "egalite", "fraternite"));
        System.out.println(tp);
        tp.clear();
        tp.setOutputFormat(OutputFormat.HTML);
        tp.appendList(List.of("inheritance", "encapsulation", "polymorphism"));
        System.out.println(tp);
    }
}