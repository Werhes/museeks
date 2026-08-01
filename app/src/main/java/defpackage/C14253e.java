package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۜۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14253e implements InterfaceC10283e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final TextView f28185e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ImageView f28186e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final MaterialButton f28187e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final TextView f28188e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final MaterialCardView f28189e;

    public C14253e(ImageView imageView, TextView textView, TextView textView2, MaterialButton materialButton, MaterialCardView materialCardView) {
        this.f28189e = materialCardView;
        this.f28187e = materialButton;
        this.f28186e = imageView;
        this.f28188e = textView;
        this.f28185e = textView2;
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f28189e;
    }
}
