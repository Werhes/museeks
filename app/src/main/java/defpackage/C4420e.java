package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4420e extends AbstractC18001e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C8724e f9592e;

    public C4420e(InterfaceC8850e interfaceC8850e) {
        super(interfaceC8850e, true);
        this.f9592e = new C8724e(this);
    }

    @Override // defpackage.AbstractC18001e
    /* renamed from: eٌؖۡ */
    public final void mo852e(Object obj) {
        this.f9592e.f17595e.smaato(obj);
    }

    @Override // defpackage.AbstractC18001e
    /* renamed from: eُٓؓ */
    public final void mo854e(Throwable th, boolean z) {
        C8724e c8724e = this.f9592e;
        C0485e c0485e = c8724e.f17595e;
        if (th instanceof CancellationException) {
            c0485e.smaato(new C16513e((CancellationException) th));
        } else if (c0485e.amazon(th)) {
            c8724e.f17594e = true;
        }
    }
}
