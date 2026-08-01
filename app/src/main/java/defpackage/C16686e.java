package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۨ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16686e implements InterfaceC16671e {
    public final boolean ad;

    public C16686e(boolean z) {
        this.ad = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16686e) && this.ad == ((C16686e) obj).ad;
    }

    public final int hashCode() {
        return this.ad ? 1231 : 1237;
    }

    public final String toString() {
        return AbstractC1786e.isVip(new StringBuilder("NowPlayingHideSystemBarEvent(hideSystemBars="), this.ad, ')');
    }
}
