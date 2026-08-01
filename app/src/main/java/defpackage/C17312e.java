package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ۠ٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17312e extends AbstractC16997e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C5181e f33956e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final boolean f33957e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final boolean f33958e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C12560e f33959e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17312e(C12560e c12560e, C5181e c5181e, int i) {
        super(false, 3);
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        c12560e = (i & 4) != 0 ? null : c12560e;
        c5181e = (i & 8) != 0 ? null : c5181e;
        this.f33957e = z;
        this.f33958e = z2;
        this.f33959e = c12560e;
        this.f33956e = c5181e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x019d, code lost:
    
        if (r7 == r1) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void isVip(defpackage.InterfaceC12864e r25, defpackage.C12560e r26, defpackage.C5181e r27, boolean r28, boolean r29, defpackage.C13770e r30, int r31) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17312e.isVip(eّۤۧ, eّٙٞ, eؘؗ۟, boolean, boolean, eٓؕۥ, int):void");
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(1485494344);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C12560e c12560e = this.f33959e;
            boolean purchase = c13770e.purchase(c12560e);
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (purchase || m3681throw == obj) {
                m3681throw = c12560e != null ? AbstractC2890e.ad(c12560e.appmetrica) : null;
                c13770e.m3682throws(m3681throw);
            }
            C5181e c5181e = (C5181e) m3681throw;
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == obj) {
                m3681throw2 = AbstractC14533e.startapp(Boolean.valueOf(c5181e != null || this.f33957e));
                c13770e.m3682throws(m3681throw2);
            }
            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw2;
            boolean booleanValue = ((Boolean) interfaceC3314e.getValue()).booleanValue();
            C5181e c5181e2 = this.f33956e;
            if (booleanValue && c5181e != null) {
                c5181e2 = c5181e;
            }
            AbstractC12121e.ad(null, null, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.subscription, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(28690829, new C6409e(this, c5181e2, c5181e, interfaceC3314e, 19), c13770e), c13770e, 12582912, 123);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3450e(this, i, 2);
        }
    }
}
