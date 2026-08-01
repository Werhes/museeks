package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4837e implements InterfaceC7224e {
    public final /* synthetic */ InterfaceC7224e ad;
    public final C10981e appmetrica;
    public final long license;
    public final int metrica;
    public final C16604e purchase;
    public final String vip;
    public final C14826e billing = AbstractC8461e.license(this);
    public final C5609e yandex = new C5609e(Boolean.TRUE);
    public final C5609e startapp = new C5609e(Boolean.FALSE);
    public final C5609e adcel = new C5609e(C10327e.f20377e);

    public C4837e(String str, int i, long j, InterfaceC7224e interfaceC7224e, C10981e c10981e, C16604e c16604e) {
        this.ad = interfaceC7224e;
        this.vip = str;
        this.metrica = i;
        this.license = j;
        this.appmetrica = c10981e;
        this.purchase = c16604e;
        InterfaceC10540e vip = interfaceC7224e.vip();
        vip.smaato(new C11898e(vip, this, 4));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(2:3|(15:5|6|7|8|(1:(2:11|12)(2:30|31))(4:32|33|34|(1:36)(1:37))|13|(2:16|14)|17|18|(1:20)(1:29)|21|22|(1:24)|25|26))|41|6|7|8|(0)(0)|13|(1:14)|17|18|(0)(0)|21|22|(0)|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
    
        r11 = new defpackage.C12763e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091 A[Catch: all -> 0x002b, LOOP:0: B:14:0x008b->B:16:0x0091, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:12:0x0027, B:13:0x0072, B:14:0x008b, B:16:0x0091, B:18:0x00bc, B:21:0x00d7, B:33:0x003f), top: B:8:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.AbstractC10731e r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4837e.ad(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC1722e appmetrica() {
        return this.ad.appmetrica();
    }

    @Override // defpackage.InterfaceC7224e
    public final C13391e license() {
        return this.ad.license();
    }

    @Override // defpackage.InterfaceC7224e
    public final C16722e metrica() {
        return this.ad.metrica();
    }

    @Override // defpackage.InterfaceC7224e
    public final C15723e purchase() {
        return this.ad.purchase();
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC10540e vip() {
        return this.ad.vip();
    }
}
