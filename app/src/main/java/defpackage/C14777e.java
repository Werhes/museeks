package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14777e implements InterfaceC5372e {
    public static final C14777e ad = new Object();
    public static final C3859e vip = AbstractC10003e.ad("SerializableContainer");

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (r10 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r0 == null) goto L9;
     */
    @Override // defpackage.InterfaceC5372e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(defpackage.InterfaceC5757e r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14777e.ad(eؘٜٜ, java.lang.Object):void");
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        byte[] copyOf;
        String pro = interfaceC11754e.pro();
        byte[] bArr = null;
        if (AbstractC7890e.billing(pro, ".")) {
            pro = null;
        }
        if (pro != null) {
            int i = 0;
            if (AbstractC5304e.m1866native(pro)) {
                copyOf = new byte[0];
            } else {
                int length = pro.length();
                byte[] bArr2 = new byte[length];
                int[] iArr = AbstractC11977e.vip;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i2 < pro.length()) {
                    int i6 = i2 + 1;
                    char charAt = pro.charAt(i2);
                    if (AbstractC7890e.yandex(charAt, 32) > 0) {
                        if (charAt == '=') {
                            break;
                        }
                        int i7 = (charAt < 0 || charAt >= iArr.length) ? -1 : iArr[charAt];
                        if (i7 == -1) {
                            throw new IllegalStateException(("Unexpected character " + charAt + " (" + ((int) charAt) + ")) in " + pro).toString());
                        }
                        i4 = (i4 << 6) | i7;
                        i5++;
                        if (i5 == 4) {
                            bArr2[i3] = (byte) (i4 >> 16);
                            bArr2[i3 + 1] = (byte) ((i4 >> 8) & 255);
                            bArr2[i3 + 2] = (byte) (i4 & 255);
                            i3 += 3;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                    i2 = i6;
                }
                int i8 = 0;
                while (i2 < pro.length()) {
                    int i9 = i2 + 1;
                    char charAt2 = pro.charAt(i2);
                    if (AbstractC7890e.yandex(charAt2, 32) > 0) {
                        if (charAt2 != '=') {
                            throw new IllegalStateException("Check failed.");
                        }
                        i8++;
                        i4 <<= 6;
                        i5++;
                    }
                    i2 = i9;
                }
                if (i5 == 4) {
                    bArr2[i3] = (byte) (i4 >> 16);
                    bArr2[i3 + 1] = (byte) ((i4 >> 8) & 255);
                    bArr2[i3 + 2] = (byte) (i4 & 255);
                    i3 = (i3 + 3) - i8;
                } else {
                    i = i5;
                }
                if (i != 0) {
                    throw new IllegalStateException(AbstractC1786e.admob(i, "buffered: ").toString());
                }
                if (i3 < length) {
                    copyOf = Arrays.copyOf(bArr2, i3);
                } else {
                    bArr = bArr2;
                }
            }
            bArr = copyOf;
        }
        return new C8633e(bArr);
    }
}
