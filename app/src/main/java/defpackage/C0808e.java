package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0808e implements InterfaceC10283e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final TextView f3197e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ImageView f3198e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final TextView f3199e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final LinearLayout f3200e;

    public C0808e(ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f3200e = linearLayout;
        this.f3198e = imageView;
        this.f3197e = textView;
        this.f3199e = textView2;
    }

    public static C0808e ad(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.c3_link_vertical, viewGroup, false);
        int i = R.id.catalog_item_photo;
        ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.catalog_item_photo);
        if (imageView != null) {
            i = R.id.catalog_item_subtitle;
            TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.catalog_item_subtitle);
            if (textView != null) {
                i = R.id.catalog_item_title;
                TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.catalog_item_title);
                if (textView2 != null) {
                    return new C0808e(imageView, (LinearLayout) inflate, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f3200e;
    }
}
