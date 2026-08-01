package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٝؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2729e extends C5143e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C5930e f6625e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f6626e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f6627e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f6628e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2729e(defpackage.C5930e r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r3.f12509e
            eؙؚٟ r1 = r3.f12510e
            r2.<init>(r0, r1)
            r2.f6625e = r3
            int r3 = r1.f13485e
            r2.f6626e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2729e.<init>(eؘ۟ؕ):void");
    }

    @Override // defpackage.C5143e, java.util.Iterator
    public final Object next() {
        if (this.f6625e.f12510e.f13485e != this.f6626e) {
            throw new ConcurrentModificationException();
        }
        Object next = super.next();
        this.f6628e = next;
        this.f6627e = true;
        return next;
    }

    @Override // defpackage.C5143e, java.util.Iterator
    public final void remove() {
        if (!this.f6627e) {
            throw new IllegalStateException();
        }
        Object obj = this.f6628e;
        C5930e c5930e = this.f6625e;
        AbstractC9476e.vip(c5930e).remove(obj);
        this.f6628e = null;
        this.f6627e = false;
        this.f6626e = c5930e.f12510e.f13485e;
        this.f11023e--;
    }
}
