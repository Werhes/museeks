package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9259e {
    public static final Unsafe ad;
    public static final boolean appmetrica;
    public static final boolean billing;
    public static final boolean license;
    public static final AbstractC8415e metrica;
    public static final long purchase;
    public static final Class vip;

    static {
        Unsafe startapp = startapp();
        ad = startapp;
        vip = AbstractC2037e.ad;
        boolean yandex = yandex(Long.TYPE);
        boolean yandex2 = yandex(Integer.TYPE);
        AbstractC8415e abstractC8415e = null;
        if (startapp != null) {
            if (!AbstractC2037e.ad()) {
                abstractC8415e = new AbstractC8415e(startapp);
            } else if (yandex) {
                abstractC8415e = new C9385e(startapp, 1);
            } else if (yandex2) {
                abstractC8415e = new C9385e(startapp, 0);
            }
        }
        metrica = abstractC8415e;
        license = abstractC8415e == null ? false : abstractC8415e.subscription();
        appmetrica = abstractC8415e == null ? false : abstractC8415e.admob();
        purchase = appmetrica(byte[].class);
        appmetrica(boolean[].class);
        purchase(boolean[].class);
        appmetrica(int[].class);
        purchase(int[].class);
        appmetrica(long[].class);
        purchase(long[].class);
        appmetrica(float[].class);
        purchase(float[].class);
        appmetrica(double[].class);
        purchase(double[].class);
        appmetrica(Object[].class);
        purchase(Object[].class);
        Field billing2 = billing();
        if (billing2 != null && abstractC8415e != null) {
            abstractC8415e.startapp(billing2);
        }
        billing = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void ad(Throwable th) {
        Logger.getLogger(AbstractC9259e.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void adcel(byte[] bArr, long j, byte b) {
        metrica.mopub(bArr, purchase + j, b);
    }

    public static void advert(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        smaato(j2, obj, ((255 & b) << i) | (metrica.purchase(j2, obj) & (~(255 << i))));
    }

    public static void amazon(long j, long j2, Object obj) {
        metrica.loadAd(j, j2, obj);
    }

    public static int appmetrica(Class cls) {
        if (appmetrica) {
            return metrica.ad(cls);
        }
        return -1;
    }

    public static Field billing() {
        Field field;
        Field field2;
        if (AbstractC2037e.ad()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static Object license(Class cls) {
        try {
            return ad.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void loadAd(long j, Object obj, Object obj2) {
        metrica.Signature(j, obj, obj2);
    }

    public static boolean metrica(long j, Object obj) {
        return ((byte) ((metrica.purchase((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static void mopub(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int purchase2 = metrica.purchase(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        smaato(j2, obj, ((255 & b) << i) | (purchase2 & (~(255 << i))));
    }

    public static void purchase(Class cls) {
        if (appmetrica) {
            metrica.vip(cls);
        }
    }

    public static void smaato(long j, Object obj, int i) {
        metrica.amazon(j, obj, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe startapp() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean vip(long j, Object obj) {
        return ((byte) ((metrica.purchase((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean yandex(Class cls) {
        if (!AbstractC2037e.ad()) {
            return false;
        }
        try {
            Class cls2 = vip;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
