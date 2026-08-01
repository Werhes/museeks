package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٚۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17108e {
    public final String ad;
    public final int vip;

    public C17108e(String str, int i) {
        this.ad = str;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17108e)) {
            return false;
        }
        C17108e c17108e = (C17108e) obj;
        if (this.vip != c17108e.vip) {
            return false;
        }
        return this.ad.equals(c17108e.ad);
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }
}
