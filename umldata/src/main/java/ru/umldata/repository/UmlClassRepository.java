package ru.umldata.repository;

import ru.umldata.model.UmlClass;

import java.util.Collection;

public interface UmlClassRepository {
    UmlClass save(UmlClass umlClass);

    void delete(long id);

    UmlClass get(long id);

    Collection<UmlClass> getAll();
}
