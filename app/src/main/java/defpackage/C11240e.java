package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11240e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ CachedPlaylist f22518e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C11188e f22519e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22520e = 1;

    public C11240e(C11188e c11188e, CachedPlaylist cachedPlaylist) {
        this.f22519e = c11188e;
        this.f22518e = cachedPlaylist;
    }

    public C11240e(CachedPlaylist cachedPlaylist, C11188e c11188e) {
        this.f22518e = cachedPlaylist;
        this.f22519e = c11188e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f22520e;
        CachedPlaylist cachedPlaylist = this.f22518e;
        C11188e c11188e = this.f22519e;
        switch (i) {
            case 0:
                int i2 = C3566e.f8039e;
                AudioPlaylist metrica = cachedPlaylist.metrica();
                String inmobi = cachedPlaylist.inmobi();
                if (inmobi == null) {
                    inmobi = BuildConfig.FLAVOR;
                }
                new C3566e(new C2014e(metrica, inmobi)).signatures(c11188e.pro());
                return Unit.INSTANCE;
            default:
                c11188e.m2514goto(new C14873e(cachedPlaylist.metrica(), new VKProfile(cachedPlaylist.pro(), null, null, null, cachedPlaylist.inmobi(), null, null, 110)));
                return Unit.INSTANCE;
        }
    }
}
