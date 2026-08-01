package defpackage;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import ua.itaysonlab.vkapi2.objects.music.AudioChartInfo;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11710e extends AbstractC16994e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f23543e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int f23544e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f23545e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f23546e;

    public C11710e(boolean z, boolean z2, boolean z3) {
        super(2);
        this.f23546e = z;
        this.f23545e = z2;
        this.f23543e = z3;
        VKXApplication.Companion companion = VKXApplication.f36531e;
        this.f23544e = VKXApplication.Companion.ad(180.0f);
    }

    @Override // defpackage.AbstractC16994e
    public final ImageView amazon(InterfaceC10283e interfaceC10283e) {
        return ((C15247e) interfaceC10283e).f30169e;
    }

    @Override // defpackage.AbstractC16994e
    public final void metrica(InterfaceC10283e interfaceC10283e, AudioTrack audioTrack, int i) {
        boolean z;
        int i2;
        C15247e c15247e = (C15247e) interfaceC10283e;
        LinearLayout linearLayout = c15247e.f30175e;
        TextView textView = c15247e.f30168e;
        LinearLayout linearLayout2 = c15247e.f30174e;
        LinearLayout linearLayout3 = c15247e.f30176e;
        LinearLayout linearLayout4 = c15247e.f30171e;
        ImageView imageView = c15247e.f30177e;
        TextView textView2 = c15247e.f30173e;
        textView2.setText(AbstractC6914e.metrica(audioTrack, false));
        c15247e.f30172e.setText(audioTrack.ad);
        TextView textView3 = c15247e.f30170e;
        DecimalFormat decimalFormat = C5575e.ad;
        textView3.setText(AbstractC15920e.subs(audioTrack.appmetrica, false));
        AbstractC13487e.vip(c15247e.f30178e, audioTrack, R.drawable.placeholder_audio, 8.0f, false, 1);
        ImageView imageView2 = c15247e.f30169e;
        imageView2.setImageDrawable(C6114e.m2033e(false));
        c15247e.f30181e.setVisibility(audioTrack.isVip() ? 0 : 8);
        linearLayout2.setVisibility(this.f23543e ? 8 : 0);
        if (this.f23545e) {
            linearLayout4.setVisibility(0);
            AudioChartInfo audioChartInfo = audioTrack.applovin;
            z = true;
            int i3 = audioChartInfo.vip;
            EnumC11609e enumC11609e = audioChartInfo.metrica;
            if (i3 == -1) {
                imageView.setVisibility(8);
                textView.setText(String.valueOf(i + 1));
            } else {
                imageView.setVisibility(0);
                textView.setText(String.valueOf(audioChartInfo.ad));
                imageView.setImageResource(enumC11609e.f23323e);
                int i4 = enumC11609e.f23322e;
                if (i4 == 0) {
                    i4 = AbstractC15933e.ad(R.attr.global_accent);
                }
                imageView.setImageTintList(ColorStateList.valueOf(i4));
            }
        } else {
            z = true;
            linearLayout4.setVisibility(8);
        }
        if (this.f23546e) {
            linearLayout.getLayoutParams().width = -2;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout3.getLayoutParams();
            layoutParams.width = this.f23544e;
            layoutParams.weight = 0.0f;
            i2 = 0;
        } else {
            linearLayout.getLayoutParams().width = -1;
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) linearLayout3.getLayoutParams();
            i2 = 0;
            layoutParams2.width = 0;
            layoutParams2.weight = 1.0f;
        }
        if (audioTrack.billing) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(i2, i2, R.drawable.ic_explicit_outline_28, i2);
        } else {
            textView2.setCompoundDrawablesWithIntrinsicBounds(i2, i2, i2, i2);
        }
        C7838e c7838e = VKXApplication.f36530e;
        if (c7838e == null) {
            c7838e = null;
        }
        C14609e vip = c7838e.vip();
        AbstractC16049e abstractC16049e = vip != null ? vip.vip : null;
        AudioTrack audioTrack2 = abstractC16049e instanceof AudioTrack ? (AudioTrack) abstractC16049e : null;
        if (audioTrack2 == null || audioTrack2.vip != audioTrack.vip) {
            imageView2.setVisibility(8);
            imageView2.setActivated(false);
        } else {
            imageView2.setVisibility(0);
            C7838e c7838e2 = VKXApplication.f36530e;
            imageView2.setActivated((c7838e2 != null ? c7838e2 : null).appmetrica() == EnumC11342e.f22808e ? z : false);
        }
        float f = AbstractC6914e.appmetrica(audioTrack) ? 0.4f : 1.0f;
        c15247e.f30180e.setAlpha(f);
        linearLayout4.setAlpha(f);
        linearLayout3.setAlpha(f);
        linearLayout2.setAlpha(f);
    }

    @Override // defpackage.AbstractC16994e
    public final InterfaceC10283e purchase(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.list_item_track, viewGroup, false);
        int i = R.id.anchor;
        LinearLayout linearLayout = (LinearLayout) AbstractC7779e.vip(inflate, R.id.anchor);
        if (linearLayout != null) {
            i = R.id.chart_data;
            LinearLayout linearLayout2 = (LinearLayout) AbstractC7779e.vip(inflate, R.id.chart_data);
            if (linearLayout2 != null) {
                i = R.id.chart_image;
                ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.chart_image);
                if (imageView != null) {
                    i = R.id.chart_pos;
                    TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.chart_pos);
                    if (textView != null) {
                        i = R.id.download_indicator;
                        ImageView imageView2 = (ImageView) AbstractC7779e.vip(inflate, R.id.download_indicator);
                        if (imageView2 != null) {
                            i = R.id.inner_content;
                            FrameLayout frameLayout = (FrameLayout) AbstractC7779e.vip(inflate, R.id.inner_content);
                            if (frameLayout != null) {
                                LinearLayout linearLayout3 = (LinearLayout) inflate;
                                i = R.id.song_album;
                                ImageView imageView3 = (ImageView) AbstractC7779e.vip(inflate, R.id.song_album);
                                if (imageView3 != null) {
                                    i = R.id.song_author;
                                    TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.song_author);
                                    if (textView2 != null) {
                                        i = R.id.song_container;
                                        LinearLayout linearLayout4 = (LinearLayout) AbstractC7779e.vip(inflate, R.id.song_container);
                                        if (linearLayout4 != null) {
                                            i = R.id.song_duration;
                                            TextView textView3 = (TextView) AbstractC7779e.vip(inflate, R.id.song_duration);
                                            if (textView3 != null) {
                                                i = R.id.song_overlay;
                                                ImageView imageView4 = (ImageView) AbstractC7779e.vip(inflate, R.id.song_overlay);
                                                if (imageView4 != null) {
                                                    i = R.id.song_title;
                                                    TextView textView4 = (TextView) AbstractC7779e.vip(inflate, R.id.song_title);
                                                    if (textView4 != null) {
                                                        return new C15247e(linearLayout3, linearLayout, linearLayout2, imageView, textView, imageView2, frameLayout, linearLayout3, imageView3, textView2, linearLayout4, textView3, imageView4, textView4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.AbstractC16994e
    public final void smaato(InterfaceC10283e interfaceC10283e) {
        AbstractC5750e.billing(((C15247e) interfaceC10283e).f30178e).ad();
    }

    @Override // defpackage.AbstractC16994e
    public final int startapp() {
        return R.layout.list_item_track;
    }
}
