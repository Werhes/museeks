package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۦۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9909e {
    public int ad;
    public float license;
    public float metrica;
    public int vip;

    public final void ad(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC15320e.billing);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.metrica = obtainStyledAttributes.getFloat(index, this.metrica);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.ad);
                this.ad = i2;
                this.ad = C16732e.license[i2];
            } else if (index == 4) {
                this.vip = obtainStyledAttributes.getInt(index, this.vip);
            } else if (index == 3) {
                this.license = obtainStyledAttributes.getFloat(index, this.license);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
