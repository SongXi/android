# android

##CustonView 自定义View系列

WaveView
>思路:1.该view是一个标转的正余弦函数 **Y**=**A**sin(**W**i+**b**)+**h** A表示幅度 W影响周期 b影响初始化位置 h影响高度
<br/>2.创建一个长度为控件width的数组,通过正余弦函数计算出各个像素上的Y坐标的位置
<br/>3.指定一个平移的速度,根据这个速度不断的改变数组
<br/>4.通过System.arraycopy来对数组进行元素进行平移的操作.(也可以通过不断设置b初相的值来改变数组的元素,不过这种操作显然更耗时间)
<br/>5.在ondraw中不断的通过drawPoint,drawLine或者的Path的LineTo方法绘制(具体使用哪种都可以) 
<br/>6.在一次绘制完成以后通过postInvalidate来刷新.


