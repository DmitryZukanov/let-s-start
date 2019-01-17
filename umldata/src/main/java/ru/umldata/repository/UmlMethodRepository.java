package ru.umldata.repository;

import ru.umldata.model.UmlMethod;

import java.util.Collection;

public interface UmlMethodRepository {
    UmlMethod save(UmlMethod umlMethod);

    void delete(long id);

    UmlMethod get(long id);

    Collection<UmlMethod> getAll();
}
