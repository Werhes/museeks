package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٔ۟ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15003e {
    public static final C5741e Companion = new Object();
    public final C7475e ad;

    public C15003e(int i, C7475e c7475e) {
        if (1 == (i & 1)) {
            this.ad = c7475e;
        } else {
            AbstractC5756e.billing(i, 1, C11066e.vip);
            throw null;
        }
    }

    public C15003e(C3549e c3549e) {
        this.ad = new C7475e(c3549e.f8006e, c3549e.f8005e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15003e) && AbstractC7890e.billing(this.ad, ((C15003e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "BsonValueJson(data=" + this.ad + ')';
    }
}
