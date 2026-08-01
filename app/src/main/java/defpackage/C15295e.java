package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15295e extends Exception {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Throwable f30221e;

    public C15295e(Throwable th, AbstractC3743e abstractC3743e, InterfaceC8850e interfaceC8850e) {
        super("Coroutine dispatcher " + abstractC3743e + " threw an exception, context = " + interfaceC8850e, th);
        this.f30221e = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f30221e;
    }
}
