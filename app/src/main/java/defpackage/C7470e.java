package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7470e implements InterfaceC10283e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ImageView f15241e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final TextView f15242e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final TextView f15243e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final LinearLayout f15244e;

    public C7470e(ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f15244e = linearLayout;
        this.f15242e = textView;
        this.f15241e = imageView;
        this.f15243e = textView2;
    }

    public static C7470e ad(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.list_item_playlist_no_subtitle, viewGroup, false);
        int i = R.id.playlist_author;
        TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.playlist_author);
        if (textView != null) {
            i = R.id.playlist_image;
            ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.playlist_image);
            if (imageView != null) {
                i = R.id.playlist_title;
                TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.playlist_title);
                if (textView2 != null) {
                    return new C7470e(imageView, (LinearLayout) inflate, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f15244e;
    }
}
