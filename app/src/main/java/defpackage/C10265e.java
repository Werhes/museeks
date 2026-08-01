package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eَٔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10265e implements InterfaceC5353e {
    public static final C12980e Companion = new Object();
    public final String ad;

    public C10265e() {
        this.ad = "8.12.1_pub";
    }

    public /* synthetic */ C10265e(int i, String str) {
        if (1 == (i & 1)) {
            this.ad = str;
        } else {
            AbstractC5756e.billing(i, 1, C0886e.ad.appmetrica());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10265e) && AbstractC7890e.billing(this.ad, ((C10265e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("FailVersionMismatch(targetVersionName="), this.ad, ')');
    }
}
