package cn.jbone.cms.core.dao.repository;

import cn.jbone.cms.core.dao.entity.Settings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingsRepository extends JpaRepository<Settings,Long>, JpaSpecificationExecutor<Settings> {
    Settings findBySettingKey(String key);
}
