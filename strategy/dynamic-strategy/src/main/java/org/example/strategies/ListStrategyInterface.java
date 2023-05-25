package org.example.strategies;

public interface ListStrategyInterface {
    default void start(StringBuilder sb) {};
    void addListItem(StringBuilder sb, String item);
    default void end(StringBuilder sb) {};

}
