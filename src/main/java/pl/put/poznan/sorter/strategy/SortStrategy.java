package pl.put.poznan.sorter.strategy;

import java.util.List;
import pl.put.poznan.sorter.dto.SortConfig;
import pl.put.poznan.sorter.dto.SortExecutionResult;

public interface SortStrategy {

    /**
     * Unikalny identyfikator strategii używany w API, np. "bubble", "quick", "merge".
     */
    String getName();

    /**
     * Sortuje przekazaną listę zgodnie z podaną konfiguracją.
     *
     * @param items  lista elementów (wartości prostych lub map/obiektów zdeserializowanych z JSON-a)
     * @param config konfiguracja sortowania (kierunek, własność obiektu, limit iteracji)
     * @return wynik zawierający aktualny stan listy, liczbę wykonanych iteracji
     *         oraz informację, czy sortowanie przerwano z powodu limitu
     */
    SortExecutionResult sort(List<Object> items, SortConfig config);
}