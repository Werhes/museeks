package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC9692e implements Callable {
    public final /* synthetic */ int ad;
    public final /* synthetic */ BinderC14884e appmetrica;
    public final /* synthetic */ String license;
    public final /* synthetic */ String metrica;
    public final /* synthetic */ String vip;

    public /* synthetic */ CallableC9692e(BinderC14884e binderC14884e, String str, String str2, String str3, int i) {
        this.ad = i;
        this.vip = str;
        this.metrica = str2;
        this.license = str3;
        this.appmetrica = binderC14884e;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.ad) {
            case 0:
                BinderC14884e binderC14884e = this.appmetrica;
                binderC14884e.metrica.m3946default();
                C1248e c1248e = binderC14884e.metrica.f30353e;
                C15398e.m3939break(c1248e);
                return c1248e.m539e(this.vip, this.metrica, this.license);
            case 1:
                BinderC14884e binderC14884e2 = this.appmetrica;
                binderC14884e2.metrica.m3946default();
                C1248e c1248e2 = binderC14884e2.metrica.f30353e;
                C15398e.m3939break(c1248e2);
                return c1248e2.m539e(this.vip, this.metrica, this.license);
            case 2:
                BinderC14884e binderC14884e3 = this.appmetrica;
                binderC14884e3.metrica.m3946default();
                C1248e c1248e3 = binderC14884e3.metrica.f30353e;
                C15398e.m3939break(c1248e3);
                return c1248e3.m513e(this.vip, this.metrica, this.license);
            default:
                BinderC14884e binderC14884e4 = this.appmetrica;
                binderC14884e4.metrica.m3946default();
                C1248e c1248e4 = binderC14884e4.metrica.f30353e;
                C15398e.m3939break(c1248e4);
                return c1248e4.m513e(this.vip, this.metrica, this.license);
        }
    }
}
