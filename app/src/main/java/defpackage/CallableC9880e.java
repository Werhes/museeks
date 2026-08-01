package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۤٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC9880e implements Callable {
    public final /* synthetic */ int ad;
    public final /* synthetic */ BinderC14884e license;
    public final /* synthetic */ Bundle metrica;
    public final /* synthetic */ C8019e vip;

    public /* synthetic */ CallableC9880e(BinderC14884e binderC14884e, C8019e c8019e, Bundle bundle, int i) {
        this.ad = i;
        this.vip = c8019e;
        this.metrica = bundle;
        this.license = binderC14884e;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.ad) {
            case 0:
                BinderC14884e binderC14884e = this.license;
                binderC14884e.metrica.m3946default();
                return binderC14884e.metrica.m3959private(this.metrica, this.vip);
            default:
                BinderC14884e binderC14884e2 = this.license;
                binderC14884e2.metrica.m3946default();
                return binderC14884e2.metrica.m3959private(this.metrica, this.vip);
        }
    }
}
