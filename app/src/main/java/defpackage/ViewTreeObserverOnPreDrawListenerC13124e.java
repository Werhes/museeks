package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC13124e implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public ViewGroup f26089e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public AbstractC18109e f26090e;

    /* JADX WARN: Removed duplicated region for block: B:116:0x01f8 A[EDGE_INSN: B:116:0x01f8->B:117:0x01f8 BREAK  A[LOOP:1: B:17:0x0085->B:29:0x01ee], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewTreeObserverOnPreDrawListenerC13124e.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f26089e;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        AbstractC8075e.metrica.remove(viewGroup);
        ArrayList arrayList = (ArrayList) AbstractC8075e.vip().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC18109e) it.next()).premium(viewGroup);
            }
        }
        this.f26090e.startapp(true);
    }
}
