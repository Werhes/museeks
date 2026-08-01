package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6167e {
    public final int ad;
    public final Throwable license;
    public final C1096e metrica;
    public final long vip;

    public C6167e(int i, C1096e c1096e, Exception exc, int i2) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        c1096e = (i2 & 4) != 0 ? null : c1096e;
        exc = (i2 & 8) != 0 ? null : exc;
        this.ad = i;
        this.vip = elapsedRealtimeNanos;
        this.metrica = c1096e;
        this.license = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6167e)) {
            return false;
        }
        C6167e c6167e = (C6167e) obj;
        return this.ad == c6167e.ad && this.vip == c6167e.vip && AbstractC7890e.billing(this.metrica, c6167e.metrica) && AbstractC7890e.billing(this.license, c6167e.license);
    }

    public final int hashCode() {
        int m2467class = AbstractC8703e.m2467class(this.ad) * 31;
        long j = this.vip;
        int i = (((int) (j ^ (j >>> 32))) + m2467class) * 31;
        C1096e c1096e = this.metrica;
        int i2 = (i + (c1096e == null ? 0 : c1096e.ad)) * 31;
        Throwable th = this.license;
        return i2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ClosingInfo(reason=" + AbstractC17861e.subs(this.ad) + ", closingTimestamp=" + ((Object) C1103e.ad(this.vip)) + ", errorCode=" + this.metrica + ", exception=" + this.license + ')';
    }
}
