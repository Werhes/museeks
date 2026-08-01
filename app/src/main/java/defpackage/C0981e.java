package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؒۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0981e implements InterfaceC11944e {
    public final C5565e ad;
    public final /* synthetic */ C7765e yandex;
    public int vip = -1;
    public long metrica = 9205357640488583168L;
    public long license = 0;
    public EnumC12813e appmetrica = EnumC12813e.f25630e;
    public boolean purchase = true;
    public C16658e billing = C5107e.f10953e;

    public C0981e(C7765e c7765e, C5565e c5565e) {
        this.yandex = c7765e;
        this.ad = c5565e;
    }

    @Override // defpackage.InterfaceC11944e
    public final void ad() {
        purchase();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
    
        if (((int) (r2 & 4294967295L)) != ((int) (r14 & 4294967295L))) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e8, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fe, code lost:
    
        if (((((int) (r2 & 4294967295L)) + r9) / 2.0f) > ((r16 + ((int) (r14 & 4294967295L))) / 2.0f)) goto L50;
     */
    @Override // defpackage.InterfaceC11944e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void appmetrica(long r18) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0981e.appmetrica(long):void");
    }

    @Override // defpackage.InterfaceC11944e
    public final void license() {
    }

    @Override // defpackage.InterfaceC11944e
    public final void metrica() {
    }

    @Override // defpackage.InterfaceC11944e
    public final void onCancel() {
        purchase();
    }

    public final void purchase() {
        if ((this.metrica & 9223372034707292159L) != 9205357640488583168L) {
            C7765e c7765e = this.yandex;
            c7765e.license();
            this.vip = -1;
            this.metrica = 9205357640488583168L;
            this.license = 0L;
            c7765e.isVip = -1;
            this.billing = C5107e.f10953e;
            c7765e.subscription.setValue(EnumC11891e.f23827e);
            this.ad.invoke();
            if (this.purchase) {
                c7765e.subscription();
            }
        }
    }

    @Override // defpackage.InterfaceC11944e
    public final void vip(long j, C16658e c16658e) {
        C7765e c7765e = this.yandex;
        boolean z = c7765e.adcel;
        C11388e c11388e = c7765e.ad;
        C7102e c7102e = c7765e.vip;
        if (z) {
            c7765e.ads(this.appmetrica, j);
            c7765e.isVip(false);
            c7765e.subscription.setValue(EnumC11891e.f23825e);
            this.metrica = j;
            this.license = 0L;
            c7765e.isVip = -1;
            this.purchase = true;
            this.billing = c16658e;
            if (c7102e.metrica() == null) {
                return;
            }
            if (c7102e.purchase(j)) {
                if (c11388e.license().f33322e.length() == 0) {
                    return;
                }
                int license = c7102e.license(j, true);
                long premium = c7765e.premium(new C17013e(c7765e.ad.license(), C12347e.vip, null, null, null, null, 60), license, license, false, this.billing, false, false, new C10138e(0));
                c11388e.adcel(premium);
                c7765e.inmobi(EnumC5022e.f10704e);
                this.vip = (int) (premium >> 32);
                return;
            }
            int license2 = c7102e.license(j, true);
            InterfaceC5178e interfaceC5178e = c7765e.mopub;
            if (interfaceC5178e != null) {
                ((C6169e) interfaceC5178e).ad(0);
            }
            c11388e.getClass();
            c11388e.adcel(AbstractC9262e.metrica(license2, license2));
            c7765e.isVip(true);
            this.purchase = false;
            c7765e.inmobi(EnumC5022e.f10705e);
        }
    }
}
