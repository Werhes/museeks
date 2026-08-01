package defpackage;

import java.util.Arrays;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17750e {
    public final InterfaceC16707e[] ad;
    public final long vip;

    public C17750e(long j, InterfaceC16707e... interfaceC16707eArr) {
        this.vip = j;
        this.ad = interfaceC16707eArr;
    }

    public C17750e(List list) {
        this((InterfaceC16707e[]) list.toArray(new InterfaceC16707e[0]));
    }

    public C17750e(InterfaceC16707e... interfaceC16707eArr) {
        this(-9223372036854775807L, interfaceC16707eArr);
    }

    public final C17750e ad(InterfaceC16707e... interfaceC16707eArr) {
        if (interfaceC16707eArr.length == 0) {
            return this;
        }
        String str = AbstractC9413e.ad;
        InterfaceC16707e[] interfaceC16707eArr2 = this.ad;
        Object[] copyOf = Arrays.copyOf(interfaceC16707eArr2, interfaceC16707eArr2.length + interfaceC16707eArr.length);
        System.arraycopy(interfaceC16707eArr, 0, copyOf, interfaceC16707eArr2.length, interfaceC16707eArr.length);
        return new C17750e(this.vip, (InterfaceC16707e[]) copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17750e.class == obj.getClass()) {
            C17750e c17750e = (C17750e) obj;
            if (Arrays.equals(this.ad, c17750e.ad) && this.vip == c17750e.vip) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1561e.metrica(this.vip) + (Arrays.hashCode(this.ad) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.ad));
        long j = this.vip;
        if (j == -9223372036854775807L) {
            str = BuildConfig.FLAVOR;
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public final C17750e vip(C17750e c17750e) {
        return c17750e == null ? this : ad(c17750e.ad);
    }
}
