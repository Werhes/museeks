package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۜؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14974e implements AdapterView.OnItemClickListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C11486e f29688e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C3024e f29689e;

    public C14974e(C11486e c11486e, C3024e c3024e) {
        this.f29688e = c11486e;
        this.f29689e = c3024e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C11486e c11486e = this.f29688e;
        DialogInterface.OnClickListener onClickListener = c11486e.loadAd;
        C3024e c3024e = this.f29689e;
        onClickListener.onClick(c3024e.vip, i);
        if (c11486e.admob) {
            return;
        }
        c3024e.vip.dismiss();
    }
}
