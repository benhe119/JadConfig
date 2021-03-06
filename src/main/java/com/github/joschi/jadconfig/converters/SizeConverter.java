package com.github.joschi.jadconfig.converters;

import com.github.joschi.jadconfig.Converter;
import com.github.joschi.jadconfig.ParameterException;
import com.github.joschi.jadconfig.util.Size;

/**
 * Converter for type {@link Size}
 *
 * @author jschalanda
 */
public class SizeConverter implements Converter<Size> {

    /**
     * Returns a {@link Size} instance representing the specified {@link String} {@literal value}.
     *
     * @param value The configuration parameter's {@link String} value
     * @return A {@link Byte} instance representing the configuration parameter's value
     */
    @Override
    public Size convertFrom(String value) {
        try {
            return Size.parse(value);
        } catch (Exception ex) {
            throw new ParameterException("Couldn't convert value \"" + value + "\" to Size.", ex);
        }

    }

    /**
     * Returns a {@link String} instance representing the configuration parameter's {@literal value}.
     *
     * @param value The configuration parameter's {@link Size} value
     * @return A {@link String} instance representing the configuration parameter's typed value
     */
    @Override
    public String convertTo(Size value) {
        if (value == null) {
            throw new ParameterException("Couldn't convert \"null\" to String.");
        }

        return value.toString();
    }
}
