package ru.umldata.repository;

import ru.umldata.model.UmlField;

import java.util.Collection;

public interface UmlFieldRepository {
    UmlField save(UmlField umlField);

    void delete(long id);

    UmlField get(long id);

    Collection<UmlField> getAll();
}
