package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۥُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2218e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ CachedTrack f5618e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5250e f5619e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5620e = 1;

    public /* synthetic */ C2218e(C5250e c5250e, CachedTrack cachedTrack) {
        this.f5619e = c5250e;
        this.f5618e = cachedTrack;
    }

    public /* synthetic */ C2218e(CachedTrack cachedTrack, C5250e c5250e) {
        this.f5618e = cachedTrack;
        this.f5619e = c5250e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f5620e;
        CachedTrack cachedTrack = this.f5618e;
        C5250e c5250e = this.f5619e;
        switch (i) {
            case 0:
                int i2 = C3566e.f8039e;
                AbstractC0890e.license(cachedTrack.metrica()).signatures(c5250e.pro());
                return Unit.INSTANCE;
            default:
                C5250e.m1839instanceof(c5250e, cachedTrack, false, 2);
                return Unit.INSTANCE;
        }
    }
}
