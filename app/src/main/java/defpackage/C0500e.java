package defpackage;

import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500e implements InterfaceC15671e, Iterable, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f2575e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C4108e f2576e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f2577e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0583e f2578e;

    public C0500e() {
        long[] jArr = AbstractC12981e.ad;
        this.f2578e = new C0583e();
    }

    public final void adcel(C0500e c0500e) {
        C0583e c0583e = c0500e.f2578e;
        Object[] objArr = c0583e.vip;
        Object[] objArr2 = c0583e.metrica;
        long[] jArr = c0583e.ad;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        C16591e c16591e = (C16591e) obj;
                        C0583e c0583e2 = this.f2578e;
                        Object invoke = c16591e.vip.invoke(c0583e2.billing(c16591e), obj2);
                        if (invoke != null) {
                            c0583e2.amazon(c16591e, invoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC15671e
    public final void appmetrica(C16591e c16591e, Object obj) {
        boolean z = obj instanceof C10591e;
        C0583e c0583e = this.f2578e;
        if (z && c0583e.metrica(c16591e)) {
            C10591e c10591e = (C10591e) c0583e.billing(c16591e);
            C10591e c10591e2 = (C10591e) obj;
            String str = c10591e2.ad;
            if (str == null) {
                str = c10591e.ad;
            }
            InterfaceC12561e interfaceC12561e = c10591e2.vip;
            if (interfaceC12561e == null) {
                interfaceC12561e = c10591e.vip;
            }
            c0583e.amazon(c16591e, new C10591e(str, interfaceC12561e));
        } else {
            c0583e.amazon(c16591e, obj);
        }
        c16591e.getClass();
    }

    public final boolean billing(C16591e c16591e) {
        return this.f2578e.metrica(c16591e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0500e)) {
            return false;
        }
        C0500e c0500e = (C0500e) obj;
        return AbstractC7890e.billing(this.f2578e, c0500e.f2578e) && this.f2575e == c0500e.f2575e && this.f2577e == c0500e.f2577e;
    }

    public final int hashCode() {
        return (((this.f2578e.hashCode() * 31) + (this.f2575e ? 1231 : 1237)) * 31) + (this.f2577e ? 1231 : 1237);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C4108e c4108e = this.f2576e;
        if (c4108e == null) {
            C0583e c0583e = this.f2578e;
            c0583e.getClass();
            C4108e c4108e2 = new C4108e(c0583e);
            this.f2576e = c4108e2;
            c4108e = c4108e2;
        }
        return ((C10104e) c4108e.entrySet()).iterator();
    }

    public final Object startapp(C16591e c16591e) {
        Object billing = this.f2578e.billing(c16591e);
        if (billing != null) {
            return billing;
        }
        throw new IllegalStateException("Key not present: " + c16591e + " - consider getOrElse or getOrNull");
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f2575e) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (this.f2577e) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        C0583e c0583e = this.f2578e;
        Object[] objArr = c0583e.vip;
        Object[] objArr2 = c0583e.metrica;
        long[] jArr = c0583e.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((C16591e) obj).ad);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return AbstractC6261e.appmetrica(this) + "{ " + ((Object) sb) + " }";
    }

    public final C0500e yandex() {
        C0500e c0500e = new C0500e();
        c0500e.f2575e = this.f2575e;
        c0500e.f2577e = this.f2577e;
        C0583e c0583e = c0500e.f2578e;
        c0583e.getClass();
        C0583e c0583e2 = this.f2578e;
        Object[] objArr = c0583e2.vip;
        Object[] objArr2 = c0583e2.metrica;
        long[] jArr = c0583e2.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            c0583e.amazon(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return c0500e;
    }
}
