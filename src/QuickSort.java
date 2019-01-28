import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ��������
 * @author Administrator
 *��������Ļ���˼���ǣ��ҵ�һ������(һ��Ϊ�����һ��ֵ)��������������������Ϊ���ڻ����������С�ڻ��������顣�ٽ����������С���������ظ�������̣�ֱ���������鳤��С�ڵ���1�ٽ������ء�
 *�����ݴ������飬 ������ С������ϲ�����һ������������ˡ�
 *��������ĺ����ǵݹ�
 *ʱ�临�Ӷ�O(N^2).
 */
public class QuickSort {

	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		List<Integer> params = Arrays.asList(9, 8, 6, 5, 6, 5, 5);
		PrintUtil.printList(quickSort.sort(params));
	}
	
	
	private List<Integer> sort(List<Integer> params) {
		//������鳤��С�ڵ���1ֱ�ӷ���
		if (params.size() <= 1) {
			return params;
		}
		//���ڻ����ļ���
		List<Integer> greaterList = new ArrayList<>();
		//С�ڻ����ļ���
		List<Integer> lessList = new ArrayList<>();
		//���࣬ ���ڻ���װ����ڼ��ϣ� С�ڻ���װ��С�ڼ���
		for(int i = 1; i < params.size(); i++) {
			if (params.get(i) >= params.get(0)) {
				greaterList.add(params.get(i));
			}else {
				lessList.add(params.get(i));
			}
		}
		//�ݹ���ڻ�������
		greaterList = sort(greaterList);
		//�ݹ�С�ڻ�������
		lessList = sort(lessList);
		//�������ؼ���
		List<Integer> result = new ArrayList<>();
		//װ�����ݣ���װС�ڼ�����Ϊ���򣬷�֮��Ϊ����
		result.addAll(lessList);
		result.add(params.get(0));
		result.addAll(greaterList);
		return result;
		
	}
}
