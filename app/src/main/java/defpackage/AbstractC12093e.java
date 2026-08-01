package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۥؘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12093e {
    public static final Method ad;

    static {
        Method method = null;
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                method = cls.getMethod("get", String.class, String.class);
                cls.getMethod("getInt", String.class, Integer.TYPE);
                cls.getMethod("getLong", String.class, Long.TYPE);
                cls.getMethod("getBoolean", String.class, Boolean.TYPE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            ad = method;
        }
    }
}
