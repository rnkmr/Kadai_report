// ���|�[�g�ۑ�F����̃v���O�����������B
// �V�F���\�[�g�ɒ���

public class Kadai_sorting {

	// �^������z��̒������P�O�ł��邱�Ƃ��O��
	static void shell_sort(int[] a){
		// a[0],a[4]  a[1],a[5]  a[2],a[6]
		// a[3],a[7]  a[4],a[8]  a[5],a[9]  ���\�[�e�B���O
		for(int j=0;j<(a.length/2);j++){
			for(int i=0;i<(a.length/2)+1-j;i++){
				if(a[i] > a[i+4]){
					int tmp = a[i+4];
					a[i+4] = a[i];
					a[i] = tmp;
				}
			}
		}
		System.out.println("----�S�[�\�[�g�������----");
		print_array(a);
		// a[0],a[2],a[4],a[6],a[8]
		// a[1],a[3],a[5],a[7],a[9]�@���\�[�e�B���O
		boolean sorted = false;
		while(sorted == false){
			for(int i=0;i<(a.length/5);i++){
				for(int j=i;j<a.length;j=j+2){
					if(j<a.length-2 && a[j]>a[j+2]){
						int tmp = a[j+2];
						a[j+2] = a[j];
						a[j] = tmp;
					}
					sorted = true;
					for (int k = i+2; k < a.length-2; ++k) {
						if(a[k-2] > a[k]) {
							sorted = false;
						}
					}
				}
			}
		}
		System.out.println("----�Q�[�\�[�g������ԁ�----");
		print_array(a);
		System.out.println("-------------------");
		// ��L�̏����Łu�n�Ȃ炵�v�������ƁA�}���\�[�g�ɔC����B
		insertion_sort(a);
	}

    static void insertion_sort(int[] array) {
    	for(int i=1;i<array.length;i++){
    		int j;
    		int tmp = array[i];
    		for(j=i;j>0 && array[j-1]>tmp;j--){
    			array[j] = array[j-1];
    		}
    		array[j] = tmp;
    	}
    }

	 static boolean check_sorted(int[] array) {
			boolean sorted = true;

			for (int i = 1; i < array.length; ++i) {
			    if(array[i-1] > array[i]) {
				sorted = false;
			    }
			}

			return sorted;
		    }

	 static void print_array(int[] array){
		 for(int i=0;i<array.length;i++){
			 System.out.println(array[i]);
		 }
	 }

    public static void main(String[] args) {
	//	int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int[] a = { 7, 9, 0, 3, 1, 8, 6, 2, 5, 4 };

	shell_sort(a);
	System.out.println(check_sorted(a));
	print_array(a);
    }
}
