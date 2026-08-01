package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٞؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4252e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14271e f9331e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9332e;

    public /* synthetic */ RunnableC4252e(C14271e c14271e, int i) {
        this.f9332e = i;
        this.f9331e = c14271e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9332e) {
            case 0:
                C15703e c15703e = this.f9331e.f28217e;
                if (c15703e != null) {
                    c15703e.setListSelectionHidden(true);
                    c15703e.requestLayout();
                    return;
                }
                return;
            default:
                C14271e c14271e = this.f9331e;
                C15703e c15703e2 = c14271e.f28217e;
                if (c15703e2 == null || !c15703e2.isAttachedToWindow() || c14271e.f28217e.getCount() <= c14271e.f28217e.getChildCount() || c14271e.f28217e.getChildCount() > c14271e.f28215e) {
                    return;
                }
                c14271e.f28227e.setInputMethodMode(2);
                c14271e.purchase();
                return;
        }
    }
}
