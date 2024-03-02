package com.buffalo.repo;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.buffalo.entity.SampleDescription;

public interface BuffaloSampleDesRepoPagingAndSorting extends PagingAndSortingRepository<SampleDescription, String>{
	

}
