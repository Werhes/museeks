package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٗ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17285e implements InterfaceC13397e {
    public static final float[] advert = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final C15024e ad;
    public boolean adcel;
    public final C6981e appmetrica;
    public long billing;
    public final C12622e license;
    public final boolean[] metrica = new boolean[4];
    public long mopub;
    public C17609e purchase;
    public InterfaceC18147e startapp;
    public final C1292e vip;
    public String yandex;

    /* JADX WARN: Type inference failed for: r3v3, types: [eّٞؕ, java.lang.Object] */
    public C17285e(C15024e c15024e) {
        this.ad = c15024e;
        ?? obj = new Object();
        obj.appmetrica = new byte[128];
        this.license = obj;
        this.mopub = -9223372036854775807L;
        this.appmetrica = new C6981e(178);
        this.vip = new C1292e();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    @Override // defpackage.InterfaceC13397e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(defpackage.C1292e r20) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17285e.ad(eؒۙۚ):void");
    }

    @Override // defpackage.InterfaceC13397e
    public final void appmetrica(InterfaceC5483e interfaceC5483e, C18316e c18316e) {
        c18316e.ad();
        c18316e.vip();
        this.yandex = c18316e.appmetrica;
        c18316e.vip();
        InterfaceC18147e Signature = interfaceC5483e.Signature(c18316e.license, 2);
        this.startapp = Signature;
        this.purchase = new C17609e(Signature);
        this.ad.pro(interfaceC5483e, c18316e);
    }

    @Override // defpackage.InterfaceC13397e
    public final void license(int i, long j) {
        this.mopub = j;
    }

    @Override // defpackage.InterfaceC13397e
    public final void metrica(boolean z) {
        this.purchase.getClass();
        if (z) {
            this.purchase.vip(0, this.billing, this.adcel);
            C17609e c17609e = this.purchase;
            c17609e.vip = false;
            c17609e.metrica = false;
            c17609e.license = false;
            c17609e.appmetrica = -1;
        }
    }

    @Override // defpackage.InterfaceC13397e
    public final void vip() {
        AbstractC17595e.license(this.metrica);
        C12622e c12622e = this.license;
        c12622e.ad = false;
        c12622e.metrica = 0;
        c12622e.vip = 0;
        C17609e c17609e = this.purchase;
        if (c17609e != null) {
            c17609e.vip = false;
            c17609e.metrica = false;
            c17609e.license = false;
            c17609e.appmetrica = -1;
        }
        C6981e c6981e = this.appmetrica;
        if (c6981e != null) {
            c6981e.billing();
        }
        this.billing = 0L;
        this.mopub = -9223372036854775807L;
    }
}
