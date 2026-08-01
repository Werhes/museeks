package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.ListIterator;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5658e {
    public static final C5658e ad = new Object();
    public static final C1169e license;
    public static final C1169e metrica;
    public static AppActivity vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘٕۥ, java.lang.Object] */
    static {
        C1169e license2 = AbstractC6874e.license();
        C0139e c0139e = C0139e.ad;
        appmetrica(license2, new C10445e("/audio_playlist([-0-9]+)_([0-9]+)(?:[_/]([0-9a-zA-Z]+))?"), new C9335e(3, c0139e, C0139e.class, "openPlaylist", "openPlaylist(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0, 0, 3));
        int i = 0;
        int i2 = 3;
        int i3 = 0;
        appmetrica(license2, new C10445e("/audio([-0-9]+)_([0-9]+)(?:[_/]([0-9a-zA-Z]+))?"), new C9335e(i2, c0139e, C0139e.class, "openTrack", "openTrack(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 4));
        appmetrica(license2, new C10445e("/music\\?z=audio_playlist([-0-9]+)_([0-9]+)(?:[_/]([0-9a-zA-Z]+))?"), new C9335e(i2, c0139e, C0139e.class, "openPlaylist", "openPlaylist(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 5));
        license2.add(new C8440e(new C10445e("/music/album/(-?[0-9]+)_([0-9-]+)_?([0-9a-z]*)"), new C9335e(i2, c0139e, C0139e.class, "openPlaylist", "openPlaylist(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 6)));
        license2.add(new C8440e(new C10445e("/music/playlist/(-?[0-9]+)_([0-9-]+)_?([0-9a-z]*)"), new C9335e(i2, c0139e, C0139e.class, "openPlaylist", "openPlaylist(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 7)));
        license2.add(new C8242e(new C10445e("/podcast([-0-9]+)_([0-9]+)"), new C14874e(2, c0139e, C0139e.class, "openPodcastEpisode", "openPodcastEpisode(Ljava/lang/String;Ljava/lang/String;)V", i3, i, 8)));
        int i4 = 1;
        license(license2, new C10445e("/music/curator/([-_a-zA-Z0-9]+)"), new C11476e(i4, c0139e, C0139e.class, "openCurator", "openCurator(Ljava/lang/String;)V", i3, i, 1));
        license(license2, new C10445e("/curator/([-_a-zA-Z0-9]+)"), new C11476e(i4, c0139e, C0139e.class, "openCurator", "openCurator(Ljava/lang/String;)V", i3, i, 2));
        license(license2, new C10445e("/music/artist/([-_a-zA-Z0-9]+)"), new C11476e(i4, c0139e, C0139e.class, "openArtist", "openArtist(Ljava/lang/String;)V", i3, i, 3));
        license(license2, new C10445e("/artist/([-_a-zA-Z0-9]+)"), new C2098e(i4, c0139e, C0139e.class, "openArtist", "openArtist(Ljava/lang/String;)V", i3, i, 20));
        license(license2, new C10445e("/audios([-0-9]+)"), new C2098e(i4, c0139e, C0139e.class, "openUserAudios", "openUserAudios(Ljava/lang/String;)V", i3, i, 21));
        license(license2, new C10445e("/podcasts([-0-9]+)"), new C2098e(i4, c0139e, C0139e.class, "openPodcastShow", "openPodcastShow(Ljava/lang/String;)V", i3, i, 22));
        license(license2, new C10445e("/audiobook([-0-9]+)"), new C2098e(i4, c0139e, C0139e.class, "openAudioBook", "openAudioBook(Ljava/lang/String;)V", i3, i, 23));
        license(license2, new C10445e("/app54108054#artist_id=([0-9]+)"), new C2098e(i4, c0139e, C0139e.class, "openY25ResultsOfArtist", "openY25ResultsOfArtist(Ljava/lang/String;)V", i3, i, 24));
        int i5 = 0;
        license2.add(new C17218e(new C10445e("/audioplayer"), new C15101e(i5, c0139e, C0139e.class, "openAudioPlayer", "openAudioPlayer()V", i3, i, 19)));
        license2.add(new C17218e(new C10445e("/audio_offline"), new C15101e(i5, c0139e, C0139e.class, "openOffline", "openOffline()V", i3, i, 20)));
        int i6 = 1;
        ad(license2, new C10445e("/app52384530"), new C2098e(i6, c0139e, C0139e.class, "openY25Results", "openY25Results(Landroid/net/Uri;)V", i3, i, 25));
        ad(license2, new C10445e("/audio"), new C2098e(i6, c0139e, C0139e.class, "openAudios", "openAudios(Landroid/net/Uri;)V", i3, i, 26));
        ad(license2, new C10445e("/podcasts"), new C2098e(i6, c0139e, C0139e.class, "openPodcasts", "openPodcasts(Landroid/net/Uri;)V", i3, i, 27));
        ad(license2, new C10445e("/audiobooks"), new C2098e(i6, c0139e, C0139e.class, "openAudiobooks", "openAudiobooks(Landroid/net/Uri;)V", i3, i, 28));
        ad(license2, new C10445e("/person_audiobooks"), new C2098e(i6, c0139e, C0139e.class, "openAudiobooksPerson", "openAudiobooksPerson(Landroid/net/Uri;)V", i3, i, 29));
        ad(license2, new C10445e("/popup"), new C11476e(i6, c0139e, C0139e.class, "openPopup", "openPopup(Landroid/net/Uri;)V", i3, i, 0));
        metrica = AbstractC6874e.metrica(license2);
        C1169e license3 = AbstractC6874e.license();
        int i7 = 3;
        appmetrica(license3, new C10445e("/audio_playlist([-0-9]+)_([0-9]+)(?:[_/]([0-9a-zA-Z]+))?"), new C9335e(i7, c0139e, C0139e.class, "openPlaylistAP", "openPlaylistAP(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 8));
        appmetrica(license3, new C10445e("/audio([-0-9]+)_([0-9]+)(?:[_/]([0-9a-zA-Z]+))?"), new C9335e(i7, c0139e, C0139e.class, "openTrackAP", "openTrackAP(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 9));
        appmetrica(license3, new C10445e("/music\\?z=audio_playlist([-0-9]+)_([0-9]+)(?:[_/]([0-9a-zA-Z]+))?"), new C9335e(i7, c0139e, C0139e.class, "openPlaylistAP", "openPlaylistAP(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 10));
        license3.add(new C8440e(new C10445e("/music/album/(-?[0-9]+)_([0-9-]+)_?([0-9a-z]*)"), new C9335e(i7, c0139e, C0139e.class, "openPlaylistAP", "openPlaylistAP(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 11)));
        license3.add(new C8440e(new C10445e("/music/playlist/(-?[0-9]+)_([0-9-]+)_?([0-9a-z]*)"), new C9335e(i7, c0139e, C0139e.class, "openPlaylistAP", "openPlaylistAP(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", i3, i, 12)));
        license = AbstractC6874e.metrica(license3);
    }

    public static void ad(C1169e c1169e, C10445e c10445e, Function1 function1) {
        c1169e.add(new C4372e(c10445e, function1));
    }

    public static void appmetrica(C1169e c1169e, C10445e c10445e, Function3 function3) {
        c1169e.add(new C2345e(c10445e, function3));
    }

    public static void license(C1169e c1169e, C10445e c10445e, Function1 function1) {
        c1169e.add(new C13499e(c10445e, function1));
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [eؚۛۖ, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v8, types: [eؚۛۖ, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [eؚۛۖ, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v10, types: [eؚۛۖ, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r6v11, types: [eؚۛۖ, kotlin.jvm.functions.Function3] */
    public static void metrica(C5658e c5658e, Uri uri, boolean z, int i) {
        AbstractC3793e abstractC3793e;
        C14031e c14031e;
        if ((i & 2) != 0) {
            z = false;
        }
        String m1852case = AbstractC5304e.m1852case(uri.toString(), uri.getScheme() + "://");
        String host = uri.getHost();
        if (host == null) {
            return;
        }
        String str = (String) AbstractC5304e.m1869private(AbstractC5304e.m1852case(m1852case, host), new String[]{"?"}, 6).get(0);
        ListIterator listIterator = (z ? license : metrica).listIterator(0);
        do {
            C11045e c11045e = (C11045e) listIterator;
            if (!c11045e.hasNext()) {
                AppActivity appActivity = vip;
                if (appActivity == null) {
                    return;
                }
                appActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uri.toString())));
                return;
            }
            abstractC3793e = (AbstractC3793e) c11045e.next();
            if (abstractC3793e.ad().license(str)) {
                Matcher matcher = abstractC3793e.ad().f20638e.matcher(str);
                if (matcher.find(0)) {
                    c14031e = new C14031e(matcher, str);
                }
            }
            c14031e = null;
        } while (c14031e == null);
        if (abstractC3793e instanceof C4372e) {
            ((C4372e) abstractC3793e).vip.invoke(uri);
            return;
        }
        if (abstractC3793e instanceof C17218e) {
            ((C17218e) abstractC3793e).vip.invoke();
            return;
        }
        if (abstractC3793e instanceof C13499e) {
            ((C13499e) abstractC3793e).vip.invoke(((C15942e) c14031e.ad()).get(1));
            return;
        }
        if (abstractC3793e instanceof C2345e) {
            ?? r6 = ((C2345e) abstractC3793e).vip;
            Object obj = ((C15942e) c14031e.ad()).get(1);
            Object obj2 = ((C15942e) c14031e.ad()).get(2);
            CharSequence charSequence = (CharSequence) ((C15942e) c14031e.ad()).get(3);
            r6.invoke(obj, obj2, charSequence.length() != 0 ? charSequence : null);
            return;
        }
        if (abstractC3793e instanceof C8440e) {
            ((C8440e) abstractC3793e).vip.invoke(((C15942e) c14031e.ad()).get(1), ((C15942e) c14031e.ad()).get(2), ((C15942e) c14031e.ad()).get(3));
        } else {
            if (!(abstractC3793e instanceof C8242e)) {
                throw new C14803e(10);
            }
            ((C8242e) abstractC3793e).vip.invoke(((C15942e) c14031e.ad()).get(1), ((C15942e) c14031e.ad()).get(2));
        }
    }

    public final void vip(String str) {
        metrica(this, Uri.parse(str), false, 6);
    }
}
