package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12297e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ CachedTrack f24674e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2921e f24675e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24676e = 1;

    public /* synthetic */ C12297e(C2921e c2921e, CachedTrack cachedTrack) {
        this.f24675e = c2921e;
        this.f24674e = cachedTrack;
    }

    public /* synthetic */ C12297e(CachedTrack cachedTrack, C2921e c2921e) {
        this.f24674e = cachedTrack;
        this.f24675e = c2921e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f24676e;
        CachedTrack cachedTrack = this.f24674e;
        C2921e c2921e = this.f24675e;
        switch (i) {
            case 0:
                int i2 = C3566e.f8039e;
                AbstractC0890e.license(cachedTrack.metrica()).signatures(c2921e.pro());
                return Unit.INSTANCE;
            default:
                C2921e.m1215return(c2921e, cachedTrack, false, 2);
                return Unit.INSTANCE;
        }
    }
}
