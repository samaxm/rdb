package online.decentworld.rdb.mapper;

import online.decentworld.rdb.entity.AppVersion;

public interface AppVersionMapper {
    AppVersion selectByAppType(String appType);

}