package org.example.strategies;

public class MarkdownListStrategy implements ListStrategyInterface {
    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append(" * ").append(item)
                .append(System.lineSeparator());
    }

}
