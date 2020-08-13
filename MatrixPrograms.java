public class MatrixPrograms{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("--------------First matrix----------------");
		int row,column;
		System.out.println("Enter number row:- ");
		row=sc.nextInt();
		System.out.println("Enter number column:- ");
		column=sc.nextInt();
		int[][] matrix=new int[row][column];
		for(int i=0;i<row;i++) {
			System.out.println("Enter "+i+" row data:- ");
			for(int j=0;j<column;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("---------------Second matrix------------------");
		int row1,column1;
		System.out.println("Enter number row:- ");
		row1=sc.nextInt();
		System.out.println("Enter number column:- ");
		column1=sc.nextInt();
		int[][] matrix1=new int[row1][column1];
		for(int i=0;i<row1;i++) {
			System.out.println("Enter "+i+" row data:- ");
			for(int j=0;j<column1;j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		
		do {
			System.out.println("1.Display Matrix");
			System.out.println("2.Add matrix");
			System.out.println("3.Subtract Matrix");
			System.out.println("4.Multiply Matrix");
			System.out.println("5.Check matrix are equal or not");
			System.out.println("6.Print Lower Triangular matrix");
			System.out.println("7.Print Uppar Triangular matrix");
			System.out.println("8.Check even and odd numbers");
			System.out.println("9.Product of two matrix");
			System.out.println("10.Transpose Matrix");
			System.out.println("11.Check Identity Matrix");
			System.out.println("12. Check Sparse Matrix");
			System.out.println("Enter your choice:- ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				display(row,column,matrix,row1,column1,matrix1);
				break;
			
			case 2:
				additionMatrix(row,column,matrix,row1,column1,matrix1);
				break;
			case 3:
				subtractMatrix(row,column,matrix,row1,column1,matrix1);
				break;
			
			case 4:
				multiplicationMatrix(row,column,matrix,row1,column1,matrix1);
				break;
				
			case 5:
				checkMatrix(row,column,matrix,row1,column1,matrix1);
				break;
			
			case 6:
				LowerTriangular(row,column,matrix,row1,column1,matrix1);
				break;
			
			case 7:
				UpparTriangular(row,column,matrix,row1,column1,matrix1);
				break;
			
			case 8:
				checkOddEven(row,column,matrix,row1,column1,matrix1);
				break;
			
			case 9:
				productMatrix(row,column,matrix,row1,column1,matrix1);
				break;
			
			case 10:
				transposeMatrix(row,column,matrix,row1,column1,matrix1);
				break;
				
			case 11:
				CheckidentityMatrix(row,column,matrix,row1,column1,matrix1);
				break;
			
			case 12:
				CheckSparseMatrix(row,column,matrix,row1,column1,matrix1);
				break;
		
		}
			System.out.println("Do you want to continu(y/n):- ");
		}while(sc.next().equalsIgnoreCase("y"));	
	}

	public static void display(int row,int column,int [][]matrix,int row1,int column1,int [][]matrix1) {
		System.out.println("\nFirst Matrix:- \n");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("\nSecond matrix:- \n");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column1;j++) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static void additionMatrix(int row,int column,int [][]matrix,int row1,int column1,int [][]matrix1) {
		int[][] add=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++){
				add[i][j]=matrix[i][j]+matrix1[i][j];
				System.out.print(add[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static void subtractMatrix(int row,int column,int [][]matrix,int row1,int column1,int [][]matrix1) {
		int[][] sub=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				sub[i][j]=matrix[i][j]-matrix1[i][j];
				System.out.print(sub[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
	
	public static void multiplicationMatrix(int row,int column,int [][]matrix,int row1,int column1,int [][]matrix1) {
		int[][] mul=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				mul[i][j]=0;
				for(int k=0;k<row;k++) {
					mul[i][j]+=matrix[i][k]*matrix1[k][j];
				}
				System.out.print(mul[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static void checkMatrix(int row,int column,int [][]matrix,int row1,int column1,int [][]matrix1) {
		boolean flag=true;
		if(row!=row1||column!=column1) {
			System.out.println("Matrix are not equal");
		}else {
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					if(matrix[i][j]!=matrix1[i][j]) {
						flag=false;
						break;
					}
				}
			}
			if(flag) {
				System.out.println("Matrix are equal");
			}else {
				System.out.println("Matrix are not equal");
			}
		}
	}
	
	public static void LowerTriangular(int row,int column,int [][]matrix,int row1,int column1,int [][]matrix1) {
		System.out.println("First Matrix: \n");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(j>i) {
					System.out.print("0 ");
				}else {
					System.out.print(matrix[i][j]+" ");
				}
			}
			System.out.println("");
		}
		System.out.println("Second Matrix: \n");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column1;j++) {
				if(j>i) {
					System.out.print("0 ");
				}else {
					System.out.print(matrix1[i][j]+" ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void UpparTriangular(int row,int column,int [][]matrix,int row1,int column1,int [][]matrix1) {
		System.out.println("First Matrix: \n");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(i>j) {
					System.out.print("0 ");
				}else {
					System.out.print(matrix[i][j]+" ");
				}
			}
			System.out.println("");
		}
		System.out.println("Second Matrix: \n");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column1;j++) {
				if(i>j) {
					System.out.print("0 ");
				}else {
					System.out.print(matrix1[i][j]+" ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void checkOddEven(int row,int column,int [][]matrix,int row1,int column1,int [][]matrix1) {
		int countEven=0,countOdd=0,countEven1=0,countOdd1=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(matrix[i][j]%2==0) {
					countEven++;
				}else {
					countOdd++;
				}
			}
		}
		System.out.println("Frequency of 1st Matrix Even numbers: "+countEven);
		System.out.println("Frequency of 1st Matrix odd numbers: "+countOdd);
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column1;j++) {
				if(matrix1[i][j]%2==0) {
					countEven1++;
				}else {
					countOdd1++;
				}
			}
		}
		System.out.println("Frequency of 2nd Matrix odd numbers: "+countEven1);
		System.out.println("Frequency of 2nd Matrix odd numbers: "+countOdd1);
	}
	
	public static void productMatrix(int row,int column,int [][]matrix,int row1,int column1,int [][]matrix1) {
		 int prod[][]=new int[row][column];
		 for(int i=0;i<row;i++) {
			 for(int j=0;j<column;j++) {
				 for(int k=0;k<row1;k++) {
					 prod[i][j]=prod[i][j]+matrix[i][k]*matrix1[k][j];
				 }
			 }
		 }
		 for(int i=0;i<row;i++) {
			 for(int j=0;j<column;j++) {
				 System.out.print(prod[i][j]+" ");
			 }
			 System.out.println("");
		 }
	}
	
	public static void transposeMatrix(int row,int column,int [][]matrix,int row1,int column1,int [][]matrix1) {
		int [][]trans=new int[row][column];
		int [][]trans1=new int[row1][column1];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				trans[i][j]=matrix[j][i];
			}
		}
		System.out.println("First Transpose Matrix: \n");

		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(trans[i][j]+" ");
			}
			System.out.println("");
			
		}
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column1;j++) {
				trans1[i][j]=matrix1[j][i];
			}
		}
		System.out.println("Second Transpose Matrix: \n");

		for(int i=0;i<row1;i++) {
			for(int j=0;j<column1;j++) {
				System.out.print(trans1[i][j]+" ");
			}
			System.out.println("");
			
		}
	}
	
	public static void CheckidentityMatrix(int row,int column,int [][]matrix,int row1,int column1,int [][]matrix1) {
		boolean flag=true;
		boolean flag1=true;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(i==j && matrix[i][j]!=1 ) {
					flag=false;
					break;
				}
				if(i!=j && matrix[i][j]!=0) {
					flag=false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("First matrix is an identity matrix\n");
		}else {
			System.out.println("First matrix is an not identity matrix\n");
		}
		
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column1;j++) {
				if(i==j && matrix1[i][j]!=1 ) {
					flag1=false;
					break;
				}
				if(i!=j && matrix1[i][j]!=0) {
					flag1=false;
					break;
				}
			}
		}
		if(flag1) {
			System.out.println("Second matrix is an identity matrix\n");
		}else {
			System.out.println("Second matrix is an not identity matrix\n");
		}
	}
	
	public static void CheckSparseMatrix(int row,int column,int [][]matrix,int row1,int column1,int [][]matrix1) {
		int count=0;
		int count1=0;
		int size=row*column,size1=row1*column1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(matrix[i][j]==0) {
					count++;
				}
			}
			
		}
		if(count>(size/2)) {
			System.out.println("First matrix is a  sparse  matrix\n");
		}else {
			System.out.println("First matrix is not a sparse matrix\n");
		}
		
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column1;j++) {
				if(matrix1[i][j]==0) {
					count1++;
				}
			}
			
		}
		if(count1>(size1/2)) {
			System.out.println("Second matrix is a  sparse  matrix\n");
		}else {
			System.out.println("Second matrix is not a sparse matrix\n");
		}
	}
}