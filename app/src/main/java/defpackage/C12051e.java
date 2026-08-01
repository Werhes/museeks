package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۢؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12051e implements InterfaceC10283e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final TextView f24108e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final TextView f24109e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ImageView f24110e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final MaterialCardView f24111e;

    public C12051e(ImageView imageView, TextView textView, TextView textView2, MaterialCardView materialCardView) {
        this.f24111e = materialCardView;
        this.f24109e = textView;
        this.f24108e = textView2;
        this.f24110e = imageView;
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f24111e;
    }
}
