package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُُؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4798e implements InterfaceC13397e {
    public int Signature;
    public final String ad;
    public int adcel;
    public boolean admob;
    public long advert;
    public int amazon;
    public InterfaceC18147e appmetrica;
    public C16975e billing;
    public final C2125e license;
    public int loadAd;
    public final C1292e metrica;
    public int mopub;
    public long pro;
    public String purchase;
    public int remoteconfig;
    public int signatures;
    public boolean smaato;
    public int startapp;
    public long subscription;
    public String tapsense;
    public final int vip;
    public int yandex;

    public C4798e(String str, int i) {
        this.ad = str;
        this.vip = i;
        C1292e c1292e = new C1292e(1024);
        this.metrica = c1292e;
        byte[] bArr = c1292e.ad;
        this.license = new C2125e(bArr.length, bArr);
        this.advert = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x019e, code lost:
    
        if (r23.smaato == false) goto L89;
     */
    @Override // defpackage.InterfaceC13397e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(defpackage.C1292e r24) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4798e.ad(eؒۙۚ):void");
    }

    @Override // defpackage.InterfaceC13397e
    public final void appmetrica(InterfaceC5483e interfaceC5483e, C18316e c18316e) {
        c18316e.ad();
        c18316e.vip();
        this.appmetrica = interfaceC5483e.Signature(c18316e.license, 1);
        c18316e.vip();
        this.purchase = c18316e.appmetrica;
    }

    @Override // defpackage.InterfaceC13397e
    public final void license(int i, long j) {
        this.advert = j;
    }

    @Override // defpackage.InterfaceC13397e
    public final void metrica(boolean z) {
    }

    @Override // defpackage.InterfaceC13397e
    public final void vip() {
        this.yandex = 0;
        this.advert = -9223372036854775807L;
        this.smaato = false;
    }
}
