package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC15976e implements View.OnClickListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AudioPlaylist f31491e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31492e;

    public /* synthetic */ ViewOnClickListenerC15976e(C11438e c11438e, AudioPlaylist audioPlaylist, VKProfile vKProfile) {
        this.f31492e = 2;
        this.f31491e = audioPlaylist;
    }

    public /* synthetic */ ViewOnClickListenerC15976e(C12678e c12678e, AudioPlaylist audioPlaylist) {
        this.f31492e = 0;
        this.f31491e = audioPlaylist;
    }

    public /* synthetic */ ViewOnClickListenerC15976e(AudioPlaylist audioPlaylist, int i) {
        this.f31492e = i;
        this.f31491e = audioPlaylist;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C4956e c4956e;
        switch (this.f31492e) {
            case 0:
                Context context = view.getContext();
                AudioPlaylist audioPlaylist = this.f31491e;
                if (audioPlaylist.f36515package != null) {
                    new C7335e(new AbstractC9615e(R.string.content_blocked_playlist, 2), 2).signatures((AppActivity) context);
                    return;
                } else {
                    AbstractC7237e.metrica(context, new C15820e(audioPlaylist));
                    return;
                }
            case 1:
                AbstractC16519e.vip((AppActivity) view.getContext(), new C7798e(1, null, this.f31491e));
                return;
            case 2:
                InterfaceC5083e interfaceC5083e = null;
                AbstractC16519e.vip((AppActivity) ((Activity) view.getContext()), new C8086e(this.f31491e, interfaceC5083e, interfaceC5083e, 25));
                return;
            case 3:
                AbstractC7237e.ad(view, new C15820e(this.f31491e));
                return;
            case 4:
                AbstractC7237e.ad(view, new C15820e(this.f31491e));
                return;
            default:
                AudioPlaylist audioPlaylist2 = this.f31491e;
                if (AbstractC13406e.amazon(audioPlaylist2)) {
                    Context context2 = view.getContext();
                    List list = audioPlaylist2.f36507final;
                    if (list == null) {
                        return;
                    }
                    AbstractC6100e.vip(context2, list);
                    return;
                }
                OriginalPlaylist originalPlaylist = audioPlaylist2.f36501break;
                String valueOf = String.valueOf(originalPlaylist != null ? originalPlaylist.ad : audioPlaylist2.applovin);
                C14027e.ad.getClass();
                if (!valueOf.equals(String.valueOf(C14027e.metrica()))) {
                    AppActivity appActivity = C5658e.vip;
                    if (appActivity != null) {
                        appActivity.isVip(new C0963e((String) null, new C9837e("https://vk.com/audios".concat(valueOf), 1)));
                        return;
                    }
                    return;
                }
                AppActivity appActivity2 = C5658e.vip;
                AppActivity appActivity3 = AbstractC0869e.premium(appActivity2) ? appActivity2 : null;
                if (appActivity3 == null || (c4956e = appActivity3.f36547e) == null) {
                    return;
                }
                ((NextDockView) c4956e.f10519e).vip(String.valueOf(3), (r3 & 2) != 0, true);
                return;
        }
    }
}
