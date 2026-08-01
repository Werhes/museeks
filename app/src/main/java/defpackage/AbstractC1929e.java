package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1929e {
    public static final Unsafe ad;
    public static final long appmetrica;
    public static final boolean license;
    public static final AbstractC17397e metrica;
    public static final boolean purchase;
    public static final Class vip;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0153  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    static {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1929e.<clinit>():void");
    }

    public static int Signature(Class cls) {
        if (license) {
            return metrica.ad.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Field ad() {
        Field field;
        Field field2;
        int i = AbstractC3433e.ad;
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

    public static void adcel(long j, Object obj, Object obj2) {
        metrica.ad.putObject(obj, j, obj2);
    }

    public static void admob(Class cls) {
        if (license) {
            metrica.ad.arrayIndexScale(cls);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe advert() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(AbstractC1929e.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static /* synthetic */ boolean amazon(long j, Object obj) {
        return ((byte) ((metrica.ad.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static int appmetrica(long j, Object obj) {
        return metrica.ad.getInt(obj, j);
    }

    public static long billing(long j, Object obj) {
        return metrica.ad.getLong(obj, j);
    }

    public static Object license(Class cls) {
        try {
            return ad.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static /* synthetic */ boolean loadAd(long j, Object obj) {
        return ((byte) ((metrica.ad.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static void metrica(Object obj, long j, byte b) {
        Unsafe unsafe = metrica.ad;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static void mopub(byte[] bArr, long j, byte b) {
        metrica.vip(bArr, appmetrica + j, b);
    }

    public static void purchase(long j, Object obj, int i) {
        metrica.ad.putInt(obj, j, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean smaato(Class cls) {
        int i = AbstractC3433e.ad;
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

    public static Object startapp(long j, Object obj) {
        return metrica.ad.getObject(obj, j);
    }

    public static void vip(Object obj, long j, byte b) {
        Unsafe unsafe = metrica.ad;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    public static void yandex(long j, long j2, Object obj) {
        metrica.ad.putLong(obj, j, j2);
    }
}
