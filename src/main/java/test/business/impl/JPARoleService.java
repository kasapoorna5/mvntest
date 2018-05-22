package test.business.impl;

import org.springframework.stereotype.Service;

import test.business.RoleService;
import test.business.model.Role;

@Service
public class JPARoleService extends JPACRUDService<Long, Role> implements RoleService {

}
