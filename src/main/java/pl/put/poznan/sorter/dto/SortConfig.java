package pl.put.poznan.sorter.dto;

public final class SortConfig {

    public enum SortOrder {
        ASC, DESC
    }

    private final SortOrder order;
    private final String property;
    private final Integer maxIterations;

    public SortConfig(SortOrder order, String property, Integer maxIterations) {
        this.order = order != null ? order : SortOrder.ASC;
        this.property = property;
        this.maxIterations = maxIterations;
    }

    public SortOrder getOrder() {
        return order;
    }

    public String getProperty() {
        return property;
    }

    public Integer getMaxIterations() {
        return maxIterations;
    }

    public boolean hasIterationLimit() {
        return maxIterations != null && maxIterations >= 0;
    }
}