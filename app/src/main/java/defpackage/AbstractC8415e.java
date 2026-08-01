package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؑؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8415e {
    public final Unsafe ad;

    public AbstractC8415e(Unsafe unsafe) {
        this.ad = unsafe;
    }

    public final void Signature(long j, Object obj, Object obj2) {
        this.ad.putObject(obj, j, obj2);
    }

    public final int ad(Class cls) {
        return this.ad.arrayBaseOffset(cls);
    }

    public abstract void adcel(Object obj, long j, boolean z);

    public boolean admob() {
        Unsafe unsafe = this.ad;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            AbstractC9259e.ad(th);
            return false;
        }
    }

    public abstract void advert(Object obj, long j, double d);

    public final void amazon(long j, Object obj, int i) {
        this.ad.putInt(obj, j, i);
    }

    public abstract float appmetrica(long j, Object obj);

    public final long billing(long j, Object obj) {
        return this.ad.getLong(obj, j);
    }

    public abstract double license(long j, Object obj);

    public final void loadAd(long j, long j2, Object obj) {
        this.ad.putLong(obj, j, j2);
    }

    public abstract boolean metrica(long j, Object obj);

    public abstract void mopub(Object obj, long j, byte b);

    public final int purchase(long j, Object obj) {
        return this.ad.getInt(obj, j);
    }

    public abstract void smaato(Object obj, long j, float f);

    public final long startapp(Field field) {
        return this.ad.objectFieldOffset(field);
    }

    public abstract boolean subscription();

    public final int vip(Class cls) {
        return this.ad.arrayIndexScale(cls);
    }

    public final Object yandex(long j, Object obj) {
        return this.ad.getObject(obj, j);
    }
}
