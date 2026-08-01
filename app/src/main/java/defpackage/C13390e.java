package defpackage;

import android.widget.AbsListView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٝۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13390e implements AbsListView.OnScrollListener {
    public final /* synthetic */ C14271e ad;

    public C13390e(C14271e c14271e) {
        this.ad = c14271e;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C14271e c14271e = this.ad;
        RunnableC4252e runnableC4252e = c14271e.f28221e;
        C16235e c16235e = c14271e.f28227e;
        if (i != 1 || c16235e.getInputMethodMode() == 2 || c16235e.getContentView() == null) {
            return;
        }
        c14271e.f28230e.removeCallbacks(runnableC4252e);
        runnableC4252e.run();
    }
}
