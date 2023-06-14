package co.com.asset.dao.notification;

import org.springframework.data.repository.CrudRepository;

import co.com.asset.model.entity.notification.Notification;

public interface NotificationRepository extends CrudRepository<Notification, Long> {

}
