package com.doinb.jvm;

/**
 * @author doinb
 * 常见垃圾回收算法
 *
 *  1 引用计数
 *
 *  2 复制： 复制之后有交换，谁空谁是to（survivor1是form区，survivor2是to区，它们的角色会互换）
 *  优点：没有产生内存碎片，它是整体复制的。 缺点：浪费空间；大对象复制时，耗时间。
 *
 *  3 标记清除：
 *     优点：没有大面积的复制，节约了空间。缺点：第一步先mark-sweep要回收的对象，第二步是回收对象，它会生产内存碎片。
 *
 *  4 标记整理：它是在标记清除上的进一步优化，先标记；再清除；最后再扫描，并往一端滑动存活对象。
 *   优点：没有内存碎片，可以利用bump。 缺点：需要移动对象的成本。
 *
 *   什么时候用什么算法？ 它就是分代收集概念。
 *
 *  GC
 *  1 GC Root 如何确定，那些对象可以作为GC Root?
 *  思路： GC Roots或者说tracing GC的“根集合”就是一组必须活跃的引用。
 *  通过一系列名为“GC Root”的对象作为起始点，从这个GC Root的对象开始向下搜索，如果一个对象到GC Roots没有任何引用链相连时，
 *  则说明此对象不可用。也即给定一个集合的作用引用作为根出发，通过引用关系遍历对象图，能被遍历到的(可到达的)对象就被判定为
 *  存活；没有被遍历到的就自然被判定为死亡。
 *
 *  在java中，可作为GC Roots的对象有：
 *  1. 虚拟机栈（栈帧中的本地变量表）中引用的对象；
 *  2. 方法区中的类静态属性引用的对象；
 *  3. 方法区中常量引用的对象；
 *  4. 本地方法栈中JNI（即一般说的Native方法）中引用的对象。
 *
 *
 *
 *
 */

public class JvmDocs {
    public static void main(String[] args) {

    }
}
