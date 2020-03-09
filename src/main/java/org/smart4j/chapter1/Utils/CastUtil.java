package org.smart4j.chapter1.Utils;

/**
 * 转型操作工具
 */
public final class CastUtil {
    /**
     * 转为String类
     * @param obj
     * @return
     */
    public static String castString(Object obj){
        return castString(obj, "");
    }

    /**
     * 转为String类（带默认值）
     * @param obj
     * @param defaultValue
     * @return
     */
    public static String castString(Object obj,String defaultValue){
        return obj!=null?String.valueOf(obj):defaultValue;
    }

    public static int castInt(Object obj) {
        return castInt(obj,0);
    }
    public static int castInt(Object obj,int defaultValue) {
        int intValue=defaultValue;

        if(obj!=null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try{
                    intValue = Integer.parseInt(strValue);
                }catch(NumberFormatException e){
                    intValue=defaultValue;
                }

            }
        }
        return intValue;
    }

    public static boolean castBoolean(Object obj) {
        return castBoolean(obj,false);
    }

    public static boolean castBoolean(Object obj, Boolean defaultValue) {
        Boolean booleanValue = defaultValue;

        if(obj!=null){
            booleanValue=Boolean.parseBoolean(castString(obj));
        }
        return booleanValue;
    }

    public static double castInt(Object obj,double defaultValue) {
        double intValue=defaultValue;

        if(obj!=null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try{
                    intValue = Double.parseDouble(strValue);
                }catch(NumberFormatException e){
                    intValue=defaultValue;
                }

            }
        }
        return intValue;
    }
}
