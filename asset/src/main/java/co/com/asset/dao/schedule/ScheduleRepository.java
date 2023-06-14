package co.com.asset.dao.schedule;

import org.springframework.data.repository.CrudRepository;

import co.com.asset.model.entity.schedule.Schedule;

public interface ScheduleRepository extends CrudRepository<Schedule, Long> {

}
