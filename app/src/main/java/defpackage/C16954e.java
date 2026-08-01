package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioBookPerson;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;
import ua.itaysonlab.vkapi2.objects.podcasts.Podcast;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCover;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٜٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16954e extends AbstractC5604e implements InterfaceC18435e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f33208e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f33209e;

    public C16954e(int i) {
        this.f33209e = i;
        switch (i) {
            case 1:
                this.f33208e = AbstractC9743e.vip();
                return;
            default:
                this.f33208e = AbstractC9743e.vip();
                return;
        }
    }

    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        Object next;
        switch (this.f33209e) {
            case 0:
                AudioBookPerson audioBookPerson = (AudioBookPerson) obj;
                C15464e c15464e = (C15464e) interfaceC10283e;
                ImageView imageView = c15464e.f30548e;
                Iterator it = audioBookPerson.license.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int i2 = ((CustomCatalogBlockItemPhoto) next).ad;
                        do {
                            Object next2 = it.next();
                            int i3 = ((CustomCatalogBlockItemPhoto) next2).ad;
                            if (i2 < i3) {
                                next = next2;
                                i2 = i3;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                CustomCatalogBlockItemPhoto customCatalogBlockItemPhoto = (CustomCatalogBlockItemPhoto) next;
                String str = customCatalogBlockItemPhoto != null ? customCatalogBlockItemPhoto.vip : null;
                InterfaceC12732e ad = AbstractC16550e.ad(imageView.getContext());
                C5944e c5944e = new C5944e(imageView.getContext());
                c5944e.metrica = str;
                AbstractC15659e.license(c5944e, imageView);
                ((C0624e) ad).ad(c5944e.ad());
                c15464e.f30549e.setText(audioBookPerson.metrica);
                c15464e.f30553e.setLayoutParams(new RelativeLayout.LayoutParams(-1, AbstractC3489e.ad));
                c15464e.f30550e.setVisibility(8);
                c15464e.f30547e.setVisibility(8);
                TextView textView = c15464e.f30552e;
                String str2 = audioBookPerson.ad;
                if (str2 == null) {
                    str2 = BuildConfig.FLAVOR;
                }
                textView.setText(str2);
                return;
            default:
                Podcast podcast = (Podcast) obj;
                C15179e c15179e = (C15179e) interfaceC10283e;
                c15179e.f30034e.setOnClickListener(new ViewOnClickListenerC6691e(podcast, 1));
                ImageView imageView2 = c15179e.f30033e;
                PodcastCover podcastCover = (PodcastCover) AbstractC13480e.m3604this(podcast.purchase);
                AbstractC2379e.metrica(imageView2, podcastCover != null ? podcastCover.ad("a") : null, Integer.valueOf(R.drawable.placeholder_playlist), new C9377e(new AbstractC13386e(8.0f), 14));
                c15179e.f30035e.setText(podcast.ad);
                c15179e.f30032e.setText(podcast.appmetrica);
                AbstractC17680e.mopub(c15179e.f30030e);
                AbstractC17680e.mopub(c15179e.f30031e);
                return;
        }
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        switch (this.f33209e) {
            case 0:
                return this.f33208e.f29359e;
            default:
                return this.f33208e.f29359e;
        }
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        switch (this.f33209e) {
            case 0:
                return R.layout.artist_header_v2cb;
            default:
                return R.layout.list_item_playlist_horizontal;
        }
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f33209e) {
            case 0:
                View inflate = layoutInflater.inflate(R.layout.artist_header_v2cb, viewGroup, false);
                int i = R.id.artist_name;
                TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.artist_name);
                if (textView != null) {
                    i = R.id.artist_photo;
                    ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.artist_photo);
                    if (imageView != null) {
                        i = R.id.artist_play;
                        MaterialButton materialButton = (MaterialButton) AbstractC7779e.vip(inflate, R.id.artist_play);
                        if (materialButton != null) {
                            i = R.id.artist_subscribe;
                            MaterialButton materialButton2 = (MaterialButton) AbstractC7779e.vip(inflate, R.id.artist_subscribe);
                            if (materialButton2 != null) {
                                i = R.id.sb_padder;
                                Space space = (Space) AbstractC7779e.vip(inflate, R.id.sb_padder);
                                if (space != null) {
                                    i = R.id.scrim_bottom;
                                    if (AbstractC7779e.vip(inflate, R.id.scrim_bottom) != null) {
                                        i = R.id.text;
                                        TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.text);
                                        if (textView2 != null) {
                                            return new C15464e((LinearLayout) inflate, textView, imageView, materialButton, materialButton2, space, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            default:
                return C15179e.ad(layoutInflater, viewGroup);
        }
    }
}
