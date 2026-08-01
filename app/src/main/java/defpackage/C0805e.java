package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؓ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0805e extends C15125e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC17475e f3194e;

    public C0805e(String str, C1410e c1410e) {
        super(str, null, false, 1);
        this.f3194e = AbstractC17475e.remoteconfig(c1410e);
    }

    @Override // defpackage.C15125e, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        AbstractC17475e abstractC17475e = this.f3194e;
        if (abstractC17475e.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + abstractC17475e;
    }
}
