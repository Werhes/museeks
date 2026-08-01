package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ۟ۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10566e implements CharSequence {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ArrayList f20849e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f20850e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ArrayList f20851e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f20852e;

    static {
        C11883e c11883e = AbstractC4768e.ad;
    }

    public /* synthetic */ C10566e(String str) {
        this(str, C13664e.f27089e);
    }

    public C10566e(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }

    public C10566e(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f20852e = list;
        this.f20850e = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                C9363e c9363e = (C9363e) list.get(i);
                Object obj = c9363e.ad;
                if (obj instanceof C4282e) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c9363e);
                } else if (obj instanceof C6191e) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c9363e);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f20849e = arrayList;
        this.f20851e = arrayList2;
        List m3577else = arrayList2 != null ? AbstractC13480e.m3577else(arrayList2, new C11021e(9)) : null;
        if (m3577else == null || m3577else.isEmpty()) {
            return;
        }
        int i2 = ((C9363e) AbstractC13480e.m3591interface(m3577else)).metrica;
        C12452e c12452e = AbstractC13570e.ad;
        C12452e c12452e2 = new C12452e(1);
        c12452e2.ad(i2);
        int size2 = m3577else.size();
        for (int i3 = 1; i3 < size2; i3++) {
            C9363e c9363e2 = (C9363e) m3577else.get(i3);
            while (true) {
                if (c12452e2.vip != 0) {
                    int license = c12452e2.license();
                    int i4 = c9363e2.vip;
                    int i5 = c9363e2.metrica;
                    if (i4 >= license) {
                        c12452e2.appmetrica(c12452e2.vip - 1);
                    } else if (i5 > license) {
                        AbstractC5525e.ad("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + license);
                    }
                }
            }
            c12452e2.ad(c9363e2.metrica);
        }
    }

    public final List ad(int i) {
        List list = this.f20852e;
        if (list == null) {
            return C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            C9363e c9363e = (C9363e) obj;
            if ((c9363e.ad instanceof AbstractC9606e) && AbstractC13195e.vip(0, i, c9363e.vip, c9363e.metrica)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f20850e.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10566e)) {
            return false;
        }
        C10566e c10566e = (C10566e) obj;
        return AbstractC7890e.billing(this.f20850e, c10566e.f20850e) && AbstractC7890e.billing(this.f20852e, c10566e.f20852e);
    }

    public final int hashCode() {
        int hashCode = this.f20850e.hashCode() * 31;
        List list = this.f20852e;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f20850e.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        if (r3.isEmpty() != false) goto L29;
     */
    @Override // java.lang.CharSequence
    /* renamed from: metrica, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C10566e subSequence(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 > r12) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.AbstractC5525e.ad(r1)
        L26:
            java.lang.String r1 = r10.f20850e
            if (r11 != 0) goto L31
            int r4 = r1.length()
            if (r12 != r4) goto L31
            return r10
        L31:
            java.lang.String r1 = r1.substring(r11, r12)
            eَ۟ۢ r4 = defpackage.AbstractC13195e.ad
            if (r11 > r12) goto L3a
            goto L54
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r11)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            defpackage.AbstractC5525e.ad(r2)
        L54:
            java.util.List r2 = r10.f20852e
            if (r2 != 0) goto L59
            goto L99
        L59:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            int r4 = r2.size()
        L66:
            if (r0 >= r4) goto L93
            java.lang.Object r5 = r2.get(r0)
            eٍٍ۠ r5 = (defpackage.C9363e) r5
            int r6 = r5.vip
            int r7 = r5.metrica
            boolean r6 = defpackage.AbstractC13195e.vip(r11, r12, r6, r7)
            if (r6 == 0) goto L90
            eٍٍ۠ r6 = new eٍٍ۠
            java.lang.Object r8 = r5.ad
            int r9 = r5.vip
            int r9 = java.lang.Math.max(r11, r9)
            int r9 = r9 - r11
            int r7 = java.lang.Math.min(r12, r7)
            int r7 = r7 - r11
            java.lang.String r5 = r5.license
            r6.<init>(r8, r9, r7, r5)
            r3.add(r6)
        L90:
            int r0 = r0 + 1
            goto L66
        L93:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L9a
        L99:
            r3 = 0
        L9a:
            eَ۟ۢ r11 = new eَ۟ۢ
            r11.<init>(r3, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10566e.subSequence(int, int):eَ۟ۢ");
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f20850e;
    }

    public final C10566e vip(Function1 function1) {
        C9122e c9122e = new C9122e(this);
        ArrayList arrayList = c9122e.f18276e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C9363e c9363e = (C9363e) function1.invoke(((C9634e) arrayList.get(i)).ad(RecyclerView.UNDEFINED_DURATION));
            arrayList.set(i, new C9634e(c9363e.ad, c9363e.vip, c9363e.metrica, c9363e.license));
        }
        return c9122e.purchase();
    }
}
