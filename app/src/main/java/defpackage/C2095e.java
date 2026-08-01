package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؓۛٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2095e implements InterfaceC17396e {
    public static final C4196e Companion = new Object();
    public final String ad;

    public /* synthetic */ C2095e(int i, String str) {
        if (1 == (i & 1)) {
            this.ad = str;
        } else {
            AbstractC5756e.billing(i, 1, C6985e.ad.appmetrica());
            throw null;
        }
    }

    public C2095e(String str) {
        this.ad = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2095e) && AbstractC7890e.billing(this.ad, ((C2095e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("CatalogSection(id="), this.ad, ')');
    }
}
