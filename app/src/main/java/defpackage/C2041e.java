package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: eٌؓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2041e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC16384e f5320e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5321e;

    public /* synthetic */ C2041e(AbstractC16384e abstractC16384e, int i) {
        this.f5321e = i;
        this.f5320e = abstractC16384e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5321e) {
            case 0:
                AbstractC16384e abstractC16384e = this.f5320e;
                C2042e appmetrica = abstractC16384e.mo1336class().isPro().appmetrica();
                return appmetrica == null ? AbstractC7518e.license(abstractC16384e.mo1336class().isPro(), C4590e.f9885e) : appmetrica;
            default:
                return AbstractC11309e.ad(this.f5320e, false);
        }
    }
}
