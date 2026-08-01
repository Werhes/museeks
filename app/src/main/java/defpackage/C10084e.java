package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10084e extends C2672e implements InterfaceC6514e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f19907e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C11927e f19908e;

    public C10084e(C11927e c11927e, Object obj, Object obj2) {
        super(obj, obj2, 0);
        this.f19908e = c11927e;
        this.f19907e = obj2;
    }

    @Override // defpackage.C2672e, java.util.Map.Entry
    public final Object getValue() {
        return this.f19907e;
    }

    @Override // defpackage.C2672e, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f19907e;
        this.f19907e = obj;
        C3792e c3792e = (C3792e) this.f19908e.f23909e;
        C6556e c6556e = c3792e.f8400e;
        Object obj3 = this.f6546e;
        if (!c6556e.containsKey(obj3)) {
            return obj2;
        }
        boolean z = c3792e.f27965e;
        if (!z) {
            c6556e.put(obj3, obj);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            AbstractC13502e abstractC13502e = c3792e.f27967e[c3792e.f27966e];
            Object obj4 = abstractC13502e.f26780e[abstractC13502e.f26778e];
            c6556e.put(obj3, obj);
            c3792e.metrica(obj4 != null ? obj4.hashCode() : 0, c6556e.f13486e, obj4, 0);
        }
        c3792e.f8401e = c6556e.f13485e;
        return obj2;
    }
}
