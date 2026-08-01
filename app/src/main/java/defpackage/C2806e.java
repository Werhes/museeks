package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۘٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2806e extends AbstractC9404e implements InterfaceC13853e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC13984e f6755e;

    public C2806e(InterfaceC13984e interfaceC13984e) {
        super("Cannot transform this request's content to " + interfaceC13984e);
        this.f6755e = interfaceC13984e;
    }

    @Override // defpackage.InterfaceC13853e
    public final Throwable ad() {
        C2806e c2806e = new C2806e(this.f6755e);
        c2806e.initCause(this);
        return c2806e;
    }
}
