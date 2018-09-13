/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.DetailedGroupInfo;
import io.swagger.client.model.GroupUsersInfo;
import io.swagger.client.model.GroupsInfo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
@Ignore
public class GroupsApiTest {

    private final GroupsApi api = new GroupsApi();

    
    /**
     * Retrieves detailed information about the group.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupDetailsTest() throws ApiException {
        String authorization = null;
        String groupId = null;
        String xApiUser = null;
        DetailedGroupInfo response = api.getGroupDetails(authorization, groupId, xApiUser);

        // TODO: test validations
    }
    
    /**
     * Retrieves all the groups in an account.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupsTest() throws ApiException {
        String authorization = null;
        String xApiUser = null;
        String cursor = null;
        Integer pageSize = null;
        GroupsInfo response = api.getGroups(authorization, xApiUser, cursor, pageSize);

        // TODO: test validations
    }
    
    /**
     * Retrieves all the users in a group.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersInGroupTest() throws ApiException {
        String authorization = null;
        String groupId = null;
        String xApiUser = null;
        String cursor = null;
        Integer pageSize = null;
        GroupUsersInfo response = api.getUsersInGroup(authorization, groupId, xApiUser, cursor, pageSize);

        // TODO: test validations
    }
    
}
