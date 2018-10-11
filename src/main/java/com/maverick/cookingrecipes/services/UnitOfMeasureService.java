package com.maverick.cookingrecipes.services;

import com.maverick.cookingrecipes.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
