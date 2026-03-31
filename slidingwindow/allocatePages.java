public class allocatePages {

    public int allocatePages(int[] arr,int m){
        int n=arr.length;
        if(m>n) return -1;
        int left=0;
        int right=0;
        for(int i=0;i<n;i++){
            left=Math.max(left,arr[i]);
            right+=arr[i];
        }
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isValid(arr,m,mid)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }

        
    return ans;
}
public static boolean isValid(int []arr,int m, int maxPages){
    int students =1;
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        if(sum>maxPages){
            students++;
            sum=arr[i];
        }
    }
    return students<=m;

}