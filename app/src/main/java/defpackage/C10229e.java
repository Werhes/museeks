package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10229e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C8933e f20234e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20235e;

    public /* synthetic */ C10229e(C8933e c8933e, int i) {
        this.f20235e = i;
        this.f20234e = c8933e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20235e) {
            case 0:
                C8933e c8933e = this.f20234e;
                return Float.valueOf(c8933e.ad() / c8933e.billing.purchase() < 1.0f ? 0.3f : 1.0f);
            default:
                return Float.valueOf(this.f20234e.purchase.purchase() * 0.5f);
        }
    }
}
