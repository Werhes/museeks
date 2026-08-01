package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۦۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18148e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ CachedPlaylist f35555e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17047e f35556e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35557e = 1;

    public C18148e(C17047e c17047e, CachedPlaylist cachedPlaylist) {
        this.f35556e = c17047e;
        this.f35555e = cachedPlaylist;
    }

    public C18148e(CachedPlaylist cachedPlaylist, C17047e c17047e) {
        this.f35555e = cachedPlaylist;
        this.f35556e = c17047e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f35557e;
        CachedPlaylist cachedPlaylist = this.f35555e;
        C17047e c17047e = this.f35556e;
        switch (i) {
            case 0:
                int i2 = C3566e.f8039e;
                AudioPlaylist metrica = cachedPlaylist.metrica();
                String inmobi = cachedPlaylist.inmobi();
                if (inmobi == null) {
                    inmobi = BuildConfig.FLAVOR;
                }
                new C3566e(new C2014e(metrica, inmobi)).signatures(c17047e.pro());
                return Unit.INSTANCE;
            default:
                c17047e.m2514goto(new C14873e(cachedPlaylist.metrica(), new VKProfile(cachedPlaylist.pro(), null, null, null, cachedPlaylist.inmobi(), null, null, 110)));
                return Unit.INSTANCE;
        }
    }
}
