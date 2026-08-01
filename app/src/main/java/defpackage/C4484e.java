package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۥؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4484e extends AbstractC6124e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public volatile long f9697e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long f9698e;

    public C4484e(String str, C2580e c2580e, long j) {
        super(str, c2580e);
        this.f9698e = j;
    }

    @Override // defpackage.AbstractC6124e
    public final /* synthetic */ Object ad() {
        return Long.valueOf(this.f9698e);
    }

    @Override // defpackage.AbstractC6124e
    public final /* synthetic */ Object appmetrica() {
        return Long.valueOf(this.f9697e);
    }

    @Override // defpackage.AbstractC6124e
    public final /* synthetic */ Object license(Object obj) {
        return (Long) obj;
    }

    @Override // defpackage.AbstractC6124e
    public final /* synthetic */ Object metrica(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // defpackage.AbstractC6124e
    public final /* synthetic */ void purchase(Object obj) {
        this.f9697e = ((Long) obj).longValue();
    }
}
