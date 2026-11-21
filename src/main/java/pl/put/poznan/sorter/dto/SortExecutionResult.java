package pl.put.poznan.sorter.dto;

import java.util.Collections;
import java.util.List;

public final class SortExecutionResult {

    private final List<Object> sortedItems;
    private final long iterationsUsed;
    private final boolean limitReached;

    public SortExecutionResult(List<Object> sortedItems, long iterationsUsed, boolean limitReached) {
        this.sortedItems = sortedItems != null
                ? Collections.unmodifiableList(sortedItems)
                : Collections.emptyList();
        this.iterationsUsed = iterationsUsed;
        this.limitReached = limitReached;
    }

    public List<Object> getSortedItems() {
        return sortedItems;
    }

    public long getIterationsUsed() {
        return iterationsUsed;
    }

    public boolean isLimitReached() {
        return limitReached;
    }
}