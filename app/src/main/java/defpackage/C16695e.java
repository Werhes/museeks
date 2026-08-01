package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16695e implements InterfaceC10283e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final TextView f32756e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ImageView f32757e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final TextView f32758e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final FrameLayout f32759e;

    public C16695e(FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f32759e = frameLayout;
        this.f32757e = imageView;
        this.f32756e = textView;
        this.f32758e = textView2;
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f32759e;
    }
}
