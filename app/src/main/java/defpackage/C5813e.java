package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5813e implements AdapterView.OnItemClickListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f12260e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12261e;

    public /* synthetic */ C5813e(int i, Object obj) {
        this.f12261e = i;
        this.f12260e = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.f12261e) {
            case 0:
                C10920e c10920e = (C10920e) this.f12260e;
                C16972e c16972e = c10920e.f21630e;
                c16972e.setSelection(i);
                if (c16972e.getOnItemClickListener() != null) {
                    c16972e.performItemClick(view, i, c10920e.f21629e.getItemId(i));
                }
                c10920e.dismiss();
                return;
            default:
                C8115e c8115e = (C8115e) this.f12260e;
                C14271e c14271e = c8115e.f16472e;
                C8115e.ad(c8115e, i < 0 ? !c14271e.f28227e.isShowing() ? null : c14271e.f28217e.getSelectedItem() : c8115e.getAdapter().getItem(i));
                AdapterView.OnItemClickListener onItemClickListener = c8115e.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !c14271e.f28227e.isShowing() ? null : c14271e.f28217e.getSelectedView();
                        i = !c14271e.f28227e.isShowing() ? -1 : c14271e.f28217e.getSelectedItemPosition();
                        j = !c14271e.f28227e.isShowing() ? Long.MIN_VALUE : c14271e.f28217e.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c14271e.f28217e, view, i, j);
                }
                c14271e.dismiss();
                return;
        }
    }
}
