package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemMeta;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۧٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14397e {
    /* JADX WARN: Type inference failed for: r4v8, types: [eٌّؒ, eٔؐۜ] */
    public static final C1962e ad(AudioTrack audioTrack, String str, String str2) {
        AlbumThumb albumThumb;
        String str3;
        C9466e c9466e = new C9466e();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        List list = Collections.EMPTY_LIST;
        C1410e c1410e2 = C1410e.f4222e;
        C9457e c9457e = new C9457e();
        C13325e c13325e = C13325e.license;
        String purchase = AbstractC6914e.purchase(audioTrack);
        purchase.getClass();
        C4761e c4761e = new C4761e();
        c4761e.ad = audioTrack.license;
        c4761e.purchase = audioTrack.ad;
        AudioAlbum audioAlbum = audioTrack.amazon;
        c4761e.amazon = (audioAlbum == null || (albumThumb = audioAlbum.appmetrica) == null || (str3 = albumThumb.metrica) == null) ? null : Uri.parse(str3);
        Boolean bool = Boolean.TRUE;
        c4761e.remoteconfig = bool;
        c4761e.subscription = Boolean.FALSE;
        c4761e.f10191goto = 1;
        c4761e.f10194this = AbstractC2301e.vip(new C6571e("android.media.IS_EXPLICIT", Long.valueOf(audioTrack.billing ? 1L : 0L)), new C6571e("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str2), new C6571e("bruhcollective.itaysonlab.vkx.auto.TRACK_SOURCE_CTX", str), new C6571e("bruhcollective.itaysonlab.vkx.auto.SOURCE_NAME", str2), new C6571e("bruhcollective.itaysonlab.vkx.auto.IS_AUTO_LINK", bool));
        return new C1962e(purchase, new C14435e(c9466e), null, new C15197e(c9457e), new C12053e(c4761e), c13325e);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [eٌّؒ, eٔؐۜ] */
    public static final C1962e metrica(AudioPlaylist audioPlaylist, C3675e c3675e, String str) {
        String str2;
        String str3;
        String str4 = audioPlaylist.subs;
        long j = audioPlaylist.applovin;
        OriginalPlaylist originalPlaylist = audioPlaylist.f36501break;
        Uri uri = null;
        if (audioPlaylist.f36507final.size() > 1) {
            str2 = AbstractC13480e.m3608try(audioPlaylist.f36507final, ", ", null, null, new C17187e(26), 30);
        } else if (AbstractC13406e.amazon(audioPlaylist)) {
            MainArtist billing = AbstractC13406e.billing(audioPlaylist);
            str2 = billing != null ? billing.metrica : null;
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
        } else {
            long j2 = originalPlaylist != null ? originalPlaylist.ad : j;
            C14027e.ad.getClass();
            if (j2 == C14027e.metrica()) {
                VKXApplication.Companion companion = VKXApplication.f36531e;
                str2 = VKXApplication.Companion.vip(R.string.my_playlist);
            } else {
                LinkedHashMap linkedHashMap = c3675e.yandex;
                if (originalPlaylist != null) {
                    j = originalPlaylist.ad;
                }
                VKProfile vKProfile = (VKProfile) linkedHashMap.get(String.valueOf(j));
                if (vKProfile == null || (str2 = vKProfile.ad()) == null) {
                    str2 = "?!";
                }
            }
        }
        C9466e c9466e = new C9466e();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        List list = Collections.EMPTY_LIST;
        C1410e c1410e2 = C1410e.f4222e;
        C9457e c9457e = new C9457e();
        C13325e c13325e = C13325e.license;
        String str5 = "ext:playlist:" + AbstractC13406e.pro(audioPlaylist);
        str5.getClass();
        C4761e c4761e = new C4761e();
        c4761e.ad = str4;
        c4761e.purchase = str2;
        AlbumThumb albumThumb = audioPlaylist.f36500abstract;
        if (albumThumb != null && (str3 = albumThumb.metrica) != null) {
            uri = Uri.parse(str3);
        }
        c4761e.amazon = uri;
        c4761e.f10191goto = 13;
        c4761e.remoteconfig = Boolean.TRUE;
        c4761e.subscription = Boolean.FALSE;
        c4761e.f10194this = AbstractC2301e.vip(new C6571e("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str), new C6571e("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2), new C6571e("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 2), new C6571e("bruhcollective.itaysonlab.vkx.auto.SOURCE_NAME", str4));
        return new C1962e(str5, new C14435e(c9466e), null, new C15197e(c9457e), new C12053e(c4761e), c13325e);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [eٌّؒ, eٔؐۜ] */
    public static final C1962e vip(CustomCatalogBlockItem customCatalogBlockItem, String str) {
        String str2 = customCatalogBlockItem.ad;
        C9466e c9466e = new C9466e();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        List list = Collections.EMPTY_LIST;
        C1410e c1410e2 = C1410e.f4222e;
        C9457e c9457e = new C9457e();
        C13325e c13325e = C13325e.license;
        StringBuilder sb = new StringBuilder("ext:");
        CustomCatalogBlockItemMeta customCatalogBlockItemMeta = customCatalogBlockItem.purchase;
        String str3 = customCatalogBlockItemMeta != null ? customCatalogBlockItemMeta.vip : null;
        String str4 = BuildConfig.FLAVOR;
        if (str3 == null) {
            str3 = BuildConfig.FLAVOR;
        }
        sb.append(str3);
        sb.append(':');
        String str5 = customCatalogBlockItem.license;
        StringBuilder sb2 = new StringBuilder("https://vk.com/");
        String str6 = customCatalogBlockItemMeta != null ? customCatalogBlockItemMeta.vip : null;
        if (str6 == null) {
            str6 = BuildConfig.FLAVOR;
        }
        sb2.append(str6);
        sb2.append('/');
        String m1852case = AbstractC5304e.m1852case(str5, sb2.toString());
        StringBuilder sb3 = new StringBuilder("https://vk.com/music/");
        String str7 = customCatalogBlockItemMeta != null ? customCatalogBlockItemMeta.vip : null;
        if (str7 != null) {
            str4 = str7;
        }
        sb3.append(str4);
        sb3.append('/');
        sb.append(AbstractC5304e.m1852case(m1852case, sb3.toString()));
        String sb4 = sb.toString();
        sb4.getClass();
        C4761e c4761e = new C4761e();
        c4761e.ad = str2;
        c4761e.purchase = customCatalogBlockItem.vip;
        List list2 = customCatalogBlockItem.metrica;
        if (list2 == null) {
            list2 = C13664e.f27089e;
        }
        String license = AbstractC8769e.license(list2);
        if (license.length() <= 0) {
            license = null;
        }
        c4761e.amazon = license != null ? Uri.parse(license) : null;
        c4761e.f10191goto = 13;
        c4761e.remoteconfig = Boolean.TRUE;
        c4761e.subscription = Boolean.FALSE;
        c4761e.f10194this = AbstractC2301e.vip(new C6571e("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str), new C6571e("bruhcollective.itaysonlab.vkx.auto.SOURCE_NAME", str2));
        return new C1962e(sb4, new C14435e(c9466e), null, new C15197e(c9457e), new C12053e(c4761e), c13325e);
    }
}
