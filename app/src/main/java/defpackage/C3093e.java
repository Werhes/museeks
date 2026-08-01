package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3093e extends AbstractC16920e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f7177e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f7178e;

    public C3093e(Object obj, boolean z) {
        this.f7178e = z;
        this.f7177e = obj.toString();
    }

    @Override // defpackage.AbstractC16920e
    public final String appmetrica() {
        return this.f7177e;
    }

    @Override // defpackage.AbstractC16920e
    public final boolean billing() {
        return this.f7178e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3093e.class != obj.getClass()) {
            return false;
        }
        C3093e c3093e = (C3093e) obj;
        return this.f7178e == c3093e.f7178e && AbstractC7890e.billing(this.f7177e, c3093e.f7177e);
    }

    public final int hashCode() {
        return this.f7177e.hashCode() + ((this.f7178e ? 1231 : 1237) * 31);
    }

    @Override // defpackage.AbstractC16920e
    public final String toString() {
        boolean z = this.f7178e;
        String str = this.f7177e;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        AbstractC13517e.ad(str, sb);
        return sb.toString();
    }
}
