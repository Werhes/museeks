package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؓ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15197e {
    public static final String adcel;
    public static final String billing;
    public static final String mopub;
    public static final C15197e purchase = new C15197e(new C9457e());
    public static final String startapp;
    public static final String yandex;
    public final long ad;
    public final float appmetrica;
    public final float license;
    public final long metrica;
    public final long vip;

    static {
        String str = AbstractC9413e.ad;
        billing = Integer.toString(0, 36);
        yandex = Integer.toString(1, 36);
        startapp = Integer.toString(2, 36);
        adcel = Integer.toString(3, 36);
        mopub = Integer.toString(4, 36);
    }

    public C15197e(C9457e c9457e) {
        long j = c9457e.ad;
        long j2 = c9457e.vip;
        long j3 = c9457e.metrica;
        float f = c9457e.license;
        float f2 = c9457e.appmetrica;
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
        this.license = f;
        this.appmetrica = f2;
    }

    public static C15197e vip(Bundle bundle) {
        C9457e c9457e = new C9457e();
        C15197e c15197e = purchase;
        c9457e.ad = bundle.getLong(billing, c15197e.ad);
        c9457e.vip = bundle.getLong(yandex, c15197e.vip);
        c9457e.metrica = bundle.getLong(startapp, c15197e.metrica);
        c9457e.license = bundle.getFloat(adcel, c15197e.license);
        c9457e.appmetrica = bundle.getFloat(mopub, c15197e.appmetrica);
        return new C15197e(c9457e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍَٓ, java.lang.Object] */
    public final C9457e ad() {
        ?? obj = new Object();
        obj.ad = this.ad;
        obj.vip = this.vip;
        obj.metrica = this.metrica;
        obj.license = this.license;
        obj.appmetrica = this.appmetrica;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15197e)) {
            return false;
        }
        C15197e c15197e = (C15197e) obj;
        return this.ad == c15197e.ad && this.vip == c15197e.vip && this.metrica == c15197e.metrica && this.license == c15197e.license && this.appmetrica == c15197e.appmetrica;
    }

    public final int hashCode() {
        long j = this.ad;
        long j2 = this.vip;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.metrica;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.license;
        int floatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.appmetrica;
        return floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }

    public final Bundle metrica() {
        Bundle bundle = new Bundle();
        C15197e c15197e = purchase;
        long j = c15197e.ad;
        long j2 = this.ad;
        if (j2 != j) {
            bundle.putLong(billing, j2);
        }
        long j3 = c15197e.vip;
        long j4 = this.vip;
        if (j4 != j3) {
            bundle.putLong(yandex, j4);
        }
        long j5 = c15197e.metrica;
        long j6 = this.metrica;
        if (j6 != j5) {
            bundle.putLong(startapp, j6);
        }
        float f = c15197e.license;
        float f2 = this.license;
        if (f2 != f) {
            bundle.putFloat(adcel, f2);
        }
        float f3 = c15197e.appmetrica;
        float f4 = this.appmetrica;
        if (f4 != f3) {
            bundle.putFloat(mopub, f4);
        }
        return bundle;
    }
}
