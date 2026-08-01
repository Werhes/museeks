package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7635e extends AbstractC6690e {
    public static final Object admob = new Object();
    public final C15197e Signature;
    public final long adcel;
    public final boolean advert;
    public final Object amazon;
    public final long appmetrica;
    public final long billing;
    public final C1962e loadAd;
    public final boolean mopub;
    public final long purchase;
    public final boolean smaato;
    public final long startapp;
    public final long yandex;

    static {
        C9466e c9466e = new C9466e();
        C3560e c3560e = new C3560e();
        List list = Collections.EMPTY_LIST;
        C1410e c1410e = C1410e.f4222e;
        C9457e c9457e = new C9457e();
        C13325e c13325e = C13325e.license;
        Uri uri = Uri.EMPTY;
        AbstractC2301e.subscription(((Uri) c3560e.appmetrica) == null || ((UUID) c3560e.license) != null);
        if (uri != null) {
            new C16914e(uri, null, ((UUID) c3560e.license) != null ? new C8369e(c3560e) : null, null, list, null, c1410e, null, -9223372036854775807L);
        }
        new C14435e(c9466e);
        new C15197e(c9457e);
        C12053e c12053e = C12053e.f24142throw;
    }

    public C7635e(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, C9821e c9821e, C1962e c1962e, C15197e c15197e) {
        this.appmetrica = j;
        this.purchase = j2;
        this.billing = j3;
        this.yandex = j4;
        this.startapp = j5;
        this.adcel = j6;
        this.mopub = z;
        this.advert = z2;
        this.smaato = z3;
        this.amazon = c9821e;
        c1962e.getClass();
        this.loadAd = c1962e;
        this.Signature = c15197e;
    }

    @Override // defpackage.AbstractC6690e
    public final Object advert(int i) {
        AbstractC2301e.mopub(i, 1);
        return admob;
    }

    @Override // defpackage.AbstractC6690e
    public final int loadAd() {
        return 1;
    }

    @Override // defpackage.AbstractC6690e
    public final C6158e purchase(int i, C6158e c6158e, boolean z) {
        AbstractC2301e.mopub(i, 1);
        Object obj = z ? admob : null;
        long j = -this.startapp;
        c6158e.getClass();
        c6158e.startapp(null, obj, 0, this.billing, j, C11541e.purchase, false);
        return c6158e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // defpackage.AbstractC6690e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C11501e smaato(int r25, defpackage.C11501e r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            defpackage.AbstractC2301e.mopub(r2, r1)
            long r1 = r0.adcel
            boolean r14 = r0.advert
            if (r14 == 0) goto L2d
            boolean r3 = r0.smaato
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.yandex
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L26
        L23:
            r16 = r5
            goto L2f
        L26:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2d
            goto L23
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = defpackage.C11501e.admob
            r21 = 0
            long r1 = r0.startapp
            eِؓٝ r5 = r0.loadAd
            java.lang.Object r6 = r0.amazon
            long r7 = r0.appmetrica
            long r9 = r0.purchase
            boolean r13 = r0.mopub
            eٕؓ۠ r15 = r0.Signature
            long r11 = r0.yandex
            r20 = 0
            r3 = r26
            r22 = r1
            r18 = r11
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.vip(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7635e.smaato(int, eِؔۨ, long):eِؔۨ");
    }

    @Override // defpackage.AbstractC6690e
    public final int vip(Object obj) {
        return admob.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.AbstractC6690e
    public final int yandex() {
        return 1;
    }
}
