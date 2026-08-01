package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0151e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ CachedTrack f1381e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C11188e f1382e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1383e = 1;

    public /* synthetic */ C0151e(C11188e c11188e, CachedTrack cachedTrack) {
        this.f1382e = c11188e;
        this.f1381e = cachedTrack;
    }

    public /* synthetic */ C0151e(CachedTrack cachedTrack, C11188e c11188e) {
        this.f1381e = cachedTrack;
        this.f1382e = c11188e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f1383e;
        CachedTrack cachedTrack = this.f1381e;
        C11188e c11188e = this.f1382e;
        switch (i) {
            case 0:
                int i2 = C3566e.f8039e;
                AbstractC0890e.license(cachedTrack.metrica()).signatures(c11188e.pro());
                return Unit.INSTANCE;
            default:
                C11188e.m3042e(c11188e, cachedTrack, 2);
                return Unit.INSTANCE;
        }
    }
}
