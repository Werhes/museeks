package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۚۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13496e extends AbstractC6762e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ String f26773e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f26774e;

    public /* synthetic */ C13496e(String str, int i) {
        this.f26774e = i;
        this.f26773e = str;
    }

    @Override // defpackage.InterfaceC10801e
    public final void ad(Object obj) {
        switch (this.f26774e) {
            case 0:
                ((AbstractC1346e) obj).metrica(this.f26773e, new C12916e(8, C7971e.crashlytics(13)));
                return;
            case 1:
                ((AbstractC1346e) obj).license(this.f26773e);
                return;
            default:
                AbstractC13480e.m3593new(((C17038e) obj).ad.f5159e, new C18513e(this.f26773e, 4));
                return;
        }
    }
}
