package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۧۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7618e extends AbstractC1687e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final transient int f15489e = 1;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient AbstractC9434e f15490e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient Object[] f15491e;

    public C7618e(AbstractC9434e abstractC9434e, Object[] objArr) {
        this.f15490e = abstractC9434e;
        this.f15491e = objArr;
    }

    @Override // defpackage.AbstractC10967e
    public final int appmetrica(Object[] objArr) {
        AbstractC6080e abstractC6080e = this.f4618e;
        if (abstractC6080e == null) {
            abstractC6080e = new C12420e(this);
            this.f4618e = abstractC6080e;
        }
        return abstractC6080e.appmetrica(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f15490e.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC6080e abstractC6080e = this.f4618e;
        if (abstractC6080e == null) {
            abstractC6080e = new C12420e(this);
            this.f4618e = abstractC6080e;
        }
        return abstractC6080e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15489e;
    }
}
