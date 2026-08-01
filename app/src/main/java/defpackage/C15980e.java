package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15980e implements InterfaceC13397e {
    public final C0912e ad;
    public InterfaceC18147e adcel;
    public boolean advert;
    public boolean amazon;
    public long billing;
    public final boolean metrica;
    public C14262e mopub;
    public String startapp;
    public final boolean vip;
    public final boolean[] yandex = new boolean[3];
    public final C6981e license = new C6981e(7);
    public final C6981e appmetrica = new C6981e(8);
    public final C6981e purchase = new C6981e(6);
    public long smaato = -9223372036854775807L;
    public final C1292e loadAd = new C1292e();

    public C15980e(C0912e c0912e, boolean z, boolean z2) {
        this.ad = c0912e;
        this.vip = z;
        this.metrica = z2;
    }

    @Override // defpackage.InterfaceC13397e
    public final void ad(C1292e c1292e) {
        int i;
        this.adcel.getClass();
        String str = AbstractC9413e.ad;
        int i2 = c1292e.vip;
        int i3 = c1292e.metrica;
        byte[] bArr = c1292e.ad;
        this.billing += c1292e.ad();
        this.adcel.appmetrica(c1292e.ad(), c1292e);
        while (true) {
            int appmetrica = AbstractC17595e.appmetrica(bArr, i2, i3, this.yandex);
            if (appmetrica == i3) {
                billing(i2, i3, bArr);
                return;
            }
            int i4 = bArr[appmetrica + 3] & 31;
            if (appmetrica <= 0 || bArr[appmetrica - 1] != 0) {
                i = 3;
            } else {
                appmetrica--;
                i = 4;
            }
            int i5 = appmetrica - i2;
            if (i5 > 0) {
                billing(i2, appmetrica, bArr);
            }
            int i6 = i3 - appmetrica;
            long j = this.billing - i6;
            purchase(i6, i5 < 0 ? -i5 : 0, j, this.smaato);
            yandex(i4, j, this.smaato);
            i2 = appmetrica + i;
        }
    }

    @Override // defpackage.InterfaceC13397e
    public final void appmetrica(InterfaceC5483e interfaceC5483e, C18316e c18316e) {
        c18316e.ad();
        c18316e.vip();
        this.startapp = c18316e.appmetrica;
        c18316e.vip();
        InterfaceC18147e Signature = interfaceC5483e.Signature(c18316e.license, 2);
        this.adcel = Signature;
        this.mopub = new C14262e(Signature, this.vip, this.metrica);
        this.ad.metrica(interfaceC5483e, c18316e);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void billing(int r17, int r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15980e.billing(int, int, byte[]):void");
    }

    @Override // defpackage.InterfaceC13397e
    public final void license(int i, long j) {
        this.smaato = j;
        this.amazon = ((i & 2) != 0) | this.amazon;
    }

    @Override // defpackage.InterfaceC13397e
    public final void metrica(boolean z) {
        this.adcel.getClass();
        String str = AbstractC9413e.ad;
        if (z) {
            ((C17790e) this.ad.f3333e).adcel(0);
            purchase(0, 0, this.billing, this.smaato);
            yandex(9, this.billing, this.smaato);
            purchase(0, 0, this.billing, this.smaato);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x01cd, code lost:
    
        if (r3.adcel == r4.adcel) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01d7, code lost:
    
        if (r8 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e9, code lost:
    
        if (r3.amazon == r4.amazon) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01fa, code lost:
    
        if (r3.Signature == r4.Signature) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0208, code lost:
    
        if (r3.advert == r4.advert) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0265, code lost:
    
        if (r3 == 1) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void purchase(int r26, int r27, long r28, long r30) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15980e.purchase(int, int, long, long):void");
    }

    @Override // defpackage.InterfaceC13397e
    public final void vip() {
        this.billing = 0L;
        this.amazon = false;
        this.smaato = -9223372036854775807L;
        AbstractC17595e.license(this.yandex);
        this.license.billing();
        this.appmetrica.billing();
        this.purchase.billing();
        ((C17790e) this.ad.f3333e).adcel(0);
        C14262e c14262e = this.mopub;
        if (c14262e != null) {
            c14262e.mopub = false;
            c14262e.loadAd = false;
            C0102e c0102e = c14262e.amazon;
            c0102e.vip = false;
            c0102e.ad = false;
        }
    }

    public final void yandex(int i, long j, long j2) {
        if (!this.advert || this.mopub.metrica) {
            this.license.yandex(i);
            this.appmetrica.yandex(i);
        }
        this.purchase.yandex(i);
        C14262e c14262e = this.mopub;
        boolean z = this.amazon;
        c14262e.startapp = i;
        c14262e.advert = j2;
        c14262e.adcel = j;
        c14262e.remoteconfig = z;
        if (!c14262e.vip || i != 1) {
            if (!c14262e.metrica) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        C0102e c0102e = c14262e.smaato;
        c14262e.smaato = c14262e.amazon;
        c14262e.amazon = c0102e;
        c0102e.vip = false;
        c0102e.ad = false;
        c14262e.yandex = 0;
        c14262e.mopub = true;
    }
}
