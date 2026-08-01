package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٜ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17764e {
    public static final C0391e Companion = new Object();
    public final String ad;
    public final C8633e vip;

    public /* synthetic */ C17764e(int i, String str, C8633e c8633e) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C3635e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = c8633e;
    }

    public C17764e(String str, C8633e c8633e) {
        this.ad = str;
        this.vip = c8633e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17764e)) {
            return false;
        }
        C17764e c17764e = (C17764e) obj;
        return AbstractC7890e.billing(this.ad, c17764e.ad) && AbstractC7890e.billing(this.vip, c17764e.vip);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        C8633e c8633e = this.vip;
        return hashCode + (c8633e == null ? 0 : c8633e.hashCode());
    }

    public final String toString() {
        return "SavedChildState(key=" + this.ad + ", savedState=" + this.vip + ')';
    }
}
