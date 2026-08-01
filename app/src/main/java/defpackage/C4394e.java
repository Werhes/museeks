package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۜٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4394e extends AbstractC3954e {
    public final C11447e adcel;
    public C18185e advert;
    public C9317e mopub;
    public final C4383e startapp;

    public C4394e(C4383e c4383e, AbstractC14073e abstractC14073e) {
        super(abstractC14073e);
        this.startapp = c4383e;
        this.adcel = AbstractC17331e.vip();
    }

    @Override // defpackage.AbstractC3954e
    public final void ad(InterfaceC2235e interfaceC2235e, long j, long j2, C17985e c17985e) {
        C9317e c9317e;
        int i;
        char c;
        C1362e c1362e;
        C4383e c4383e = this.startapp;
        float mo497instanceof = interfaceC2235e.mo497instanceof(c4383e.ad);
        float mo497instanceof2 = interfaceC2235e.mo497instanceof(c4383e.vip);
        long j3 = c4383e.metrica;
        float mo497instanceof3 = interfaceC2235e.mo497instanceof(C8163e.ad(j3));
        float mo497instanceof4 = interfaceC2235e.mo497instanceof(C8163e.vip(j3));
        C11447e c11447e = this.adcel;
        if (c17985e != null) {
            int ceil = (int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)));
            int ceil2 = (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)));
            if (mo497instanceof2 > 0.0f) {
                C0763e license = c17985e.license();
                c = ' ';
                float f = license.metrica - license.ad;
                float f2 = license.license - license.vip;
                i = ceil;
                c1362e = AbstractC7214e.ad((int) Math.ceil(f), (int) Math.ceil(f2), 1, 24);
                C11648e ad = AbstractC17324e.ad(c1362e);
                ad.appmetrica(c17985e, c11447e);
                ad.amazon(0.0f, 0.0f, f, f2, 1);
                C11447e ad2 = C17138e.ad(c11447e, 0, null, 5);
                ad2.advert(mo497instanceof2 * 2.0f);
                Unit unit = Unit.INSTANCE;
                ad.appmetrica(c17985e, ad2);
            } else {
                i = ceil;
                c = ' ';
                c1362e = null;
            }
            int ceil3 = ((int) Math.ceil(mo497instanceof)) * 2;
            C1362e ad3 = AbstractC7214e.ad(i + ceil3, ceil2 + ceil3, 1, 24);
            Bitmap bitmap = ad3.ad;
            C11648e ad4 = AbstractC17324e.ad(ad3);
            if (c1362e != null) {
                ad4.mopub(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), C17138e.ad(c11447e, 0, null, 15));
                ad4.Signature(c1362e, (Float.floatToRawIntBits(mo497instanceof3) << c) | (Float.floatToRawIntBits(mo497instanceof4) & 4294967295L), C17138e.ad(c11447e, 11, mo497instanceof > 0.0f ? AbstractC6537e.ad(mo497instanceof) : null, 9));
                c9317e = new C9317e(AbstractC14520e.ad(ad3));
            } else {
                ad4.billing();
                ad4.loadAd(mo497instanceof3, mo497instanceof4);
                ad4.appmetrica(c17985e, C17138e.ad(c11447e, 0, mo497instanceof > 0.0f ? AbstractC6537e.ad(mo497instanceof) : null, 11));
                ad4.admob();
                ad4.mopub(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), C17138e.ad(c11447e, 11, null, 13));
                c9317e = new C9317e(AbstractC14520e.ad(ad3));
            }
        } else {
            int i2 = (int) (j >> 32);
            int i3 = (int) (j & 4294967295L);
            C1362e ad5 = AbstractC7214e.ad((int) Math.ceil(Float.intBitsToFloat(i2)), (int) Math.ceil(Float.intBitsToFloat(i3)), 1, 24);
            C11648e ad6 = AbstractC17324e.ad(ad5);
            float f3 = mo497instanceof3 + mo497instanceof2;
            float f4 = mo497instanceof4 + mo497instanceof2;
            ad6.purchase(f3, f4, Math.max(f3, (Float.intBitsToFloat(i2) + mo497instanceof3) - mo497instanceof2), Math.max(f4, (Float.intBitsToFloat(i3) + mo497instanceof4) - mo497instanceof2), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), C17138e.ad(c11447e, 0, mo497instanceof > 0.0f ? AbstractC6537e.ad(mo497instanceof) : null, 11));
            Bitmap bitmap2 = ad5.ad;
            ad6.mopub(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight(), C17138e.ad(c11447e, 11, null, 13));
            c9317e = new C9317e(AbstractC14520e.ad(ad5));
        }
        this.mopub = c9317e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r5 == false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC3954e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void metrica(defpackage.InterfaceC2235e r17, long r18, defpackage.C17985e r20, float r21, defpackage.C2815e r22, defpackage.AbstractC4457e r23, int r24) {
        /*
            r16 = this;
            r0 = r16
            eٍؚۧ r1 = r0.mopub
            if (r1 == 0) goto L71
            eؖۛ۟ r2 = r0.startapp
            eۣؖؒ r3 = r2.purchase
            boolean r4 = r3 instanceof defpackage.AbstractC9876e
            if (r4 == 0) goto L2d
            eٙۦ r4 = r0.advert
            if (r4 == 0) goto L1d
            eٍٕۤ r5 = r4.license
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L1b
            goto L1d
        L1b:
            r1 = r4
            goto L2d
        L1d:
            eٙۦ r4 = new eٙۦ
            eٍٕۤ r1 = defpackage.AbstractC7595e.billing(r1)
            eٍٕۤ r3 = defpackage.AbstractC7595e.billing(r3)
            r4.<init>(r1, r3)
            r0.advert = r4
            goto L1b
        L2d:
            r4 = r1
            if (r20 == 0) goto L42
            r7 = 0
            r10 = 8
            r3 = r17
            r6 = r21
            r8 = r22
            r9 = r24
            r5 = r4
            r4 = r20
            defpackage.AbstractC4653e.loadAd(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L42:
            r5 = 0
            r9 = r18
            boolean r1 = defpackage.AbstractC14520e.appmetrica(r9, r5)
            if (r1 == 0) goto L5f
            r10 = 0
            r13 = 22
            r5 = 0
            r7 = 0
            r3 = r17
            r9 = r21
            r11 = r22
            r12 = r24
            defpackage.AbstractC4653e.admob(r3, r4, r5, r7, r9, r10, r11, r12, r13)
            return
        L5f:
            int r14 = r2.license
            r12 = 0
            r15 = 38
            r5 = 0
            r7 = 0
            r3 = r17
            r11 = r21
            r13 = r22
            defpackage.AbstractC4653e.remoteconfig(r3, r4, r5, r7, r9, r11, r12, r13, r14, r15)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4394e.metrica(eؓۦۚ, long, e٘ۙۥ, float, eَؔۙ, eۣؖؒ, int):void");
    }
}
