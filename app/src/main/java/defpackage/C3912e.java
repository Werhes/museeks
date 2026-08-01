package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3912e implements InterfaceC10283e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final TextView f8736e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final TextView f8737e;

    public C3912e(TextView textView, TextView textView2) {
        this.f8737e = textView;
        this.f8736e = textView2;
    }

    public static C3912e ad(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.c3_text, viewGroup, false);
        if (inflate == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) inflate;
        return new C3912e(textView, textView);
    }

    @Override // defpackage.InterfaceC10283e
    public final View getRoot() {
        return this.f8737e;
    }
}
