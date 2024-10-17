package com.campusdual.selection;

public class SwitchStatement {
    public static int methodSwitchCase(int value){
        int toRet = 0;

        switch (value + 1){  //El switch evalúa la expresión value + 1 y selecciona el caso que coincide con ese valor.
            case 1:
                toRet = value +1;
                break;
            case 2:
                toRet = value;
                break;
            case 3:
                toRet = value -1;
                break;
            default:
                toRet = value * 2;
                break;
        }
        return toRet;
    }

    // En caso de que fuese initialValue = 2, case = 3 porque value(2) + 1 , toret = value(2) -1 = 1
    // En caso de que fuese initialValue = 3, case = 4 porque value(3) + 1 , toret = value(3) * 2 = 6

    public static void main(String[] args){
        int initialValue = 2;
        int value =methodSwitchCase(initialValue);
        System.out.println(" Initial value is -> "+ initialValue + " final value is ->" + value);

    }
}
