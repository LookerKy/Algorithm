package com.kyhome.algorithmEx;


import java.io.*;

 
public class CountingSort {
    int[] numbers; //�Էµ� ����
    int[] countArr;//���� ����
  
    int max = 0;
    int index = 0;
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    void inputNumbers() throws IOException {//���� �Է��ϱ�
        //Scanner sc = new Scanner(System.in);
        //int size = sc.nextInt();
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(br.readLine().trim());
        numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(br.readLine().trim());
            numbers[i] = num;
            if (max < num) {
                max = num;
            }
        }
    }
 
    void sort() throws IOException {
        inputNumbers();
        int maxNumber = max;
        countArr = new int[maxNumber + 1]; //0-maxNumber+1��ŭ ����
   
 
        for (int i = 0; i < numbers.length; i++) {
            //�ش��ϴ� ���� ī����
            countArr[numbers[i]]++;
        }
        for (int i = 0; i < countArr.length; i++) {
            for (int j = 0; j < countArr[i]; j++) {
                bw.write(i+"\n");
            }
        }
        bw.close();      
    }
 
    public static void main(String[] args) throws IOException {
        new CountingSort().sort();
    }
}
