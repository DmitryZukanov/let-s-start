package ru.umldata.repository;

import ru.umldata.model.UmlObject;

import java.util.Collection;

public interface UmlObjectRepository {
    UmlObject save(UmlObject umlObject);

    void delete(long id);

    UmlObject get(long id);

    Collection<UmlObject> getAll();
}
