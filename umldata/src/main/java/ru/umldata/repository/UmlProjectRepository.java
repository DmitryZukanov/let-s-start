package ru.umldata.repository;

import ru.umldata.model.UmlProject;

import java.util.Collection;

public interface UmlProjectRepository {
    UmlProject save(UmlProject umlProject);

    void delete(long id);

    UmlProject get(long id);

    Collection<UmlProject> getAll();
}
