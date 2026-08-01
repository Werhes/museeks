package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؖۨ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4544e {
    public static final C12726e Companion = new Object();
    public final String ad;

    public C4544e(int i, String str) {
        if (1 == (i & 1)) {
            this.ad = str;
        } else {
            AbstractC5756e.billing(i, 1, C5506e.vip);
            throw null;
        }
    }

    public C4544e(C12639e c12639e) {
        this.ad = c12639e.f25358e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4544e) && AbstractC7890e.billing(this.ad, ((C4544e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("BsonValueJson(data="), this.ad, ')');
    }
}
