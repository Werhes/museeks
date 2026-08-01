package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eّؓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1772e implements InterfaceC17396e {
    public static final C4699e Companion = new Object();
    public final C5869e ad;

    public /* synthetic */ C1772e(int i, C5869e c5869e) {
        if (1 == (i & 1)) {
            this.ad = c5869e;
        } else {
            AbstractC5756e.billing(i, 1, C4037e.ad.appmetrica());
            throw null;
        }
    }

    public C1772e(C5869e c5869e) {
        this.ad = c5869e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1772e) && AbstractC7890e.billing(this.ad, ((C1772e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "Playlist(args=" + this.ad + ')';
    }
}
