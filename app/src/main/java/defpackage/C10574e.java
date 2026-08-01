package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10574e implements InterfaceC17873e {
    public final InterfaceC4082e ad;
    public final Throwable metrica;
    public final C14542e vip;

    public C10574e(InterfaceC4082e interfaceC4082e, C14542e c14542e, Throwable th) {
        this.ad = interfaceC4082e;
        this.vip = c14542e;
        this.metrica = th;
    }

    @Override // defpackage.InterfaceC17873e
    public final InterfaceC4082e amazon() {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10574e)) {
            return false;
        }
        C10574e c10574e = (C10574e) obj;
        return AbstractC7890e.billing(this.ad, c10574e.ad) && AbstractC7890e.billing(this.vip, c10574e.vip) && AbstractC7890e.billing(this.metrica, c10574e.metrica);
    }

    public final int hashCode() {
        InterfaceC4082e interfaceC4082e = this.ad;
        return this.metrica.hashCode() + ((this.vip.hashCode() + ((interfaceC4082e == null ? 0 : interfaceC4082e.hashCode()) * 31)) * 31);
    }

    @Override // defpackage.InterfaceC17873e
    public final C14542e license() {
        return this.vip;
    }

    public final String toString() {
        return "ErrorResult(image=" + this.ad + ", request=" + this.vip + ", throwable=" + this.metrica + ")";
    }
}
