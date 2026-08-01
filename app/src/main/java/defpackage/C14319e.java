package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14319e extends ClickableSpan {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f28312e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C8092e f28313e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f28314e;

    public C14319e(int i, C8092e c8092e, int i2) {
        this.f28314e = i;
        this.f28313e = c8092e;
        this.f28312e = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f28314e);
        this.f28313e.ad.performAction(this.f28312e, bundle);
    }
}
