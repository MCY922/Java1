package test;
public class CPU {
public int speed;      //CPU�����ٶ�
public int price;  //CPU�ļ۸�
CPU(int speed,int price) {//���췽��1
this.speed=speed;
this.price=price;
}
CPU(){}//���췽��2
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
