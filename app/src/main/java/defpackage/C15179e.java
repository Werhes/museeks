package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15179e implements InterfaceC10283e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final TextView f30030e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final TextView f30031e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final TextView f30032e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ImageView f30033e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final LinearLayout f30034e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final TextView f30035e;

    public C15179e(LinearLayout linearLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4) {
        this.f30034e = linearLayout;
        this.f30032e = textView;
        this.f30031e = textView2;
        this.f30033e = imageView;
        this.f30030e = textView3;
        this.f30035e = textView4;
    }

    public static C15179e ad(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.list_item_playlist_horizontal, viewGroup, false);
        int i = R.id.playlist_author;
        TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.playlist_author);
        if (textView != null) {
            i = R.id.playlist_chart_pos;
            TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.playlist_chart_pos);
            if (textView2 != null) {
                i = R.id.playlist_image;
                ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.playlist_image);
                if (imageView != null) {
                    i = R.id.playlist_snippet;
                    TextView textView3 = (TextView) AbstractC7779e.vip(inflate, R.id.playlist_snippet);
                    if (textView3 != null) {
                        i = R.id.playlist_title;
                        TextView textView4 = (TextView) AbstractC7779e.vip(inflate, R.id.playlist_title);
                        if (textView4 != null) {
                            i = R.id.song_overlay;
                            if (((ImageView) AbstractC7779e.vip(inflate, R.id.song_overlay)) != null) {
                                return new C15179e((LinearLayout) inflate, textView, textView2, imageView, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f30034e;
    }
}
