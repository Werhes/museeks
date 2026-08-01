package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C10664e.class)
/* renamed from: eٌؙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4749e extends AbstractC4879e {
    public static final C3750e Companion = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C2453e f10165e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f10166e;

    public C4749e(String str, C2453e c2453e) {
        this.f10166e = str;
        this.f10165e = c2453e;
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        if (!AbstractC7890e.billing(c12232e.vip(C4749e.class), c12232e.vip(obj.getClass()))) {
            return false;
        }
        C4749e c4749e = (C4749e) obj;
        return AbstractC7890e.billing(this.f10166e, c4749e.f10166e) && AbstractC7890e.billing(this.f10165e, c4749e.f10165e);
    }

    public final int hashCode() {
        return this.f10165e.hashCode() + (this.f10166e.hashCode() * 31);
    }

    public final String toString() {
        return "BsonDBPointer(namespace='" + this.f10166e + "', id=" + this.f10165e + ')';
    }
}
