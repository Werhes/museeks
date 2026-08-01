package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2Text;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2Banner;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCatalogLongread;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkapi2.objects.video.VKVideo;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٟۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7350e extends AbstractC5604e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f15083e;

    public /* synthetic */ C7350e(int i) {
        this.f15083e = i;
    }

    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        String m3608try;
        String m3608try2;
        String str = "Unknown Artist";
        final int i2 = 1;
        final int i3 = 0;
        switch (this.f15083e) {
            case 0:
                Catalog2Banner catalog2Banner = (Catalog2Banner) obj;
                C14375e c14375e = (C14375e) interfaceC10283e;
                List list = catalog2Banner.metrica;
                TextView textView = c14375e.f28428e;
                MaterialButton materialButton = c14375e.f28427e;
                c14375e.f28425e.setText(catalog2Banner.purchase);
                String str2 = catalog2Banner.appmetrica;
                if (str2 == null || str2.length() == 0) {
                    AbstractC17680e.mopub(textView);
                } else {
                    textView.setText(str2);
                    AbstractC17680e.amazon(textView);
                }
                ImageView imageView = c14375e.f28426e;
                String license = AbstractC8769e.license(catalog2Banner.license);
                InterfaceC12732e ad = AbstractC16550e.ad(imageView.getContext());
                C5944e c5944e = new C5944e(imageView.getContext());
                c5944e.metrica = license;
                AbstractC15659e.license(c5944e, imageView);
                ((C0624e) ad).ad(c5944e.ad());
                c14375e.f28429e.setOnClickListener(new ViewOnClickListenerC16943e(catalog2Banner, 0));
                if (list == null || list.isEmpty()) {
                    AbstractC17680e.mopub(materialButton);
                    return;
                }
                AbstractC17680e.amazon(materialButton);
                Catalog2Button catalog2Button = (Catalog2Button) list.get(0);
                materialButton.setText(catalog2Button.yandex);
                materialButton.setOnClickListener(new ViewOnClickListenerC11834e(catalog2Button, 0));
                return;
            case 1:
                CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) obj;
                C0279e c0279e = (C0279e) interfaceC10283e;
                LinearLayout linearLayout = c0279e.f2282e;
                ImageView imageView2 = c0279e.f2281e;
                List list2 = customCatalogBlockItem.metrica;
                AbstractC2379e.metrica(imageView2, list2 != null ? AbstractC8769e.license(list2) : null, Integer.valueOf(R.drawable.placeholder_link), new C9377e(new AbstractC13386e(8.0f), 6));
                c0279e.f2280e.setText(customCatalogBlockItem.ad);
                AbstractC1464e.ad(linearLayout);
                linearLayout.setOnClickListener(new ViewOnClickListenerC12970e(this, customCatalogBlockItem, 0));
                return;
            case 2:
                ((C4682e) interfaceC10283e).f10065e.setOnClickListener(new ViewOnClickListenerC0123e(2, (VKProfile) obj));
                return;
            case 3:
                CustomCatalogBlockItem customCatalogBlockItem2 = (CustomCatalogBlockItem) obj;
                C12051e c12051e = (C12051e) interfaceC10283e;
                String str3 = customCatalogBlockItem2.vip;
                TextView textView2 = c12051e.f24108e;
                ImageView imageView3 = c12051e.f24110e;
                List list3 = customCatalogBlockItem2.metrica;
                AbstractC2379e.metrica(imageView3, list3 != null ? AbstractC8769e.license(list3) : null, Integer.valueOf(R.drawable.placeholder_link), new C9377e(null, 15));
                c12051e.f24109e.setText(customCatalogBlockItem2.ad);
                textView2.setText(str3);
                textView2.setVisibility(str3.length() > 0 ? 0 : 8);
                c12051e.f24111e.setOnClickListener(new ViewOnClickListenerC12970e(customCatalogBlockItem2, 1));
                return;
            case 4:
                final PodcastCatalogLongread podcastCatalogLongread = (PodcastCatalogLongread) obj;
                C5631e c5631e = (C5631e) interfaceC10283e;
                c5631e.f12010e.setOnClickListener(new View.OnClickListener() { // from class: eؑ۠ۜ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i3) {
                            case 0:
                                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(podcastCatalogLongread.yandex)));
                                return;
                            default:
                                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(podcastCatalogLongread.yandex)));
                                return;
                        }
                    }
                });
                c5631e.f12008e.setOnClickListener(new View.OnClickListener() { // from class: eؑ۠ۜ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i2) {
                            case 0:
                                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(podcastCatalogLongread.yandex)));
                                return;
                            default:
                                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(podcastCatalogLongread.yandex)));
                                return;
                        }
                    }
                });
                c5631e.f12009e.setText(podcastCatalogLongread.billing);
                c5631e.f12007e.setText(podcastCatalogLongread.metrica);
                ImageView imageView4 = c5631e.f12006e;
                String ad2 = podcastCatalogLongread.license.ad("a");
                InterfaceC12732e ad3 = AbstractC16550e.ad(imageView4.getContext());
                C5944e c5944e2 = new C5944e(imageView4.getContext());
                c5944e2.metrica = ad2;
                AbstractC15659e.license(c5944e2, imageView4);
                ((C0624e) ad3).ad(c5944e2.ad());
                return;
            case 5:
                CustomCatalogBlockItem customCatalogBlockItem3 = (CustomCatalogBlockItem) obj;
                C4459e c4459e = (C4459e) interfaceC10283e;
                String str4 = customCatalogBlockItem3.vip;
                LinearLayout linearLayout2 = c4459e.f9669e;
                TextView textView3 = c4459e.f9666e;
                ImageView imageView5 = c4459e.f9667e;
                List list4 = customCatalogBlockItem3.metrica;
                AbstractC2379e.metrica(imageView5, list4 != null ? AbstractC8769e.license(list4) : null, Integer.valueOf(R.drawable.placeholder_link), new C9377e(new C15878e(), 6));
                c4459e.f9668e.setText(customCatalogBlockItem3.ad);
                textView3.setText(str4);
                textView3.setVisibility(str4.length() > 0 ? 0 : 8);
                AbstractC1464e.ad(linearLayout2);
                linearLayout2.setOnClickListener(new ViewOnClickListenerC12970e(customCatalogBlockItem3, 2));
                return;
            case 6:
                Catalog2Banner catalog2Banner2 = (Catalog2Banner) obj;
                C6070e c6070e = (C6070e) interfaceC10283e;
                TextView textView4 = c6070e.f12745e;
                c6070e.f12747e.setText(catalog2Banner2.purchase);
                String str5 = catalog2Banner2.appmetrica;
                if (str5 == null || str5.length() == 0) {
                    AbstractC17680e.mopub(textView4);
                } else {
                    textView4.setText(str5);
                    AbstractC17680e.amazon(textView4);
                }
                ImageView imageView6 = c6070e.f12746e;
                String license2 = AbstractC8769e.license(catalog2Banner2.license);
                InterfaceC12732e ad4 = AbstractC16550e.ad(imageView6.getContext());
                C5944e c5944e3 = new C5944e(imageView6.getContext());
                c5944e3.metrica = license2;
                AbstractC15659e.license(c5944e3, imageView6);
                ((C0624e) ad4).ad(c5944e3.ad());
                c6070e.f12748e.setOnClickListener(new ViewOnClickListenerC16943e(catalog2Banner2, 2));
                return;
            case 7:
                CustomCatalogBlockItem customCatalogBlockItem4 = (CustomCatalogBlockItem) obj;
                C0808e c0808e = (C0808e) interfaceC10283e;
                String str6 = customCatalogBlockItem4.vip;
                LinearLayout linearLayout3 = c0808e.f3200e;
                TextView textView5 = c0808e.f3197e;
                ImageView imageView7 = c0808e.f3198e;
                List list5 = customCatalogBlockItem4.metrica;
                AbstractC2379e.metrica(imageView7, list5 != null ? AbstractC8769e.license(list5) : null, Integer.valueOf(R.drawable.placeholder_link), new C9377e(new C15878e(), 6));
                c0808e.f3199e.setText(customCatalogBlockItem4.ad);
                textView5.setText(str6);
                textView5.setVisibility(str6.length() > 0 ? 0 : 8);
                AbstractC1464e.ad(linearLayout3);
                linearLayout3.setOnClickListener(new ViewOnClickListenerC12970e(this, customCatalogBlockItem4, 5));
                return;
            case 8:
                Catalog2Text catalog2Text = (Catalog2Text) obj;
                TextView textView6 = ((C3912e) interfaceC10283e).f8737e;
                if (AbstractC7890e.billing(catalog2Text.ad, "_synth_lyrics")) {
                    textView6.setPadding(0, textView6.getPaddingTop(), 0, textView6.getPaddingBottom());
                }
                textView6.setMovementMethod(new LinkMovementMethod());
                C10445e c10445e = AbstractC4605e.ad;
                textView6.setText(AbstractC4605e.ad(catalog2Text.vip));
                AbstractC13336e.metrica(textView6);
                return;
            case 9:
                final VKVideo vKVideo = (VKVideo) obj;
                C8725e c8725e = (C8725e) interfaceC10283e;
                c8725e.f17597e.setText(vKVideo.metrica);
                TextView textView7 = c8725e.f17598e;
                List list6 = vKVideo.startapp;
                if (list6 != null && (m3608try = AbstractC13480e.m3608try(list6, null, null, null, new C9369e(20), 31)) != null) {
                    str = m3608try;
                }
                textView7.setText(str);
                c8725e.f17600e.setText(AbstractC15920e.subs(vKVideo.mopub, false));
                ImageView imageView8 = c8725e.f17599e;
                List list7 = vKVideo.purchase;
                AbstractC2379e.metrica(imageView8, list7 != null ? AbstractC8769e.license(list7) : null, Integer.valueOf(R.drawable.ic_video_outline_28), new C9377e(new AbstractC13386e(8.0f), 14));
                c8725e.f17601e.setOnClickListener(new View.OnClickListener() { // from class: eٟؓٔ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i3) {
                            case 0:
                                Context context = view.getContext();
                                String str7 = vKVideo.advert;
                                if (str7 == null) {
                                    return;
                                }
                                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str7)));
                                return;
                            default:
                                Context context2 = view.getContext();
                                String str8 = vKVideo.advert;
                                if (str8 == null) {
                                    return;
                                }
                                context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str8)));
                                return;
                        }
                    }
                });
                return;
            default:
                final VKVideo vKVideo2 = (VKVideo) obj;
                C10340e c10340e = (C10340e) interfaceC10283e;
                c10340e.f20400e.setText(vKVideo2.metrica);
                TextView textView8 = c10340e.f20398e;
                List list8 = vKVideo2.startapp;
                if (list8 != null && (m3608try2 = AbstractC13480e.m3608try(list8, null, null, null, new C9369e(21), 31)) != null) {
                    str = m3608try2;
                }
                textView8.setText(str);
                ImageView imageView9 = c10340e.f20399e;
                List list9 = vKVideo2.purchase;
                AbstractC2379e.metrica(imageView9, list9 != null ? AbstractC8769e.license(list9) : null, Integer.valueOf(R.drawable.ic_video_outline_28), new C9377e(new AbstractC13386e(8.0f), 14));
                c10340e.f20401e.setOnClickListener(new View.OnClickListener() { // from class: eٟؓٔ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i2) {
                            case 0:
                                Context context = view.getContext();
                                String str7 = vKVideo2.advert;
                                if (str7 == null) {
                                    return;
                                }
                                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str7)));
                                return;
                            default:
                                Context context2 = view.getContext();
                                String str8 = vKVideo2.advert;
                                if (str8 == null) {
                                    return;
                                }
                                context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str8)));
                                return;
                        }
                    }
                });
                return;
        }
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        switch (this.f15083e) {
            case 0:
                return R.layout.c3_catalog_banner;
            case 1:
                return R.layout.c3_button_category;
            case 2:
                return R.layout.c3_banner_curator_group;
            case 3:
                return R.layout.c3_double_category;
            case 4:
                return R.layout.podcast_longread;
            case 5:
                return R.layout.c3_owner_cell;
            case 6:
                return R.layout.c3_catalog_banner_small;
            case 7:
                return R.layout.c3_link_vertical;
            case 8:
                return R.layout.c3_text;
            case 9:
                return R.layout.c3_video_vertical;
            default:
                return R.layout.c3_video;
        }
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f15083e) {
            case 0:
                View inflate = layoutInflater.inflate(R.layout.c3_catalog_banner, viewGroup, false);
                int i = R.id.action;
                MaterialButton materialButton = (MaterialButton) AbstractC7779e.vip(inflate, R.id.action);
                if (materialButton != null) {
                    i = R.id.banner_bg;
                    ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.banner_bg);
                    if (imageView != null) {
                        i = R.id.banner_bg_overlay;
                        if (AbstractC7779e.vip(inflate, R.id.banner_bg_overlay) != null) {
                            i = R.id.text;
                            TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.text);
                            if (textView != null) {
                                i = R.id.title;
                                TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.title);
                                if (textView2 != null) {
                                    return new C14375e(imageView, textView, textView2, materialButton, (MaterialCardView) inflate);
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            case 1:
                View inflate2 = layoutInflater.inflate(R.layout.c3_button_category, viewGroup, false);
                int i2 = R.id.card;
                if (((FrameLayout) AbstractC7779e.vip(inflate2, R.id.card)) != null) {
                    i2 = R.id.shuffle_btn;
                    ImageView imageView2 = (ImageView) AbstractC7779e.vip(inflate2, R.id.shuffle_btn);
                    if (imageView2 != null) {
                        i2 = R.id.shuffle_txt;
                        TextView textView3 = (TextView) AbstractC7779e.vip(inflate2, R.id.shuffle_txt);
                        if (textView3 != null) {
                            return new C0279e((LinearLayout) inflate2, imageView2, textView3);
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
            case 2:
                View inflate3 = layoutInflater.inflate(R.layout.c3_banner_curator_group, viewGroup, false);
                if (inflate3 != null) {
                    return new C4682e((TextView) inflate3);
                }
                throw new NullPointerException("rootView");
            case 3:
                View inflate4 = layoutInflater.inflate(R.layout.c3_double_category, viewGroup, false);
                MaterialCardView materialCardView = (MaterialCardView) inflate4;
                int i3 = R.id.common;
                TextView textView4 = (TextView) AbstractC7779e.vip(inflate4, R.id.common);
                if (textView4 != null) {
                    i3 = R.id.common_sub;
                    TextView textView5 = (TextView) AbstractC7779e.vip(inflate4, R.id.common_sub);
                    if (textView5 != null) {
                        i3 = R.id.header;
                        if (((RelativeLayout) AbstractC7779e.vip(inflate4, R.id.header)) != null) {
                            i3 = R.id.playlist_image;
                            ImageView imageView3 = (ImageView) AbstractC7779e.vip(inflate4, R.id.playlist_image);
                            if (imageView3 != null) {
                                return new C12051e(imageView3, textView4, textView5, materialCardView);
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i3)));
            case 4:
                View inflate5 = layoutInflater.inflate(R.layout.podcast_longread, viewGroup, false);
                MaterialCardView materialCardView2 = (MaterialCardView) inflate5;
                int i4 = R.id.listen;
                MaterialButton materialButton2 = (MaterialButton) AbstractC7779e.vip(inflate5, R.id.listen);
                if (materialButton2 != null) {
                    i4 = R.id.slider_text;
                    TextView textView6 = (TextView) AbstractC7779e.vip(inflate5, R.id.slider_text);
                    if (textView6 != null) {
                        i4 = R.id.slider_title;
                        TextView textView7 = (TextView) AbstractC7779e.vip(inflate5, R.id.slider_title);
                        if (textView7 != null) {
                            i4 = R.id.song_album;
                            ImageView imageView4 = (ImageView) AbstractC7779e.vip(inflate5, R.id.song_album);
                            if (imageView4 != null) {
                                return new C5631e(imageView4, textView6, textView7, materialButton2, materialCardView2);
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate5.getResources().getResourceName(i4)));
            case 5:
                View inflate6 = layoutInflater.inflate(R.layout.c3_owner_cell, viewGroup, false);
                int i5 = R.id.catalog_item_photo;
                ImageView imageView5 = (ImageView) AbstractC7779e.vip(inflate6, R.id.catalog_item_photo);
                if (imageView5 != null) {
                    i5 = R.id.catalog_item_subtitle;
                    TextView textView8 = (TextView) AbstractC7779e.vip(inflate6, R.id.catalog_item_subtitle);
                    if (textView8 != null) {
                        i5 = R.id.catalog_item_title;
                        TextView textView9 = (TextView) AbstractC7779e.vip(inflate6, R.id.catalog_item_title);
                        if (textView9 != null) {
                            return new C4459e(imageView5, (LinearLayout) inflate6, textView8, textView9);
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate6.getResources().getResourceName(i5)));
            case 6:
                View inflate7 = layoutInflater.inflate(R.layout.c3_catalog_banner_small, viewGroup, false);
                int i6 = R.id.banner_bg;
                ImageView imageView6 = (ImageView) AbstractC7779e.vip(inflate7, R.id.banner_bg);
                if (imageView6 != null) {
                    i6 = R.id.banner_bg_overlay;
                    if (AbstractC7779e.vip(inflate7, R.id.banner_bg_overlay) != null) {
                        i6 = R.id.text;
                        TextView textView10 = (TextView) AbstractC7779e.vip(inflate7, R.id.text);
                        if (textView10 != null) {
                            i6 = R.id.title;
                            TextView textView11 = (TextView) AbstractC7779e.vip(inflate7, R.id.title);
                            if (textView11 != null) {
                                return new C6070e(imageView6, textView10, textView11, (MaterialCardView) inflate7);
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate7.getResources().getResourceName(i6)));
            case 7:
                return C0808e.ad(layoutInflater, viewGroup);
            case 8:
                return C3912e.ad(layoutInflater, viewGroup);
            case 9:
                View inflate8 = layoutInflater.inflate(R.layout.c3_video_vertical, viewGroup, false);
                int i7 = R.id.playlist_image;
                ImageView imageView7 = (ImageView) AbstractC7779e.vip(inflate8, R.id.playlist_image);
                if (imageView7 != null) {
                    i7 = R.id.video_artists;
                    TextView textView12 = (TextView) AbstractC7779e.vip(inflate8, R.id.video_artists);
                    if (textView12 != null) {
                        i7 = R.id.video_duration;
                        TextView textView13 = (TextView) AbstractC7779e.vip(inflate8, R.id.video_duration);
                        if (textView13 != null) {
                            i7 = R.id.video_title;
                            TextView textView14 = (TextView) AbstractC7779e.vip(inflate8, R.id.video_title);
                            if (textView14 != null) {
                                return new C8725e(imageView7, (LinearLayout) inflate8, textView12, textView13, textView14);
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate8.getResources().getResourceName(i7)));
            default:
                View inflate9 = layoutInflater.inflate(R.layout.c3_video, viewGroup, false);
                int i8 = R.id.playlist_image;
                ImageView imageView8 = (ImageView) AbstractC7779e.vip(inflate9, R.id.playlist_image);
                if (imageView8 != null) {
                    i8 = R.id.video_artists;
                    TextView textView15 = (TextView) AbstractC7779e.vip(inflate9, R.id.video_artists);
                    if (textView15 != null) {
                        i8 = R.id.video_title;
                        TextView textView16 = (TextView) AbstractC7779e.vip(inflate9, R.id.video_title);
                        if (textView16 != null) {
                            return new C10340e(imageView8, (LinearLayout) inflate9, textView15, textView16);
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate9.getResources().getResourceName(i8)));
        }
    }
}
