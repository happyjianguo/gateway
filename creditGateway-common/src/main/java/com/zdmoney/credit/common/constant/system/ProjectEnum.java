package com.zdmoney.credit.common.constant.system;

import com.zdmoney.credit.common.util.Strings;

/**
 * 网关接入 项目的枚举
 * @author 00236640
 *
 */
public enum ProjectEnum {
    
	BSB("bsb", "包银业务系统","comm"),
    ABS("abs", "数信业务系统","params"),
    WM3("wm3", "外贸3业务系统","params"),
    LUFAX("lufax", "陆金所业务系统","params"),
    APS("aps", "证大征审系统","params"),
    XDCORE("xdcore", "证大核心系统","params"),
    FDD("fdd","法大大电子签章系统","params"),
    XDSIGNATURE("xdsignature","核心电子签章","params"),
	PIC("pic", "图片系统","params");    
    /** 项目编号 **/
    private String projectNo;
    /** 项目名 **/
    private String projectName;
    /** 报文关键节点的key，和系统对应*/
    private String node;

    public static ProjectEnum get(String projectNo) {
        if (Strings.isEmpty(projectNo)) {
            return null;
        }
        for (ProjectEnum projectEnum : ProjectEnum.values()) {
            if (projectEnum.name().equals(projectNo)) {
                return projectEnum;
            }
        }
        return null;
    }
    
    public static ProjectEnum nodeOf(String node){
    	ProjectEnum project = null;
		if (node != null){
			for (ProjectEnum type : ProjectEnum.values()) {
				if (type.node.equalsIgnoreCase(node)){
					project = type;
				}
			}
		}
		return project;
	}

    ProjectEnum(String projectNo, String projectName,String node) {
        this.projectNo = projectNo;
        this.projectName = projectName;
        this.node = node;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}
    
}
