package com.community.rest.repository;

import com.community.rest.domain.User;

import com.community.rest.domain.projection.CustomizedRestMvcConfiguration;
import com.community.rest.domain.projection.UserOnlyContainName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// @RepositoryRestResource(excerptProjection = CustomizedRestMvcConfiguration.class)
// 위에가 될 줄 알았는데 안된다.. 그냥 혹시 몰라서 코드를 남긴다.
@RepositoryRestResource(excerptProjection = UserOnlyContainName.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
