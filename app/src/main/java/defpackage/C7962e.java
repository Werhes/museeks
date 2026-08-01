package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7962e extends AbstractC16858e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C10743e f16125e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f16126e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7962e(C10743e c10743e, int i) {
        super(0);
        this.f16126e = i;
        this.f16125e = c10743e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f;
        long purchase;
        float f2;
        long j;
        switch (this.f16126e) {
            case 0:
                return Boolean.valueOf(this.f16125e.adcel.getValue() != null);
            case 1:
                return this.f16125e.ad.tapsense();
            case 2:
                C10743e c10743e = this.f16125e;
                C2164e license = c10743e.license();
                if (license != null) {
                    C15816e tapsense = c10743e.ad.tapsense();
                    C13648e c13648e = (C13648e) tapsense.f31190e;
                    int ordinal = tapsense.m4021native().ordinal();
                    if (ordinal == 0) {
                        purchase = c13648e.purchase() & 4294967295L;
                    } else {
                        if (ordinal != 1) {
                            throw new C14803e(10);
                        }
                        purchase = c13648e.purchase() >> 32;
                    }
                    long vip = license.vip();
                    f = (((int) purchase) - AbstractC17957e.purchase(AbstractC12246e.ad((int) (vip >> 32), (int) (4294967295L & vip)), c10743e.purchase())) - 1.0f;
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(f);
            case 3:
                C10743e c10743e2 = this.f16125e;
                C2164e license2 = c10743e2.license();
                if (license2 != null) {
                    long vip2 = license2.vip();
                    float purchase2 = AbstractC17957e.purchase(AbstractC12246e.ad((int) (vip2 >> 32), (int) (vip2 & 4294967295L)), c10743e2.purchase());
                    long metrica = license2.metrica();
                    int ordinal2 = c10743e2.purchase().ordinal();
                    if (ordinal2 == 0) {
                        j = metrica & 4294967295L;
                    } else {
                        if (ordinal2 != 1) {
                            throw new C14803e(10);
                        }
                        j = metrica >> 32;
                    }
                    f2 = (purchase2 + ((int) j)) - 1.0f;
                } else {
                    f2 = 0.0f;
                }
                return Float.valueOf(f2);
            default:
                return this.f16125e.purchase();
        }
    }
}
