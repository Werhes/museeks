package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10823e implements InterfaceC16811e {
    public final int ad;
    public final List vip;

    public C10823e(int i, List list) {
        this.ad = i;
        this.vip = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10823e)) {
            return false;
        }
        C10823e c10823e = (C10823e) obj;
        return this.ad == c10823e.ad && AbstractC7890e.billing(this.vip, c10823e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(duplicateCount=");
        sb.append(this.ad);
        sb.append(", duplicates=");
        return AbstractC1786e.tapsense(sb, this.vip, ')');
    }
}
