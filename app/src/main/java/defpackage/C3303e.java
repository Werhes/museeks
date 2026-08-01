package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eِؕٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3303e {
    public static final C0969e Companion = new Object();
    public final C5548e ad;

    public C3303e(int i, C5548e c5548e) {
        if (1 == (i & 1)) {
            this.ad = c5548e;
        } else {
            AbstractC5756e.billing(i, 1, C4847e.vip);
            throw null;
        }
    }

    public C3303e(C4749e c4749e) {
        this.ad = new C5548e(c4749e.f10166e, c4749e.f10165e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3303e) && AbstractC7890e.billing(this.ad, ((C3303e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "BsonValueJson(data=" + this.ad + ')';
    }
}
