package oo.day02;
/*
 * ����:
 * 1)��һ���ļ��У����԰��������
 * 2)public���ε��ֻ࣬����һ��
 * 3)public���ε���������ļ�����ͬ
 */
//���ص���ʾ
public class OverloadDemo {
	public static void main(String[] args) {
		Aoo o = new Aoo();
		o.say();
		o.say("zhangsan");
		o.say(25);
		o.say("zhangsan", 25);
		o.say(25, "zhangsan");
	}
}

class Aoo{
	void say(){}
	void say(String name){}
	void say(int age){}
	void say(String name,int age){}
	void say(int age,String name){}
	
	//int say(){return 1;} //������������뷵��ֵ�����޹�
	//void say(String address){} //���������������������޹�
}











