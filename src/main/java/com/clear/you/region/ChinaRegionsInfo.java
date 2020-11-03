package com.clear.you.region;

/**
 * @author zk
 * @date 2020/10/15 10:36
 */
public class ChinaRegionsInfo {

  //行政区域代码
  private String code;

  //行政区域名称
  private String name;

  //行政区域类型，1:省份，2：城市，3：区或者县城
  private Integer type;

  //上一级行政区域编码
  private String parentCode;


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getParentCode() {
    return parentCode;
  }

  public void setParentCode(String parentCode) {
    this.parentCode = parentCode;
  }
}
