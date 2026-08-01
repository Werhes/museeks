package defpackage;

import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۡۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5211e {
    public static final String ad(AudioPlaylist audioPlaylist) {
        int i = audioPlaylist.f36526try;
        String str = audioPlaylist.f36503catch;
        if (str == null || str.length() == 0 || i == 0) {
            return (str == null || str.length() == 0) ? i != 0 ? String.valueOf(i) : BuildConfig.FLAVOR : str;
        }
        VKXApplication.Companion companion = VKXApplication.f36531e;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        return vKXApplication.getString(R.string.playlist_year_and_subtitle, Integer.valueOf(i), str);
    }

    public static final String vip(CachedPlaylist cachedPlaylist) {
        String subs = cachedPlaylist.subs();
        if (subs == null || subs.length() == 0 || cachedPlaylist.m4690goto() == 0) {
            String subs2 = cachedPlaylist.subs();
            return (subs2 == null || subs2.length() == 0) ? cachedPlaylist.m4690goto() != 0 ? String.valueOf(cachedPlaylist.m4690goto()) : BuildConfig.FLAVOR : cachedPlaylist.subs();
        }
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        return vKXApplication.getString(R.string.playlist_year_and_subtitle, Integer.valueOf(cachedPlaylist.m4690goto()), cachedPlaylist.subs());
    }
}
