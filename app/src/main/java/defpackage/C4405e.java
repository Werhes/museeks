package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4405e {
    public final int ad;
    public final C10224e vip;

    public C4405e(int i, C10224e c10224e) {
        this.ad = i;
        this.vip = c10224e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4405e)) {
            return false;
        }
        C4405e c4405e = (C4405e) obj;
        return this.ad == c4405e.ad && AbstractC7890e.billing(this.vip, c4405e.vip);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        C10224e c10224e = this.vip;
        return i + (c10224e == null ? 0 : c10224e.hashCode());
    }

    public final String toString() {
        return "Result3A(status=" + ((Object) ("Status(value=" + this.ad + ')')) + ", frameMetadata=" + this.vip + ')';
    }
}
