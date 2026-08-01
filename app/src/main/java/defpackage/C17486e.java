package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؒؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17486e implements Iterable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f34283e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final HashMap f34281e = new HashMap();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Set f34280e = Collections.EMPTY_SET;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public List f34282e = Collections.EMPTY_LIST;

    public final int appmetrica(C15683e c15683e) {
        int intValue;
        synchronized (this.f34283e) {
            try {
                intValue = this.f34281e.containsKey(c15683e) ? ((Integer) this.f34281e.get(c15683e)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    public final void billing(C15683e c15683e) {
        synchronized (this.f34283e) {
            try {
                Integer num = (Integer) this.f34281e.get(c15683e);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f34282e);
                arrayList.remove(c15683e);
                this.f34282e = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f34281e.remove(c15683e);
                    HashSet hashSet = new HashSet(this.f34280e);
                    hashSet.remove(c15683e);
                    this.f34280e = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.f34281e.put(c15683e, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f34283e) {
            it = this.f34282e.iterator();
        }
        return it;
    }
}
