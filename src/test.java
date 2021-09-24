import java.util.Arrays;

/**
 * Project name(项目名称)：比较两个数组是否相等（equals()）
 * Package(包名): PACKAGE_NAME
 * Description(描述)：
 * <p>
 * 数组相等的条件不仅要求数组元素的个数必须相等，而且要求对应位置的元素也相等。Arrays 类提供了 equals() 方法比较整个数组。语法如下：
 * Arrays.equals(arrayA, arrayB);
 * 其中，arrayA 是用于比较的第一个数组，arrayB 是用于比较的第二个数组。
 * <p>
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/24
 * Time(创建时间)： 19:15
 * Version(版本): 1.0
 */

public class test
{
    public static void main(String[] args)
    {
        int[] data = {1, 5, 8, 7};
        int[] data1 = {1, 5, 8, 7};
        int[] data2 = {1, 8, 9, 6, 5};
        if (Arrays.equals(data, data1))
        {
            System.out.println("data数组和data1数组相等");
        }
        else
        {
            System.out.println("data数组和data1数组不相等");
        }
        if (Arrays.equals(data2, data1))
        {
            System.out.println("data2数组和data1数组相等");
        }
        else
        {
            System.out.println("data2数组和data1数组不相等");
        }
    }
}
