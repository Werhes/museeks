package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟۣؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2769e implements InterfaceC6347e {
    public final InterfaceC12321e ad;
    public final long appmetrica;
    public final long license;
    public final long metrica;
    public final long purchase;
    public final long vip;

    public C2769e(InterfaceC12321e interfaceC12321e, long j, long j2, long j3, long j4, long j5) {
        this.ad = interfaceC12321e;
        this.vip = j;
        this.metrica = j2;
        this.license = j3;
        this.appmetrica = j4;
        this.purchase = j5;
    }

    @Override // defpackage.InterfaceC6347e
    public final C13178e appmetrica(long j) {
        C7278e c7278e = new C7278e(j, C17909e.ad(this.ad.purchase(j), 0L, this.metrica, this.license, this.appmetrica, this.purchase));
        return new C13178e(c7278e, c7278e);
    }

    @Override // defpackage.InterfaceC6347e
    public final long billing() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC6347e
    public final /* synthetic */ boolean license() {
        return false;
    }

    @Override // defpackage.InterfaceC6347e
    public final boolean vip() {
        return true;
    }
}
