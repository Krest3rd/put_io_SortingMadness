package pl.put.poznan.sorter.strategy.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import pl.put.poznan.sorter.dto.SortConfig;
import pl.put.poznan.sorter.dto.SortExecutionResult;
import pl.put.poznan.sorter.strategy.SortStrategy;

@Component
public class BubbleSortStrategy implements SortStrategy {

    @Override
    public String getName() {
        return "bubble";
    }

    @Override
    public SortExecutionResult sort(List<Object> items, SortConfig config) {
        // TODO: Do actual implementation
        long iterations = 0;
        boolean limitReached = false;

        return new SortExecutionResult(list, iterations, limitReached);
    }
}