package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۥۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10656e extends AbstractC9743e {
    public int license;
    public Object[] metrica;

    @Override // defpackage.AbstractC9743e
    public final int adcel() {
        return this.license;
    }

    @Override // defpackage.AbstractC9743e
    public final Object advert(int i) {
        if (i < this.license) {
            return this.metrica[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    public final void amazon(C9492e c9492e, Object obj) {
        int loadAd;
        if (!c9492e.metrica && (loadAd = loadAd(c9492e)) != -1) {
            AbstractC9835e.advert(obj, "metadata value");
            this.metrica[loadAd + loadAd + 1] = obj;
            return;
        }
        int i = this.license + 1;
        Object[] objArr = this.metrica;
        int length = objArr.length;
        if (i + i > length) {
            this.metrica = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.metrica;
        int i2 = this.license;
        int i3 = i2 + i2;
        objArr2[i3] = c9492e;
        AbstractC9835e.advert(obj, "metadata value");
        objArr2[i3 + 1] = obj;
        this.license++;
    }

    public final int loadAd(C9492e c9492e) {
        for (int i = 0; i < this.license; i++) {
            if (this.metrica[i + i].equals(c9492e)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC9743e
    public final C9492e mopub(int i) {
        if (i < this.license) {
            return (C9492e) this.metrica[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.AbstractC9743e
    public final Object smaato(C9492e c9492e) {
        int loadAd = loadAd(c9492e);
        if (loadAd == -1) {
            return null;
        }
        return c9492e.vip.cast(this.metrica[loadAd + loadAd + 1]);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.license; i++) {
            sb.append(" '");
            sb.append(mopub(i));
            sb.append("': ");
            sb.append(advert(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
