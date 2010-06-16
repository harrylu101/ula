package ula.action.admin.special;

import ula.action.FrameworkAction;
import ula.constant.AlertMessage;
import ula.constant.CommonConstants;

public class SouvenirCommissionAction extends FrameworkAction {
	@Override
	public String add() {
		return super.add();
	}

	@Override
	protected int addToDB(String title, String content) {
		try {
			return super.getServiceManager().getSpecialService().addInfo(CommonConstants.ID_SPECIAL_COMMISSION_SOUVENIR, title, content,CommonConstants.TAG_SPECIAL_COMMISION_SOUVENIR);
		} catch (Exception e) {
			super.debug(e.getMessage());
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public String admin() {
		super.setMapKeyName(CommonConstants.KEY_SPECIAL_SOUVENIR);
		try {
			super.setInfoMap(super.getServiceManager().getSpecialService().getInfo(CommonConstants.ID_SPECIAL_COMMISSION_SOUVENIR));
		} catch (Exception e) {
		super.debug(e.getMessage());
			e.printStackTrace();
			super.setAlertMessage(AlertMessage.SPECIAL_SOUVENIR);
			return super.admin();
		}
		return super.admin();
	}

	@Override
	public String edit() {
	super.setMapKeyName(CommonConstants.KEY_SPECIAL_SOUVENIR);
	try {
		super.setInfoMap(super.getServiceManager().getSpecialService().getInfo(CommonConstants.ID_SPECIAL_COMMISSION_SOUVENIR));
	} catch (Exception e) {
		super.debug(e.getMessage());
		e.printStackTrace();
		return ERROR;
	}
	
		return super.edit();
	}

	@Override
	public String preAdd() {
		return super.preAdd();
	}

	@Override
	public String update() {
		return super.update();
	}

	@Override
	protected int updateToDB(String title2, String content2) {
		try {
			return super.getServiceManager().getSpecialService().updateInfo(CommonConstants.ID_SPECIAL_COMMISSION_SOUVENIR, title2, content2);
		} catch (Exception e) {
			super.debug(e.getMessage());
			e.printStackTrace();
			
			return 0;
		}
	}

	@Override
	public String view() {
		return super.view();
	}
}
