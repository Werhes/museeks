package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4324e implements InterfaceC3518e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static volatile C4324e f9456e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0409e f9457e;

    static {
        new String(new byte[]{13, 10});
    }

    public C4324e() {
        Csuper ad = AbstractC8507e.ad();
        ad.mo3904implements("IND", "Indications field");
        ad.mo3904implements("LYR", "Lyrics multi line text");
        ad.mo3904implements("INF", "Additional information multi line text");
        ad.mo3904implements("AUT", "Lyrics/Music Author name");
        ad.mo3904implements("EAL", "Extended Album name");
        ad.mo3904implements("EAR", "Extended Artist name");
        ad.mo3904implements("ETT", "Extended Track Title");
        ad.mo3904implements("IMG", "Link to an image files");
        this.f9457e = ad.mopub(true);
    }

    @Override // defpackage.InterfaceC3518e
    public final String getValue(String str) {
        return (String) this.f9457e.get(str);
    }
}
