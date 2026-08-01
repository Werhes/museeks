package defpackage;

import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۦؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12886e implements InterfaceC7961e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C5453e f25732e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f25733e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C16887e f25734e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C5453e f25735e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C4753e f25736e;

    public /* synthetic */ C12886e(C4753e c4753e, C16887e c16887e, int i, C5453e c5453e, C5453e c5453e2) {
        this.f25736e = c4753e;
        this.f25734e = c16887e;
        this.f25733e = i;
        this.f25735e = c5453e;
        this.f25732e = c5453e2;
    }

    @Override // defpackage.InterfaceC7961e, defpackage.InterfaceC9650e
    public final ListenableFuture apply(Object obj) {
        C16887e c16887e = this.f25734e;
        Surface surface = (Surface) obj;
        C4753e c4753e = this.f25736e;
        c4753e.getClass();
        surface.getClass();
        try {
            c16887e.license();
            C13705e c13705e = new C13705e(surface, this.f25733e, c4753e.billing.ad, this.f25735e, this.f25732e);
            c13705e.f27152e.f19184e.ad(new RunnableC10022e(c16887e, 1), AbstractC3062e.billing());
            AbstractC4265e.yandex("Consumer can only be linked once.", c16887e.admob == null);
            c16887e.admob = c13705e;
            return AbstractC15792e.mopub(c13705e);
        } catch (C3720e e) {
            return new C4065e(1, e);
        }
    }
}
