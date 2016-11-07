package com.izhbg.typz.shop.goods.dto;import java.util.Date;import javax.persistence.Column;import javax.persistence.Entity;import javax.persistence.Id;import javax.persistence.Table;import org.hibernate.annotations.GenericGenerator;/******************************************************************************* * javaBeans * t_sh_goods_price --> TShGoodsPrice  * <table explanation> * @author 2016-06-15 10:56:14 *  */	@Entity@Table(name = "t_sh_goods_price")public class TShGoodsPrice implements java.io.Serializable {	//field	/**  **/	@Id	@GenericGenerator(name = "paymentableGenerator", strategy = "assigned")   	private String id;	/**  **/	@Column(name = "goods_id" )	private String goodsId;	/**  **/	private Integer version;	/**  **/	@Column(name = "price_type" )	private Integer priceType;// 1:建议价格  	2：实际售价 	/**  **/	private Double price;	/**  **/	@Column(name = "del_status" )	private Integer delStatus;	/**  **/	@Column(name = "create_time" )	private Date createTime;	/**  **/	@Column(name = "create_user" )	private String createUser;	/**  **/	@Column(name = "update_time" )	private Date updateTime;	/**  **/	@Column(name = "update_user" )	private String updateUser;	private String percent;//推广者获取利润的比例  多个比例;分割	//method	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}		public String getGoodsId() {		return goodsId;	}	public void setGoodsId(String goodsId) {		this.goodsId = goodsId;	}	public Integer getVersion() {		return version;	}	public void setVersion(Integer version) {		this.version = version;	}		public Integer getPriceType() {		return priceType;	}	public void setPriceType(Integer priceType) {		this.priceType = priceType;	}	public Double getPrice() {		return price;	}	public void setPrice(Double price) {		this.price = price;	}		public Integer getDelStatus() {		return delStatus;	}	public void setDelStatus(Integer delStatus) {		this.delStatus = delStatus;	}		public Date getCreateTime() {		return createTime;	}	public void setCreateTime(Date createTime) {		this.createTime = createTime;	}		public String getCreateUser() {		return createUser;	}	public void setCreateUser(String createUser) {		this.createUser = createUser;	}		public Date getUpdateTime() {		return updateTime;	}	public void setUpdateTime(Date updateTime) {		this.updateTime = updateTime;	}		public String getUpdateUser() {		return updateUser;	}	public void setUpdateUser(String updateUser) {		this.updateUser = updateUser;	}		public String getPercent() {		return percent;	}	public void setPercent(String percent) {		this.percent = percent;	}	//override toString Method 	public String toString() {		StringBuffer sb=new StringBuffer();		sb.append("{");		sb.append("'id':'"+this.getId()+"',");		sb.append("'goodsId':'"+this.getGoodsId()+"',");		sb.append("'version':'"+this.getVersion()+"',");		sb.append("'priceType':'"+this.getPriceType()+"',");		sb.append("'price':'"+this.getPrice()+"',");		sb.append("'delStatus':'"+this.getDelStatus()+"',");		sb.append("'createTime':'"+this.getCreateTime()+"',");		sb.append("'createUser':'"+this.getCreateUser()+"',");		sb.append("'updateTime':'"+this.getUpdateTime()+"',");		sb.append("'updateUser':'"+this.getUpdateUser()+"'");		sb.append("}");		return sb.toString();	}}