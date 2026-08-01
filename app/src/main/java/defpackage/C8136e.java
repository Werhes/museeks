package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8136e extends IllegalStateException implements InterfaceC13853e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f16514e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f16515e;

    public C8136e(String str, String str2) {
        super(AbstractC17861e.admob("Header ", str, " is not allowed for ", str2));
        this.f16515e = str;
        this.f16514e = str2;
    }

    @Override // defpackage.InterfaceC13853e
    public final Throwable ad() {
        C8136e c8136e = new C8136e(this.f16515e, this.f16514e);
        c8136e.initCause(this);
        return c8136e;
    }
}
