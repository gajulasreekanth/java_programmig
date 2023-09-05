public class MergeSort {
    int[] array;
    int[] tempMergArr;
    int length;
    public static void main(String[] args){
        int[] inputArr={48,36,13,52,19,24,21};
        MergeSort ms= new MergeSort();
        ms.Sort(inputArr);
        for(int i:inputArr){
            System.out.print(i+" ");
        }
    }
    public void Sort(int inputArr[]){
        this.array=inputArr;
        this.length=inputArr.length;
        this.tempMergArr=new int[length];
        divideArray(0,length-1);
    }
    public void  divideArray(int lowerIndex,int higherIndex){
        if(lowerIndex<higherIndex){
            int middle = lowerIndex+(higherIndex-lowerIndex)/2;
            divideArray(lowerIndex,middle);
            divideArray(middle+1,higherIndex);
            mergeArray(lowerIndex,middle,higherIndex);
        }

    }
    public void mergeArray(int lowerIndex,int middle,int higherIndex){
        for(int i=lowerIndex;i<=higherIndex;i++){
            tempMergArr[i]=array[i];

        }
        int i=lowerIndex;
        int j=middle+1;
        int k=lowerIndex;
        while(i<=middle && j<=higherIndex){
            if(tempMergArr[i]<=tempMergArr[j]){
                array[k]=tempMergArr[i];
                i++;
            }
            else{
                array[k]=tempMergArr[j];
                j++;
            }
            k++;
        }
        while(i<=middle){
            array[k]=tempMergArr[i];
            k++;
            i++;
        }
    }
}
