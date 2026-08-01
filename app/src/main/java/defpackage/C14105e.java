package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14105e implements AdapterView.OnItemSelectedListener {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C14271e f27892e;

    public C14105e(C14271e c14271e) {
        this.f27892e = c14271e;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C15703e c15703e;
        if (i == -1 || (c15703e = this.f27892e.f28217e) == null) {
            return;
        }
        c15703e.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
