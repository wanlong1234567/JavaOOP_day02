package oo.day02;
//������Ĳ�����
public class CellTest {
	public static void main(String[] args) {
		/*
		Cell c = new Cell();
		c.row = 2;
		c.col = 5;
		c.drop();
		c.drop(3);
		c.moveLeft();
		c.moveLeft(2);
		printWall(c);
		*/
		
		Cell c1 = new Cell(); //0,0
		Cell c2 = new Cell(3); //3,3
		Cell c3 = new Cell(2,5); //2,5
		printWall(c2);
		
	}
	
	
	//��ǽ+���
	public static void printWall(Cell cc){
		for(int i=0;i<20;i++){ //��
			for(int j=0;j<10;j++){ //��
				if(i==cc.row && j==cc.col){ //����ƥ��
					System.out.print("* ");
				}else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

}















