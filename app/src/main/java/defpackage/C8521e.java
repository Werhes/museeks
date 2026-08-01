package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8521e extends AbstractC5604e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f17328e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f17329e;

    public C8521e(boolean z, boolean z2) {
        this.f17329e = z;
        this.f17328e = z2;
    }

    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        final AudioTrack audioTrack = (AudioTrack) obj;
        C16559e c16559e = (C16559e) interfaceC10283e;
        TextView textView = c16559e.f32507e;
        TextView textView2 = c16559e.f32509e;
        LinearLayout linearLayout = c16559e.f32511e;
        final int i2 = 0;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: eٌۣٓ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        AudioTrack audioTrack2 = audioTrack;
                        AbstractC7237e.ad(view, new C13642e(audioTrack2.vip, audioTrack2.metrica));
                        return;
                    default:
                        AbstractC7237e.ad(view, new C5421e(audioTrack.metrica));
                        return;
                }
            }
        });
        if (!this.f17328e) {
            AbstractC1464e.ad(linearLayout);
        }
        final int i3 = 1;
        if (this.f17329e) {
            textView2.setText(String.valueOf(i + 1));
        } else {
            textView2.setVisibility(8);
        }
        AbstractC13487e.vip(c16559e.f32510e, audioTrack, R.drawable.placeholder_audio, 8.0f, false, 3);
        c16559e.f32512e.setText(audioTrack.license);
        c16559e.f32508e.setText(audioTrack.isPro.license);
        textView.setText(audioTrack.ad);
        textView.setOnClickListener(new View.OnClickListener() { // from class: eٌۣٓ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        AudioTrack audioTrack2 = audioTrack;
                        AbstractC7237e.ad(view, new C13642e(audioTrack2.vip, audioTrack2.metrica));
                        return;
                    default:
                        AbstractC7237e.ad(view, new C5421e(audioTrack.metrica));
                        return;
                }
            }
        });
        TextView textView3 = c16559e.f32513e;
        DecimalFormat decimalFormat = C5575e.ad;
        textView3.setText(AbstractC15920e.subs(audioTrack.appmetrica, false));
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return R.layout.podcast_simple_view;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.podcast_simple_view, viewGroup, false);
        int i = R.id.chart_data;
        TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.chart_data);
        if (textView != null) {
            i = R.id.desc;
            TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.desc);
            if (textView2 != null) {
                i = R.id.separator;
                if (((TextView) AbstractC7779e.vip(inflate, R.id.separator)) != null) {
                    i = R.id.song_album;
                    ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.song_album);
                    if (imageView != null) {
                        i = R.id.song_author;
                        TextView textView3 = (TextView) AbstractC7779e.vip(inflate, R.id.song_author);
                        if (textView3 != null) {
                            i = R.id.song_duration;
                            TextView textView4 = (TextView) AbstractC7779e.vip(inflate, R.id.song_duration);
                            if (textView4 != null) {
                                i = R.id.song_title;
                                TextView textView5 = (TextView) AbstractC7779e.vip(inflate, R.id.song_title);
                                if (textView5 != null) {
                                    return new C16559e((LinearLayout) inflate, textView, textView2, imageView, textView3, textView4, textView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
