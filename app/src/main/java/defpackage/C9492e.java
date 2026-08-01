package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9492e {
    public final String ad;
    public final long appmetrica;
    public final boolean license;
    public final boolean metrica;
    public final Class vip;

    public C9492e(String str, Class cls, boolean z, boolean z2) {
        char charAt = str.charAt(0);
        if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
            if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '_'))) {
                throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
        this.ad = str;
        this.vip = cls;
        this.metrica = z;
        this.license = z2;
        int identityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (identityHashCode & 63);
            identityHashCode >>>= 6;
        }
        this.appmetrica = j;
    }

    public void ad(Iterator it, C16212e c16212e) {
        while (it.hasNext()) {
            vip(it.next(), c16212e);
        }
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.vip.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.ad;
        StringBuilder sb = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        AbstractC13501e.Signature(sb, name, "/", str, "[");
        return AbstractC1786e.signatures(sb, name2, "]");
    }

    public void vip(Object obj, C16212e c16212e) {
        c16212e.ad(obj, this.ad);
    }
}
