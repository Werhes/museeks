package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12479e {
    public static final LinkedHashMap ad = new LinkedHashMap();

    public static final int ad(int i) {
        String str;
        switch (AbstractC8703e.m2467class(i)) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                switch (i) {
                    case 1:
                        str = "RLM_LOG_LEVEL_ALL";
                        break;
                    case 2:
                        str = "RLM_LOG_LEVEL_TRACE";
                        break;
                    case 3:
                        str = "RLM_LOG_LEVEL_DEBUG";
                        break;
                    case 4:
                        str = "RLM_LOG_LEVEL_DETAIL";
                        break;
                    case 5:
                        str = "RLM_LOG_LEVEL_INFO";
                        break;
                    case 6:
                        str = "RLM_LOG_LEVEL_WARNING";
                        break;
                    case 7:
                        str = "RLM_LOG_LEVEL_ERROR";
                        break;
                    case 8:
                        str = "RLM_LOG_LEVEL_FATAL";
                        break;
                    case 9:
                        str = "RLM_LOG_LEVEL_OFF";
                        break;
                    default:
                        str = "null";
                        break;
                }
                throw new IllegalArgumentException("Invalid core log level: ".concat(str));
        }
    }

    public static final C8506e vip(String str, InterfaceC16665e interfaceC16665e) {
        C8506e c8506e = new C8506e(str, interfaceC16665e);
        ad.put(String.valueOf(c8506e), c8506e);
        return c8506e;
    }
}
