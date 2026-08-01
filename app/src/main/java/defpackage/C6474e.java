package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6474e extends AbstractC16994e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f13388e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6474e(int i) {
        super(2);
        this.f13388e = i;
    }

    @Override // defpackage.AbstractC16994e
    public final ImageView amazon(InterfaceC10283e interfaceC10283e) {
        switch (this.f13388e) {
            case 0:
                return ((C12090e) interfaceC10283e).f24232e;
            default:
                return ((C2114e) interfaceC10283e).f5469e;
        }
    }

    @Override // defpackage.AbstractC16994e
    public final void metrica(InterfaceC10283e interfaceC10283e, AudioTrack audioTrack, int i) {
        int i2 = this.f13388e;
        EnumC11342e enumC11342e = EnumC11342e.f22808e;
        switch (i2) {
            case 0:
                C12090e c12090e = (C12090e) interfaceC10283e;
                ImageView imageView = c12090e.f24230e;
                TextView textView = c12090e.f24228e;
                ImageView imageView2 = c12090e.f24232e;
                TextView textView2 = c12090e.f24229e;
                textView2.setText(AbstractC6914e.metrica(audioTrack, true));
                TextView textView3 = c12090e.f24233e;
                DecimalFormat decimalFormat = C5575e.ad;
                textView3.setText(AbstractC15920e.subs(audioTrack.appmetrica, false));
                ImageView imageView3 = c12090e.f24227e;
                imageView3.setVisibility(audioTrack.isVip() ? 0 : 8);
                textView.setText(String.valueOf(i + 1));
                if (audioTrack.billing) {
                    textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_explicit_outline_28, 0);
                } else {
                    textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                if (audioTrack.tapsense) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                imageView2.setImageDrawable(C6114e.m2033e(true));
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
                    textView.setVisibility(0);
                } else {
                    imageView2.setVisibility(0);
                    C7838e c7838e2 = VKXApplication.f36530e;
                    imageView2.setActivated((c7838e2 != null ? c7838e2 : null).appmetrica() == enumC11342e);
                    textView.setVisibility(4);
                }
                float f = AbstractC6914e.appmetrica(audioTrack) ? 0.4f : 1.0f;
                c12090e.f24226e.setAlpha(f);
                textView2.setAlpha(f);
                imageView.setAlpha(f);
                imageView3.setAlpha(f);
                textView3.setAlpha(f);
                return;
            default:
                C2114e c2114e = (C2114e) interfaceC10283e;
                TextView textView4 = c2114e.f5464e;
                ImageView imageView4 = c2114e.f5469e;
                TextView textView5 = c2114e.f5465e;
                textView5.setText(AbstractC6914e.metrica(audioTrack, false));
                c2114e.f5472e.setText(audioTrack.ad);
                TextView textView6 = c2114e.f5467e;
                DecimalFormat decimalFormat2 = C5575e.ad;
                textView6.setText(AbstractC15920e.subs(audioTrack.appmetrica, false));
                c2114e.f5468e.setVisibility(audioTrack.isVip() ? 0 : 8);
                textView4.setText(String.valueOf(i + 1));
                if (audioTrack.billing) {
                    textView5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_explicit_outline_28, 0);
                } else {
                    textView5.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                imageView4.setImageDrawable(C6114e.m2033e(true));
                C7838e c7838e3 = VKXApplication.f36530e;
                if (c7838e3 == null) {
                    c7838e3 = null;
                }
                C14609e vip2 = c7838e3.vip();
                AbstractC16049e abstractC16049e2 = vip2 != null ? vip2.vip : null;
                AudioTrack audioTrack3 = abstractC16049e2 instanceof AudioTrack ? (AudioTrack) abstractC16049e2 : null;
                if (audioTrack3 == null || audioTrack3.vip != audioTrack.vip) {
                    imageView4.setVisibility(8);
                    imageView4.setActivated(false);
                    textView4.setVisibility(0);
                } else {
                    imageView4.setVisibility(0);
                    C7838e c7838e4 = VKXApplication.f36530e;
                    imageView4.setActivated((c7838e4 != null ? c7838e4 : null).appmetrica() == enumC11342e);
                    textView4.setVisibility(4);
                }
                float f2 = AbstractC6914e.appmetrica(audioTrack) ? 0.4f : 1.0f;
                c2114e.f5463e.setAlpha(f2);
                c2114e.f5471e.setAlpha(f2);
                c2114e.f5466e.setAlpha(f2);
                return;
        }
    }

    @Override // defpackage.AbstractC16994e
    public final InterfaceC10283e purchase(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f13388e) {
            case 0:
                View inflate = layoutInflater.inflate(R.layout.list_item_track_mainonly, viewGroup, false);
                int i = R.id.chart_pos;
                TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.chart_pos);
                if (textView != null) {
                    i = R.id.download_indicator;
                    ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.download_indicator);
                    if (imageView != null) {
                        i = R.id.focus_indicator;
                        ImageView imageView2 = (ImageView) AbstractC7779e.vip(inflate, R.id.focus_indicator);
                        if (imageView2 != null) {
                            i = R.id.inner_content;
                            FrameLayout frameLayout = (FrameLayout) AbstractC7779e.vip(inflate, R.id.inner_content);
                            if (frameLayout != null) {
                                LinearLayout linearLayout = (LinearLayout) inflate;
                                i = R.id.song_duration;
                                TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.song_duration);
                                if (textView2 != null) {
                                    i = R.id.song_overlay;
                                    ImageView imageView3 = (ImageView) AbstractC7779e.vip(inflate, R.id.song_overlay);
                                    if (imageView3 != null) {
                                        i = R.id.song_title;
                                        TextView textView3 = (TextView) AbstractC7779e.vip(inflate, R.id.song_title);
                                        if (textView3 != null) {
                                            return new C12090e(linearLayout, textView, imageView, imageView2, frameLayout, textView2, imageView3, textView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            default:
                View inflate2 = layoutInflater.inflate(R.layout.list_item_track_collection, viewGroup, false);
                int i2 = R.id.anchor;
                LinearLayout linearLayout2 = (LinearLayout) AbstractC7779e.vip(inflate2, R.id.anchor);
                if (linearLayout2 != null) {
                    i2 = R.id.chart_pos;
                    TextView textView4 = (TextView) AbstractC7779e.vip(inflate2, R.id.chart_pos);
                    if (textView4 != null) {
                        i2 = R.id.download_indicator;
                        ImageView imageView4 = (ImageView) AbstractC7779e.vip(inflate2, R.id.download_indicator);
                        if (imageView4 != null) {
                            i2 = R.id.inner_content;
                            FrameLayout frameLayout2 = (FrameLayout) AbstractC7779e.vip(inflate2, R.id.inner_content);
                            if (frameLayout2 != null) {
                                LinearLayout linearLayout3 = (LinearLayout) inflate2;
                                i2 = R.id.song_author;
                                TextView textView5 = (TextView) AbstractC7779e.vip(inflate2, R.id.song_author);
                                if (textView5 != null) {
                                    i2 = R.id.song_container;
                                    LinearLayout linearLayout4 = (LinearLayout) AbstractC7779e.vip(inflate2, R.id.song_container);
                                    if (linearLayout4 != null) {
                                        i2 = R.id.song_duration;
                                        TextView textView6 = (TextView) AbstractC7779e.vip(inflate2, R.id.song_duration);
                                        if (textView6 != null) {
                                            i2 = R.id.song_overlay;
                                            ImageView imageView5 = (ImageView) AbstractC7779e.vip(inflate2, R.id.song_overlay);
                                            if (imageView5 != null) {
                                                i2 = R.id.song_title;
                                                TextView textView7 = (TextView) AbstractC7779e.vip(inflate2, R.id.song_title);
                                                if (textView7 != null) {
                                                    return new C2114e(linearLayout3, linearLayout2, textView4, imageView4, frameLayout2, textView5, linearLayout4, textView6, imageView5, textView7);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
        }
    }

    @Override // defpackage.AbstractC16994e
    public final /* bridge */ /* synthetic */ void smaato(InterfaceC10283e interfaceC10283e) {
        switch (this.f13388e) {
            case 0:
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC16994e
    public final int startapp() {
        switch (this.f13388e) {
            case 0:
                return R.layout.list_item_track_mainonly;
            default:
                return R.layout.list_item_track_collection;
        }
    }

    @Override // defpackage.AbstractC16994e
    public final void vip(InterfaceC10283e interfaceC10283e, boolean z) {
        switch (this.f13388e) {
            case 0:
                TextView textView = ((C12090e) interfaceC10283e).f24228e;
                if (z) {
                    textView.setVisibility(4);
                    return;
                } else {
                    textView.setVisibility(0);
                    return;
                }
            default:
                TextView textView2 = ((C2114e) interfaceC10283e).f5464e;
                if (z) {
                    textView2.setVisibility(4);
                    return;
                } else {
                    textView2.setVisibility(0);
                    return;
                }
        }
    }
}
