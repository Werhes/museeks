package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17061e implements InterfaceC1232e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f33400e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f33401e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C13578e f33402e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5981e f33403e;

    public C17061e(C5981e c5981e, long j, Object obj, C13578e c13578e) {
        this.f33403e = c5981e;
        this.f33401e = j;
        this.f33400e = obj;
        this.f33402e = c13578e;
    }

    @Override // defpackage.InterfaceC1232e
    public final void ad() {
        C5981e c5981e = this.f33403e;
        synchronized (c5981e) {
            if (this.f33401e < c5981e.admob()) {
                return;
            }
            Object[] objArr = c5981e.f12587e;
            if (AbstractC6959e.license(objArr, this.f33401e) != this) {
                return;
            }
            AbstractC6959e.appmetrica(objArr, this.f33401e, AbstractC6959e.f14258e);
            c5981e.advert();
            Unit unit = Unit.INSTANCE;
        }
    }
}
