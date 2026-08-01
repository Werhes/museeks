package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4008e implements Function0 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f8917e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C3967e f8918e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ float f8919e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C3258e f8920e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8921e = 1;

    public /* synthetic */ C4008e(InterfaceC10857e interfaceC10857e, float f, C3967e c3967e, C3258e c3258e) {
        this.f8917e = interfaceC10857e;
        this.f8919e = f;
        this.f8918e = c3967e;
        this.f8920e = c3258e;
    }

    public /* synthetic */ C4008e(C17602e c17602e, C3967e c3967e, C3258e c3258e, float f) {
        this.f8917e = c17602e;
        this.f8918e = c3967e;
        this.f8920e = c3258e;
        this.f8919e = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f8921e;
        C3258e c3258e = this.f8920e;
        C3967e c3967e = this.f8918e;
        float f = this.f8919e;
        Object obj = this.f8917e;
        switch (i) {
            case 0:
                C17602e c17602e = (C17602e) obj;
                C7695e c7695e = C7695e.startapp;
                int i2 = c3967e.f8852e;
                C14960e c14960e = c3258e.f7403e;
                c14960e.getClass();
                C7695e metrica = AbstractC7291e.metrica(i2);
                C17985e c17985e = c17602e.ad;
                InterfaceC3934e interfaceC3934e = c17602e.vip;
                float f2 = c17602e.metrica;
                c17985e.startapp();
                c17985e.adcel(1);
                interfaceC3934e.pro(c17985e, f2, metrica);
                if (c14960e.ad.purchase) {
                    int i3 = c3967e.f8852e;
                    float f3 = i3 != 0 ? i3 != 1 ? i3 != 2 ? 180.0f : 90.0f : -90.0f : 0.0f;
                    float f4 = f / 2;
                    long floatToRawIntBits = (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
                    c17985e.advert((-9223372034707292160L) ^ floatToRawIntBits);
                    float[] ad = C6739e.ad();
                    C6739e.purchase(ad, f3);
                    c17985e.mopub(ad);
                    c17985e.advert(floatToRawIntBits);
                }
                c3967e.f8852e = (c3967e.f8852e + 1) % 3;
                return c17985e;
            default:
                C7695e c7695e2 = C7695e.startapp;
                int i4 = c3967e.f8852e;
                C14960e c14960e2 = c3258e.f7403e;
                c14960e2.getClass();
                AbstractC4457e ad2 = ((InterfaceC10857e) obj).ad(f, AbstractC7291e.metrica(i4));
                int i5 = c3967e.f8852e + 1;
                c14960e2.getClass();
                c3967e.f8852e = i5 % 3;
                return ad2;
        }
    }
}
