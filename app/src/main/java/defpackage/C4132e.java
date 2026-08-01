package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4132e implements InterfaceC18244e {
    public final /* synthetic */ int ad;
    public static final /* synthetic */ C4132e vip = new C4132e(0);
    public static final /* synthetic */ C4132e metrica = new C4132e(2);

    public /* synthetic */ C4132e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC18244e
    public final ListenableFuture apply(Object obj) {
        switch (this.ad) {
            case 0:
                C10427e c10427e = (C10427e) obj;
                throw new C4914e(c10427e.f20605e.f733e, c10427e.getMessage(), c10427e);
            case 1:
                throw null;
            default:
                return AbstractC2017e.license(BuildConfig.FLAVOR);
        }
    }
}
