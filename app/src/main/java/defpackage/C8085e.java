package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٝۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8085e extends AbstractC6124e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public volatile boolean f16433e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f16434e;

    public C8085e(String str, C2580e c2580e, boolean z) {
        super(str, c2580e);
        this.f16434e = z;
    }

    @Override // defpackage.AbstractC6124e
    public final /* synthetic */ Object ad() {
        return Boolean.valueOf(this.f16434e);
    }

    @Override // defpackage.AbstractC6124e
    public final /* synthetic */ Object appmetrica() {
        return Boolean.valueOf(this.f16433e);
    }

    @Override // defpackage.AbstractC6124e
    public final /* synthetic */ Object license(Object obj) {
        return (Boolean) obj;
    }

    @Override // defpackage.AbstractC6124e
    public final /* synthetic */ Object metrica(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // defpackage.AbstractC6124e
    public final /* synthetic */ void purchase(Object obj) {
        this.f16433e = ((Boolean) obj).booleanValue();
    }
}
