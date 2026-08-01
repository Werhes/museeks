package defpackage;

import android.graphics.Paint;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8700e extends AbstractC13616e implements InterfaceC8501e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public C11447e f17553e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public long f17554e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public InterfaceC16154e f17555e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public float f17556e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public Paint f17557e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C9156e f17558e;

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final /* synthetic */ void mo292case() {
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    public final void mo294e(C4017e c4017e) {
        C4017e c4017e2;
        C14434e c14434e = c4017e.f8940e;
        InterfaceC14576e m4557this = c14434e.f28537e.m4557this();
        if (this.f17553e == null) {
            C11447e vip = AbstractC17331e.vip();
            this.f17553e = vip;
            this.f17557e = vip.ad;
            m2466e();
        }
        if (this.f17558e == null) {
            this.f17558e = new C9156e(this.f17555e, c14434e.f28537e.m4560try(), c4017e.getLayoutDirection(), c4017e);
            c4017e2 = c4017e;
        } else {
            c4017e2 = c4017e;
        }
        AbstractC14073e ads = this.f17558e.ads(this.f17555e, c14434e.f28537e.m4560try(), c4017e2.getLayoutDirection(), c4017e2);
        if (ads instanceof C14340e) {
            m4557this.startapp(((C14340e) ads).appmetrica, this.f17553e);
        } else if (ads instanceof C2904e) {
            long j = ((C2904e) ads).appmetrica.appmetrica;
            m4557this.purchase(0.0f, 0.0f, Float.intBitsToFloat((int) (c14434e.f28537e.m4560try() >> 32)), Float.intBitsToFloat((int) (c14434e.f28537e.m4560try() & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), this.f17553e);
        } else {
            if (!(ads instanceof C10435e)) {
                throw new C14803e(10);
            }
            m4557this.appmetrica(((C10435e) ads).appmetrica, this.f17553e);
        }
        c4017e2.ad();
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final void m2466e() {
        int m2193extends = AbstractC6532e.m2193extends(C3618e.vip(0.0f, this.f17554e));
        int m2193extends2 = AbstractC6532e.m2193extends(this.f17554e);
        this.f17557e.setColor(m2193extends);
        this.f17557e.setShadowLayer(this.f17556e, 0.0f, 0.0f, m2193extends2);
    }
}
