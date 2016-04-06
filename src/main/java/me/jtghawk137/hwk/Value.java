package me.jtghawk137.hwk;

public class Value
{

    private Type type;
    private Object value;

    public Value(Type type, Object value)
    {
        this.type = type;
        this.value = value;
    }

    public void setValue(Object value)
    {
        this.value = value;
    }

    public Type getType()
    {
        return type;
    }

    public Object getValue()
    {
        return value;
    }
}
