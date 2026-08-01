package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13812e implements InterfaceC10283e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final TextView f27377e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ImageView f27378e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final LinearLayout f27379e;

    public C13812e(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f27379e = linearLayout;
        this.f27378e = imageView;
        this.f27377e = textView;
    }

    public static C13812e ad(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.c3_link_horizontal_small, viewGroup, false);
        int i = R.id.catalog_item_photo;
        ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.catalog_item_photo);
        if (imageView != null) {
            i = R.id.catalog_item_title;
            TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.catalog_item_title);
            if (textView != null) {
                return new C13812e((LinearLayout) inflate, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f27379e;
    }
}
