package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6070e implements InterfaceC10283e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final TextView f12745e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ImageView f12746e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final TextView f12747e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final MaterialCardView f12748e;

    public C6070e(ImageView imageView, TextView textView, TextView textView2, MaterialCardView materialCardView) {
        this.f12748e = materialCardView;
        this.f12746e = imageView;
        this.f12745e = textView;
        this.f12747e = textView2;
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f12748e;
    }
}
