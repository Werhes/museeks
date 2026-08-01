package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9395e implements InterfaceC13782e {
    public final InterfaceC5483e ad;
    public long adcel;
    public long advert;
    public final byte[] appmetrica;
    public final int billing;
    public final int license;
    public final C18437e metrica;
    public int mopub;
    public final C1292e purchase;
    public int startapp;
    public final InterfaceC18147e vip;
    public final C16975e yandex;
    public static final int[] smaato = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] amazon = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    public C9395e(InterfaceC5483e interfaceC5483e, InterfaceC18147e interfaceC18147e, C18437e c18437e) {
        this.ad = interfaceC5483e;
        this.vip = interfaceC18147e;
        this.metrica = c18437e;
        int i = c18437e.vip;
        int max = Math.max(1, i / 10);
        this.billing = max;
        C1292e c1292e = new C1292e(c18437e.appmetrica);
        c1292e.pro();
        int pro = c1292e.pro();
        this.license = pro;
        int i2 = c18437e.ad;
        int i3 = c18437e.metrica;
        int i4 = (((i3 - (i2 * 4)) * 8) / (c18437e.license * i2)) + 1;
        if (pro != i4) {
            throw C15125e.ad(null, "Expected frames per block: " + i4 + "; got: " + pro);
        }
        int billing = AbstractC9413e.billing(max, pro);
        this.appmetrica = new byte[billing * i3];
        this.purchase = new C1292e(pro * 2 * i2 * billing);
        int i5 = ((i3 * i) * 8) / pro;
        C11445e c11445e = new C11445e();
        c11445e.amazon = AbstractC8542e.amazon("audio/raw");
        c11445e.yandex = i5;
        c11445e.startapp = i5;
        c11445e.loadAd = max * 2 * i2;
        c11445e.f23018class = i2;
        c11445e.f23021interface = i;
        c11445e.f23020goto = 2;
        this.yandex = new C16975e(c11445e);
    }

    @Override // defpackage.InterfaceC13782e
    public final void ad(long j) {
        this.startapp = 0;
        this.adcel = j;
        this.mopub = 0;
        this.advert = 0L;
    }

    public final void license(int i) {
        long j = this.adcel;
        long j2 = this.advert;
        C18437e c18437e = this.metrica;
        long j3 = c18437e.vip;
        String str = AbstractC9413e.ad;
        long m2555import = j + AbstractC9413e.m2555import(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = i * 2 * c18437e.ad;
        this.vip.ad(m2555import, 1, i2, this.mopub - i2, null);
        this.advert += i;
        this.mopub -= i2;
    }

    @Override // defpackage.InterfaceC13782e
    public final void metrica(int i, long j) {
        C4401e c4401e = new C4401e(this.metrica, this.license, i, j);
        this.ad.pro(c4401e);
        C16975e c16975e = this.yandex;
        InterfaceC18147e interfaceC18147e = this.vip;
        interfaceC18147e.billing(c16975e);
        interfaceC18147e.license(c4401e.appmetrica);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // defpackage.InterfaceC13782e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean vip(defpackage.InterfaceC2283e r25, long r26) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9395e.vip(eَؔؐ, long):boolean");
    }
}
