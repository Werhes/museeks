package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٛۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12595e extends AbstractC16994e {
    public static void loadAd(C15415e c15415e, final AudioTrack audioTrack, final int i, final C12344e c12344e, final Function0 function0) {
        ImageView imageView = c15415e.f30470e;
        TextView textView = c15415e.f30469e;
        ImageView imageView2 = c15415e.f30471e;
        boolean z = c12344e != null && ((ArrayList) c12344e.f24748e).contains(audioTrack);
        textView.setText(AbstractC6914e.metrica(audioTrack, false));
        c15415e.f30478e.setText(audioTrack.ad);
        TextView textView2 = c15415e.f30476e;
        DecimalFormat decimalFormat = C5575e.ad;
        textView2.setText(AbstractC15920e.subs(audioTrack.appmetrica, false));
        AbstractC13487e.vip(c15415e.f30479e, audioTrack, R.drawable.placeholder_audio, 8.0f, false, 1);
        imageView2.setImageDrawable(C6114e.m2033e(false));
        c15415e.f30475e.setVisibility(audioTrack.isVip() ? 0 : 8);
        if (audioTrack.billing) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_explicit_outline_28, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: eؙؗۦ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C3566e.f8039e;
                AbstractC0890e.appmetrica(AudioTrack.this, new C15736e(c12344e, i, function0, 4)).signatures((Activity) view.getContext());
            }
        });
        c15415e.f30474e.setVisibility(z ? 0 : 8);
        C7838e c7838e = VKXApplication.f36530e;
        if (c7838e == null) {
            c7838e = null;
        }
        C14609e vip = c7838e.vip();
        AbstractC16049e abstractC16049e = vip != null ? vip.vip : null;
        AudioTrack audioTrack2 = abstractC16049e instanceof AudioTrack ? (AudioTrack) abstractC16049e : null;
        if (audioTrack2 == null || audioTrack2.vip != audioTrack.vip || z) {
            imageView2.setVisibility(8);
            imageView2.setActivated(false);
        } else {
            imageView2.setVisibility(0);
            C7838e c7838e2 = VKXApplication.f36530e;
            imageView2.setActivated((c7838e2 != null ? c7838e2 : null).appmetrica() == EnumC11342e.f22808e);
        }
        float f = AbstractC6914e.appmetrica(audioTrack) ? 0.4f : 1.0f;
        c15415e.f30468e.setAlpha(f);
        c15415e.f30473e.setAlpha(f);
        c15415e.f30472e.setAlpha(f);
        imageView.setAlpha(f);
    }

    @Override // defpackage.AbstractC16994e
    public final ImageView amazon(InterfaceC10283e interfaceC10283e) {
        return ((C15415e) interfaceC10283e).f30471e;
    }

    @Override // defpackage.AbstractC16994e
    public final void metrica(InterfaceC10283e interfaceC10283e, AudioTrack audioTrack, int i) {
        loadAd((C15415e) interfaceC10283e, audioTrack, i, null, new C10673e(27));
    }

    @Override // defpackage.AbstractC16994e
    public final InterfaceC10283e purchase(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.list_item_track_swipe, viewGroup, false);
        int i = R.id.anchor;
        LinearLayout linearLayout = (LinearLayout) AbstractC7779e.vip(inflate, R.id.anchor);
        if (linearLayout != null) {
            i = R.id.call_menu;
            ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.call_menu);
            if (imageView != null) {
                i = R.id.download_indicator;
                ImageView imageView2 = (ImageView) AbstractC7779e.vip(inflate, R.id.download_indicator);
                if (imageView2 != null) {
                    i = R.id.inner_content;
                    FrameLayout frameLayout = (FrameLayout) AbstractC7779e.vip(inflate, R.id.inner_content);
                    if (frameLayout != null) {
                        LinearLayout linearLayout2 = (LinearLayout) inflate;
                        i = R.id.song_album;
                        ImageView imageView3 = (ImageView) AbstractC7779e.vip(inflate, R.id.song_album);
                        if (imageView3 != null) {
                            i = R.id.song_author;
                            TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.song_author);
                            if (textView != null) {
                                i = R.id.song_container;
                                LinearLayout linearLayout3 = (LinearLayout) AbstractC7779e.vip(inflate, R.id.song_container);
                                if (linearLayout3 != null) {
                                    i = R.id.song_duration;
                                    TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.song_duration);
                                    if (textView2 != null) {
                                        i = R.id.song_overlay;
                                        ImageView imageView4 = (ImageView) AbstractC7779e.vip(inflate, R.id.song_overlay);
                                        if (imageView4 != null) {
                                            i = R.id.song_selected;
                                            ImageView imageView5 = (ImageView) AbstractC7779e.vip(inflate, R.id.song_selected);
                                            if (imageView5 != null) {
                                                i = R.id.song_title;
                                                TextView textView3 = (TextView) AbstractC7779e.vip(inflate, R.id.song_title);
                                                if (textView3 != null) {
                                                    return new C15415e(linearLayout2, linearLayout, imageView, imageView2, frameLayout, imageView3, textView, linearLayout3, textView2, imageView4, imageView5, textView3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.AbstractC16994e
    public final void smaato(InterfaceC10283e interfaceC10283e) {
        AbstractC5750e.billing(((C15415e) interfaceC10283e).f30479e).ad();
    }

    @Override // defpackage.AbstractC16994e
    public final int startapp() {
        return R.layout.list_item_track_swipe;
    }
}
