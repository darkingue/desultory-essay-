package pers.qqs.lesson.javabasic.datatype;

import org.testng.annotations.Test;

/**
 * Created by qqs on 18/3/27.
 * 变量就是申请内存来存储值。也就是说，当创建变量的时候，需要在内存中申请空间。
 * 内存管理系统根据变量的类型为变量分配存储空间，分配的空间只能用来储存该类型数据。
 * 因此，通过定义不同类型的变量，可以在内存中储存整数、小数或者字符。
 * Java 的两大数据类型:
 * 1.内置数据类型
 * 2.引用数据类型
 * 本例展示给大家的是【内置数据类型】
 * Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。
 * 实际上，JAVA中还存在另外一种基本类型void，它也有对应的包装类 java.lang.Void，不过我们无法直接对它们进行操作。
 */
public class PrimitiveTypeL {
 /*   byte：

       byte 数据类型是8位、有符号的，以二进制补码表示的整数；
       最小值是 -128（-2^7）；
       最大值是 127（2^7-1）；
       默认值是 0；
       byte 类型用在大型数组中节约空间，主要代替整数，因为 byte 变量占用的空间只有 int 类型的四分之一；
       例子：byte a = 100，byte b = -50。
       short：

       short 数据类型是 16 位、有符号的以二进制补码表示的整数
       最小值是 -32768（-2^15）；
       最大值是 32767（2^15 - 1）；
       Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一；
       默认值是 0；
       例子：short s = 1000，short r = -20000。
       int：

       int 数据类型是32位、有符号的以二进制补码表示的整数；
       最小值是 -2,147,483,648（-2^31）；
       最大值是 2,147,483,647（2^31 - 1）；
       一般地整型变量默认为 int 类型；
       默认值是 0 ；
       例子：int a = 100000, int b = -200000。
       long：

       long 数据类型是 64 位、有符号的以二进制补码表示的整数；
       最小值是 -9,223,372,036,854,775,808（-2^63）；
       最大值是 9,223,372,036,854,775,807（2^63 -1）；
       这种类型主要使用在需要比较大整数的系统上；
       默认值是 0L；
       例子： long a = 100000L，Long b = -200000L。
               "L"理论上不分大小写，但是若写成"l"容易与数字"1"混淆，不容易分辩。所以最好大写。
       float：

       float 数据类型是单精度、32位、符合IEEE 754标准的浮点数；
       float 在储存大型浮点数组的时候可节省内存空间；
       默认值是 0.0f；
       浮点数不能用来表示精确的值，如货币；
       例子：float f1 = 234.5f。
       double：

       double 数据类型是双精度、64 位、符合IEEE 754标准的浮点数；
       浮点数的默认类型为double类型；
       double类型同样不能表示精确的值，如货币；
       默认值是 0.0d；
       例子：double d1 = 123.4。
       boolean：

       boolean数据类型表示一位的信息；
       只有两个取值：true 和 false；
       这种类型只作为一种标志来记录 true/false 情况；
       默认值是 false；
       例子：boolean one = true。
       char：

       char类型是一个单一的 16 位 Unicode 字符；
       最小值是 \u0000（即为0）；
       最大值是 \uffff（即为65,535）；
       char 数据类型可以储存任何字符；
       例子：char letter = 'A';。*/

    public static void main(String[] args) {
        // byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);


        // 正负数位操作
        binaryToDecimal(2147483647);
        System.out.println(2147483647);

        binaryToDecimal(~2147483647 + 1);
        System.out.println(~2147483647 + 1);

    }

    public static void binaryToDecimal(int n) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(n >>> i & 1);
        }
    }

    /**
     * 自动类型转换
     * 整型、实型（常量）、字符型数据可以混合运算。运算中，不同类型的数据先转化为同一类型，然后进行运算。
     * 转换从低级到高级。
     * 低  ------------------------------------>  高
     * byte,short,char—>int—>long—>float—>double
     * 数据类型转换必须满足如下规则：
     * <p/>
     * 1.不能对boolean类型进行类型转换。
     * 2.不能把对象类型转换成不相关类的对象。
     */
    @Test
    public void mandatoryTypeConversion() {
        int i = 128;
        //      3.在把容量大的类型转换为容量小的类型时必须使用强制类型转换。
        //      4.转换过程中可能导致溢出或损失精度，例如：
        byte b = (byte) i;
        System.out.println("int强制类型转换为byte后的值等于" + b);
        //      5. 浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入，例如：
        //        (int)23.7 == 23;
        //        (int)-45.89f == -45
        System.out.println((int) 23.7);
        System.out.println((int) -45.89f);

    }

    /**
     * 自动类型转换必须满足转换前的数据类型的位数要低于转换后的数据类型，
     * 例如: short数据类型的位数为16位，就可以自动转换位数为32的int类型，同样float数据类型的位数为32，可以自动转换为64位的double类型。
     */

    @Test
    public void automaticTypeConversion() {
        char c1 = 'a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于" + i1);
        int i2 = c1 + 1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于" + i2);
        char b = 'a';
    }

    /**
     *
     * 隐含强制类型转换
     * 1. 整数的默认类型是 int。
     * 2. 浮点型不存在这种情况，因为在定义 float 类型时必须在数字后面跟上 F 或者 f。
     */

}
