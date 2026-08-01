package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۦۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3766e {
    public final ArrayList ad = new ArrayList();
    public float[] vip;

    public C3766e() {
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = Float.NaN;
        }
        this.vip = fArr;
    }

    public final void ad(Enum r3, float f) {
        ArrayList arrayList = this.ad;
        arrayList.add(r3);
        if (this.vip.length < arrayList.size()) {
            this.vip = Arrays.copyOf(this.vip, arrayList.size() + 2);
        }
        this.vip[arrayList.size() - 1] = f;
    }
}
