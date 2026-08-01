package defpackage;

import android.util.Range;
import android.util.Rational;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٜٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10388e {
    public final boolean ad;
    public final Rational license;
    public final Range metrica;
    public final int vip;

    public C10388e(boolean z, int i, Range range, Rational rational) {
        this.ad = z;
        this.vip = i;
        this.metrica = range;
        this.license = rational;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10388e)) {
            return false;
        }
        C10388e c10388e = (C10388e) obj;
        return this.ad == c10388e.ad && this.vip == c10388e.vip && AbstractC7890e.billing(this.metrica, c10388e.metrica) && AbstractC7890e.billing(this.license, c10388e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + ((this.metrica.hashCode() + ((((this.ad ? 1231 : 1237) * 31) + this.vip) * 31)) * 31);
    }

    public final String toString() {
        return "EvCompValue(supported=" + this.ad + ", index=" + this.vip + ", range=" + this.metrica + ", step=" + this.license + ')';
    }
}
