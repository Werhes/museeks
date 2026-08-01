package defpackage;

import java.util.HashSet;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12298e {
    public UUID ad;
    public C13198e appmetrica;
    public HashSet license;
    public C13198e metrica;
    public int purchase;
    public EnumC7300e vip;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12298e.class != obj.getClass()) {
            return false;
        }
        C12298e c12298e = (C12298e) obj;
        if (this.purchase == c12298e.purchase && this.ad.equals(c12298e.ad) && this.vip == c12298e.vip && this.metrica.equals(c12298e.metrica) && this.license.equals(c12298e.license)) {
            return this.appmetrica.equals(c12298e.appmetrica);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.appmetrica.hashCode() + ((this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.purchase;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.ad + "', mState=" + this.vip + ", mOutputData=" + this.metrica + ", mTags=" + this.license + ", mProgress=" + this.appmetrica + '}';
    }
}
