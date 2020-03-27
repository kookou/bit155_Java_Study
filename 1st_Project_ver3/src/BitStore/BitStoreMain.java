package BitStore;

import BitStore.ui.BoardUI;
import BitStore.ui.LoginUI;
import BitStore.ui.admin.MemberUI;
import BitStore.ui.admin.ProductUI;
import BitStore.ui.user.BitStoreUI;
import BitStore.ui.user.UserUI;
import BitStore.util.BitStore;

public class BitStoreMain {
	public static void main(String[] args) {
		
		BitStore bs = new BitStore();
		
		BitStoreUI pu = new BitStoreUI();
		pu.useBitStore();
		
//		BitStoreUI bsUI = new BitStoreUI();
//		bsUI.user();
		
//		BoardUI bu = new BoardUI();
//		bu.commonBoard();
		
//		UserUI bitStore = new UserUI(); //������
//		bitStore.service();
		
//		LoginUI lu = new LoginUI();
//		lu.admin();
//		ProductUI pu = new ProductUI(); //�������� ��Ʈ
//		pu.admin();
		
	}
}