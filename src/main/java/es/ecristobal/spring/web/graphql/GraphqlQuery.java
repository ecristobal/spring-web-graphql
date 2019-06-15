/*******************************************************************************
 * Copyright (c) 2019 Sagittec. All rights reserved.
 *******************************************************************************/
package es.ecristobal.spring.web.graphql;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.stereotype.Service;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Service
/**
 * Annotation that should be added to any class defining queries that should be published on a GraphQL schema.
 *
 * @author Esteban Cristóbal
 */
public @interface GraphqlQuery {
}
