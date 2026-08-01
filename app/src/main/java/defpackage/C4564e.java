package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؗؑؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4564e {
    public static final C17949e Companion = new Object();
    public final C12548e ad;

    public C4564e(int i, C12548e c12548e) {
        if (1 == (i & 1)) {
            this.ad = c12548e;
        } else {
            AbstractC5756e.billing(i, 1, C2970e.vip);
            throw null;
        }
    }

    public C4564e(C12837e c12837e) {
        this.ad = new C12548e(String.valueOf(c12837e.f25656e));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4564e) && AbstractC7890e.billing(this.ad, ((C4564e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.ad.hashCode();
    }

    public final String toString() {
        return "BsonValueJson(data=" + this.ad + ')';
    }
}
