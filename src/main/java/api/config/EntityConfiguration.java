package api.config;

import services.*;


public enum EntityConfiguration {

    MYUSER{
        @Override
        public Class<?> getEntityService() {
            return MyUserService.class;
        }
    },
    TOKEN {
        @Override
        public Class<?> getEntityService() {
            return CreateTokenService.class;
        }
    }

    ;

    public abstract Class<?> getEntityService();
}
