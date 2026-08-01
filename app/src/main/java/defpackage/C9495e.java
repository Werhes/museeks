package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٍُٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9495e {
    public static final C15856e Companion = new Object();
    public final String ad;

    public C9495e(int i, String str) {
        if (1 == (i & 1)) {
            this.ad = str;
        } else {
            AbstractC5756e.billing(i, 1, C12812e.vip);
            throw null;
        }
    }

    public C9495e(C12355e c12355e) {
        this.ad = c12355e.f24776e.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9495e) && AbstractC7890e.billing(this.ad, ((C9495e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("BsonValueJson(data="), this.ad, ')');
    }
}
