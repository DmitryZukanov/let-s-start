package ru.umldata.repository.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.umldata.model.UmlClass;
import ru.umldata.repository.UmlClassRepository;

import java.util.Collection;

public class UmlClassRepositoryImpl implements UmlClassRepository {

    private static final Logger log = LoggerFactory.getLogger(UmlClassRepositoryImpl.class);

    public UmlClass save(UmlClass umlClass) {
        log.info("Save", umlClass);
        return null;
    }

    public void delete(long id) {

    }

    public UmlClass get(long id) {
        return null;
    }

    public Collection<UmlClass> getAll() {
        return null;
    }
}
