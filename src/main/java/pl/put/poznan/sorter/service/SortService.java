package pl.put.poznan.sorter.service;

import pl.put.poznan.sorter.strategy.SortStrategy

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class SortService {

    private final SortFactory sortFactory;

    @Autowired
    public SortService(SortFactory sortFactory) {
        this.sortFactory = sortFactory;
    }
}
