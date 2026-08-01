package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8665e {
    public final C11709e ad;
    public final List vip;

    public C8665e(C11709e c11709e, List list) {
        this.ad = c11709e;
        this.vip = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8665e)) {
            return false;
        }
        C8665e c8665e = (C8665e) obj;
        return AbstractC7890e.billing(this.ad, c8665e.ad) && AbstractC7890e.billing(this.vip, c8665e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassRequest(classId=");
        sb.append(this.ad);
        sb.append(", typeParametersCount=");
        return AbstractC1786e.tapsense(sb, this.vip, ')');
    }
}
