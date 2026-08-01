package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14183e implements InterfaceC14449e {
    public final InterfaceC14449e metrica;
    public final long vip;

    public C14183e(long j, InterfaceC14449e interfaceC14449e) {
        AbstractC4265e.license(j >= 0, "Timeout must be non-negative.");
        this.vip = j;
        this.metrica = interfaceC14449e;
    }

    @Override // defpackage.InterfaceC14449e
    public final long ad() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC14449e
    public final C13497e vip(C15475e c15475e) {
        C13497e vip = this.metrica.vip(c15475e);
        long j = this.vip;
        return (j <= 0 || c15475e.vip < j - vip.ad) ? vip : C13497e.license;
    }
}
