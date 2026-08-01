package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eْٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18276e {
    public static final C3868e Companion = new Object();
    public final String ad;

    public C18276e(int i, String str) {
        if (1 == (i & 1)) {
            this.ad = str;
        } else {
            AbstractC5756e.billing(i, 1, C7941e.vip);
            throw null;
        }
    }

    public C18276e(C1502e c1502e) {
        this.ad = String.valueOf(c1502e.f4365e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18276e) && AbstractC7890e.billing(this.ad, ((C18276e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("BsonValueJson(data="), this.ad, ')');
    }
}
