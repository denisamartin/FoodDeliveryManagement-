package business;

public enum Role {
    ADMIN("ADMIN"),
    EMPLOYEE("EMPLOYEE"),
    CLIENT("CLIENT");

    private final String roleType;

    Role(String roleType) {
        this.roleType = roleType;
    }

    public static Role setRole(String roleType) {
        return switch (roleType) {
            case "ADMIN" -> Role.ADMIN;
            case "EMPLOYEE" -> Role.EMPLOYEE;
            case "CLIENT" -> Role.CLIENT;
            default -> null;
        };
    }

    public String getRoleType() {
        return roleType;
    }
}
