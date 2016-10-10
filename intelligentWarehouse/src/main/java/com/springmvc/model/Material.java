package com.springmvc.model;

import org.springframework.stereotype.Component;

@Component
public class Material {
		
//	private String create_date;    //创建时间	
//	private String modi_date;      //修改时间
//	private float flag;            //标识
//	private String mb001;          //品号
//	private String mb002;          //品名
//	private String mb003;          //规格
//	private String mb004;          //库存单位
//	private String mb005;          //品号分类
//	private int mb064;             //库存数量
//	private String mb080;          //货号
//	private String mb081;          //
	
	private String create_date;  //创建时间
	private String th004;        //品号
	private String th005;        //品名
	private String th006;        //规格
	private String th007;        //仓库
	private int th008;           //数量
	private String th009;        //单位
	private String th012;        //单价
	private String th013;        //金额
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getTh004() {
		return th004;
	}
	public void setTh004(String th004) {
		this.th004 = th004;
	}
	public String getTh005() {
		return th005;
	}
	public void setTh005(String th005) {
		this.th005 = th005;
	}
	public String getTh006() {
		return th006;
	}
	public void setTh006(String th006) {
		this.th006 = th006;
	}
	public String getTh007() {
		return th007;
	}
	public void setTh007(String th007) {
		this.th007 = th007;
	}
	public int getTh008() {
		return th008;
	}
	public void setTh008(int th008) {
		this.th008 = th008;
	}
	public String getTh009() {
		return th009;
	}
	public void setTh009(String th009) {
		this.th009 = th009;
	}
	public String getTh012() {
		return th012;
	}
	public void setTh012(String th012) {
		this.th012 = th012;
	}
	public String getTh013() {
		return th013;
	}
	public void setTh013(String th013) {
		this.th013 = th013;
	}
	@Override
	public String toString() {
		return "Material [create_date=" + create_date + ", th004=" + th004 + ", th005=" + th005 + ", th006=" + th006
				+ ", th007=" + th007 + ", th008=" + th008 + ", th009=" + th009 + ", th012=" + th012 + ", th013=" + th013
				+ "]";
	}

	
	
	
	
	
	
	
	
	

	
	

}
