package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15721e implements InterfaceC11659e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C15721e f30971e = new C15721e(null);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C4065e f30972e;

    public C15721e(Object obj) {
        this.f30972e = AbstractC15792e.mopub(obj);
    }

    @Override // defpackage.InterfaceC11659e
    public final void loadAd(InterfaceC4868e interfaceC4868e) {
    }

    @Override // defpackage.InterfaceC11659e
    public final void metrica(Executor executor, InterfaceC4868e interfaceC4868e) {
        this.f30972e.ad(new RunnableC16019e(this, interfaceC4868e, 25), executor);
    }

    @Override // defpackage.InterfaceC11659e
    public final ListenableFuture startapp() {
        return this.f30972e;
    }
}
