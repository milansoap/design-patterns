package org.example.processors;

import org.example.strategies.HtmlListStrategy;
import org.example.strategies.ListStrategyInterface;
import org.example.strategies.MarkdownListStrategy;
import org.example.types.OutputFormat;

import java.util.List;

public class TextProcessor {
    private StringBuilder sb = new StringBuilder();
    private ListStrategyInterface listStrategy;

    public TextProcessor(OutputFormat format) {
        setOutputFormat(format);
    }

    public void setOutputFormat(OutputFormat format) { // SET STRATEGY
        switch (format) {
            case MARKDOWN:
                listStrategy = new MarkdownListStrategy();
                break;
            case HTML:
                listStrategy = new HtmlListStrategy();
                break;
        }
    }

    public void appendList(List<String> items) {
        listStrategy.start(sb);
        for (String item: items) {
            listStrategy.addListItem(sb, item);
        }
        listStrategy.end(sb);
    }

    public void clear() {
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
