package com.flipfit.dao;

import java.time.LocalTime;

import com.flipfit.bean.GymCenter;
import com.flipfit.bean.GymSlot;
import com.flipfit.helper.DataStore;

public class GymCentreDAO {

	public GymSlot getSlotByTime(String centreId, LocalTime startTime, LocalTime endTime) {
		GymCenter center = DataStore.getCenter(centreId);
		if (center == null) {
			return null;
		}
		return center.getCenterSlot().stream()
				.filter(slot -> slot.getStartTime().equals(startTime) && slot.getEndTime().equals(endTime)).findFirst()
				.orElse(null);
	}
}

/**
 * 
 */
package com.flipfit.dao;

/**
 * 
 */


import com.flipfit.bean.GymCenter;
import com.flipfit.bean.GymSlot;
import java.time.LocalTime;
import java.util.List;

public interface GymCentreDAO {
    // Persists new gym center information 
    void save(GymCenter centre);
    
    // Returns gyms in a specific city for the Customer Service 
    List<GymCenter> findByCity(String city);
    
    // Resolves the specific GymSlot based on user-requested times
    GymSlot getSlotByTime(String centreId, LocalTime startTime, LocalTime endTime);
}
