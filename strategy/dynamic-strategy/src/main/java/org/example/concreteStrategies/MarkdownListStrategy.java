package org.example.concreteStrategies;

import org.example.strategies.ListStrategyInterface;

public class MarkdownListStrategy implements ListStrategyInterface {
    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append(" * ").append(item)
                .append(System.lineSeparator());
    }

}
