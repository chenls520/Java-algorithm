/**
 * ð������
 * @author Administrator
 *
 *ð������Ļ���˼���ǣ�ÿ�αȽ��������ڵ�Ԫ�أ�������ǵ�˳�����Ͱ����ǽ�������
 *ÿ��ѭ��ֻ�ܽ�һ�����ֹ�Ϊ����n������������ֻ��Ҫ����n-1�Ρ�
 *ð������ĺ�����˫��Ƕ��ѭ����ʱ�临�Ӷ�ΪO(N^2).
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		PrintUtil.printArray(new BubbleSort().sort(PrintUtil.ARRAY));
	}

	
	private int[] sort(int[] params) {
		//ѭ��n-1��
		for(int i = 1; i < params.length; i++) {
			//�������бȽϣ�ѭ��n-1��
			for(int j = 0; j < params.length - 1; j ++) {
				//ǰ���С�ں�����н�����Ϊ�������У���֮����
				if (params[j] < params[j + 1]) {
					int temp = params[j];
					params[j] = params[j + 1];
					params[j + 1] = temp;
				}
			}
		}
		
		return params;
	}
}
