package ula.action.admin.contact;

import ula.action.FrameworkAction;
import ula.constant.AlertMessage;
import ula.constant.CommonConstants;
import ula.constant.ErrorConstants;

/**
 * 俄罗斯团队客户入口
 * @author Harry
 *
 */
public class GroupClientRussianAction extends FrameworkAction {
	@Override
	public String add() {	
		return super.add();
	}

	@Override
	protected int addToDB(String title, String content) {
		try {
			return super.getServiceManager().getContactService().addInfo(CommonConstants.ID_CONTACT_GROUP_RU, title, content);
		} catch (Exception e) {
			super.debug(ErrorConstants.INSERT_ERROR);
			return 0;
		}
	}

	@Override
	public String admin() {
		super.setMapKeyName(CommonConstants.KEY_CONTACT_INFO);
		try {
			super.setInfoMap(super.getServiceManager().getContactService().getInfo(CommonConstants.ID_CONTACT_GROUP_RU));
		} catch (Exception e) {
			this.setCustomAlertMessage(AlertMessage.CONTACT_INFO_EMPTY);
			return super.admin();
		}
		return super.admin();
	}

	@Override
	public String edit() {
		
		super.setMapKeyName(CommonConstants.KEY_CONTACT_INFO);
		try {
			super.setInfoMap(super.getServiceManager().getContactService().getInfo(CommonConstants.ID_CONTACT_GROUP_RU));
		} catch (Exception e) {
			this.debug(e.getMessage());
			this.setErrorMessage(ErrorConstants.UNKOWN_ERROR);
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
			return super.getServiceManager().getContactService().updateInfo(CommonConstants.ID_CONTACT_GROUP_RU, title2, content2);
		} catch (Exception e) {
			super.debug(ErrorConstants.UPDATE_ERROR);
			return 0;
		}
	}

	@Override
	public String view() {
		super.setMapKeyName(CommonConstants.KEY_CONTACT_INFO);
		return super.view();
	}
	
}
