package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaAlbum;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۦ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8357e implements InterfaceC17863e {
    public final /* synthetic */ int ad;
    public static final C8357e vip = new C8357e(0);
    public static final C8357e metrica = new C8357e(1);
    public static final C8357e license = new C8357e(2);

    public /* synthetic */ C8357e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC17863e
    public final String ad(Object obj, C6302e c6302e) {
        String purchase;
        switch (this.ad) {
            case 0:
                UmaTrack umaTrack = (UmaTrack) obj;
                C16320e c16320e = c6302e.vip;
                UmaAlbum umaAlbum = umaTrack.purchase;
                if (umaAlbum != null) {
                    String str = "uma_track_byAlbum_" + umaAlbum.vip + '_' + AbstractC18366e.appmetrica(c16320e);
                    if (str != null) {
                        return str;
                    }
                }
                return "uma_track_byTrack_" + umaTrack.ad + '_' + AbstractC18366e.appmetrica(c16320e);
            case 1:
                AudioPlaylist audioPlaylist = (AudioPlaylist) obj;
                return "vk_playlist_" + audioPlaylist.applovin + '_' + audioPlaylist.isPro + '_' + AbstractC18366e.appmetrica(c6302e.vip);
            case 2:
                AudioAlbum audioAlbum = ((AudioTrack) obj).amazon;
                if (audioAlbum == null) {
                    return null;
                }
                return "vk_track_" + audioAlbum.vip() + '_' + AbstractC18366e.appmetrica(c6302e.vip);
            case 3:
                C0388e c0388e = (C0388e) obj;
                if (!AbstractC7890e.billing(c0388e.metrica, "android.resource")) {
                    return null;
                }
                Configuration configuration = c6302e.ad.getResources().getConfiguration();
                Bitmap.Config[] configArr = AbstractC13427e.ad;
                return c0388e + ":" + (configuration.uiMode & 48);
            case 4:
                C0388e c0388e2 = (C0388e) obj;
                String str2 = c0388e2.metrica;
                if ((str2 != null && !str2.equals("file")) || c0388e2.appmetrica == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = AbstractC13427e.ad;
                if ((AbstractC7890e.billing(c0388e2.metrica, "file") && AbstractC7890e.billing(AbstractC13480e.m3604this(AbstractC0718e.yandex(c0388e2)), "android_asset")) || !((Boolean) AbstractC8306e.license(c6302e, AbstractC2182e.metrica)).booleanValue() || (purchase = AbstractC0718e.purchase(c0388e2)) == null) {
                    return null;
                }
                AbstractC11062e abstractC11062e = c6302e.purchase;
                String str3 = C10675e.f21023e;
                return c0388e2 + "-" + abstractC11062e.crashlytics(C10215e.license(purchase, false)).purchase;
            default:
                return ((C0388e) obj).ad;
        }
    }
}
