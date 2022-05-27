package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

import java.io.IOException;
import java.lang.reflect.Type;

public class MiscCodec
        implements ObjectSerializer, ObjectDeserializer {
    public static final MiscCodec instance = new MiscCodec();

    @Override
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {
        throw new JSONException("TODO");
    }

    @Override
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {
        throw new JSONException("TODO");
    }
}