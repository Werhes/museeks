package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9504e {
    public final int ad;
    public final int vip;

    public C9504e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
        if (!(i >= 0)) {
            AbstractC8889e.ad("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        AbstractC8889e.ad("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9504e)) {
            return false;
        }
        C9504e c9504e = (C9504e) obj;
        return this.ad == c9504e.ad && this.vip == c9504e.vip;
    }

    public final int hashCode() {
        return (this.ad * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.ad);
        sb.append(", end=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
