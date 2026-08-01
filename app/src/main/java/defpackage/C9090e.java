package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9090e implements InterfaceC13397e {
    public static final double[] subscription = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public boolean Signature;
    public String ad;
    public boolean adcel;
    public boolean admob;
    public long advert;
    public long amazon;
    public final C1292e appmetrica;
    public final boolean[] billing = new boolean[4];
    public final String license;
    public long loadAd;
    public final C15024e metrica;
    public boolean mopub;
    public final C6981e purchase;
    public long smaato;
    public long startapp;
    public InterfaceC18147e vip;
    public final C11734e yandex;

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [eِٓۖ, java.lang.Object] */
    public C9090e(C15024e c15024e, String str) {
        this.metrica = c15024e;
        this.license = str;
        ?? obj = new Object();
        obj.license = new byte[128];
        this.yandex = obj;
        if (c15024e != null) {
            this.purchase = new C6981e(178);
            this.appmetrica = new C1292e();
        } else {
            this.purchase = null;
            this.appmetrica = null;
        }
        this.smaato = -9223372036854775807L;
        this.loadAd = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01eb  */
    @Override // defpackage.InterfaceC13397e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(defpackage.C1292e r23) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9090e.ad(eؒۙۚ):void");
    }

    @Override // defpackage.InterfaceC13397e
    public final void appmetrica(InterfaceC5483e interfaceC5483e, C18316e c18316e) {
        c18316e.ad();
        c18316e.vip();
        this.ad = c18316e.appmetrica;
        c18316e.vip();
        this.vip = interfaceC5483e.Signature(c18316e.license, 2);
        C15024e c15024e = this.metrica;
        if (c15024e != null) {
            c15024e.pro(interfaceC5483e, c18316e);
        }
    }

    @Override // defpackage.InterfaceC13397e
    public final void license(int i, long j) {
        this.smaato = j;
    }

    @Override // defpackage.InterfaceC13397e
    public final void metrica(boolean z) {
        this.vip.getClass();
        if (z) {
            boolean z2 = this.Signature;
            this.vip.ad(this.loadAd, z2 ? 1 : 0, (int) (this.startapp - this.amazon), 0, null);
        }
    }

    @Override // defpackage.InterfaceC13397e
    public final void vip() {
        AbstractC17595e.license(this.billing);
        C11734e c11734e = this.yandex;
        c11734e.metrica = false;
        c11734e.ad = 0;
        c11734e.vip = 0;
        C6981e c6981e = this.purchase;
        if (c6981e != null) {
            c6981e.billing();
        }
        this.startapp = 0L;
        this.adcel = false;
        this.smaato = -9223372036854775807L;
        this.loadAd = -9223372036854775807L;
    }
}
