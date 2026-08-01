package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10779e {
    public static final ArrayList ad = AbstractC13480e.m3588implements(new AbstractC9848e('0', '9'), new AbstractC9848e('a', 'f'));

    public static final String ad(int i, int i2, byte[] bArr) {
        char[] cArr = new char[(i2 - i) * 2];
        int i3 = 0;
        while (i < i2) {
            byte b = bArr[i];
            int i4 = i3 + 1;
            ArrayList arrayList = ad;
            cArr[i3] = ((Character) arrayList.get((b >> 4) & 15)).charValue();
            i3 += 2;
            cArr[i4] = ((Character) arrayList.get(b & 15)).charValue();
            i++;
        }
        return new String(cArr);
    }
}
