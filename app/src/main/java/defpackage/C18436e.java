package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۡۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18436e implements InterfaceC10283e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final ImageView f36138e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final TextView f36139e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final MaterialButton f36140e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final TextView f36141e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final MaterialCardView f36142e;

    public C18436e(ImageView imageView, TextView textView, TextView textView2, MaterialButton materialButton, MaterialCardView materialCardView) {
        this.f36142e = materialCardView;
        this.f36140e = materialButton;
        this.f36139e = textView;
        this.f36141e = textView2;
        this.f36138e = imageView;
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f36142e;
    }
}
