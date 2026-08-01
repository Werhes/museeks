package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12695e {
    public final C17466e ad;
    public C14195e license = (C14195e) AbstractC5676e.vip.firebase();
    public int metrica;
    public int vip;

    public C12695e(C17466e c17466e) {
        this.ad = c17466e;
    }

    public final C4860e ad(String str) {
        if (this.vip == 0) {
            return null;
        }
        C13935e c13935e = AbstractC7076e.ad;
        int abs = Math.abs(AbstractC7076e.vip(0, str.length(), str));
        int i = this.metrica;
        while (true) {
            int i2 = abs % i;
            int i3 = i2 * 6;
            if (this.license.ad(i3) == -1) {
                return null;
            }
            if (vip(str, i3)) {
                return purchase(i3);
            }
            abs = i2 + 1;
            i = this.metrica;
        }
    }

    public final void appmetrica() {
        this.vip = 0;
        this.metrica = 0;
        C12074e c12074e = AbstractC5676e.vip;
        c12074e.mo360e(this.license);
        this.license = (C14195e) c12074e.firebase();
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [eؘۣٔ, kotlin.jvm.functions.Function2] */
    public final void license(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = this.vip;
        double d = i6;
        int i7 = this.metrica;
        if (d >= i7 * 0.75d) {
            C14195e c14195e = this.license;
            this.vip = 0;
            this.metrica = (i7 * 2) | 128;
            C14195e c14195e2 = (C14195e) AbstractC5676e.vip.firebase();
            int size = (c14195e.ad.size() * 2) | 1;
            for (int i8 = 0; i8 < size; i8++) {
                c14195e2.ad.add(AbstractC5676e.ad.firebase());
            }
            c14195e2.getClass();
            this.license = c14195e2;
            C4300e license = AbstractC16342e.license((AbstractC15049e) c14195e.vip().vip);
            while (license.hasNext()) {
                int intValue = ((Number) license.next()).intValue();
                license(c14195e.ad(intValue + 1), c14195e.ad(intValue + 2), c14195e.ad(intValue + 3), c14195e.ad(intValue + 4));
            }
            AbstractC5676e.vip.mo360e(c14195e);
            if (i6 != this.vip) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C17466e c17466e = this.ad;
        int abs = Math.abs(AbstractC7076e.vip(i, i2, c17466e));
        CharSequence subSequence = c17466e.subSequence(i, i2);
        int i9 = abs % this.metrica;
        int i10 = -1;
        while (true) {
            i5 = i9 * 6;
            if (this.license.ad(i5) == -1) {
                break;
            }
            if (vip(subSequence, i5)) {
                i10 = i9;
            }
            i9 = (i9 + 1) % this.metrica;
        }
        this.license.metrica(i5, abs);
        this.license.metrica(i5 + 1, i);
        this.license.metrica(i5 + 2, i2);
        this.license.metrica(i5 + 3, i3);
        this.license.metrica(i5 + 4, i4);
        this.license.metrica(i5 + 5, -1);
        if (i10 != -1) {
            this.license.metrica((i10 * 6) + 5, i9);
        }
        this.vip++;
    }

    public final C4860e metrica(int i) {
        return (C4860e) this.ad.subSequence(this.license.ad(i + 1), this.license.ad(i + 2));
    }

    public final C4860e purchase(int i) {
        return (C4860e) this.ad.subSequence(this.license.ad(i + 3), this.license.ad(i + 4));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [eؘۣٔ, kotlin.jvm.functions.Function2] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C12074e c12074e = AbstractC5676e.ad;
        C4300e license = AbstractC16342e.license((AbstractC15049e) this.license.vip().vip);
        while (license.hasNext()) {
            int intValue = ((Number) license.next()).intValue();
            sb.append((CharSequence) BuildConfig.FLAVOR);
            sb.append((CharSequence) metrica(intValue));
            sb.append((CharSequence) " => ");
            sb.append((CharSequence) purchase(intValue));
            sb.append((CharSequence) "\n");
        }
        return sb.toString();
    }

    public final boolean vip(CharSequence charSequence, int i) {
        return AbstractC7076e.ad(this.ad, this.license.ad(i + 1), this.license.ad(i + 2), charSequence);
    }
}
