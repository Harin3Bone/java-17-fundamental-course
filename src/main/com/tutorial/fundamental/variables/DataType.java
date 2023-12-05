package com.tutorial.fundamental.variables;

public class DataType {

    private int integerDef;
    private double doubleDef;
    private boolean boolDef;
    private Integer integerClassDef;

    @Override
    public String toString() {
        return "DataType{" +
                "integerDef=" + integerDef +
                ", doubleDef=" + doubleDef +
                ", boolDef=" + boolDef +
                ", integerClassDef=" + integerClassDef +
                '}';
    }

    /* Data Type
     * Primitive Data Type:
     *      - Pass by Value
     *      - Default value of number is 0 and default value of logical is false
     * Non-Primitive Data Type:
     *      - Pass by Reference
     *      - Default value is NULL
     */

    public void primitiveDataType() {
        // All Number type default value equal 0
        short shortDataType = 1;
        int intDataType = 1;
        long longDataType = 1;

        float floatDataType = 1.0f;
        double doubleDataType = 1.0;

        // Logical Type default value equal false
        boolean booleanDataType = false;
    }

    public void primitiveButNonPrimitive() {
        Short shortDataType = 1;
        Integer intDataType = 1;
        Long longDataType = 1L;

        Float floatDataType = 1.0f;
        Double doubleDataType = 1.0;

        Boolean booleanDataType = false;
    }

    public void nonPrimitiveDataType() {
        char charDataType = 'c';
        Character characterDataType = 'C';
        String stringDataType = "String";
    }
}
