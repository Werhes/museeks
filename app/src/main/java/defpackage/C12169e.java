package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؐۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12169e extends AbstractMap {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C11797e f24462e = new C11797e(29);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String f24463e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C12403e f24464e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int[] f24465e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Integer f24466e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object[] f24467e;

    public C12169e() {
        List list = Collections.EMPTY_LIST;
        this.f24464e = new C12403e(this, -1);
        this.f24466e = null;
        this.f24463e = null;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw AbstractC5087e.m1747goto(it);
        }
        int size = list.size();
        Object[] objArr = new Object[size];
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw AbstractC5087e.m1747goto(it2);
        }
        int[] iArr = {0};
        this.f24467e = vip(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
        this.f24465e = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x016d, code lost:
    
        if (r8 < 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, eّؐۦ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [eّؐۦ] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12169e(defpackage.C12169e r21, defpackage.C12169e r22) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12169e.<init>(eّؐۦ, eّؐۦ):void");
    }

    public static boolean vip(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    public final int ad(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        C12403e c12403e = (C12403e) entry.getValue();
        int billing = c12403e.billing() - c12403e.appmetrica();
        System.arraycopy(c12403e.f24835e.f24467e, c12403e.appmetrica(), objArr, i2, billing);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new C12403e(this, i));
        int i3 = i2 + billing;
        iArr[i + 1] = i3;
        return i3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f24464e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f24466e == null) {
            this.f24466e = Integer.valueOf(super.hashCode());
        }
        return this.f24466e.intValue();
    }

    public final Map.Entry metrica(int i) {
        if (i < this.f24465e[0]) {
            return (Map.Entry) this.f24467e[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f24463e == null) {
            this.f24463e = super.toString();
        }
        return this.f24463e;
    }
}
