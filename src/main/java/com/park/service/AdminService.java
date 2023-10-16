package com.park.service;

import java.util.List;

import com.park.domain.CategoryVO;
import com.park.domain.GoodsVO;

public interface AdminService {

	// 카테고리
	public List<CategoryVO> category() throws Exception;
	
	// 상품등록
	public void register(GoodsVO vo) throws Exception;
		
}