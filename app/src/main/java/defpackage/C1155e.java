package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؒٚٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1155e {
    public static final C15941e Companion = new Object();
    public final C6833e ad;

    public C1155e(int i, C6833e c6833e) {
        if (1 == (i & 1)) {
            this.ad = c6833e;
        } else {
            AbstractC5756e.billing(i, 1, C14174e.vip);
            throw null;
        }
    }

    public C1155e(C15337e c15337e) {
        long j = c15337e.f30255e;
        this.ad = new C6833e((int) (j >> 32), (int) j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155e) && AbstractC7890e.billing(this.ad, ((C1155e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "BsonValueJson(data=" + this.ad + ')';
    }
}
