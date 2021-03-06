package com.crosstown.farruco.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.crosstown.farruco.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}