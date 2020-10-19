# 计192班 马成彧 2019311530<br/>
# Java第一次上机实验报告<br/>
## 实验内容<br/>
1、用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别是PC、CPU、、HardDisk、Test。<br/>
2、类的定义中不少于两个构造方法，每个类定义不少于2个属性。<br/>
3、尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。<br/>
## 实验目的<br/>
1、了解Java的相关知识。<br/>
2、学习建立包、类。<br/>
3、深入学习构造方法、属性等知识。<br/>
4、尝试多种不同的对象属性调用的方法。<br/>
6、熟悉github的使用方法，同时使用markdown语言书写实验报告。<br/>
## 实验过程<br/>
1、建立一个test包，建立CPU.java、HardDisk.java、PC.java、Test.java四个文件。<br/>
2、CPU类使getSpeed()返回speed的值，getPrice()返回price的值。用setSpeed(int speed),this.speed将值赋给speed。用setPrice(int price),this.price将值赋给price。<br/>
3、HardDisk类使getAmount()返回amount的值，getRate()返回rate的值。用setAmount(int amount),this.amount将值赋给amount。用setRate(int rate),this.rate将值赋给rate。<br/>
4、PC类使setCPU(CPU cpu)赋值给cpu,setHardDisk(HardDisk HD)赋值给HD，用show(){System.out.println.....}输出CPU速度，硬盘容量，CPU的价格，硬盘转速。<br/>
5、Test创建CPU对象cpu，HardDisk对象HD，PC对象pc,使用pc调用setCPU(CPU cpu)方法、setHardDisk(HardDisk HD)方法、show()方法。<br/>
## 阅读程序<br/>
CPU.java<br/>
package test;
public class CPU {
public int speed;      //CPU运行速度
public int price;  //CPU的价格
CPU(int speed,int price) {//构造方法1
this.speed=speed;
this.price=price;
}
CPU(){}//构造方法2
int getSpeed() {
return speed;	
}
int getPrice() {
return price;	
}
public void setSpeed(int speed) {
	this.speed=speed;
}
public void setPrice(int price) {
	this.price=price;
}
}<br/>
HardDisk.java<br/>
package test;
public class HardDisk {
	private int amount;          
	public int rate;       
	HardDisk(){}                           //构造方法1
	HardDisk(int amount,int rate){    //构造方法2
		this.amount=amount;
		this.rate=rate;
	}
	void setAmount(int amount){       //设定硬盘容量
		this.amount = amount;
	}
	void setRate(int rate){       //设定硬盘容量
		this.rate=rate;
	}
	int getAmount() {            //获取硬盘容量
		return amount;
	}
	int getRate() {
		return rate;
	}
}<br/>
PC.java<br/>
package test;
public class PC {
CPU cpu;
HardDisk HD;
PC(){}//构造方法一
PC(CPU cpu,HardDisk HD){//构造方法二
	this.cpu=cpu;
	this.HD=HD;
}
void setCPU(CPU cpu) {
	this.cpu=cpu;
}
void SetHardDisk(HardDisk HD) {
	this.HD=HD;
}
void show() {
	System.out.println("CPU速度:"+cpu.getSpeed());
	System.out.println("硬盘容量"+HD.getAmount());
	System.out.println("CPU的价格"+cpu.getPrice());
	System.out.println("硬盘转速"+HD.getRate());
}
}<br/>
Test.java<br/>
package test;
public class Test {
public static void main(String args[]) {
	CPU cpu=new CPU();
	HardDisk HD=new HardDisk();
	cpu.setSpeed(2200);
	HD.setAmount(200);
	HD.setRate(500);
	cpu.setPrice(1000);
	PC pc=new PC();
	pc.setCPU(cpu);
	pc.SetHardDisk(HD);
	pc.show();
}
}<br/>
## 实验结果<br/>
CPU速度:2200<br/>
硬盘容量200<br/>
CPU的价格1000<br/>
硬盘转速500<br/>
## 实验感想<br/>
通过这次试验我学会了使用github书写实验报告，并且学会建立包、类，每个源文件最多一个pubulic class类和文件名保持一致，在实际上机实验时当出现多个public class时就会发生报错。<br/>
java的程序编写是面向对象的而c语言是面向过程的，在编写新的属性时我只书写了setPrice没有用getPrice进行返回price的值而发生报错。<br/>
构造方法没有类型，当前面出现int、viod就不再是构造方法，通过实验我发现了构造方法在定义后里面可以是空的。<br/>
还有一种就是在书写构造方法后里面也可以进行赋值，空的构造方法对整个程序不存在影响，在实验中也发现了自身的不足对程序的理解和完备上还存在问题，对于老师提出的一些改进要求编写起来还存在困难。<br/>
本次实验未能使用上循环进行判断，逻辑上还存在一些问题，对于修饰符private的用法还存在一些问题，需要在认真的继续深入学习。<br/>
