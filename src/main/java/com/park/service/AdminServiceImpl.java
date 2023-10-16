package com.park.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.park.domain.CategoryVO;
import com.park.domain.GoodsVO;
import com.park.persistence.AdminDAO;

@Service
public class AdminServiceImpl implements AdminService {

	@Inject
	private AdminDAO dao;

	// 카테고리
	@Override
	public List<CategoryVO> category() throws Exception {
		return dao.category();
	}

	// 상품등록
	@Override
	public void register(GoodsVO vo) throws Exception {
		dao.register(vo);		
	}
} 