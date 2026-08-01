package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.AudioBook;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.RecommendedPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11438e extends AbstractC5604e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Object f23002e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f23003e;

    public /* synthetic */ C11438e(int i, Object obj) {
        this.f23003e = i;
        this.f23002e = obj;
    }

    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        String str;
        Catalog2Button catalog2Button;
        int i2 = this.f23003e;
        Object obj2 = this.f23002e;
        switch (i2) {
            case 0:
                RecommendedPlaylist recommendedPlaylist = (RecommendedPlaylist) obj;
                C3808e c3808e = (C3808e) interfaceC10283e;
                C3675e c3675e = (C3675e) obj2;
                RecyclerView recyclerView = c3808e.f8433e;
                TextView textView = c3808e.f8439e;
                StringBuilder sb = new StringBuilder();
                Float f = recommendedPlaylist.metrica;
                sb.append((int) ((f != null ? f.floatValue() : 1.0f) * 100));
                sb.append('%');
                textView.setText(sb.toString());
                c3808e.f8438e.setText(" • " + recommendedPlaylist.license);
                AudioPlaylist audioPlaylist = (AudioPlaylist) c3675e.vip.get(recommendedPlaylist.getAd());
                c3808e.f8435e.setText(audioPlaylist != null ? audioPlaylist.subs : null);
                ImageView imageView = c3808e.f8436e;
                String str2 = recommendedPlaylist.purchase;
                if (str2 == null) {
                    str2 = String.valueOf(audioPlaylist != null ? AbstractC13406e.advert(audioPlaylist) : null);
                }
                InterfaceC12732e ad = AbstractC16550e.ad(imageView.getContext());
                C5944e c5944e = new C5944e(imageView.getContext());
                c5944e.metrica = str2;
                AbstractC15659e.license(c5944e, imageView);
                ((C0624e) ad).ad(c5944e.ad());
                VKProfile vKProfile = (VKProfile) c3675e.yandex.get(String.valueOf(recommendedPlaylist.vip));
                c3808e.f8432e.setText(vKProfile != null ? vKProfile.ad() : null);
                ImageView imageView2 = c3808e.f8431e;
                str = vKProfile != null ? vKProfile.license : null;
                InterfaceC12732e ad2 = AbstractC16550e.ad(imageView2.getContext());
                C5944e c5944e2 = new C5944e(imageView2.getContext());
                c5944e2.metrica = str;
                AbstractC15659e.license(c5944e2, imageView2);
                AbstractC2182e.metrica(c5944e2, new C4668e());
                ((C0624e) ad2).ad(c5944e2.ad());
                c3808e.f8434e.setOnClickListener(new ViewOnClickListenerC15976e(this, audioPlaylist, vKProfile));
                c3808e.f8437e.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                C11268e c11268e = new C11268e(false, false, 0, null, null, null, 95);
                c11268e.f22635e = new C10869e(this, c3808e, audioPlaylist, vKProfile);
                List list = recommendedPlaylist.appmetrica;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AudioTrack audioTrack = (AudioTrack) c3675e.ad.get((String) it.next());
                    if (audioTrack != null) {
                        arrayList.add(audioTrack);
                    }
                }
                c11268e.firebase(arrayList);
                recyclerView.setAdapter(c11268e);
                c3808e.f8430e.setOnClickListener(new ViewOnClickListenerC15976e(audioPlaylist, 3));
                return;
            case 1:
                RecommendedPlaylist recommendedPlaylist2 = (RecommendedPlaylist) obj;
                C15179e c15179e = (C15179e) interfaceC10283e;
                C3675e c3675e2 = (C3675e) obj2;
                TextView textView2 = c15179e.f30030e;
                StringBuilder sb2 = new StringBuilder();
                Float f2 = recommendedPlaylist2.metrica;
                sb2.append((int) ((f2 != null ? f2.floatValue() : 1.0f) * 100));
                sb2.append("% • ");
                sb2.append(recommendedPlaylist2.license);
                textView2.setText(sb2.toString());
                AudioPlaylist audioPlaylist2 = (AudioPlaylist) c3675e2.vip.get(recommendedPlaylist2.getAd());
                c15179e.f30035e.setText(audioPlaylist2 != null ? audioPlaylist2.subs : null);
                AbstractC13487e.ad(c15179e.f30033e, audioPlaylist2, 3, 6);
                VKProfile vKProfile2 = (VKProfile) c3675e2.yandex.get(String.valueOf(recommendedPlaylist2.vip));
                c15179e.f30032e.setText(vKProfile2 != null ? vKProfile2.ad() : null);
                AbstractC17680e.mopub(c15179e.f30031e);
                c15179e.f30034e.setOnClickListener(new ViewOnClickListenerC15976e(audioPlaylist2, 4));
                return;
            default:
                AudioBook audioBook = (AudioBook) obj;
                C0808e c0808e = (C0808e) interfaceC10283e;
                LinearLayout linearLayout = c0808e.f3200e;
                TextView textView3 = c0808e.f3197e;
                Catalog2Block catalog2Block = (Catalog2Block) obj2;
                List metrica = catalog2Block.getMetrica();
                if (metrica == null) {
                    metrica = C13664e.f27089e;
                }
                Catalog2Button catalog2Button2 = (Catalog2Button) AbstractC13480e.m3604this(metrica);
                AbstractC2379e.metrica(c0808e.f3198e, AbstractC8769e.license(audioBook.admob), Integer.valueOf(R.drawable.placeholder_link), new C9377e(new C15878e(), 6));
                TextView textView4 = c0808e.f3199e;
                str = catalog2Button2 != null ? catalog2Button2.yandex : null;
                if (str == null) {
                    str = BuildConfig.FLAVOR;
                }
                textView4.setText(str);
                textView3.setText(audioBook.yandex);
                AbstractC17680e.amazon(textView3);
                AbstractC1464e.ad(linearLayout);
                List metrica2 = catalog2Block.getMetrica();
                if (metrica2 == null || (catalog2Button = (Catalog2Button) AbstractC13480e.m3604this(metrica2)) == null) {
                    return;
                }
                linearLayout.setOnClickListener(new ViewOnClickListenerC0858e(c0808e, catalog2Button, 0));
                return;
        }
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        switch (this.f23003e) {
            case 0:
                return R.layout.c3_recomm_playlist;
            case 1:
                return R.layout.list_item_playlist_horizontal;
            default:
                return R.layout.c3_link_vertical;
        }
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f23003e) {
            case 0:
                View inflate = layoutInflater.inflate(R.layout.c3_recomm_playlist, viewGroup, false);
                int i = R.id.audios;
                RecyclerView recyclerView = (RecyclerView) AbstractC7779e.vip(inflate, R.id.audios);
                if (recyclerView != null) {
                    i = R.id.avatar;
                    ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.avatar);
                    if (imageView != null) {
                        MaterialCardView materialCardView = (MaterialCardView) inflate;
                        i = R.id.common;
                        TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.common);
                        if (textView != null) {
                            i = R.id.header;
                            RelativeLayout relativeLayout = (RelativeLayout) AbstractC7779e.vip(inflate, R.id.header);
                            if (relativeLayout != null) {
                                i = R.id.percent;
                                TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.percent);
                                if (textView2 != null) {
                                    i = R.id.percent_text;
                                    TextView textView3 = (TextView) AbstractC7779e.vip(inflate, R.id.percent_text);
                                    if (textView3 != null) {
                                        i = R.id.play;
                                        ImageView imageView2 = (ImageView) AbstractC7779e.vip(inflate, R.id.play);
                                        if (imageView2 != null) {
                                            i = R.id.playlist_image;
                                            ImageView imageView3 = (ImageView) AbstractC7779e.vip(inflate, R.id.playlist_image);
                                            if (imageView3 != null) {
                                                i = R.id.user;
                                                TextView textView4 = (TextView) AbstractC7779e.vip(inflate, R.id.user);
                                                if (textView4 != null) {
                                                    return new C3808e(materialCardView, recyclerView, imageView, textView, relativeLayout, textView2, textView3, imageView2, imageView3, textView4);
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
            case 1:
                return C15179e.ad(layoutInflater, viewGroup);
            default:
                return C0808e.ad(layoutInflater, viewGroup);
        }
    }
}
