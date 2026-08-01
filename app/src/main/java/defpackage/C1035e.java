package defpackage;

import java.util.concurrent.Executors;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْْؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1035e implements InterfaceC7449e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ String f3496e;

    public /* synthetic */ C1035e(String str) {
        this.f3496e = str;
    }

    public InterfaceC15288e ad() {
        return new C7850e(16, new C14530e(Executors.newSingleThreadExecutor(new ThreadFactoryC9760e(this.f3496e, 1))));
    }

    @Override // defpackage.InterfaceC7449e
    public Object startapp(C6584e c6584e, C18424e c18424e, int i) {
        return c6584e.m2207interface(c18424e, this.f3496e);
    }
}
