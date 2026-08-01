package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؐ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15905e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13372e f31341e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31342e;

    public /* synthetic */ C15905e(C13372e c13372e, int i) {
        this.f31342e = i;
        this.f31341e = c13372e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DialogInterfaceC15370e dialogInterfaceC15370e;
        int i = this.f31342e;
        InterfaceC5083e interfaceC5083e = null;
        C13372e c13372e = this.f31341e;
        switch (i) {
            case 0:
                C3566e c3566e = (C3566e) obj;
                new C18128e(c13372e.f26633e).signatures(c3566e.f10582e);
                c3566e.purchase();
                return Unit.INSTANCE;
            case 1:
                C3566e c3566e2 = (C3566e) obj;
                AbstractC7237e.metrica(c3566e2.f10582e, new C14850e(c13372e.f26633e.ad));
                c3566e2.m1376interface();
                return Unit.INSTANCE;
            case 2:
                C3566e c3566e3 = (C3566e) obj;
                Activity activity = c3566e3.f10582e;
                AudioTrack audioTrack = c13372e.f26633e;
                C15584e c15584e = new C15584e(0);
                WeakReference weakReference = AbstractC2835e.startapp;
                if (weakReference != null && (dialogInterfaceC15370e = (DialogInterfaceC15370e) weakReference.get()) != null) {
                    dialogInterfaceC15370e.dismiss();
                }
                AbstractC2835e.startapp = null;
                C16985e c16985e = new C16985e(activity);
                C11486e c11486e = (C11486e) c16985e.f26878e;
                c11486e.license = c11486e.ad.getText(R.string.edit_audio_dialog);
                View inflate = LayoutInflater.from(activity).inflate(R.layout.sconnect_edit_audio, (ViewGroup) null, false);
                int i2 = R.id.artist;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC7779e.vip(inflate, R.id.artist);
                if (textInputEditText != null) {
                    i2 = R.id.artist_root;
                    if (((TextInputLayout) AbstractC7779e.vip(inflate, R.id.artist_root)) != null) {
                        i2 = R.id.save;
                        MaterialButton materialButton = (MaterialButton) AbstractC7779e.vip(inflate, R.id.save);
                        if (materialButton != null) {
                            LinearLayout linearLayout = (LinearLayout) inflate;
                            int i3 = R.id.title;
                            TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC7779e.vip(inflate, R.id.title);
                            if (textInputEditText2 != null) {
                                i3 = R.id.title_root;
                                if (((TextInputLayout) AbstractC7779e.vip(inflate, R.id.title_root)) != null) {
                                    C11467e c11467e = new C11467e(linearLayout, textInputEditText, materialButton, textInputEditText2);
                                    textInputEditText2.setText(audioTrack.license);
                                    textInputEditText.setText(audioTrack.ad);
                                    materialButton.setOnClickListener(new ViewOnClickListenerC16710e(c11467e, activity, audioTrack, c15584e));
                                    c11486e.Signature = linearLayout;
                                    AbstractC2835e.startapp = new WeakReference(c16985e.isPro());
                                    c3566e3.purchase();
                                    return Unit.INSTANCE;
                                }
                            }
                            i2 = i3;
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            case 3:
                C3566e c3566e4 = (C3566e) obj;
                Activity activity2 = c3566e4.f10582e;
                AudioTrack audioTrack2 = c13372e.f26633e;
                VKXApplication.Companion companion = VKXApplication.f36531e;
                AbstractC7237e.metrica(activity2, new AbstractC9194e(VKXApplication.Companion.vip(R.string.tab_recommendations), new C13412e(AbstractC6914e.purchase(audioTrack2), audioTrack2.ad + " - " + audioTrack2.license)));
                c3566e4.m1376interface();
                return Unit.INSTANCE;
            case 4:
                C3566e c3566e5 = (C3566e) obj;
                Activity activity3 = c3566e5.f10582e;
                AbstractC16519e.vip((AppActivity) activity3, new C10105e(c13372e, activity3, null));
                c3566e5.purchase();
                return Unit.INSTANCE;
            case 5:
                C3566e c3566e6 = (C3566e) obj;
                new C7537e(c13372e.f26633e).signatures(c3566e6.f10582e);
                c3566e6.purchase();
                return Unit.INSTANCE;
            case 6:
                C3566e c3566e7 = (C3566e) obj;
                AppActivity appActivity = (AppActivity) c3566e7.f10582e;
                AudioTrack audioTrack3 = c13372e.f26633e;
                AbstractC2745e.vip(appActivity, new C12908e(audioTrack3, 4));
                AppActivity appActivity2 = (AppActivity) c3566e7.f10582e;
                Integer valueOf = Integer.valueOf(R.drawable.ic_download_square_outline_28);
                VKXApplication.Companion companion2 = VKXApplication.f36531e;
                C9402e.ad(appActivity2, new C15076e(valueOf, VKXApplication.Companion.vip(R.string.sn_track_added_to_cache), audioTrack3.ad + " - " + audioTrack3.license, null, null, 120));
                c3566e7.purchase();
                return Unit.INSTANCE;
            case 7:
                C3566e c3566e8 = (C3566e) obj;
                C11794e c11794e = C11794e.f23667e;
                AppActivity appActivity3 = (AppActivity) c3566e8.f10582e;
                AudioTrack audioTrack4 = c13372e.f26633e;
                c11794e.getClass();
                C2464e.appmetrica.getClass();
                C2464e.vip(appActivity3, audioTrack4);
                AppActivity appActivity4 = (AppActivity) c3566e8.f10582e;
                Integer valueOf2 = Integer.valueOf(R.drawable.ic_download_square_outline_28);
                VKXApplication.Companion companion3 = VKXApplication.f36531e;
                C9402e.ad(appActivity4, new C15076e(valueOf2, VKXApplication.Companion.vip(R.string.sn_track_added_to_cache), audioTrack4.ad + " - " + audioTrack4.license, null, null, 120));
                c3566e8.purchase();
                return Unit.INSTANCE;
            case 8:
                C3566e c3566e9 = (C3566e) obj;
                new C13424e(new C5175e(c13372e.f26633e)).signatures(c3566e9.f10582e);
                c3566e9.purchase();
                return Unit.INSTANCE;
            case 9:
                AudioTrack audioTrack5 = c13372e.f26633e;
                ((AppActivity) ((Activity) obj)).isVip(new C15820e(audioTrack5.amazon.ad.intValue(), 8, audioTrack5.amazon.vip.longValue(), audioTrack5.amazon.metrica));
                return Unit.INSTANCE;
            default:
                C3566e c3566e10 = (C3566e) obj;
                C7838e c7838e = VKXApplication.f36530e;
                if (c7838e == null) {
                    c7838e = null;
                }
                AudioTrack audioTrack6 = c13372e.f26633e;
                c7838e.getClass();
                c7838e.startapp(new C2122e(c7838e, audioTrack6, interfaceC5083e, 2));
                c3566e10.purchase();
                return Unit.INSTANCE;
        }
    }
}
