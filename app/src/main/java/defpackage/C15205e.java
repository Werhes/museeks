package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15205e implements InterfaceC13397e {
    public int advert;
    public int amazon;
    public String appmetrica;
    public int loadAd;
    public int mopub;
    public InterfaceC18147e purchase;
    public int remoteconfig;
    public boolean signatures;
    public boolean startapp;
    public int license = 0;
    public final C1292e ad = new C1292e(2, new byte[15]);
    public final C2125e vip = new C2125e();
    public final C1292e metrica = new C1292e();
    public final C9128e Signature = new C9128e();
    public int admob = -2147483647;
    public int subscription = -1;
    public long pro = -1;
    public boolean adcel = true;
    public boolean smaato = true;
    public double billing = -9.223372036854776E18d;
    public double yandex = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:213:0x028c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0486 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x046d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0420  */
    @Override // defpackage.InterfaceC13397e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(defpackage.C1292e r25) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15205e.ad(eؒۙۚ):void");
    }

    @Override // defpackage.InterfaceC13397e
    public final void appmetrica(InterfaceC5483e interfaceC5483e, C18316e c18316e) {
        c18316e.ad();
        c18316e.vip();
        this.appmetrica = c18316e.appmetrica;
        c18316e.vip();
        this.purchase = interfaceC5483e.Signature(c18316e.license, 1);
    }

    @Override // defpackage.InterfaceC13397e
    public final void license(int i, long j) {
        this.mopub = i;
        if (!this.adcel && (this.loadAd != 0 || !this.smaato)) {
            this.startapp = true;
        }
        if (j != -9223372036854775807L) {
            if (this.startapp) {
                this.yandex = j;
            } else {
                this.billing = j;
            }
        }
    }

    @Override // defpackage.InterfaceC13397e
    public final void metrica(boolean z) {
    }

    @Override // defpackage.InterfaceC13397e
    public final void vip() {
        this.license = 0;
        this.advert = 0;
        this.ad.m564extends(2);
        this.amazon = 0;
        this.loadAd = 0;
        this.admob = -2147483647;
        this.subscription = -1;
        this.remoteconfig = 0;
        this.pro = -1L;
        this.signatures = false;
        this.startapp = false;
        this.smaato = true;
        this.adcel = true;
        this.billing = -9.223372036854776E18d;
        this.yandex = -9.223372036854776E18d;
    }
}
