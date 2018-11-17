package com.zdmoney.credit.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.constant.system.SequencesEnum;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.system.dao.pub.IAccessLogDao;
import com.zdmoney.credit.system.domain.AccessLog;
import com.zdmoney.credit.system.service.pub.IAccessLogService;
import com.zdmoney.credit.system.service.pub.ISequencesService;

@Service
public class AccessLogServiceImpl implements IAccessLogService {

    @Autowired
    private IAccessLogDao accessLogDao;

    @Autowired
    private ISequencesService sequencesService;

    public AccessLog insert(AccessLog accessLog) {
        if (Strings.isEmpty(accessLog.getId())) {
            Long seqId = sequencesService.getSequences(SequencesEnum.ACCESS_LOG);
            accessLog.setId(seqId);
        }
        accessLogDao.insert(accessLog);
        return accessLog;
    }
}
