package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.meetingsManagement.domain.InviteStatus;
import eapli.base.meetingsManagement.domain.Meetings;
import eapli.base.meetingsManagement.repositories.MeetingsRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.Query;
import java.time.LocalTime;
import java.util.Calendar;

public class JpaMeetingsRepository extends JpaAutoTxRepository<Meetings, Long, Long> implements MeetingsRepository {
    public JpaMeetingsRepository ( final TransactionalContext autoTx) {
        super(autoTx, "id");
    }

    public JpaMeetingsRepository(final String puname) {
        super(puname, Application.settings().extendedPersistenceProperties(), "id");
    }


    @Override
    public Iterable<Meetings> cancelled() {
        final Query query = entityManager().createQuery("SELECT c FROM Meetings c WHERE c.cancelled = :TRUE",
                Meetings.class);
        query.setParameter("TRUE", true);
        return query.getResultList();

    }

    @Override
    public Iterable<Meetings> findByMyMeetingsCreatedAndOpened(SystemUser systemUser) {
        final Query query = entityManager().createQuery("SELECT r FROM Meetings r where r.cancelled =: status and r.systemUser =: systemUser", Meetings.class);
        query.setParameter("status", false);
        query.setParameter("systemUser", systemUser);

        return query.getResultList();
    }

    @Override
    public Iterable<Meetings> findByMyMeetings(SystemUser systemUser) {
        //final Query query = entityManager().createQuery("SELECT r FROM Meetings r join r.invite i WHERE i.systemUser.id =: systemUser or r.systemUser =: systemUser and r.cancelled =: status", Meetings.class);
        final Query query = entityManager().createQuery("SELECT m FROM Meetings m WHERE m.cancelled =:status and m.systemUser = :systemUser OR :systemUser IN (SELECT i.systemUser FROM m.invite i)", Meetings.class);
        query.setParameter("status", false);
        query.setParameter("systemUser", systemUser);

        return query.getResultList();
    }

    @Override
    public Iterable<Meetings> findByMyMeetingsAndOpened(SystemUser systemUser) {
        //final Query query1 = entityManager().createQuery("SELECT m FROM Meetings m join m.invite i WHERE i.systemUser.id =: systemUser", Meetings.class);
        final Query query1 = entityManager().createQuery("SELECT m FROM Meetings m join m.invite i WHERE i.systemUser.id =: systemUser AND m.cancelled =: status", Meetings.class);
        //final Query query = entityManager().createQuery("SELECT r FROM Meetings r where r.cancelled =: status and r.systemUser =: systemUser and r.invite.systemUser =: systemUsers", Meetings.class);
        //query1.setParameter("status", false);
        query1.setParameter("systemUser", systemUser.identity());
        query1.setParameter("status", false);
        //query1.setParameter("systemUsers", systemUser);
        return query1.getResultList();
    }

    @Override
    public Iterable<Meetings> findByMyMeetingsPending(SystemUser systemUser) {
        //final Query query1 = entityManager().createQuery("SELECT m FROM Meetings m join m.invite i WHERE i.systemUser.id =: systemUser", Meetings.class);
        final Query query1 = entityManager().createQuery("SELECT m FROM Meetings m join m.invite i WHERE i.systemUser.id =: systemUser and i.inviteStatus =: inviteStatus AND m.cancelled =: status", Meetings.class);
        //final Query query = entityManager().createQuery("SELECT r FROM Meetings r where r.cancelled =: status and r.systemUser =: systemUser and r.invite.systemUser =: systemUsers", Meetings.class);
        //query1.setParameter("status", false);
        query1.setParameter("systemUser", systemUser.identity());
        query1.setParameter("status", false);
        query1.setParameter("inviteStatus", InviteStatus.PENDING);
        //query1.setParameter("systemUsers", systemUser);
        return query1.getResultList();
    }

    @Override
    public Iterable<Meetings> findByMyMeetingsPendingHours(SystemUser systemUser, Calendar date, LocalTime startTime,LocalTime endTime) {
        //final Query query1 = entityManager().createQuery("SELECT m FROM Meetings m join m.invite i WHERE i.systemUser.id =: systemUser", Meetings.class);
        //((c.startingTime <= :ENDTIME AND c.endingTime > :STARTTIME) OR (c.startingTime < :ENDTIME AND c.endingTime >= :STARTTIME))
        final Query query1 = entityManager().createQuery("SELECT m FROM Meetings m join m.invite i WHERE i.systemUser.id =: systemUser and i.inviteStatus =: inviteStatus AND m.cancelled =: status AND m.date =:date and (m.startTime < :endTime AND m.endTime > :startTime)", Meetings.class);
        //final Query query = entityManager().createQuery("SELECT r FROM Meetings r where r.cancelled =: status and r.systemUser =: systemUser and r.invite.systemUser =: systemUsers", Meetings.class);
        //query1.setParameter("status", false);
        query1.setParameter("systemUser", systemUser.identity());
        query1.setParameter("status", false);
        query1.setParameter("inviteStatus", InviteStatus.PENDING);
        query1.setParameter("date", date);
        query1.setParameter("startTime", startTime);
        query1.setParameter("endTime", endTime);
        //query1.setParameter("systemUsers", systemUser);
        return query1.getResultList();
    }


}
