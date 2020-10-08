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
}
