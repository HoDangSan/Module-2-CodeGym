package com.dangsan.blog.repository.impl;

import com.dangsan.blog.model.Posts;
import com.dangsan.blog.repository.PostsRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class PostsRepositoryImpl implements PostsRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Posts> findAll(){
        TypedQuery<Posts> query = em.createQuery("select p from Posts p", Posts.class);
        return query.getResultList();
    }

    @Override
    public Posts findById(Long id) {
        TypedQuery<Posts> query = em.createQuery("select p from Posts p where  p.id=:id", Posts.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(Posts model) {
        if(model.getId() != null){
            em.merge(model);
        } else {
            em.persist(model);
        }
    }

    @Override
    public void remove(Long id) {
        Posts posts = findById(id);
        if(posts != null){
            em.remove(posts);
        }
    }
}
