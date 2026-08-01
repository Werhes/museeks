package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚِٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16057e extends AbstractC9519e {
    public short[] ad;
    public int vip;

    @Override // defpackage.AbstractC9519e
    public final Object ad() {
        return new C5901e(Arrays.copyOf(this.ad, this.vip));
    }

    @Override // defpackage.AbstractC9519e
    public final int license() {
        return this.vip;
    }

    @Override // defpackage.AbstractC9519e
    public final void vip(int i) {
        short[] sArr = this.ad;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.ad = Arrays.copyOf(sArr, i);
        }
    }
}
