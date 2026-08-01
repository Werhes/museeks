package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؗ۠ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5194e {
    public static final C6186e Companion = new Object();
    public final String ad;

    public C5194e(int i, String str) {
        if (1 == (i & 1)) {
            this.ad = str;
        } else {
            AbstractC5756e.billing(i, 1, C16135e.vip);
            throw null;
        }
    }

    public C5194e(C18213e c18213e) {
        this.ad = c18213e.f35654e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5194e) && AbstractC7890e.billing(this.ad, ((C5194e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("BsonValueJson(code="), this.ad, ')');
    }
}
