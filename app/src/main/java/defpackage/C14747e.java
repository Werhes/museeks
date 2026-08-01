package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14747e extends AbstractC17732e {

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public static final C11447e f29167e;

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public C12009e f29168e;

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public final C9011e f29169e;

    static {
        C11447e vip = AbstractC17331e.vip();
        vip.appmetrica(C3618e.purchase);
        vip.advert(1.0f);
        vip.smaato(1);
        f29167e = vip;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eٌ۟ٝ, eْۤۡ] */
    /* JADX WARN: Type inference failed for: r3v4, types: [eٖؖؓ] */
    public C14747e(C13915e c13915e) {
        super(c13915e);
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f27020e = 0;
        this.f29169e = abstractC13616e;
        abstractC13616e.f27018e = this;
        this.f29168e = c13915e.f27587e != null ? new AbstractC4134e(this) : null;
    }

    @Override // defpackage.InterfaceC16719e
    public final AbstractC2832e admob(long j) {
        if (this.f34781e) {
            j = this.f29168e.f6805e;
        }
        m1210strictfp(j);
        C13915e c13915e = this.f34782e;
        C12431e ads = c13915e.ads();
        Object[] objArr = ads.f24870e;
        int i = ads.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            ((C13915e) objArr[i2]).f27612e.Signature.f25181e = 3;
        }
        m4418e(c13915e.f27606e.vip(this, c13915e.amazon(), j));
        m4407e();
        return this;
    }

    @Override // defpackage.AbstractC17732e, defpackage.AbstractC2832e
    /* renamed from: case */
    public final void mo1207case(long j, float f, C16446e c16446e) {
        C14747e c14747e;
        if (this.f34784e) {
            c14747e = this;
            c14747e.m4397e(mo2526e().f9110e, f, null, c16446e);
        } else {
            m4397e(j, f, null, c16446e);
            c14747e = this;
        }
        if (c14747e.f18511e) {
            return;
        }
        c14747e.f34782e.f27612e.Signature.m3364switch();
    }

    @Override // defpackage.AbstractC2832e
    /* renamed from: catch */
    public final void mo392catch(long j, float f, Function1 function1) {
        if (this.f34784e) {
            m4397e(mo2526e().f9110e, f, function1, null);
        } else {
            m4397e(j, f, function1, null);
        }
        if (this.f18511e) {
            return;
        }
        this.f34782e.f27612e.Signature.m3364switch();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // defpackage.AbstractC17732e
    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3841e(defpackage.InterfaceC11124e r12, long r13, defpackage.C2106e r15, int r16, boolean r17) {
        /*
            r11 = this;
            eِٓؔ r0 = r11.f34782e
            boolean r1 = r12.amazon(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            boolean r1 = r11.m4408e(r13)
            if (r1 == 0) goto L16
            r9 = r16
            r10 = r17
        L14:
            r3 = r2
            goto L34
        L16:
            r9 = r16
            if (r9 != r2) goto L32
            long r4 = r11.m4386e()
            float r1 = r11.m4394e(r13, r4)
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r4 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r4
            r4 = 2139095040(0x7f800000, float:Infinity)
            if (r1 >= r4) goto L32
            r10 = r3
            goto L14
        L30:
            r9 = r16
        L32:
            r10 = r17
        L34:
            if (r3 == 0) goto L7a
            int r1 = r15.f5431e
            eّّؔ r0 = r0.applovin()
            java.lang.Object[] r3 = r0.f24870e
            int r0 = r0.f24868e
            int r0 = r0 - r2
        L41:
            if (r0 < 0) goto L78
            r2 = r3[r0]
            r5 = r2
            eِٓؔ r5 = (defpackage.C13915e) r5
            boolean r2 = r5.m3724throw()
            if (r2 == 0) goto L73
            r4 = r12
            r6 = r13
            r8 = r15
            r4.adcel(r5, r6, r8, r9, r10)
            long r6 = r15.appmetrica()
            float r2 = defpackage.AbstractC1574e.license(r6)
            r9 = 0
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 >= 0) goto L73
            boolean r2 = defpackage.AbstractC1574e.purchase(r6)
            if (r2 == 0) goto L73
            boolean r2 = defpackage.AbstractC1574e.appmetrica(r6)
            if (r2 != 0) goto L73
            boolean r2 = r12.advert(r15, r5)
            if (r2 == 0) goto L78
        L73:
            int r0 = r0 + (-1)
            r9 = r16
            goto L41
        L78:
            r15.f5431e = r1
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14747e.mo3841e(eُٜ۟, long, eُؓۜ, int, boolean):void");
    }

    @Override // defpackage.AbstractC17732e
    /* renamed from: eِؕٛ */
    public final void mo2522e(InterfaceC14576e interfaceC14576e, C16446e c16446e) {
        C13915e c13915e = this.f34782e;
        InterfaceC16590e ad = AbstractC10501e.ad(c13915e);
        C12431e applovin = c13915e.applovin();
        Object[] objArr = applovin.f24870e;
        int i = applovin.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            C13915e c13915e2 = (C13915e) objArr[i2];
            if (c13915e2.m3724throw()) {
                c13915e2.adcel(interfaceC14576e, c16446e);
            }
        }
        if (((ViewTreeObserverOnGlobalLayoutListenerC5014e) ad).getShowLayoutBounds()) {
            long j = this.f6803e;
            interfaceC14576e.mopub(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f29167e);
        }
    }

    @Override // defpackage.AbstractC17732e
    /* renamed from: eٍۢؒ */
    public final AbstractC13616e mo2524e() {
        return this.f29169e;
    }

    @Override // defpackage.AbstractC17732e
    /* renamed from: eؘٖؗ */
    public final AbstractC4134e mo2526e() {
        return this.f29168e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eٖؖؓ, eِۜۛ] */
    @Override // defpackage.AbstractC17732e
    /* renamed from: e٘ٔ٘ */
    public final void mo2527e() {
        if (this.f29168e == null) {
            this.f29168e = new AbstractC4134e(this);
        }
    }

    @Override // defpackage.InterfaceC16719e
    public final int loadAd(int i) {
        C16911e signatures = this.f34782e.signatures();
        InterfaceC2747e applovin = signatures.applovin();
        C13915e c13915e = (C13915e) signatures.f33137e;
        return applovin.ad((AbstractC17732e) c13915e.f27592e.appmetrica, c13915e.amazon(), i);
    }

    @Override // defpackage.InterfaceC16719e
    public final int metrica(int i) {
        C16911e signatures = this.f34782e.signatures();
        InterfaceC2747e applovin = signatures.applovin();
        C13915e c13915e = (C13915e) signatures.f33137e;
        return applovin.license((AbstractC17732e) c13915e.f27592e.appmetrica, c13915e.amazon(), i);
    }

    @Override // defpackage.InterfaceC16719e
    public final int smaato(int i) {
        C16911e signatures = this.f34782e.signatures();
        InterfaceC2747e applovin = signatures.applovin();
        C13915e c13915e = (C13915e) signatures.f33137e;
        return applovin.metrica((AbstractC17732e) c13915e.f27592e.appmetrica, c13915e.amazon(), i);
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: static */
    public final int mo2528static(AbstractC17016e abstractC17016e) {
        C12009e c12009e = this.f29168e;
        if (c12009e != null) {
            return c12009e.mo2528static(abstractC17016e);
        }
        C12570e c12570e = this.f34782e.f27612e.Signature;
        C10324e c10324e = c12570e.f25208e;
        if (!c12570e.f25183e) {
            if (c12570e.f25213e.license == 1) {
                c10324e.purchase = true;
                if (c10324e.vip) {
                    c12570e.f25200e = true;
                    c12570e.f25206e = true;
                }
            } else {
                c10324e.billing = true;
            }
        }
        C14747e appmetrica = c12570e.appmetrica();
        boolean z = appmetrica.f18514e;
        appmetrica.f18514e = true;
        c12570e.crashlytics();
        appmetrica.f18514e = z;
        Integer num = (Integer) c10324e.startapp.get(abstractC17016e);
        return num != null ? num.intValue() : RecyclerView.UNDEFINED_DURATION;
    }

    @Override // defpackage.InterfaceC16719e
    /* renamed from: while */
    public final int mo2529while(int i) {
        C16911e signatures = this.f34782e.signatures();
        InterfaceC2747e applovin = signatures.applovin();
        C13915e c13915e = (C13915e) signatures.f33137e;
        return applovin.appmetrica((AbstractC17732e) c13915e.f27592e.appmetrica, c13915e.amazon(), i);
    }
}
