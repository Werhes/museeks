package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: eْٔؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13250e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C11758e f26283e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26284e;

    public /* synthetic */ C13250e(C11758e c11758e, int i) {
        this.f26284e = i;
        this.f26283e = c11758e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f26284e;
        C11758e c11758e = this.f26283e;
        switch (i) {
            case 0:
                C7025e c7025e = c11758e.vip;
                return AbstractC6874e.startapp(AbstractC7518e.purchase(c7025e), AbstractC7518e.billing(c7025e));
            default:
                return c11758e.metrica ? AbstractC6874e.adcel(AbstractC7518e.appmetrica(c11758e.vip)) : C13664e.f27089e;
        }
    }
}
