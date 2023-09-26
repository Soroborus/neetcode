import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        int[] a={};
        a=deleteNth(a,3);
        for (int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int[] deleteNth(int[] elements,int n){
        if (n==0){
            elements=new int[1];
            return elements;
        }
        else{
            if (elements.length==0){
                return elements;
            }
        }
        LinkedList<Integer> list = new LinkedList<Integer>();
        int e=1;
        list.add(elements[0]);
        for (int i=1;i<elements.length;i++){
            if (elements[i]==list.getLast() && e<n){
                list.add(elements[i]);
                e++;
            }
            else{
                    e=0;
                    for(int j=0;j<list.size();j++){
                        if (list.get(j)==elements[i]){
                            e++;
                        }
                    }
                    if (e<n){
                        list.addLast(elements[i]);
                        e++;
                    }

            }
        }

        elements=new int[list.size()];
        for (int i=0;i<list.size();i++){
            elements[i]=list.get(i);
        }
        return elements;
    }
}
