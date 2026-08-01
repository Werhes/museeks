package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5631e implements InterfaceC10283e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final ImageView f12006e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final TextView f12007e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final MaterialButton f12008e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final TextView f12009e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final MaterialCardView f12010e;

    public C5631e(ImageView imageView, TextView textView, TextView textView2, MaterialButton materialButton, MaterialCardView materialCardView) {
        this.f12010e = materialCardView;
        this.f12008e = materialButton;
        this.f12007e = textView;
        this.f12009e = textView2;
        this.f12006e = imageView;
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f12010e;
    }
}
