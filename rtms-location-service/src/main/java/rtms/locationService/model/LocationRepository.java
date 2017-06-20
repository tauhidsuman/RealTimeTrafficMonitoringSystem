/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package rtms.locationService.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

//http://localhost:8080/locations?page=1&size=1
public interface LocationRepository extends PagingAndSortingRepository<Location, Long> {

    //    http://localhost:8080/locations/search/findByServiceType{?type,page,size,sort}
    @RestResource(rel = "by-service-type")
    Page<Location> findByServiceType(@Param("type") String type, Pageable pageable);

    //    http://localhost:8080/locations/search/vin{?vin,page,size,sort}
    //    http://localhost:8080/locations/search/vin?vin=07e8db69-99f2-4fe2-b65a-52fbbdf8c32c
    @RestResource(path = "vin", rel = "by-vin")
    Page<Location> findByUnitInfoUnitVin(@Param("vin") String vin, Pageable pageable);

}
