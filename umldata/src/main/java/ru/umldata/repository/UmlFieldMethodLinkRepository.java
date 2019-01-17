package ru.umldata.repository;

import ru.umldata.model.UmlFieldMethodLink;

import java.util.Collection;

public interface UmlFieldMethodLinkRepository {
    UmlFieldMethodLink save(UmlFieldMethodLink umlFieldMethodLink );

    void delete(long id);

    UmlFieldMethodLink get(long id);

    Collection<UmlFieldMethodLink> getAll();
}
