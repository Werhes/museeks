package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.text.DecimalFormat;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCatalogSliderItem;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8390e extends AbstractC5604e implements InterfaceC18435e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f17162e = AbstractC9743e.vip();

    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        final PodcastCatalogSliderItem podcastCatalogSliderItem = (PodcastCatalogSliderItem) obj;
        C18436e c18436e = (C18436e) interfaceC10283e;
        ImageView imageView = c18436e.f36138e;
        MaterialButton materialButton = c18436e.f36140e;
        MaterialCardView materialCardView = c18436e.f36142e;
        TextView textView = c18436e.f36139e;
        TextView textView2 = c18436e.f36141e;
        final int i2 = 1;
        if (!(podcastCatalogSliderItem instanceof PodcastCatalogSliderItem.EpisodeItem)) {
            if (!(podcastCatalogSliderItem instanceof PodcastCatalogSliderItem.RandomButtonItem)) {
                throw new C14803e(10);
            }
            materialCardView.setOnClickListener(null);
            materialButton.setOnClickListener(new ViewOnClickListenerC0123e(9, this));
            int metrica = AbstractC3898e.metrica(AbstractC15933e.ad(R.attr.global_accent), 0.2f, -16777216);
            Integer valueOf = Integer.valueOf(R.drawable.placeholder_shuffle);
            InterfaceC12732e ad = AbstractC16550e.ad(imageView.getContext());
            C5944e c5944e = new C5944e(imageView.getContext());
            c5944e.metrica = valueOf;
            AbstractC15659e.license(c5944e, imageView);
            ((C0624e) ad).ad(c5944e.ad());
            materialCardView.setCardBackgroundColor(metrica);
            textView2.setText("Вам повезет!");
            textView.setText("Попробуйте послушать случайный эпизод");
            textView2.setMaxLines(1);
            textView.setMaxLines(2);
            int i3 = AbstractC3898e.appmetrica(metrica) <= 0.75d ? -1 : -16777216;
            textView2.setTextColor(i3);
            textView.setTextColor(AbstractC3898e.startapp(i3, (int) (255 * 0.7f)));
            return;
        }
        final int i4 = 0;
        materialCardView.setOnClickListener(new View.OnClickListener() { // from class: eؙٕۖ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        AudioTrack audioTrack = ((PodcastCatalogSliderItem.EpisodeItem) podcastCatalogSliderItem).vip;
                        AbstractC7237e.ad(view, new C13642e(audioTrack.vip, audioTrack.metrica));
                        return;
                    default:
                        AbstractC13201e.license(view.getContext(), new C4464e(((PodcastCatalogSliderItem.EpisodeItem) podcastCatalogSliderItem).vip));
                        return;
                }
            }
        });
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: eؙٕۖ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        AudioTrack audioTrack = ((PodcastCatalogSliderItem.EpisodeItem) podcastCatalogSliderItem).vip;
                        AbstractC7237e.ad(view, new C13642e(audioTrack.vip, audioTrack.metrica));
                        return;
                    default:
                        AbstractC13201e.license(view.getContext(), new C4464e(((PodcastCatalogSliderItem.EpisodeItem) podcastCatalogSliderItem).vip));
                        return;
                }
            }
        });
        AudioTrack audioTrack = ((PodcastCatalogSliderItem.EpisodeItem) podcastCatalogSliderItem).vip;
        String ad2 = AbstractC6914e.ad(audioTrack);
        InterfaceC12732e ad3 = AbstractC16550e.ad(imageView.getContext());
        C5944e c5944e2 = new C5944e(imageView.getContext());
        c5944e2.metrica = ad2;
        AbstractC15659e.license(c5944e2, imageView);
        VKXApplication.Companion companion = VKXApplication.f36531e;
        AbstractC2182e.metrica(c5944e2, new C5271e(VKXApplication.Companion.ad(8.0f)));
        ((C0624e) ad3).ad(c5944e2.ad());
        materialCardView.setCardBackgroundColor(AbstractC15933e.ad(R.attr.bg_primary));
        textView2.setText(audioTrack.license);
        Context context = materialCardView.getContext();
        String str = audioTrack.ad;
        DecimalFormat decimalFormat = C5575e.ad;
        textView.setText(context.getString(R.string.separator_strings, str, AbstractC15920e.subs(audioTrack.appmetrica, false)));
        textView2.setMaxLines(2);
        textView.setMaxLines(1);
        textView2.setTextColor(AbstractC15933e.ad(R.attr.text_primary));
        textView.setTextColor(AbstractC15933e.ad(R.attr.text_secondary));
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f17162e.f29359e;
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return R.layout.podcast_slider_item;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.podcast_slider_item, viewGroup, false);
        MaterialCardView materialCardView = (MaterialCardView) inflate;
        int i = R.id.listen;
        MaterialButton materialButton = (MaterialButton) AbstractC7779e.vip(inflate, R.id.listen);
        if (materialButton != null) {
            i = R.id.slider_text;
            TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.slider_text);
            if (textView != null) {
                i = R.id.slider_title;
                TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.slider_title);
                if (textView2 != null) {
                    i = R.id.song_album;
                    ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.song_album);
                    if (imageView != null) {
                        return new C18436e(imageView, textView, textView2, materialButton, materialCardView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
