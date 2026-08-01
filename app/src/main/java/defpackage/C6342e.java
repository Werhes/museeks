package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6342e implements InterfaceC10898e, InterfaceC16112e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f13182e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f13183e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f13184e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f13185e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public long f13186e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f13187e;

    public C6342e(long j, InterfaceC7227e interfaceC7227e, C17974e c17974e, InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper) {
        this.f13183e = c17974e;
        this.f13185e = interfaceC15348e;
        this.f13182e = longPointerWrapper;
        this.f13187e = interfaceC7227e;
        this.f13186e = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6342e(defpackage.C9904e r22, int r23, int r24, long r25) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6342e.<init>(eٍۦٔ, int, int, long):void");
    }

    @Override // defpackage.InterfaceC10898e
    public int ad(boolean z, byte[] bArr) {
        C10398e c10398e = (C10398e) this.f13187e;
        byte[] bArr2 = (byte[]) this.f13185e;
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this.f13186e > 140737488355328L) {
            return -1;
        }
        if (z) {
            license(null);
        }
        int length2 = bArr.length;
        byte[] bArr3 = new byte[length2];
        int length3 = bArr.length / bArr2.length;
        c10398e.init(new C14915e((byte[]) this.f13183e));
        for (int i = 0; i < length3; i++) {
            c10398e.update(bArr2, 0, bArr2.length);
            c10398e.doFinal(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr3, bArr2.length * i, bArr2.length);
        }
        if (bArr2.length * length3 < length2) {
            c10398e.update(bArr2, 0, bArr2.length);
            c10398e.doFinal(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr3, bArr2.length * length3, length2 - (length3 * bArr2.length));
        }
        pro((byte) 0, null);
        this.f13186e++;
        System.arraycopy(bArr3, 0, bArr, 0, bArr.length);
        return length;
    }

    public float adcel() {
        return ((C6458e) this.f13185e).ad();
    }

    public float amazon() {
        return C5602e.yandex(this.f13186e);
    }

    public void applovin(InterfaceC14576e interfaceC14576e, AbstractC4457e abstractC4457e, float f, C13973e c13973e, C11964e c11964e, AbstractC4970e abstractC4970e) {
        C2687e c2687e = ((C9904e) this.f13183e).f19541e;
        int i = c2687e.metrica;
        float amazon = amazon();
        float adcel = adcel();
        c2687e.metrica(abstractC4457e, (Float.floatToRawIntBits(adcel) & 4294967295L) | (Float.floatToRawIntBits(amazon) << 32), f);
        c2687e.purchase(c13973e);
        c2687e.billing(c11964e);
        c2687e.appmetrica(abstractC4970e);
        c2687e.vip(3);
        tapsense(interfaceC14576e);
        c2687e.vip(i);
    }

    public C6458e billing(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        C15803e c15803e;
        float amazon = amazon();
        C9904e c9904e = (C9904e) this.f13183e;
        C2687e c2687e = c9904e.f19541e;
        int i8 = c9904e.f19532e;
        C5386e c5386e = c9904e.f19539e;
        C1839e c1839e = c9904e.f19535e;
        C1255e c1255e = AbstractC1943e.ad;
        C0965e c0965e = c1839e.metrica;
        return new C6458e(charSequence, amazon, c2687e, i, truncateAt, i8, (c0965e == null || (c15803e = c0965e.vip) == null) ? false : c15803e.ad, i3, i5, i6, i7, i4, i2, c5386e);
    }

    @Override // defpackage.InterfaceC16112e
    public void clear() {
        AbstractC0054e.license(this);
    }

    @Override // defpackage.InterfaceC16112e
    public boolean contains(Object obj) {
        InterfaceC14287e interfaceC14287e = (InterfaceC14287e) obj;
        if (interfaceC14287e != null && !C7290e.yandex((InterfaceC10518e) interfaceC14287e)) {
            return false;
        }
        C15816e c15816e = new C15816e(15);
        if (interfaceC14287e != null) {
            C13655e f36702e = ((InterfaceC10518e) interfaceC14287e).getF36702e();
            r2 = f36702e != null ? f36702e : null;
            if (r2 == null) {
                throw new IllegalArgumentException("Cannot lookup unmanaged objects in realm");
            }
        }
        realm_value_t m4012break = c15816e.m4012break(r2);
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f13182e).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_find(ptr$cinterop_release, m4012break.ad, m4012break, new long[1], zArr);
        boolean z = zArr[0];
        c15816e.m4020interface();
        return z;
    }

    @Override // defpackage.InterfaceC16112e
    public boolean crashlytics(Object obj, int i, LinkedHashMap linkedHashMap) {
        boolean signatures = signatures((InterfaceC14287e) obj, i, linkedHashMap);
        purchase(startapp() + 1);
        return signatures;
    }

    @Override // defpackage.InterfaceC16112e
    public Object get(int i) {
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f13182e;
        long j = i;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_set_get(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        int realm_value_t_type_get = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar);
        int[] m2468interface = AbstractC8703e.m2468interface(14);
        int length = m2468interface.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            int i5 = m2468interface[i4];
            if (AbstractC8703e.m2467class(i5) == realm_value_t_type_get) {
                i3 = i5;
                break;
            }
            i4++;
        }
        if (i3 == 0) {
            throw new IllegalStateException(("Unknown value type: " + realm_value_t_type_get).toString());
        }
        if (1 == i3) {
            return null;
        }
        InterfaceC7227e interfaceC7227e = (InterfaceC7227e) this.f13187e;
        C17974e c17974e = (C17974e) this.f13183e;
        InterfaceC15348e interfaceC15348e = (InterfaceC15348e) this.f13185e;
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
            return null;
        }
        return AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar), interfaceC7227e, c17974e, interfaceC15348e);
    }

    @Override // defpackage.InterfaceC16112e
    /* renamed from: goto, reason: not valid java name */
    public boolean mo2159goto(InterfaceC11775e interfaceC11775e, int i, Map map) {
        return AbstractC0054e.ad(this, interfaceC11775e, i, map);
    }

    public void isPro(InterfaceC14576e interfaceC14576e, long j, C13973e c13973e, C11964e c11964e, AbstractC4970e abstractC4970e) {
        C2687e c2687e = ((C9904e) this.f13183e).f19541e;
        int i = c2687e.metrica;
        c2687e.license(j);
        c2687e.purchase(c13973e);
        c2687e.billing(c11964e);
        c2687e.appmetrica(abstractC4970e);
        c2687e.vip(3);
        tapsense(interfaceC14576e);
        c2687e.vip(i);
    }

    @Override // defpackage.InterfaceC10898e
    public void license(byte[] bArr) {
        byte[] entropy = ((InterfaceC16186e) this.f13182e).getEntropy();
        if (entropy.length < (this.f13184e + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        byte[] adcel = AbstractC12442e.adcel(entropy, bArr);
        pro((byte) 0, adcel);
        if (adcel != null) {
            pro((byte) 1, adcel);
        }
        this.f13186e = 1L;
    }

    @Override // defpackage.InterfaceC16112e
    public InterfaceC16112e metrica(InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper) {
        C17974e c17974e = (C17974e) this.f13183e;
        return new C6342e(this.f13186e, (InterfaceC7227e) this.f13187e, c17974e, interfaceC15348e, longPointerWrapper);
    }

    public long mopub(C0763e c0763e, int i, C11180e c11180e) {
        InterfaceC14403e c11055e;
        int i2;
        int[] iArr;
        C6458e c6458e = (C6458e) this.f13185e;
        RectF mopub = AbstractC9764e.mopub(c0763e);
        int i3 = (i != 0 && i == 1) ? 1 : 0;
        C11213e c11213e = new C11213e(3, c11180e);
        Layout layout = c6458e.purchase;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            iArr = AbstractC5666e.smaato(c6458e, mopub, i3, c11213e);
        } else {
            C18464e metrica = c6458e.metrica();
            if (i3 == 1) {
                c11055e = new C3168e(layout.getText(), c6458e.adcel(), 26);
            } else {
                CharSequence text = layout.getText();
                c11055e = i4 >= 29 ? new C11055e(text, c6458e.ad) : new C12753e(text);
            }
            InterfaceC14403e interfaceC14403e = c11055e;
            int lineForVertical = layout.getLineForVertical((int) mopub.top);
            if (mopub.top <= c6458e.appmetrica(lineForVertical) || (lineForVertical = lineForVertical + 1) < c6458e.billing) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) mopub.bottom);
                if (lineForVertical2 != 0 || mopub.bottom >= c6458e.billing(0)) {
                    int yandex = AbstractC16540e.yandex(c6458e, layout, metrica, i5, mopub, interfaceC14403e, c11213e, true);
                    while (true) {
                        i2 = i5;
                        if (yandex != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        yandex = AbstractC16540e.yandex(c6458e, layout, metrica, i5, mopub, interfaceC14403e, c11213e, true);
                    }
                    if (yandex != -1) {
                        int i6 = lineForVertical2;
                        int yandex2 = AbstractC16540e.yandex(c6458e, layout, metrica, i6, mopub, interfaceC14403e, c11213e, false);
                        while (yandex2 == -1 && i2 < i6) {
                            i6--;
                            yandex2 = AbstractC16540e.yandex(c6458e, layout, metrica, i6, mopub, interfaceC14403e, c11213e, false);
                        }
                        if (yandex2 != -1) {
                            iArr = new int[]{interfaceC14403e.appmetrica(yandex + 1), interfaceC14403e.smaato(yandex2 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        return iArr == null ? C12347e.vip : AbstractC9262e.metrica(iArr[0], iArr[1]);
    }

    public void pro(byte b, byte[] bArr) {
        C10398e c10398e = (C10398e) this.f13187e;
        byte[] bArr2 = (byte[]) this.f13183e;
        c10398e.init(new C14915e(bArr2));
        byte[] bArr3 = (byte[]) this.f13185e;
        c10398e.update(bArr3, 0, bArr3.length);
        c10398e.update(b);
        if (bArr != null) {
            c10398e.update(bArr, 0, bArr.length);
        }
        c10398e.doFinal(bArr2, 0);
        c10398e.init(new C14915e(bArr2, 0, bArr2.length));
        c10398e.update(bArr3, 0, bArr3.length);
        c10398e.doFinal(bArr3, 0);
    }

    @Override // defpackage.InterfaceC16112e
    public void purchase(int i) {
        this.f13184e = i;
    }

    @Override // defpackage.InterfaceC16112e
    public boolean remoteconfig(Collection collection, int i, Map map) {
        return AbstractC0054e.vip(this, collection, i, map);
    }

    @Override // defpackage.InterfaceC16112e
    public boolean remove(Object obj) {
        InterfaceC14287e interfaceC14287e = (InterfaceC14287e) obj;
        boolean z = false;
        if (interfaceC14287e == null || C7290e.yandex((InterfaceC10518e) interfaceC14287e)) {
            C15816e c15816e = new C15816e(15);
            Object obj2 = AbstractC6503e.ad;
            if (interfaceC14287e != null) {
                C13655e f36702e = ((InterfaceC10518e) interfaceC14287e).getF36702e();
                r3 = f36702e != null ? f36702e : null;
                if (r3 == null) {
                    throw new IllegalArgumentException("Cannot lookup unmanaged objects in realm");
                }
            }
            realm_value_t m4012break = c15816e.m4012break(r3);
            boolean[] zArr = new boolean[1];
            long ptr$cinterop_release = ((LongPointerWrapper) this.f13182e).getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_set_erase(ptr$cinterop_release, m4012break.ad, m4012break, zArr);
            z = zArr[0];
            c15816e.m4020interface();
        }
        purchase(startapp() + 1);
        return z;
    }

    @Override // defpackage.InterfaceC16112e
    public boolean removeAll(Collection collection) {
        return AbstractC0054e.amazon(this, collection);
    }

    @Override // defpackage.InterfaceC16112e
    public boolean signatures(Object obj, int i, Map map) {
        InterfaceC14287e interfaceC14287e = (InterfaceC14287e) obj;
        C15816e c15816e = new C15816e(15);
        C17974e c17974e = (C17974e) this.f13183e;
        InterfaceC15348e interfaceC15348e = (InterfaceC15348e) this.f13185e;
        if (interfaceC14287e != null) {
            C13655e f36702e = ((InterfaceC10518e) interfaceC14287e).getF36702e();
            if (f36702e == null) {
                interfaceC14287e = AbstractC3422e.ad(c17974e, interfaceC15348e.crashlytics(), interfaceC14287e, i, map);
            } else if (!AbstractC7890e.billing(f36702e.f27072e, interfaceC15348e)) {
                throw new IllegalArgumentException("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
            }
        } else {
            interfaceC14287e = null;
        }
        realm_value_t m4012break = c15816e.m4012break(interfaceC14287e != null ? ((InterfaceC10518e) interfaceC14287e).getF36702e() : null);
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f13182e).getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_set_insert(ptr$cinterop_release, m4012break.ad, m4012break, new long[1], zArr);
        boolean z = zArr[0];
        c15816e.m4020interface();
        return z;
    }

    @Override // defpackage.InterfaceC16112e
    public int startapp() {
        return this.f13184e;
    }

    public void tapsense(InterfaceC14576e interfaceC14576e) {
        Canvas canvas = AbstractC16863e.ad;
        Canvas canvas2 = ((C11648e) interfaceC14576e).ad;
        C6458e c6458e = (C6458e) this.f13185e;
        if (c6458e.license) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, amazon(), adcel());
        }
        int i = c6458e.yandex;
        if (canvas2.getClipBounds(c6458e.Signature)) {
            if (i != 0) {
                canvas2.translate(0.0f, i);
            }
            ThreadLocal threadLocal = AbstractC10080e.ad;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new Canvas();
                threadLocal.set(obj);
            }
            C7598e c7598e = (C7598e) obj;
            c7598e.ad = canvas2;
            try {
                c6458e.purchase.draw(c7598e);
                if (i != 0) {
                    canvas2.translate(0.0f, (-1) * i);
                }
            } finally {
                c7598e.ad = null;
            }
        }
        if (c6458e.license) {
            canvas2.restore();
        }
    }

    @Override // defpackage.InterfaceC16112e
    public NativePointer vip() {
        return (LongPointerWrapper) this.f13182e;
    }

    @Override // defpackage.InterfaceC2750e
    public InterfaceC15348e yandex() {
        return (InterfaceC15348e) this.f13185e;
    }
}
