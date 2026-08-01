package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؐؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15145e implements InterfaceC1272e {
    public final int ad;
    public int appmetrica;
    public InterfaceC18147e billing;
    public int license;
    public final String metrica;
    public InterfaceC5483e purchase;
    public final int vip;

    public C15145e(int i, int i2, String str) {
        this.ad = i;
        this.vip = i2;
        this.metrica = str;
    }

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        if (j == 0 || this.appmetrica == 1) {
            this.appmetrica = 1;
            this.license = 0;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        int i = this.vip;
        int i2 = this.ad;
        AbstractC2301e.subscription((i2 == -1 || i == -1) ? false : true);
        C1292e c1292e = new C1292e(i);
        ((C14446e) interfaceC2283e).billing(c1292e.ad, 0, i, false);
        return c1292e.m565goto() == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [eؙِۘ, java.lang.Object] */
    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        this.purchase = interfaceC5483e;
        InterfaceC18147e Signature = interfaceC5483e.Signature(1024, 4);
        this.billing = Signature;
        C11445e c11445e = new C11445e();
        String str = this.metrica;
        c11445e.smaato = AbstractC8542e.amazon(str);
        c11445e.amazon = AbstractC8542e.amazon(str);
        AbstractC8647e.firebase(c11445e, Signature);
        this.purchase.mopub();
        this.purchase.pro(new Object());
        this.appmetrica = 1;
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    @Override // defpackage.InterfaceC1272e
    public final int vip(InterfaceC2283e interfaceC2283e, C14829e c14829e) {
        int i = this.appmetrica;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC18147e interfaceC18147e = this.billing;
        interfaceC18147e.getClass();
        int purchase = interfaceC18147e.purchase(interfaceC2283e, 1024, true);
        if (purchase != -1) {
            this.license += purchase;
            return 0;
        }
        this.appmetrica = 2;
        this.billing.ad(0L, 1, this.license, 0, null);
        this.license = 0;
        return 0;
    }
}
