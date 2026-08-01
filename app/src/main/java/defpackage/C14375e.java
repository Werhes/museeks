package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۦؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14375e implements InterfaceC10283e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final TextView f28425e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ImageView f28426e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final MaterialButton f28427e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final TextView f28428e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final MaterialCardView f28429e;

    public C14375e(ImageView imageView, TextView textView, TextView textView2, MaterialButton materialButton, MaterialCardView materialCardView) {
        this.f28429e = materialCardView;
        this.f28427e = materialButton;
        this.f28426e = imageView;
        this.f28428e = textView;
        this.f28425e = textView2;
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f28429e;
    }
}
