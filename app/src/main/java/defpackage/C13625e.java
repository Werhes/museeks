package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۥّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13625e {
    public final int ad;
    public final Integer vip;

    public C13625e(int i, Integer num) {
        this.ad = i;
        this.vip = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13625e)) {
            return false;
        }
        C13625e c13625e = (C13625e) obj;
        return this.ad == c13625e.ad && AbstractC7890e.billing(this.vip, c13625e.vip);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        Integer num = this.vip;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.ad + ", dataOffset=" + this.vip + ')';
    }
}
