package defpackage;

import android.content.Context;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1607e extends AbstractC15807e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [eؘٗٙ, eٟٓۧ, java.lang.Object, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r6v1, types: [eؘٜٔ, java.lang.Object, eَّٝ] */
    public C1607e(Context context) {
        super(context);
        C12780e c12780e = this.f31175e;
        ?? obj = new Object();
        obj.ad = c12780e;
        Context context2 = getContext();
        C14913e c14913e = new C14913e(c12780e);
        ?? abstractC5682e = new AbstractC5682e(context2, c12780e);
        abstractC5682e.f28004e = obj;
        abstractC5682e.f28003e = c14913e;
        c14913e.f22047e = abstractC5682e;
        abstractC5682e.f28005e = C2955e.ad(context2.getResources(), R.drawable.indeterminate_static, null);
        setIndeterminateDrawable(abstractC5682e);
        setProgressDrawable(new C18397e(getContext(), c12780e, obj));
    }

    public int getIndicatorDirection() {
        return this.f31175e.adcel;
    }

    public int getIndicatorInset() {
        return this.f31175e.startapp;
    }

    public int getIndicatorSize() {
        return this.f31175e.yandex;
    }

    public void setIndicatorDirection(int i) {
        this.f31175e.adcel = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        C12780e c12780e = this.f31175e;
        if (c12780e.startapp != i) {
            c12780e.startapp = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        C12780e c12780e = this.f31175e;
        if (c12780e.yandex != max) {
            c12780e.yandex = max;
            c12780e.ad();
            requestLayout();
            invalidate();
        }
    }

    @Override // defpackage.AbstractC15807e
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        this.f31175e.ad();
    }
}
