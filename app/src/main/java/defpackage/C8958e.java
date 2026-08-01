package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8958e implements InterfaceC13397e {
    public final /* synthetic */ int ad;
    public int adcel;
    public long advert;
    public int amazon;
    public final int appmetrica;
    public String billing;
    public final String license;
    public long loadAd;
    public final C1292e metrica;
    public boolean mopub;
    public final String purchase;
    public C16975e smaato;
    public int startapp;
    public final C2125e vip;
    public InterfaceC18147e yandex;

    public C8958e(int i, int i2, String str, String str2) {
        this.ad = i2;
        switch (i2) {
            case 1:
                C2125e c2125e = new C2125e(16, new byte[16]);
                this.vip = c2125e;
                this.metrica = new C1292e(c2125e.vip);
                this.startapp = 0;
                this.adcel = 0;
                this.mopub = false;
                this.loadAd = -9223372036854775807L;
                this.license = str;
                this.appmetrica = i;
                this.purchase = str2;
                return;
            default:
                C2125e c2125e2 = new C2125e(128, new byte[128]);
                this.vip = c2125e2;
                this.metrica = new C1292e(c2125e2.vip);
                this.startapp = 0;
                this.loadAd = -9223372036854775807L;
                this.license = str;
                this.appmetrica = i;
                this.purchase = str2;
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8958e(String str) {
        this(0, 0, null, str);
        this.ad = 0;
    }

    private final void billing(boolean z) {
    }

    private final void purchase(boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ba  */
    @Override // defpackage.InterfaceC13397e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(defpackage.C1292e r23) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8958e.ad(eؒۙۚ):void");
    }

    @Override // defpackage.InterfaceC13397e
    public final void appmetrica(InterfaceC5483e interfaceC5483e, C18316e c18316e) {
        switch (this.ad) {
            case 0:
                c18316e.ad();
                c18316e.vip();
                this.billing = c18316e.appmetrica;
                c18316e.vip();
                this.yandex = interfaceC5483e.Signature(c18316e.license, 1);
                return;
            default:
                c18316e.ad();
                c18316e.vip();
                this.billing = c18316e.appmetrica;
                c18316e.vip();
                this.yandex = interfaceC5483e.Signature(c18316e.license, 1);
                return;
        }
    }

    @Override // defpackage.InterfaceC13397e
    public final void license(int i, long j) {
        switch (this.ad) {
            case 0:
                this.loadAd = j;
                return;
            default:
                this.loadAd = j;
                return;
        }
    }

    @Override // defpackage.InterfaceC13397e
    public final void metrica(boolean z) {
        int i = this.ad;
    }

    @Override // defpackage.InterfaceC13397e
    public final void vip() {
        switch (this.ad) {
            case 0:
                this.startapp = 0;
                this.adcel = 0;
                this.mopub = false;
                this.loadAd = -9223372036854775807L;
                return;
            default:
                this.startapp = 0;
                this.adcel = 0;
                this.mopub = false;
                this.loadAd = -9223372036854775807L;
                return;
        }
    }
}
