package sa.activities.service;

import sa.activities.model.Activity;
import sa.activities.model.Comment;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.xml.registry.infomodel.User;
import java.util.List;

@Stateless
public class ActivityService {
    @PersistenceContext
    EntityManager entityManager;

    public List<Activity> getAllActivities(int first, int maxResult){
        return entityManager.createNamedQuery(Activity.FIND_ALL)
                .setFirstResult(first).setMaxResults(maxResult).getResultList();
    }

    public Activity getActivityById(int id){
        return entityManager.find(Activity.class, id);
    }

    public void createActivity(Activity activity) {
        entityManager.persist(activity);
    }

    public Activity updateActivity(int id, Activity activity) {
        Activity activityToUpdate = entityManager.find(Activity.class, id);
        activityToUpdate.setAdministrador(activity.getAdministrador());
        activityToUpdate.setBanner(activity.getBanner());
        activityToUpdate.setCategoria(activity.getCategoria());
        activityToUpdate.setDescripcion(activity.getDescripcion());
        activityToUpdate.setFecha(activity.getFecha());
        activityToUpdate.setHora(activity.getHora());
        activityToUpdate.setInformacion(activity.getInformacion());
        activityToUpdate.setLista_miembros(activity.getLista_miembros());
        activityToUpdate.setLugar(activity.getLugar());
        activityToUpdate.setNombre(activity.getNombre());
        activityToUpdate.setNotas_adicionales(activity.getNotas_adicionales());
        activityToUpdate.setRecurrente(activity.isRecurrente());
        activityToUpdate.setTags_especificos(activity.getTags_especificos());
        return entityManager.merge(activityToUpdate);
    }
    public Activity updateAdministrator(String administrator, int id, Activity activity) {
        Activity activityToUpdate = entityManager.find(Activity.class, id);

        if(activityToUpdate.getAdministrador().equals( administrator )){
            activityToUpdate.setAdministrador(activity.getAdministrador());
            activityToUpdate.setBanner(activity.getBanner());
            activityToUpdate.setCategoria(activity.getCategoria());
            activityToUpdate.setDescripcion(activity.getDescripcion());
            activityToUpdate.setFecha(activity.getFecha());
            activityToUpdate.setHora(activity.getHora());
            activityToUpdate.setInformacion(activity.getInformacion());
            activityToUpdate.setLista_miembros(activity.getLista_miembros());
            activityToUpdate.setLugar(activity.getLugar());
            activityToUpdate.setNombre(activity.getNombre());
            activityToUpdate.setNotas_adicionales(activity.getNotas_adicionales());
            activityToUpdate.setRecurrente(activity.isRecurrente());
            activityToUpdate.setTags_especificos(activity.getTags_especificos());
            return entityManager.merge(activityToUpdate);
        }else{
            return null;
        }
    }
    public void deleteActivity(int id) {
        Activity activityToDelete = entityManager.find(Activity.class, id);
        entityManager.remove(activityToDelete);
    }
    public  void addComment(int id, Comment comment){
        Activity activityToUpdate = entityManager.find(Activity.class, id);
        activityToUpdate.getComments().add(comment);
    }
}
