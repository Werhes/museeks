package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؐۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7642e extends C1329e {
    public final C5949e license;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7642e() {
        super(4);
        C5949e c5949e = C5949e.f12529e;
        this.license = c5949e;
    }

    @Override // defpackage.C1329e, defpackage.AbstractC13584e
    public final AbstractC13584e ad(Object obj) {
        super.ad(obj);
        return this;
    }

    @Override // defpackage.C1329e
    public final /* bridge */ /* synthetic */ AbstractC12614e billing() {
        throw null;
    }

    @Override // defpackage.C1329e
    /* renamed from: purchase */
    public final C1329e ad(Object obj) {
        super.ad(obj);
        return this;
    }

    public final C3889e yandex() {
        C3889e c3889e;
        Object[] objArr = this.ad;
        int i = this.vip;
        C5949e c5949e = this.license;
        if (i == 0) {
            c3889e = AbstractC12107e.tapsense(c5949e);
        } else {
            AbstractC8306e.ad(i, objArr);
            Arrays.sort(objArr, 0, i, c5949e);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (c5949e.compare(obj, objArr[i2 - 1]) != 0) {
                    objArr[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, i, (Object) null);
            if (i2 < objArr.length / 2) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            c3889e = new C3889e(AbstractC17475e.loadAd(i2, objArr), c5949e);
        }
        this.vip = c3889e.f8716e.size();
        this.metrica = true;
        return c3889e;
    }
}
