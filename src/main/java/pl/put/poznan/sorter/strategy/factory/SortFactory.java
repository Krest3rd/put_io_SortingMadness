package pl.put.poznan.sorter.strategy.factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.put.poznan.sorter.strategy.SortStrategy;

@Component
public class SortFactory {

    private final Map<String, SortStrategy> strategiesByName;

    @Autowired
    public SortFactory(List<SortStrategy> strategies) {
        Map<String, SortStrategy> map = new LinkedHashMap<>();
        if (strategies != null) {
            for (SortStrategy strategy : strategies) {
                if (strategy != null && strategy.getName() != null) {
                    map.put(normalize(strategy.getName()), strategy);
                }
            }
        }
        this.strategiesByName = Collections.unmodifiableMap(map);
    }

    public SortStrategy getStrategy(String algorithmName) {
        if (algorithmName == null || algorithmName.trim().isEmpty()) {
            throw new IllegalArgumentException("Algorithm name must not be blank");
        }
        String key = normalize(algorithmName);
        SortStrategy strategy = strategiesByName.get(key);
        if (strategy == null) {
            throw new IllegalArgumentException("Unsupported sorting algorithm: " + algorithmName);
        }
        return strategy;
    }

    public List<SortStrategy> getAllStrategies() {
        return new ArrayList<>(strategiesByName.values());
    }

    public boolean hasStrategy(String algorithmName) {
        if (algorithmName == null) {
            return false;
        }
        return strategiesByName.containsKey(normalize(algorithmName));
    }

    private String normalize(String name) {
        return name.trim().toLowerCase(Locale.ROOT);
    }
}