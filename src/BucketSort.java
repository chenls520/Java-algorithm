import com.sun.javafx.sg.prism.web.NGWebView;

/**
 * Ͱ����
 * @author Administrator
 *
 */
public class BucketSort {
	
	public static void main(String[] args) {
		BucketSort bucketSort = new BucketSort();
		int[] params = {1, 8, 6, 5, 6, 5, 5};
		bucketSort.print(bucketSort.sort(params, 9));;
		
	}
	
	private int[] sort(int[] params, int length) {
		//��ʼ�����飬lenght Ӧ�ñ�params������ֵ��1
		int[] buckets= new int[length];
		for(int i = 0; i < buckets.length; i++) {
			buckets[i] = 0;
		}
		//ѭ������params���飬���params��ֵΪbuckets���±���buckets�±��Ӧ��ֵ��һ����ʾ���ڼ�����
		for(int i = 0; i < params.length; i++) {
			buckets[params[i]] += 1;
		}
		return buckets;
	}

	private void print(int[] params) {
		for(int i = 0; i < params.length; i++) {
			for(int j = 1; j <= params[i]; j ++) {
				System.out.println(i);
			}
		}
	}
}
