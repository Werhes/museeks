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
/* renamed from: eٍؗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5314e {
    public static final Unsafe ad;
    public static final boolean appmetrica;
    public static final boolean billing;
    public static final boolean license;
    public static final AbstractC17552e metrica;
    public static final long purchase;
    public static final Class vip;

    static {
        Unsafe adcel = adcel();
        ad = adcel;
        vip = AbstractC16549e.ad;
        boolean purchase2 = purchase(Long.TYPE);
        boolean purchase3 = purchase(Integer.TYPE);
        AbstractC17552e abstractC17552e = null;
        if (adcel != null) {
            if (!AbstractC16549e.ad()) {
                abstractC17552e = new AbstractC17552e(adcel);
            } else if (purchase2) {
                abstractC17552e = new C13525e(adcel, 1);
            } else if (purchase3) {
                abstractC17552e = new C13525e(adcel, 0);
            }
        }
        metrica = abstractC17552e;
        license = abstractC17552e == null ? false : abstractC17552e.remoteconfig();
        appmetrica = abstractC17552e == null ? false : abstractC17552e.subscription();
        purchase = metrica(byte[].class);
        metrica(boolean[].class);
        license(boolean[].class);
        metrica(int[].class);
        license(int[].class);
        metrica(long[].class);
        license(long[].class);
        metrica(float[].class);
        license(float[].class);
        metrica(double[].class);
        license(double[].class);
        metrica(Object[].class);
        license(Object[].class);
        Field appmetrica2 = appmetrica();
        if (appmetrica2 != null && abstractC17552e != null) {
            abstractC17552e.adcel(appmetrica2);
        }
        billing = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void Signature(long j, Object obj, Object obj2) {
        metrica.admob(j, obj, obj2);
    }

    public static void ad(Throwable th) {
        Logger.getLogger(AbstractC5314e.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe adcel() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void advert(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int billing2 = metrica.billing(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        amazon(j2, obj, ((255 & b) << i) | (billing2 & (~(255 << i))));
    }

    public static void amazon(long j, Object obj, int i) {
        metrica.loadAd(j, obj, i);
    }

    public static Field appmetrica() {
        Field field;
        Field field2;
        if (AbstractC16549e.ad()) {
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

    public static byte billing(long j, byte[] bArr) {
        return metrica.license(purchase + j, bArr);
    }

    public static void license(Class cls) {
        if (appmetrica) {
            metrica.vip(cls);
        }
    }

    public static void loadAd(long j, long j2, Object obj) {
        metrica.Signature(j, j2, obj);
    }

    public static int metrica(Class cls) {
        if (appmetrica) {
            return metrica.ad(cls);
        }
        return -1;
    }

    public static void mopub(byte[] bArr, long j, byte b) {
        metrica.advert(bArr, purchase + j, b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean purchase(Class cls) {
        if (!AbstractC16549e.ad()) {
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

    public static void smaato(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        amazon(j2, obj, ((255 & b) << i) | (metrica.billing(j2, obj) & (~(255 << i))));
    }

    public static byte startapp(long j, Object obj) {
        return (byte) ((metrica.billing((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Object vip(Class cls) {
        try {
            return ad.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static byte yandex(long j, Object obj) {
        return (byte) ((metrica.billing((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }
}
