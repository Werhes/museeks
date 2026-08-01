package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِِؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11458e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10469e f23062e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23063e;

    public /* synthetic */ C11458e(C10469e c10469e, int i) {
        this.f23063e = i;
        this.f23062e = c10469e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f23063e) {
            case 0:
                return Boolean.valueOf(this.f23062e.f27016e);
            default:
                C11795e c11795e = this.f23062e.f20667e;
                if (!c11795e.f27022e.f27016e) {
                    return null;
                }
                EnumC16488e m3239e = c11795e.m3239e();
                if (!m3239e.ad()) {
                    return null;
                }
                if (m3239e.vip()) {
                    return c11795e.m3242e(null);
                }
                C11795e purchase = ((C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(c11795e)).getFocusOwner()).purchase();
                if (purchase != null) {
                    return purchase.m3242e(AbstractC5851e.adcel(c11795e));
                }
                return null;
        }
    }
}
