package cn.kane.travel.attachement.dao;

import java.util.List;

import cn.kane.travel.attachement.entity.Attachement;
import cn.kane.travel.common.dao.BaseDao;

public interface AttachementDao 
   extends BaseDao<Attachement>{

	List<Attachement> findObjects();
	/**根据摘要信息判定文件是否已经存在*/
	int findObjectByDisgest(String fileDisgest);
	
	Attachement findAttachementById(Integer id);
	
}
