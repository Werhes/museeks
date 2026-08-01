package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؒٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0932e extends AbstractC9722e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C9730e f3346e;

    public C0932e(C9730e c9730e) {
        this.f3346e = c9730e;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f3346e.vip().ad();
    }

    @Override // defpackage.AbstractC9722e, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f3346e.vip().vip();
    }
}
