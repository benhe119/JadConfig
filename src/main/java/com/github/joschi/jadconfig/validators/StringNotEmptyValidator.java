package com.github.joschi.jadconfig.validators;

import com.github.joschi.jadconfig.ValidationException;
import com.github.joschi.jadconfig.Validator;

/**
 * {@link Validator} class which checks if the named parameter is a non-empty {@link String}.
 *
 * @author jschalanda
 */
public class StringNotEmptyValidator implements Validator<String> {

    /**
     * Validates if the value {@literal value} the of provided configuration parameter {@literal name} is a non-empty
     * {@link String}
     *
     * @param name  The name of the configuration parameter
     * @param value The value of the configuration validator
     * @throws ValidationException If the value {@literal value} configuration parameter {@literal name} can't be parsed
     *                             as a {@link String} or is empty.
     */
    @Override
    public void validate(final String name, final String value) throws ValidationException {
        if (value != null && value.isEmpty()) {
            throw new ValidationException("Parameter " + name + " should not be empty");
        }
    }
}
