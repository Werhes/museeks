package defpackage;

import android.content.DialogInterface;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۥ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC1458e implements DialogInterface.OnClickListener {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f4296e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f4297e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4298e;

    public /* synthetic */ DialogInterfaceOnClickListenerC1458e(Object obj, Object obj2, int i) {
        this.f4298e = i;
        this.f4297e = obj;
        this.f4296e = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        StringBuilder sb;
        String str;
        int i2 = this.f4298e;
        Object obj = this.f4296e;
        Object obj2 = this.f4297e;
        switch (i2) {
            case 0:
                C2038e c2038e = (C2038e) obj2;
                C0939e c0939e = (C0939e) obj;
                C11794e.f23667e.billing((AudioTrack) c2038e.adcel().vip);
                C12894e c12894e = c2038e.admob;
                VKXApplication.Companion companion = VKXApplication.f36531e;
                c12894e.loadAd(VKXApplication.Companion.vip(R.string.sn_track_removed_from_cache), c0939e.license + " - " + c0939e.vip);
                dialogInterface.dismiss();
                return;
            default:
                C15293e c15293e = (C15293e) obj2;
                List list = (List) obj;
                AppActivity appActivity = (AppActivity) c15293e.pro();
                Integer valueOf = Integer.valueOf(R.drawable.ic_delete_outline_android_28);
                VKXApplication.Companion companion2 = VKXApplication.f36531e;
                String vip = VKXApplication.Companion.vip(R.string.sn_tracks_removed_from_library);
                if (list.size() == 1) {
                    sb = new StringBuilder();
                    sb.append(list.size());
                    str = " штука";
                } else {
                    sb = new StringBuilder();
                    sb.append(list.size());
                    str = " штук";
                }
                sb.append(str);
                C9402e.ad(appActivity, new C15076e(valueOf, vip, sb.toString(), new C6571e(VKXApplication.Companion.vip(R.string.sn_undo), new C14136e(15)), new C1708e(list, c15293e, 23), 80));
                dialogInterface.dismiss();
                return;
        }
    }
}
