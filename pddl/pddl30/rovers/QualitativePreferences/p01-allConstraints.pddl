
(define (problem roverprob1234)
        (:domain rover)
        (:objects general - lander colour - mode high_res - mode low_res - mode
         rover0 - rover rover0store - store waypoint0 - waypoint waypoint1 -
         waypoint waypoint2 - waypoint waypoint3 - waypoint camera0 - camera
         objective0 - objective objective1 - objective)
        (:init (visible waypoint1 waypoint0) (visible waypoint0 waypoint1)
         (visible waypoint2 waypoint0) (visible waypoint0 waypoint2)
         (visible waypoint2 waypoint1) (visible waypoint1 waypoint2)
         (visible waypoint3 waypoint0) (visible waypoint0 waypoint3)
         (visible waypoint3 waypoint1) (visible waypoint1 waypoint3)
         (visible waypoint3 waypoint2) (visible waypoint2 waypoint3)
         (at_soil_sample waypoint0) (at_rock_sample waypoint1)
         (at_soil_sample waypoint2) (at_rock_sample waypoint2)
         (at_soil_sample waypoint3) (at_rock_sample waypoint3)
         (at_lander general waypoint0) (channel_free general)
         (at rover0 waypoint3) (available rover0) (store_of rover0store rover0)
         (empty rover0store) (equipped_for_soil_analysis rover0)
         (equipped_for_rock_analysis rover0) (equipped_for_imaging rover0)
         (can_traverse rover0 waypoint3 waypoint0)
         (can_traverse rover0 waypoint0 waypoint3)
         (can_traverse rover0 waypoint3 waypoint1)
         (can_traverse rover0 waypoint1 waypoint3)
         (can_traverse rover0 waypoint1 waypoint2)
         (can_traverse rover0 waypoint2 waypoint1) (on_board camera0 rover0)
         (calibration_target camera0 objective1) (supports camera0 colour)
         (supports camera0 high_res) (visible_from objective0 waypoint0)
         (visible_from objective0 waypoint1)
         (visible_from objective0 waypoint2)
         (visible_from objective0 waypoint3)
         (visible_from objective1 waypoint0)
         (visible_from objective1 waypoint1)
         (visible_from objective1 waypoint2)
         (visible_from objective1 waypoint3))
        (:goal
         (and (communicated_soil_data waypoint2)
              (communicated_rock_data waypoint3)
              (communicated_image_data objective1 high_res)))
        (:constraints
         (and
                (preference atEnd1 (at end (have_image rover0 objective1 high_res)))
                (preference always1 (always (have_image rover0 objective1 high_res)))
                (preference sometime1 (sometime (have_image rover0 objective1 high_res)))
                (preference within1 (within 1 (have_image rover0 objective1 high_res)))
                (preference at-most-once1 (at-most-once (have_image rover0 objective1 high_res)))
                (preference sometime-after1 (sometime-after (have_image rover0 objective1 high_res) (have_image rover0 objective1 high_res)))
                (preference sometime-before1 (sometime-before (have_image rover0 objective1 high_res) (have_image rover0 objective1 high_res)))
                (preference always-within1 (always-within 19 (have_image rover0 objective1 high_res) (have_image rover0 objective1 high_res)))
                (preference hold-during1 (hold-during 19 1 (have_image rover0 objective1 high_res)))
                (preference hold-after1 (hold-after 17 (have_image rover0 objective1 high_res)))
          )
         )
)
