package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4569e implements InterfaceC10283e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final LinearLayout f9854e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final TextView f9855e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ImageView f9856e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final TextView f9857e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final LinearLayout f9858e;

    public C4569e(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, LinearLayout linearLayout2) {
        this.f9858e = linearLayout;
        this.f9856e = imageView;
        this.f9855e = textView;
        this.f9857e = textView2;
        this.f9854e = linearLayout2;
    }

    public static C4569e ad(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.v7_post_header, viewGroup, false);
        int i = R.id.post_avatar;
        ImageView imageView = (ImageView) AbstractC7779e.vip(inflate, R.id.post_avatar);
        if (imageView != null) {
            i = R.id.post_group;
            TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.post_group);
            if (textView != null) {
                i = R.id.post_time;
                TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.post_time);
                if (textView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) inflate;
                    return new C4569e(linearLayout, imageView, textView, textView2, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f9858e;
    }
}
