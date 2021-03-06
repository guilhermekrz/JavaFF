
(define (problem roverprob2312)
        (:domain rover)
        (:objects general - lander colour - mode high_res - mode low_res - mode
         rover0 - rover rover1 - rover rover0store - store rover1store - store
         waypoint0 - waypoint waypoint1 - waypoint waypoint2 - waypoint
         waypoint3 - waypoint waypoint4 - waypoint waypoint5 - waypoint camera0
         - camera camera1 - camera camera2 - camera objective0 - objective
         objective1 - objective)
        (:init (visible waypoint0 waypoint3) (visible waypoint3 waypoint0)
         (visible waypoint1 waypoint0) (visible waypoint0 waypoint1)
         (visible waypoint1 waypoint4) (visible waypoint4 waypoint1)
         (visible waypoint2 waypoint0) (visible waypoint0 waypoint2)
         (visible waypoint2 waypoint3) (visible waypoint3 waypoint2)
         (visible waypoint3 waypoint1) (visible waypoint1 waypoint3)
         (visible waypoint3 waypoint5) (visible waypoint5 waypoint3)
         (visible waypoint4 waypoint3) (visible waypoint3 waypoint4)
         (visible waypoint5 waypoint0) (visible waypoint0 waypoint5)
         (visible waypoint5 waypoint2) (visible waypoint2 waypoint5)
         (visible waypoint5 waypoint4) (visible waypoint4 waypoint5)
         (at_rock_sample waypoint0) (at_soil_sample waypoint1)
         (at_soil_sample waypoint2) (at_rock_sample waypoint2)
         (at_soil_sample waypoint3) (at_rock_sample waypoint3)
         (at_soil_sample waypoint4) (at_soil_sample waypoint5)
         (at_rock_sample waypoint5) (at_lander general waypoint3)
         (channel_free general) (at rover0 waypoint1) (available rover0)
         (store_of rover0store rover0) (empty rover0store)
         (equipped_for_rock_analysis rover0) (equipped_for_imaging rover0)
         (can_traverse rover0 waypoint1 waypoint0)
         (can_traverse rover0 waypoint0 waypoint1)
         (can_traverse rover0 waypoint1 waypoint4)
         (can_traverse rover0 waypoint4 waypoint1)
         (can_traverse rover0 waypoint0 waypoint2)
         (can_traverse rover0 waypoint2 waypoint0)
         (can_traverse rover0 waypoint0 waypoint3)
         (can_traverse rover0 waypoint3 waypoint0)
         (can_traverse rover0 waypoint0 waypoint5)
         (can_traverse rover0 waypoint5 waypoint0) (at rover1 waypoint4)
         (available rover1) (store_of rover1store rover1) (empty rover1store)
         (equipped_for_soil_analysis rover1) (equipped_for_imaging rover1)
         (can_traverse rover1 waypoint4 waypoint1)
         (can_traverse rover1 waypoint1 waypoint4)
         (can_traverse rover1 waypoint4 waypoint3)
         (can_traverse rover1 waypoint3 waypoint4)
         (can_traverse rover1 waypoint4 waypoint5)
         (can_traverse rover1 waypoint5 waypoint4)
         (can_traverse rover1 waypoint1 waypoint0)
         (can_traverse rover1 waypoint0 waypoint1)
         (can_traverse rover1 waypoint5 waypoint2)
         (can_traverse rover1 waypoint2 waypoint5) (on_board camera0 rover0)
         (calibration_target camera0 objective0) (supports camera0 colour)
         (supports camera0 low_res) (on_board camera1 rover0)
         (calibration_target camera1 objective1) (supports camera1 colour)
         (supports camera1 low_res) (on_board camera2 rover1)
         (calibration_target camera2 objective0) (supports camera2 colour)
         (supports camera2 high_res) (visible_from objective0 waypoint0)
         (visible_from objective0 waypoint1)
         (visible_from objective0 waypoint2)
         (visible_from objective0 waypoint3)
         (visible_from objective0 waypoint4)
         (visible_from objective0 waypoint5)
         (visible_from objective1 waypoint0)
         (visible_from objective1 waypoint1))
        (:goal
         (and (communicated_soil_data waypoint5)
              (communicated_soil_data waypoint1)
              (communicated_soil_data waypoint4)
              (communicated_soil_data waypoint2)
              (communicated_rock_data waypoint0)
              (communicated_rock_data waypoint2)
              (communicated_rock_data waypoint3)
              (communicated_image_data objective0 colour)
              (communicated_image_data objective1 low_res)
              (communicated_image_data objective0 low_res)))
        (:constraints
         (and (preference e0 (sometime (full rover1store)))
              (preference e1 (sometime (full rover0store)))
              (preference e2 (sometime (calibrated camera2 rover1)))
              (preference e3 (sometime (have_image rover1 objective0 colour)))
              (preference e4 (sometime (have_image rover0 objective0 colour)))
              (preference o0 (at-most-once (at rover1 waypoint5)))
              (preference o1 (at-most-once (at rover1 waypoint4)))
              (preference o2 (at-most-once (at rover0 waypoint1)))
              (preference o3 (at-most-once (empty rover0store)))
              (preference o4 (at-most-once (calibrated camera1 rover0)))
              (preference o5 (at-most-once (calibrated camera0 rover0)))
              (preference sb1
               (sometime-before (at rover1 waypoint5) (at rover1 waypoint1)))
              (preference sb69
               (sometime-before (at rover0 waypoint0)
                (have_image rover0 objective1 low_res)))
              (preference sb90
               (sometime-before (at rover0 waypoint2) (full rover1store)))
              (preference sb129
               (sometime-before (have_soil_analysis rover1 waypoint4)
                (full rover1store)))
              (preference sb155
               (sometime-before (have_soil_analysis rover1 waypoint2)
                (have_rock_analysis rover0 waypoint0)))
              (preference sb170
               (sometime-before (have_soil_analysis rover1 waypoint1)
                (full rover0store)))
              (preference sb190
               (sometime-before (have_rock_analysis rover0 waypoint3)
                (calibrated camera2 rover1)))
              (preference sb193
               (sometime-before (have_rock_analysis rover0 waypoint3)
                (have_image rover1 objective0 colour)))
              (preference sb222
               (sometime-before (have_rock_analysis rover0 waypoint0)
                (have_soil_analysis rover1 waypoint1)))
              (preference sb250
               (sometime-before (have_image rover0 objective1 low_res)
                (full rover1store)))
              (preference sb252
               (sometime-before (have_image rover0 objective1 low_res)
                (have_soil_analysis rover1 waypoint1)))))
        (:metric minimize
         (+ (* (is-violated sb252) 10.2344)
            (* (is-violated sb250) 8.78388)
            (* (is-violated sb222) 8.78388)
            (* (is-violated sb193) 8.78388)
            (* (is-violated sb190) 8.78388)
            (* (is-violated sb170) 11.0403)
            (* (is-violated sb155) 9.42857)
            (* (is-violated sb129) 8.78388)
            (* (is-violated sb90) 8.78388)
            (* (is-violated sb69) 8.78388)
            (* (is-violated sb1) 8.78388)
            (* (is-violated o5) 10.2344)
            (* (is-violated o4) 9.42857)
            (* (is-violated o3) 8.78388)
            (* (is-violated o2) 8.78388)
            (* (is-violated o1) 11.0403)
            (* (is-violated o0) 8.78388)
            (* (is-violated e4) 8.78388)
            (* (is-violated e3) 8.78388)
            (* (is-violated e2) 8.78388)
            (* (is-violated e1) 8.78388)
            (* (is-violated e0) 8.78388)
	)))
