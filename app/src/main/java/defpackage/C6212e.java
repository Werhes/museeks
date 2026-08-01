package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6212e implements InterfaceC1381e, InterfaceC7898e, InterfaceC9307e, InterfaceC6786e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC0771e f12972e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Executor f12973e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C0560e f12974e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12975e;

    public /* synthetic */ C6212e(Executor executor, InterfaceC0771e interfaceC0771e, C0560e c0560e, int i) {
        this.f12975e = i;
        this.f12973e = executor;
        this.f12972e = interfaceC0771e;
        this.f12974e = c0560e;
    }

    @Override // defpackage.InterfaceC1381e
    public final void ad(C0560e c0560e) {
        switch (this.f12975e) {
            case 0:
                this.f12973e.execute(new RunnableC12554e((Object) this, (Object) c0560e, false, 2));
                return;
            default:
                this.f12973e.execute(new RunnableC12554e((Object) this, (Object) c0560e, false, 3));
                return;
        }
    }

    @Override // defpackage.InterfaceC9307e
    /* renamed from: eؘؕۥ */
    public void mo268e(Exception exc) {
        this.f12974e.Signature(exc);
    }

    @Override // defpackage.InterfaceC7898e
    public void license(Object obj) {
        this.f12974e.amazon(obj);
    }

    @Override // defpackage.InterfaceC6786e
    public void subscription() {
        this.f12974e.admob();
    }
}
