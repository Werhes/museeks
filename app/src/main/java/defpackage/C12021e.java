package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ۟ٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12021e extends AbstractC4628e {
    public int adcel;
    public int purchase;
    public int yandex;
    public AbstractC9555e[] appmetrica = new AbstractC9555e[16];
    public int[] billing = new int[16];
    public Object[] startapp = new Object[16];

    public final void adcel(AbstractC9555e abstractC9555e) {
        int i = this.purchase;
        AbstractC9555e[] abstractC9555eArr = this.appmetrica;
        if (i == abstractC9555eArr.length) {
            AbstractC9555e[] abstractC9555eArr2 = new AbstractC9555e[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(abstractC9555eArr, 0, abstractC9555eArr2, 0, i);
            this.appmetrica = abstractC9555eArr2;
        }
        int i2 = this.yandex;
        int i3 = abstractC9555e.vip;
        int i4 = abstractC9555e.metrica;
        int i5 = i2 + i3;
        int[] iArr = this.billing;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            AbstractC1660e.advert(0, 0, iArr, iArr2, length);
            this.billing = iArr2;
        }
        int i7 = this.adcel + i4;
        Object[] objArr = this.startapp;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.startapp = objArr2;
        }
        AbstractC9555e[] abstractC9555eArr3 = this.appmetrica;
        int i9 = this.purchase;
        this.purchase = i9 + 1;
        abstractC9555eArr3[i9] = abstractC9555e;
        this.yandex += abstractC9555e.vip;
        this.adcel += i4;
    }

    public final void billing() {
        this.purchase = 0;
        this.yandex = 0;
        Arrays.fill(this.startapp, 0, this.adcel, (Object) null);
        this.adcel = 0;
    }

    public final boolean startapp() {
        return this.purchase == 0;
    }

    public final void yandex(InterfaceC11305e interfaceC11305e, C14479e c14479e, C14995e c14995e, InterfaceC15989e interfaceC15989e) {
        if (this.purchase != 0) {
            C11226e c11226e = new C11226e(6, this);
            C12021e c12021e = (C12021e) c11226e.appmetrica;
            while (true) {
                AbstractC9555e abstractC9555e = c12021e.appmetrica[c11226e.vip];
                C3155e purchase = abstractC9555e.purchase(c11226e);
                InterfaceC11305e interfaceC11305e2 = interfaceC11305e;
                C14479e c14479e2 = c14479e;
                C14995e c14995e2 = c14995e;
                InterfaceC15989e interfaceC15989e2 = interfaceC15989e;
                try {
                    abstractC9555e.license(c11226e, interfaceC11305e2, c14479e2, c14995e2, interfaceC15989e2);
                    int i = c11226e.vip;
                    int i2 = c12021e.purchase;
                    if (i < i2) {
                        AbstractC9555e abstractC9555e2 = c12021e.appmetrica[i];
                        c11226e.metrica += abstractC9555e2.vip;
                        c11226e.license += abstractC9555e2.metrica;
                        int i3 = i + 1;
                        c11226e.vip = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        interfaceC11305e = interfaceC11305e2;
                        c14479e = c14479e2;
                        c14995e = c14995e2;
                        interfaceC15989e = interfaceC15989e2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        billing();
    }
}
