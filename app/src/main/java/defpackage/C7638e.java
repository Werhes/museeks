package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eًؐٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7638e {
    public static final C13253e Companion = new Object();
    public final String ad;

    public C7638e(int i, String str) {
        if (1 == (i & 1)) {
            this.ad = str;
        } else {
            AbstractC5756e.billing(i, 1, C17062e.vip);
            throw null;
        }
    }

    public C7638e(C17629e c17629e) {
        this.ad = String.valueOf(c17629e.f34552e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7638e) && AbstractC7890e.billing(this.ad, ((C7638e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("BsonValueJson(data="), this.ad, ')');
    }
}
