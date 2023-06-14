package co.com.asset.dao.notification;

import org.springframework.data.repository.CrudRepository;

import co.com.asset.model.entity.notification.NotificationType;

public interface NotificationTypeRepository extends CrudRepository<NotificationType, Integer> {

}
