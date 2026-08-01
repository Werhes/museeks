package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2246e extends AbstractC17258e {
    public final int appmetrica;
    public final int[] license;
    public final AbstractC9743e metrica;
    public final AbstractC9743e vip;

    public C2246e(AbstractC9743e abstractC9743e, AbstractC9743e abstractC9743e2) {
        this.vip = abstractC9743e;
        this.metrica = abstractC9743e2;
        int adcel = abstractC9743e2.adcel();
        if (!(adcel <= 28)) {
            throw new IllegalArgumentException("metadata size too large");
        }
        int[] iArr = new int[adcel];
        this.license = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < adcel) {
            C9492e license = license(i);
            long j2 = license.appmetrica | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (license.equals(license(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = license.metrica ? iArr[i3] | (1 << (i + 4)) : i;
                    i++;
                    j = j2;
                }
            }
            iArr[i2] = i;
            i2++;
            i++;
            j = j2;
        }
        this.appmetrica = i2;
    }

    @Override // defpackage.AbstractC17258e
    public final void ad(C11467e c11467e, C16212e c16212e) {
        for (int i = 0; i < this.appmetrica; i++) {
            int i2 = this.license[i];
            C9492e license = license(i2 & 31);
            if (license.metrica) {
                c11467e.m3220try(license, new C13123e(this, license, i2), c16212e);
            } else {
                AbstractC9743e abstractC9743e = this.vip;
                int adcel = abstractC9743e.adcel();
                if (i2 >= adcel) {
                    abstractC9743e = this.metrica;
                    i2 -= adcel;
                }
                c11467e.m3219throw(license, license.vip.cast(abstractC9743e.advert(i2)), c16212e);
            }
        }
    }

    public final C9492e license(int i) {
        AbstractC9743e abstractC9743e = this.vip;
        int adcel = abstractC9743e.adcel();
        return i >= adcel ? this.metrica.mopub(i - adcel) : abstractC9743e.mopub(i);
    }

    @Override // defpackage.AbstractC17258e
    public final Set metrica() {
        return new C10442e(5, this);
    }

    @Override // defpackage.AbstractC17258e
    public final int vip() {
        return this.appmetrica;
    }
}
