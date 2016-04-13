package fr.mgargadennec.blossom.core.common.constants.impl;
public interface BlossomSecurityConst {

  long SECURITY_GROUP_ROOT_ID = 8172650534474498799L;

  String SECURITY_RIGHT_PREFIX = "BO_RIGHT_";

  String SECURITY_GROUP_PREFIX = "BO_GROUP_";

  String SECURITY_DAO_SUFFIX = "_DAO_";

  String SECURITY_DAO_READ_SUFFIX = SECURITY_DAO_SUFFIX + "R";

  String SECURITY_DAO_WRITE_SUFFIX = SECURITY_DAO_SUFFIX + "W";

  String SECURITY_DAO_CREATE_SUFFIX = SECURITY_DAO_SUFFIX + "C";

  String SECURITY_DAO_DELETE_SUFFIX = SECURITY_DAO_SUFFIX + "D";

  String SECURITY_GENERIC_ENTITY = "GENERIC";

  String SECURITY_GENERIC_DAO_PREFIX = SECURITY_RIGHT_PREFIX + SECURITY_GENERIC_ENTITY + SECURITY_DAO_SUFFIX;

  String SECURITY_GENERIC_DAO_READ = SECURITY_GENERIC_DAO_PREFIX + "R";

  String SECURITY_GENERIC_DAO_WRITE = SECURITY_GENERIC_DAO_PREFIX + "W";

  String SECURITY_GENERIC_DAO_CREATE = SECURITY_GENERIC_DAO_PREFIX + "C";

  String SECURITY_GENERIC_DAO_DELETE = SECURITY_GENERIC_DAO_PREFIX + "D";

  String SECURITY_RUN_AS_PREFIX = "BO_RUN_AS_";

  String SECURITY_ROOT_AUTHORITY = "ROOT";

  String SECURITY_GROUP_ROOT_AUTHORITY = "GROUP_ROOT";

  String BO_HISTORY_RIGHT_NAME = "HISTORY";
}
