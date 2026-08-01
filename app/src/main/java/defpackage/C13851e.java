package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: eًٓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13851e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC1104e f27435e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27436e;

    public /* synthetic */ C13851e(AbstractC1104e abstractC1104e, int i) {
        this.f27436e = i;
        this.f27435e = abstractC1104e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27436e) {
            case 0:
                AbstractC1104e abstractC1104e = this.f27435e;
                C7901e metrica = abstractC1104e.mo1336class().isPro().metrica();
                return metrica == null ? AbstractC7518e.metrica(abstractC1104e.mo1336class().isPro(), C4590e.f9885e) : metrica;
            default:
                return AbstractC11309e.ad(this.f27435e, true);
        }
    }
}
