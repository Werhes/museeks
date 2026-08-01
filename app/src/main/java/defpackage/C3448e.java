package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3448e extends AbstractC5597e {
    @Override // defpackage.AbstractC5597e
    public final void advert(Object obj, long j, byte b) {
        this.ad.putByte(obj, j, b);
    }

    @Override // defpackage.AbstractC5597e
    public final void amazon(Object obj, long j, float f) {
        this.ad.putFloat(obj, j, f);
    }

    @Override // defpackage.AbstractC5597e
    public final double appmetrica(long j, Object obj) {
        return this.ad.getDouble(obj, j);
    }

    @Override // defpackage.AbstractC5597e
    public final byte license(long j, Object obj) {
        return this.ad.getByte(obj, j);
    }

    @Override // defpackage.AbstractC5597e
    public final boolean metrica(long j, Object obj) {
        return this.ad.getBoolean(obj, j);
    }

    @Override // defpackage.AbstractC5597e
    public final void mopub(Object obj, long j, boolean z) {
        this.ad.putBoolean(obj, j, z);
    }

    @Override // defpackage.AbstractC5597e
    public final float purchase(long j, Object obj) {
        return this.ad.getFloat(obj, j);
    }

    @Override // defpackage.AbstractC5597e
    public final boolean remoteconfig() {
        Unsafe unsafe = this.ad;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (AbstractC14352e.appmetrica() != null) {
                    try {
                        Class<?> cls3 = this.ad.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        AbstractC14352e.ad(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                AbstractC14352e.ad(th2);
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC5597e
    public final void smaato(Object obj, long j, double d) {
        this.ad.putDouble(obj, j, d);
    }

    @Override // defpackage.AbstractC5597e
    public final boolean subscription() {
        if (!super.subscription()) {
            return false;
        }
        try {
            Class<?> cls = this.ad.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            AbstractC14352e.ad(th);
            return false;
        }
    }
}
