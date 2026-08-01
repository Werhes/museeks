package defpackage;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12177e extends AbstractC12364e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f24474e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f24475e;

    public /* synthetic */ C12177e(int i, Object obj) {
        this.f24474e = i;
        this.f24475e = obj;
    }

    @Override // defpackage.AbstractC12364e
    public final Object adcel() {
        int i = this.f24474e;
        Object obj = this.f24475e;
        switch (i) {
            case 0:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(6000L);
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(1);
                ofFloat.setInterpolator(null);
                ofFloat.addUpdateListener(new C1498e(1, this));
                ofFloat.addUpdateListener(((C5008e) obj).billing);
                ofFloat.start();
                ofFloat.pause();
                return ofFloat;
            default:
                return new C14703e(((C1244e) obj).amazon);
        }
    }
}
