package api.config;

import services.*;


public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    },
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
