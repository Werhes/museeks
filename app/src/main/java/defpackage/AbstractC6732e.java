package defpackage;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۢٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6732e implements Iterable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C1884e f13911e = new C1884e(new byte[0]);

    public static AbstractC6732e appmetrica(Iterator it, int i) {
        if (i == 1) {
            return (AbstractC6732e) it.next();
        }
        int i2 = i >>> 1;
        return appmetrica(it, i2).billing(appmetrica(it, i - i2));
    }

    public static C1974e loadAd() {
        return new C1974e();
    }

    public abstract int Signature(int i, int i2, int i3);

    public abstract int adcel();

    public abstract int admob(int i, int i2, int i3);

    public abstract boolean advert();

    public final AbstractC6732e billing(AbstractC6732e abstractC6732e) {
        int size = size();
        int size2 = abstractC6732e.size();
        if (size + size2 >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = C1152e.f3729e;
        C1152e c1152e = this instanceof C1152e ? (C1152e) this : null;
        if (abstractC6732e.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return abstractC6732e;
        }
        int size3 = abstractC6732e.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = abstractC6732e.size();
            byte[] bArr = new byte[size4 + size5];
            yandex(0, 0, size4, bArr);
            abstractC6732e.yandex(0, size4, size5, bArr);
            return new C1884e(bArr);
        }
        if (c1152e != null) {
            AbstractC6732e abstractC6732e2 = c1152e.f3733e;
            if (abstractC6732e.size() + abstractC6732e2.size() < 128) {
                int size6 = abstractC6732e2.size();
                int size7 = abstractC6732e.size();
                byte[] bArr2 = new byte[size6 + size7];
                abstractC6732e2.yandex(0, 0, size6, bArr2);
                abstractC6732e.yandex(0, size6, size7, bArr2);
                return new C1152e(c1152e.f3731e, new C1884e(bArr2));
            }
        }
        if (c1152e != null) {
            AbstractC6732e abstractC6732e3 = c1152e.f3733e;
            AbstractC6732e abstractC6732e4 = c1152e.f3731e;
            if (abstractC6732e4.adcel() > abstractC6732e3.adcel() && c1152e.f3735e > abstractC6732e.adcel()) {
                return new C1152e(abstractC6732e4, new C1152e(abstractC6732e3, abstractC6732e));
            }
        }
        if (size3 >= C1152e.f3729e[Math.max(adcel(), abstractC6732e.adcel()) + 1]) {
            return new C1152e(this, abstractC6732e);
        }
        C7988e c7988e = new C7988e(22);
        c7988e.m2364class(this);
        c7988e.m2364class(abstractC6732e);
        Stack stack = (Stack) c7988e.f16176e;
        AbstractC6732e abstractC6732e5 = (AbstractC6732e) stack.pop();
        while (!stack.isEmpty()) {
            abstractC6732e5 = new C1152e((AbstractC6732e) stack.pop(), abstractC6732e5);
        }
        return abstractC6732e5;
    }

    public abstract void isVip(OutputStream outputStream, int i, int i2);

    public abstract String remoteconfig();

    public abstract int size();

    public abstract boolean smaato();

    public abstract void startapp(int i, int i2, int i3, byte[] bArr);

    public abstract int subscription();

    public final String tapsense() {
        try {
            return remoteconfig();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public final void yandex(int i, int i2, int i3, byte[] bArr) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i3 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i4 = i + i3;
        if (i4 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i4);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i5 = i2 + i3;
        if (i5 <= bArr.length) {
            if (i3 > 0) {
                startapp(i, i2, i3, bArr);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i5);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }
}
