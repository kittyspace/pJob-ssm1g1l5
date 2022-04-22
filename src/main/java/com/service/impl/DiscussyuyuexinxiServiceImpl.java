package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussyuyuexinxiDao;
import com.entity.DiscussyuyuexinxiEntity;
import com.service.DiscussyuyuexinxiService;
import com.entity.vo.DiscussyuyuexinxiVO;
import com.entity.view.DiscussyuyuexinxiView;

@Service("discussyuyuexinxiService")
public class DiscussyuyuexinxiServiceImpl extends ServiceImpl<DiscussyuyuexinxiDao, DiscussyuyuexinxiEntity> implements DiscussyuyuexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyuyuexinxiEntity> page = this.selectPage(
                new Query<DiscussyuyuexinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyuyuexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyuyuexinxiEntity> wrapper) {
		  Page<DiscussyuyuexinxiView> page =new Query<DiscussyuyuexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyuyuexinxiVO> selectListVO(Wrapper<DiscussyuyuexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyuyuexinxiVO selectVO(Wrapper<DiscussyuyuexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyuyuexinxiView> selectListView(Wrapper<DiscussyuyuexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyuyuexinxiView selectView(Wrapper<DiscussyuyuexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
