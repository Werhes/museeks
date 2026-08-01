package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10972e {
    public final InterfaceC1753e ad;
    public final Throwable metrica;
    public final InterfaceC1753e vip;

    public C10972e(InterfaceC1753e interfaceC1753e, InterfaceC1753e interfaceC1753e2, Throwable th) {
        this.ad = interfaceC1753e;
        this.vip = interfaceC1753e2;
        this.metrica = th;
    }

    public /* synthetic */ C10972e(InterfaceC1753e interfaceC1753e, C16663e c16663e, Throwable th, int i) {
        this(interfaceC1753e, (i & 2) != 0 ? null : c16663e, (i & 4) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10972e)) {
            return false;
        }
        C10972e c10972e = (C10972e) obj;
        return AbstractC7890e.billing(this.ad, c10972e.ad) && AbstractC7890e.billing(this.vip, c10972e.vip) && AbstractC7890e.billing(this.metrica, c10972e.metrica);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        InterfaceC1753e interfaceC1753e = this.vip;
        int hashCode2 = (hashCode + (interfaceC1753e == null ? 0 : interfaceC1753e.hashCode())) * 31;
        Throwable th = this.metrica;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.ad + ", nextPlan=" + this.vip + ", throwable=" + this.metrica + ')';
    }
}
