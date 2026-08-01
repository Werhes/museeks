package defpackage;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٝۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5046e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2014e f10753e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10754e;

    public /* synthetic */ C5046e(C2014e c2014e, int i) {
        this.f10754e = i;
        this.f10753e = c2014e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f10754e;
        InterfaceC5083e interfaceC5083e = null;
        int i2 = 1;
        C2014e c2014e = this.f10753e;
        switch (i) {
            case 0:
                C3566e c3566e = (C3566e) obj;
                AppActivity appActivity = (AppActivity) c3566e.f10582e;
                AudioPlaylist audioPlaylist = c2014e.f5297e;
                appActivity.isVip(new C17399e(new C3294e(audioPlaylist.applovin, audioPlaylist.isPro, audioPlaylist.f36509implements)));
                c3566e.purchase();
                return Unit.INSTANCE;
            case 1:
                C3566e c3566e2 = (C3566e) obj;
                C0576e startapp = AbstractC14533e.startapp(Boolean.FALSE);
                new C17180e(R.string.libtools_merge_playlist, R.string.libtools_merge_playlist_confirm, R.string.confirm_act, new C2892e(-1072921257, true, new C9458e(startapp, 0)), null, new Csynchronized(29, c2014e, startapp, c3566e2), null, 328).signatures(c3566e2.f10582e);
                c3566e2.purchase();
                return Unit.INSTANCE;
            case 2:
                C3566e c3566e3 = (C3566e) obj;
                Activity activity = c3566e3.f10582e;
                c2014e.license(activity, new C14678e(activity, c2014e, i2));
                AppActivity appActivity2 = (AppActivity) c3566e3.f10582e;
                Integer valueOf = Integer.valueOf(R.drawable.ic_download_square_outline_28);
                VKXApplication.Companion companion = VKXApplication.f36531e;
                C9402e.ad(appActivity2, new C15076e(valueOf, VKXApplication.Companion.vip(R.string.sn_playlist_added_to_cache), c2014e.f5296e + " - " + c2014e.f5297e.subs, null, null, 120));
                c3566e3.purchase();
                return Unit.INSTANCE;
            case 3:
                AppActivity appActivity3 = (AppActivity) ((Activity) obj);
                StringBuilder sb = new StringBuilder("https://vk.com/audios");
                AudioPlaylist audioPlaylist2 = c2014e.f5297e;
                OriginalPlaylist originalPlaylist = audioPlaylist2.f36501break;
                sb.append(originalPlaylist != null ? originalPlaylist.ad : audioPlaylist2.applovin);
                appActivity3.isVip(new C0963e((String) null, new C9837e(sb.toString(), 1)));
                return Unit.INSTANCE;
            case 4:
                C3566e c3566e4 = (C3566e) obj;
                Activity activity2 = c3566e4.f10582e;
                c2014e.license(activity2, new C14678e(activity2, c2014e, 2));
                AppActivity appActivity4 = (AppActivity) c3566e4.f10582e;
                Integer valueOf2 = Integer.valueOf(R.drawable.ic_download_square_outline_28);
                VKXApplication.Companion companion2 = VKXApplication.f36531e;
                C9402e.ad(appActivity4, new C15076e(valueOf2, VKXApplication.Companion.vip(R.string.sn_playlist_added_to_cache), c2014e.f5296e + " - " + c2014e.f5297e.subs, null, null, 120));
                c3566e4.purchase();
                return Unit.INSTANCE;
            case 5:
                C3566e c3566e5 = (C3566e) obj;
                new C13424e(new C10702e(c2014e.f5297e)).signatures(c3566e5.f10582e);
                c3566e5.purchase();
                return Unit.INSTANCE;
            case 6:
                C3566e c3566e6 = (C3566e) obj;
                Activity activity3 = c3566e6.f10582e;
                c2014e.license(activity3, new C5687e(activity3, 3));
                c3566e6.purchase();
                return Unit.INSTANCE;
            case 7:
                C3566e c3566e7 = (C3566e) obj;
                c2014e.license(c3566e7.f10582e, new C16889e(c3566e7, i2));
                c3566e7.purchase();
                return Unit.INSTANCE;
            case 8:
                C3566e c3566e8 = (C3566e) obj;
                Activity activity4 = c3566e8.f10582e;
                c2014e.license(activity4, new C14678e(c2014e, activity4));
                c3566e8.purchase();
                return Unit.INSTANCE;
            default:
                C3566e c3566e9 = (C3566e) obj;
                Activity activity5 = c3566e9.f10582e;
                AbstractC16519e.vip((AppActivity) activity5, new C7195e(c2014e, activity5, interfaceC5083e, 10));
                c3566e9.purchase();
                return Unit.INSTANCE;
        }
    }
}
