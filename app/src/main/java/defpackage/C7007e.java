package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: eًؚؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7007e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C8746e f14343e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14344e;

    public /* synthetic */ C7007e(C8746e c8746e, int i) {
        this.f14344e = i;
        this.f14343e = c8746e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14344e) {
            case 0:
                AbstractC16232e abstractC16232e = (AbstractC16232e) obj;
                if (abstractC16232e.metrica()) {
                    return "*";
                }
                String m2481final = this.f14343e.m2481final(abstractC16232e.vip());
                if (abstractC16232e.ad() == 1) {
                    return m2481final;
                }
                return AbstractC8647e.m2461throw(abstractC16232e.ad()) + ' ' + m2481final;
            default:
                return this.f14343e.m2481final((AbstractC1186e) obj);
        }
    }
}
