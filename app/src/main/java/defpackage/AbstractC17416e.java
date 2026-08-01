package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۦٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17416e {
    public static final C2892e ad = new C2892e(-2094951472, false, new C7478e(19));
    public static final C2892e vip = new C2892e(-1425114673, false, new C7478e(20));
    public static final C2892e metrica = new C2892e(1464237989, false, new C10387e(10));
    public static final C2892e license = new C2892e(114521605, false, new C10387e(11));

    public static final long ad(long j, C0763e c0763e) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = c0763e.ad;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = c0763e.metrica;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = c0763e.vip;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = c0763e.license;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(f2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        if (defpackage.AbstractC1660e.yandex(r9, defpackage.AbstractC13427e.ad) != false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00e5 -> B:10:0x00ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object license(defpackage.C17201e r16, defpackage.C14542e r17, defpackage.C6302e r18, defpackage.C4335e r19, defpackage.AbstractC10731e r20) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17416e.license(eٗۖۖ, eؘٔؕ, eَؙؗ, eؖۘ۠, eُؑ۠):java.lang.Object");
    }

    public static ByteBuffer metrica(FileChannel fileChannel, C18524e c18524e) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) c18524e.f36318e);
        allocateDirect.order(ByteOrder.BIG_ENDIAN);
        fileChannel.read(allocateDirect);
        allocateDirect.position(0);
        return allocateDirect;
    }

    public static final long vip(C7102e c7102e, long j) {
        C2152e c2152e;
        InterfaceC0043e appmetrica = c7102e.appmetrica();
        if (appmetrica != null) {
            InterfaceC0043e vip2 = c7102e.vip();
            if (vip2 != null) {
                c2152e = new C2152e((appmetrica.billing() && vip2.billing()) ? appmetrica.mo207class(vip2, j) : j);
            } else {
                c2152e = null;
            }
            if (c2152e != null) {
                return c2152e.ad;
            }
        }
        return j;
    }
}
