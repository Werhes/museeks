package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eً۠ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8264e {
    public static final C5663e Companion = new Object();
    public static final InterfaceC3477e[] metrica = {AbstractC18039e.appmetrica(2, new C11689e(17)), null};
    public final InterfaceC1940e ad;
    public final C4431e vip;

    public /* synthetic */ C8264e(int i, InterfaceC1940e interfaceC1940e, C4431e c4431e) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C17467e.ad.appmetrica());
            throw null;
        }
        this.ad = interfaceC1940e;
        this.vip = c4431e;
    }

    public C8264e(InterfaceC1940e interfaceC1940e, C4431e c4431e) {
        this.ad = interfaceC1940e;
        this.vip = c4431e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8264e)) {
            return false;
        }
        C8264e c8264e = (C8264e) obj;
        return AbstractC7890e.billing(this.ad, c8264e.ad) && AbstractC7890e.billing(this.vip, c8264e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "VkxSavedState(source=" + this.ad + ", lastTrack=" + this.vip + ')';
    }
}
