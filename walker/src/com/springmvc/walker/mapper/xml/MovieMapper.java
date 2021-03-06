package com.springmvc.walker.mapper.xml;

import java.util.List;
import java.util.Map;

import com.springmvc.walker.xml.entity.MovieEntity;

public interface MovieMapper {

	public boolean insertMovie(MovieEntity movie);
	
	public boolean updateMovie(MovieEntity movie);
	
	public boolean updateStatusById(Map<String, Object> paraMap);
	
	public boolean deleteMovie(String MOVIE_ID);
	
	public MovieEntity getMovieById(String MOVIE_ID);
	
	public MovieEntity getMovieByOriginalId(String ORIGINAL_ID);
	
	public List<MovieEntity> getMoviesByProgramId(String PROGRAM_ID);
}
