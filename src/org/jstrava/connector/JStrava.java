package org.jstrava.connector;

import org.jstrava.entities.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by roberto on 12/26/13.
 */
public interface JStrava {



    public Athlete getCurrentAthlete();
    public Athlete findAthlete(Integer id);
    /*Update Current Athlete Missing*/
    public List<SegmentEffort> findAthleteKOMs(Integer athleteId);
    public List<SegmentEffort> findAthleteKOMs(Integer athleteId,Integer page, Integer per_page);
    public List<Athlete> getCurrentAthleteFriends();
    public List<Athlete> findAthleteFriends(Integer id);
    public List<Athlete> findAthleteFriends(Integer id, Integer page, Integer per_page);
    public List<Athlete> getCurrentAthleteFollowers();
    public List<Athlete> findAthleteFollowers(Integer id);
    public List<Athlete> findAthleteFollowers(Integer id, Integer page, Integer per_page);
    public List<Athlete> findAthleteBothFollowing(Integer id);
    public List<Athlete> findAthleteBothFollowing(Integer id, Integer page, Integer per_page);
    public Activity findActivity(Integer id);
    public Activity findActivity(Integer id,boolean include_all_efforts);
    public List<Activity> getCurrentAthleteActivities();
    public List<Activity> getCurrentAthleteActivities( Integer page, Integer per_page);
    public List<Activity> getCurrentAthleteActivitiesBeforeDate( Long before);
    public List<Activity> getCurrentAthleteActivitiesAfterDate( Long after);


    public List<Athlete> findActivityKudos(Integer activityId);
    public List<Athlete> findActivityKudos(Integer activityId,Integer page, Integer per_page);

    public List<Comment> findActivityComments(Integer activityId);
    public Gear findGear(String id);
    public Club findClub(Integer id);
    public List<Athlete> findClubMembers(Integer clubId);
    public List<Activity> findClubActivities(Integer clubId);
    public List<LapEffort> findActivityLaps(Integer activityId);
    public SegmentEffort findSegmentEffort(Integer id);
    public Segment findSegment(Long segmentId);
    public List<Segment>findSegments(Bound bound);
    public List<Segment>findSegments(Bound bound,String activityType,String minCat,String maxCat);

    public List<Photo>findActivityPhotos(Integer activityId);
    public SegmentLeaderBoard findSegmentLeaderBoard (Long segmentId);
    public SegmentLeaderBoard findSegmentLeaderBoard (Long segmentId, HashMap optionalParameters);
}
