package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ٘ۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10340e implements InterfaceC10283e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final TextView f20398e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ImageView f20399e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final TextView f20400e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final LinearLayout f20401e;

    public C10340e(ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f20401e = linearLayout;
        this.f20399e = imageView;
        this.f20398e = textView;
        this.f20400e = textView2;
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f20401e;
    }
}
