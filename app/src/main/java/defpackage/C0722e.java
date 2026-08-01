package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.podcasts.Podcast;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCover;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۧٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722e extends AbstractC5604e implements InterfaceC18435e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f3019e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f3020e = AbstractC9743e.vip();

    public C0722e(boolean z) {
        this.f3019e = z;
    }

    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        Podcast podcast = (Podcast) obj;
        Integer valueOf = Integer.valueOf(R.drawable.placeholder_playlist);
        String str = podcast.appmetrica;
        String str2 = podcast.ad;
        List list = podcast.purchase;
        interfaceC10283e.getRoot().setOnClickListener(new ViewOnClickListenerC6691e(podcast, 0));
        if (this.f3019e) {
            C4143e c4143e = (C4143e) interfaceC10283e;
            ImageView imageView = c4143e.f9133e;
            PodcastCover podcastCover = (PodcastCover) AbstractC13480e.m3604this(list);
            AbstractC2379e.metrica(imageView, podcastCover != null ? podcastCover.ad("a") : null, valueOf, new C9377e(new AbstractC13386e(8.0f), 14));
            c4143e.f9135e.setText(str2);
            c4143e.f9134e.setText(str);
            return;
        }
        C7470e c7470e = (C7470e) interfaceC10283e;
        ImageView imageView2 = c7470e.f15241e;
        PodcastCover podcastCover2 = (PodcastCover) AbstractC13480e.m3604this(list);
        AbstractC2379e.metrica(imageView2, podcastCover2 != null ? podcastCover2.ad("c") : null, valueOf, new C9377e(new AbstractC13386e(8.0f), 14));
        c7470e.f15243e.setText(str2);
        c7470e.f15242e.setText(str);
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f3020e.f29359e;
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return this.f3019e ? R.layout.list_item_playlist_large : R.layout.list_item_playlist_no_subtitle;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (!this.f3019e) {
            return C7470e.ad(layoutInflater, viewGroup);
        }
        View inflate = layoutInflater.inflate(R.layout.list_item_playlist_large, viewGroup, false);
        int i = R.id.playlist_author;
        TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.playlist_author);
        if (textView != null) {
            i = R.id.playlist_image;
            ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.playlist_image);
            if (imageView != null) {
                i = R.id.playlist_title;
                TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.playlist_title);
                if (textView2 != null) {
                    return new C4143e(imageView, (LinearLayout) inflate, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
