package pl.put.poznan.sorter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.put.poznan.sorter.strategy.factory.SortFactory;

@Service
public class SortService {

    private final SortFactory sortFactory;

    @Autowired
    public SortService(SortFactory sortFactory) {
        this.sortFactory = sortFactory;
    }
}
