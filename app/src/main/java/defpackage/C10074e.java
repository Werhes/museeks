package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10074e extends AbstractC9519e {
    public byte[] ad;
    public int vip;

    @Override // defpackage.AbstractC9519e
    public final Object ad() {
        return Arrays.copyOf(this.ad, this.vip);
    }

    @Override // defpackage.AbstractC9519e
    public final int license() {
        return this.vip;
    }

    @Override // defpackage.AbstractC9519e
    public final void vip(int i) {
        byte[] bArr = this.ad;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.ad = Arrays.copyOf(bArr, i);
        }
    }
}
