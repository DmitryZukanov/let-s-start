package ru.umldata.repository;

import ru.umldata.model.UmlEntityType;

import java.util.Collection;

public interface UmlEntityTypeRepository {
    UmlEntityType save(UmlEntityType umlEntityType);

    void delete(long id);

    UmlEntityType get(long id);

    Collection<UmlEntityType> getAll();
}
