package com.internousdev.kamaboko.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kamaboko.dao.MCategoryDAO;
import com.internousdev.kamaboko.dao.PurchaseHistoryInfoDAO;
import com.internousdev.kamaboko.dto.MCategoryDTO;
import com.internousdev.kamaboko.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseHistoryAction extends ActionSupport implements SessionAware {
	private String categoryId;
	private List<MCategoryDTO> mCategoryDtoList=new ArrayList<MCategoryDTO>();
	private Map<String,Object> session;
	public String execute() throws SQLException { //executeメソッドおよびエラーの設定

		PurchaseHistoryInfoDAO purchaseHistoryInfoDao= new PurchaseHistoryInfoDAO();
		List<PurchaseHistoryInfoDTO> purchaseHistoryDtoList=new ArrayList<PurchaseHistoryInfoDTO>();
		purchaseHistoryDtoList=purchaseHistoryInfoDao.getPurchaseHistoryList(String.valueOf(session.get("loginId")));
		Iterator<PurchaseHistoryInfoDTO> iterator=purchaseHistoryDtoList.iterator();

//		もし次の要素が無くなれば
		if(!(iterator.hasNext())){

//		purchaseHistoryDtoListにnullを格納
			purchaseHistoryDtoList=null;
		}
		session.put("purchaeseHistoryInfoDtoList", purchaseHistoryDtoList);

//		もしsession内にmCategoryListが存在しなければ
		if(!session.containsKey("mCategoryList")){
			MCategoryDAO mCategoryDao=new MCategoryDAO();
			mCategoryDtoList=mCategoryDao.getMCategoryList();
			session.put("mCategoryDtoList",mCategoryDtoList );
		}
		return SUCCESS;

	}
	public List<MCategoryDTO> getmCategoryDtoList() {
		return mCategoryDtoList;
	}


	public void setmCategoryDtoList(List<MCategoryDTO> mCategoryDtoList) {
		this.mCategoryDtoList = mCategoryDtoList;
	}


	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
