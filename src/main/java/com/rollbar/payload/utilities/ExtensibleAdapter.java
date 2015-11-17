package com.rollbar.payload.utilities;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class ExtensibleAdapter implements JsonSerializer<Extensible> {
    public JsonElement serialize(Extensible extensible, Type type, JsonSerializationContext jsonSerializationContext) {
        return extensible.asJsonElement(jsonSerializationContext);
    }
}