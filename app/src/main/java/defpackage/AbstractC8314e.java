package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۤؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8314e {
    public static final Unsafe ad;
    public static final boolean appmetrica;
    public static final boolean billing;
    public static final boolean license;
    public static final AbstractC17397e metrica;
    public static final long purchase;
    public static final Class vip;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    static {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8314e.<clinit>():void");
    }

    public static int Signature(Class cls) {
        if (appmetrica) {
            return metrica.ad.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void ad(Class cls) {
        if (appmetrica) {
            metrica.ad.arrayIndexScale(cls);
        }
    }

    public static void adcel(long j, Object obj, int i) {
        metrica.ad.putInt(obj, j, i);
    }

    public static void advert(long j, Object obj, Object obj2) {
        metrica.ad.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean amazon(long j, Object obj) {
        return ((byte) ((metrica.ad.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static int appmetrica(long j, Object obj) {
        return metrica.ad.getInt(obj, j);
    }

    public static Object billing(Class cls) {
        try {
            return ad.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void license(Object obj, long j, byte b) {
        AbstractC17397e abstractC17397e = metrica;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        abstractC17397e.ad.putInt(obj, j2, ((255 & b) << i) | (abstractC17397e.ad.getInt(obj, j2) & (~(255 << i))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean loadAd(Class cls) {
        int i = AbstractC1605e.ad;
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

    public static void metrica(Object obj, long j, byte b) {
        AbstractC17397e abstractC17397e = metrica;
        long j2 = (-4) & j;
        int i = abstractC17397e.ad.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        abstractC17397e.ad.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    public static void mopub(long j, long j2, Object obj) {
        metrica.ad.putLong(obj, j, j2);
    }

    public static long purchase(long j, Object obj) {
        return metrica.ad.getLong(obj, j);
    }

    public static /* bridge */ /* synthetic */ boolean smaato(long j, Object obj) {
        return ((byte) ((metrica.ad.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe startapp() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field vip() {
        Field field;
        Field field2;
        int i = AbstractC1605e.ad;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static Object yandex(long j, Object obj) {
        return metrica.ad.getObject(obj, j);
    }
}
