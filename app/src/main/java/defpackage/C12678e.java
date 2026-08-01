package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.loadAd;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12678e extends AbstractC5604e implements InterfaceC9392e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C3675e f25413e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f25414e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f25415e;

    public C12678e(int i, boolean z, C3675e c3675e) {
        this.f25415e = i;
        this.f25414e = z;
        this.f25413e = c3675e;
    }

    @Override // defpackage.InterfaceC9392e
    public final void ad(int i) {
        C13029e c13029e;
        C1847e c1847e = this.f11959e;
        AudioPlaylist audioPlaylist = (AudioPlaylist) AbstractC13480e.m3592native(i, c1847e.purchase);
        if (audioPlaylist == null) {
            return;
        }
        if (i == 0) {
            c13029e = new C13029e(audioPlaylist, Integer.valueOf(((AudioPlaylist) c1847e.purchase.get(1)).isPro), (Integer) null, 4);
        } else if (i == AbstractC6874e.billing(c1847e.purchase)) {
            List list = c1847e.purchase;
            c13029e = new C13029e(audioPlaylist, (Integer) null, Integer.valueOf(((AudioPlaylist) list.get(AbstractC6874e.billing(list) - 1)).isPro), 2);
        } else {
            c13029e = new C13029e(audioPlaylist, (Integer) null, Integer.valueOf(((AudioPlaylist) c1847e.purchase.get(i - 1)).isPro), 2);
        }
        AbstractC18406e.appmetrica(c13029e);
    }

    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, final InterfaceC10283e interfaceC10283e) {
        String m3376class;
        final AudioPlaylist audioPlaylist = (AudioPlaylist) obj;
        long j = audioPlaylist.applovin;
        Boolean bool = audioPlaylist.f36502case;
        String str = audioPlaylist.subs;
        boolean z = audioPlaylist.f36511instanceof;
        final String str2 = BuildConfig.FLAVOR;
        if (z) {
            m3376class = audioPlaylist.f36519static;
            if (m3376class == null) {
                m3376class = BuildConfig.FLAVOR;
            }
        } else if (AbstractC13406e.amazon(audioPlaylist)) {
            m3376class = AbstractC13406e.billing(audioPlaylist).metrica;
        } else {
            OriginalPlaylist originalPlaylist = audioPlaylist.f36501break;
            if (originalPlaylist != null) {
                String m3376class2 = m3376class(originalPlaylist.ad);
                m3376class = m3376class2 == null ? m3376class(j) : m3376class2;
            } else {
                m3376class = m3376class(j);
            }
        }
        if (m3376class != null) {
            str2 = m3376class;
        }
        interfaceC10283e.getRoot().setOnClickListener(new ViewOnClickListenerC15976e(this, audioPlaylist));
        interfaceC10283e.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: eّٓٓ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                if (C12678e.this.f25415e == 6) {
                    return true;
                }
                new C3566e(new C2014e(audioPlaylist, str2)).signatures((Activity) interfaceC10283e.getRoot().getContext());
                return true;
            }
        });
        interfaceC10283e.getRoot().setAlpha(audioPlaylist.f36515package != null ? 0.4f : 1.0f);
        int i2 = this.f25415e;
        int m2467class = AbstractC8703e.m2467class(i2);
        if (m2467class == 0) {
            C17228e c17228e = (C17228e) interfaceC10283e;
            TextView textView = c17228e.f33752e;
            TextView textView2 = c17228e.f33749e;
            AbstractC13487e.ad(c17228e.f33750e, audioPlaylist, 3, 6);
            textView2.setText(str);
            c17228e.f33751e.setText(str2);
            String ad = AbstractC5211e.ad(audioPlaylist);
            if (ad.length() > 0) {
                textView.setVisibility(0);
                textView.setText(ad);
            } else {
                textView.setVisibility(8);
            }
            if (AbstractC7890e.billing(bool, Boolean.TRUE)) {
                textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_explicit_outline_20, 0);
                return;
            } else {
                textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                return;
            }
        }
        if (m2467class == 1) {
            C7470e c7470e = (C7470e) interfaceC10283e;
            TextView textView3 = c7470e.f15243e;
            AbstractC13487e.ad(c7470e.f15241e, audioPlaylist, 3, 6);
            textView3.setText(str);
            c7470e.f15242e.setText(str2);
            if (AbstractC7890e.billing(bool, Boolean.TRUE)) {
                textView3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_explicit_outline_20, 0);
                return;
            } else {
                textView3.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                return;
            }
        }
        if (m2467class == 2 || m2467class == 3) {
            C15179e c15179e = (C15179e) interfaceC10283e;
            TextView textView4 = c15179e.f30031e;
            TextView textView5 = c15179e.f30030e;
            TextView textView6 = c15179e.f30035e;
            AbstractC13487e.ad(c15179e.f30033e, audioPlaylist, 3, 6);
            textView6.setText(str);
            c15179e.f30032e.setText(str2);
            textView4.setText(String.valueOf(i + 1));
            textView4.setVisibility(i2 == 4 ? 0 : 8);
            String ad2 = AbstractC5211e.ad(audioPlaylist);
            if (ad2.length() > 0) {
                textView5.setVisibility(0);
                textView5.setText(ad2);
            } else {
                textView5.setVisibility(8);
            }
            if (AbstractC7890e.billing(bool, Boolean.TRUE)) {
                textView6.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_explicit_outline_20, 0);
                return;
            } else {
                textView6.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                return;
            }
        }
        if (m2467class != 4) {
            if (m2467class != 5) {
                throw new C14803e(10);
            }
            C5849e c5849e = (C5849e) interfaceC10283e;
            AbstractC2379e.vip(c5849e.f12318e, AbstractC13406e.advert(audioPlaylist), null, new C9377e(null, 15));
            c5849e.f12315e.setText(str);
            c5849e.f12316e.setText(audioPlaylist.f36503catch);
            c5849e.f12317e.setOnClickListener(new ViewOnClickListenerC15976e(audioPlaylist, 1));
            return;
        }
        C0392e c0392e = (C0392e) interfaceC10283e;
        TextView textView7 = c0392e.f2425e;
        TextView textView8 = c0392e.f2430e;
        AbstractC13487e.ad(c0392e.f2428e, audioPlaylist, 3, 6);
        textView8.setText(str);
        c0392e.f2426e.setText(str2);
        c0392e.f2427e.setText(String.valueOf(i + 1));
        String ad3 = AbstractC5211e.ad(audioPlaylist);
        if (ad3.length() > 0) {
            textView7.setVisibility(0);
            textView7.setText(ad3);
        } else {
            textView7.setVisibility(8);
        }
        if (AbstractC7890e.billing(bool, Boolean.TRUE)) {
            textView8.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_explicit_outline_20, 0);
        } else {
            textView8.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.startapp
    public final void applovin(loadAd loadad) {
        ImageView imageView;
        InterfaceC10283e interfaceC10283e = ((C5272e) loadad).signatures;
        int m2467class = AbstractC8703e.m2467class(this.f25415e);
        if (m2467class == 0) {
            imageView = ((C17228e) interfaceC10283e).f33750e;
        } else if (m2467class == 1) {
            imageView = ((C7470e) interfaceC10283e).f15241e;
        } else if (m2467class == 2 || m2467class == 3) {
            imageView = ((C15179e) interfaceC10283e).f30033e;
        } else if (m2467class == 4) {
            imageView = ((C0392e) interfaceC10283e).f2428e;
        } else {
            if (m2467class != 5) {
                throw new C14803e(10);
            }
            imageView = ((C5849e) interfaceC10283e).f12318e;
        }
        AbstractC5750e.billing(imageView).ad();
    }

    /* renamed from: class, reason: not valid java name */
    public final String m3376class(long j) {
        VKProfile vKProfile = (VKProfile) this.f25413e.yandex.get(String.valueOf(j));
        if (vKProfile != null) {
            return vKProfile.ad();
        }
        return null;
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        int m2467class = AbstractC8703e.m2467class(this.f25415e);
        if (m2467class == 0) {
            return R.layout.list_item_playlist;
        }
        if (m2467class == 1) {
            return R.layout.list_item_playlist_no_subtitle;
        }
        if (m2467class == 2 || m2467class == 3) {
            return R.layout.list_item_playlist_horizontal;
        }
        if (m2467class == 4) {
            return R.layout.list_item_playlist_chart;
        }
        if (m2467class == 5) {
            return R.layout.list_item_playlist_recomms;
        }
        throw new C14803e(10);
    }

    @Override // defpackage.InterfaceC9392e
    public final boolean metrica() {
        return this.f25414e;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int m2467class = AbstractC8703e.m2467class(this.f25415e);
        int i = R.id.playlist_subtitle;
        int i2 = R.id.playlist_title;
        if (m2467class == 0) {
            View inflate = layoutInflater.inflate(R.layout.list_item_playlist, viewGroup, false);
            TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.playlist_author);
            if (textView != null) {
                ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.playlist_image);
                if (imageView != null) {
                    TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.playlist_subtitle);
                    if (textView2 != null) {
                        TextView textView3 = (TextView) AbstractC7779e.vip(inflate, R.id.playlist_title);
                        if (textView3 != null) {
                            return new C17228e(imageView, (LinearLayout) inflate, textView, textView2, textView3);
                        }
                        i = R.id.playlist_title;
                    }
                } else {
                    i = R.id.playlist_image;
                }
            } else {
                i = R.id.playlist_author;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
        if (m2467class == 1) {
            return C7470e.ad(layoutInflater, viewGroup);
        }
        if (m2467class == 2 || m2467class == 3) {
            return C15179e.ad(layoutInflater, viewGroup);
        }
        if (m2467class == 4) {
            View inflate2 = layoutInflater.inflate(R.layout.list_item_playlist_chart, viewGroup, false);
            TextView textView4 = (TextView) AbstractC7779e.vip(inflate2, R.id.chart_position);
            if (textView4 != null) {
                TextView textView5 = (TextView) AbstractC7779e.vip(inflate2, R.id.playlist_author);
                if (textView5 != null) {
                    ImageView imageView2 = (ImageView) AbstractC7779e.vip(inflate2, R.id.playlist_image);
                    if (imageView2 != null) {
                        TextView textView6 = (TextView) AbstractC7779e.vip(inflate2, R.id.playlist_subtitle);
                        if (textView6 != null) {
                            TextView textView7 = (TextView) AbstractC7779e.vip(inflate2, R.id.playlist_title);
                            if (textView7 != null) {
                                return new C0392e((LinearLayout) inflate2, textView4, textView5, imageView2, textView6, textView7);
                            }
                            i = R.id.playlist_title;
                        }
                    } else {
                        i = R.id.playlist_image;
                    }
                } else {
                    i = R.id.playlist_author;
                }
            } else {
                i = R.id.chart_position;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i)));
        }
        if (m2467class != 5) {
            throw new C14803e(10);
        }
        View inflate3 = layoutInflater.inflate(R.layout.list_item_playlist_recomms, viewGroup, false);
        int i3 = R.id.dimmer;
        if (AbstractC7779e.vip(inflate3, R.id.dimmer) != null) {
            i3 = R.id.play;
            ImageView imageView3 = (ImageView) AbstractC7779e.vip(inflate3, R.id.play);
            if (imageView3 != null) {
                TextView textView8 = (TextView) AbstractC7779e.vip(inflate3, R.id.playlist_author);
                if (textView8 != null) {
                    ImageView imageView4 = (ImageView) AbstractC7779e.vip(inflate3, R.id.playlist_image);
                    if (imageView4 != null) {
                        TextView textView9 = (TextView) AbstractC7779e.vip(inflate3, R.id.playlist_title);
                        if (textView9 != null) {
                            return new C5849e((MaterialCardView) inflate3, imageView3, textView8, imageView4, textView9);
                        }
                    } else {
                        i2 = R.id.playlist_image;
                    }
                } else {
                    i2 = R.id.playlist_author;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i2)));
            }
        }
        i2 = i3;
        throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i2)));
    }

    @Override // defpackage.InterfaceC9392e
    public final void vip(int i, int i2) {
        ArrayList arrayList = new ArrayList(this.f11959e.purchase);
        Collections.swap(arrayList, i, i2);
        firebase(arrayList);
    }
}
