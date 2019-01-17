package ru.umldata.repository;

import ru.umldata.model.UmlFieldEntityLink;

import java.util.Collection;

public interface UmlFieldEntityLinkRepository {
    UmlFieldEntityLink save(UmlFieldEntityLink umlFieldEntityLink );

    void delete(long id);

    UmlFieldEntityLink get(long id);

    Collection<UmlFieldEntityLink> getAll();
}
