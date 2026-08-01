package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٟؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9265e {
    public final int ad;
    public final Set appmetrica;
    public final boolean license;
    public final boolean metrica;
    public final AbstractC10226e purchase;
    public final int vip;

    public C9265e(int i, int i2, boolean z, boolean z2, Set set, AbstractC10226e abstractC10226e) {
        this.ad = i;
        this.vip = i2;
        this.metrica = z;
        this.license = z2;
        this.appmetrica = set;
        this.purchase = abstractC10226e;
    }

    public /* synthetic */ C9265e(int i, boolean z, boolean z2, Set set, int i2) {
        this(i, 1, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : set, null);
    }

    public static C9265e ad(C9265e c9265e, int i, boolean z, Set set, AbstractC10226e abstractC10226e, int i2) {
        int i3 = c9265e.ad;
        if ((i2 & 2) != 0) {
            i = c9265e.vip;
        }
        int i4 = i;
        if ((i2 & 4) != 0) {
            z = c9265e.metrica;
        }
        boolean z2 = z;
        boolean z3 = c9265e.license;
        if ((i2 & 16) != 0) {
            set = c9265e.appmetrica;
        }
        Set set2 = set;
        if ((i2 & 32) != 0) {
            abstractC10226e = c9265e.purchase;
        }
        c9265e.getClass();
        return new C9265e(i3, i4, z2, z3, set2, abstractC10226e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9265e)) {
            return false;
        }
        C9265e c9265e = (C9265e) obj;
        return AbstractC7890e.billing(c9265e.purchase, this.purchase) && c9265e.ad == this.ad && c9265e.vip == this.vip && c9265e.metrica == this.metrica && c9265e.license == this.license;
    }

    public final int hashCode() {
        AbstractC10226e abstractC10226e = this.purchase;
        int hashCode = abstractC10226e != null ? abstractC10226e.hashCode() : 0;
        int m2467class = AbstractC8703e.m2467class(this.ad) + (hashCode * 31) + hashCode;
        int m2467class2 = AbstractC8703e.m2467class(this.vip) + (m2467class * 31) + m2467class;
        int i = (m2467class2 * 31) + (this.metrica ? 1 : 0) + m2467class2;
        return (i * 31) + (this.license ? 1 : 0) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeAttributes(howThisTypeIsUsed=");
        int i = this.ad;
        sb.append(i != 1 ? i != 2 ? "null" : "COMMON" : "SUPERTYPE");
        sb.append(", flexibility=");
        int i2 = this.vip;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "FLEXIBLE_LOWER_BOUND" : "FLEXIBLE_UPPER_BOUND" : "INFLEXIBLE");
        sb.append(", isRaw=");
        sb.append(this.metrica);
        sb.append(", isForAnnotationParameter=");
        sb.append(this.license);
        sb.append(", visitedTypeParameters=");
        sb.append(this.appmetrica);
        sb.append(", defaultType=");
        sb.append(this.purchase);
        sb.append(')');
        return sb.toString();
    }

    public final C9265e vip(int i) {
        return ad(this, i, false, null, null, 61);
    }
}
