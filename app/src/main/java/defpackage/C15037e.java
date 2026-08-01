package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15037e {
    public final C11139e ad;
    public final /* synthetic */ C13119e metrica;
    public final C0576e vip = AbstractC14533e.startapp(null);

    public C15037e(C13119e c13119e, C11139e c11139e, String str) {
        this.metrica = c13119e;
        this.ad = c11139e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C2919e ad(Function1 function1, Function1 function12) {
        C0576e c0576e = this.vip;
        C2919e c2919e = (C2919e) c0576e.getValue();
        C13119e c13119e = this.metrica;
        if (c2919e == null) {
            Object invoke = function12.invoke(c13119e.metrica());
            Object invoke2 = function12.invoke(c13119e.metrica());
            C11139e c11139e = this.ad;
            AbstractC3424e abstractC3424e = (AbstractC3424e) c11139e.ad.invoke(invoke2);
            abstractC3424e.license();
            C11117e c11117e = new C11117e(c13119e, invoke, abstractC3424e, c11139e);
            c2919e = new C2919e(this, c11117e, function1, function12);
            c0576e.setValue(c2919e);
            c13119e.startapp.add(c11117e);
        }
        c2919e.f6903e = (AbstractC16858e) function12;
        c2919e.f6904e = function1;
        c2919e.metrica(c13119e.purchase());
        return c2919e;
    }
}
