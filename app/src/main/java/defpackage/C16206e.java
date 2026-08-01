package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16206e {
    public final int ad;
    public final C6571e vip;

    public C16206e(int i, C6571e c6571e) {
        this.ad = i;
        this.vip = c6571e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16206e)) {
            return false;
        }
        C16206e c16206e = (C16206e) obj;
        return this.ad == c16206e.ad && AbstractC7890e.billing(this.vip, c16206e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad * 31);
    }

    public final String toString() {
        return "StorageCardPathModel(pathProvider=" + this.ad + ", selectedStorage=" + ((Object) ("StorageSize(src=" + this.vip + ')')) + ')';
    }
}
