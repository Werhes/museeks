package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٕ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15748e implements InterfaceC8399e {
    public static final C11714e Companion = new Object();
    public final C2813e ad;

    public /* synthetic */ C15748e(int i, C2813e c2813e) {
        if (1 == (i & 1)) {
            this.ad = c2813e;
        } else {
            AbstractC5756e.billing(i, 1, C10278e.ad.appmetrica());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15748e) && AbstractC7890e.billing(this.ad, ((C15748e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "NestedApiError(error=" + this.ad + ")";
    }
}
