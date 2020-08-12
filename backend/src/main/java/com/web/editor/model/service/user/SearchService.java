package com.web.editor.model.service.user;

import java.util.List;

import com.web.editor.model.dto.user.Portfolio;
import com.web.editor.model.dto.user.PortfolioList;
import com.web.editor.model.dto.user.SearchPageBean;

public interface SearchService {

	// public List<Portfolio> searchAll(int currentPage, int sizePerPage, SearchPageBean bean);
	public List<PortfolioList> searchAll();
	
	public Portfolio search(int no);

	public List<PortfolioList> searchRecommend();
	
}
