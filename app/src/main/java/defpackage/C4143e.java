package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4143e implements InterfaceC10283e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ImageView f9133e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final TextView f9134e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final TextView f9135e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final LinearLayout f9136e;

    public C4143e(ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f9136e = linearLayout;
        this.f9134e = textView;
        this.f9133e = imageView;
        this.f9135e = textView2;
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f9136e;
    }
}
