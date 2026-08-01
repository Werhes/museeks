package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٍؙۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9297e {
    public static final C0976e Companion = new Object();
    public final String ad;

    public C9297e(int i, String str) {
        if (1 == (i & 1)) {
            this.ad = str;
        } else {
            AbstractC5756e.billing(i, 1, C2594e.vip);
            throw null;
        }
    }

    public C9297e(C17727e c17727e) {
        this.ad = String.valueOf(c17727e.f34766e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9297e) && AbstractC7890e.billing(this.ad, ((C9297e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("BsonValueJson(data="), this.ad, ')');
    }
}
