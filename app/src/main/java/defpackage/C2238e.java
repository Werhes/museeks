package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۦ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2238e implements AutoCloseable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C2673e f5695e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Set f5696e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C14400e f5697e;

    public C2238e(C14400e c14400e) {
        C1169e c1169e = c14400e.appmetrica;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(c1169e, 10));
        ListIterator listIterator = c1169e.listIterator(0);
        while (true) {
            C11045e c11045e = (C11045e) listIterator;
            if (!c11045e.hasNext()) {
                break;
            } else {
                arrayList.add(new C13269e(((C9050e) c11045e.next()).f18109e));
            }
        }
        Set m3582e = AbstractC13480e.m3582e(arrayList);
        this.f5697e = c14400e;
        this.f5696e = m3582e;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(c1169e, 10));
        ListIterator listIterator2 = c1169e.listIterator(0);
        while (true) {
            C11045e c11045e2 = (C11045e) listIterator2;
            if (!c11045e2.hasNext()) {
                AbstractC13480e.m3582e(arrayList2);
                this.f5695e = AbstractC14430e.metrica(false);
                return;
            }
            arrayList2.add(new C18319e(((C9050e) c11045e2.next()).f18108e));
        }
    }

    public final boolean ad() {
        if (!this.f5695e.ad()) {
            return false;
        }
        C14400e c14400e = this.f5697e;
        C8194e c8194e = c14400e.license;
        C1169e c1169e = c14400e.appmetrica;
        c8194e.m3039private();
        int subs = c1169e.subs();
        for (int i = 0; i < subs; i++) {
            C9050e c9050e = (C9050e) c1169e.get(i);
            if (this.f5696e.contains(new C13269e(c9050e.f18109e))) {
                c9050e.m3039private();
            }
        }
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ad();
    }

    public final void finalize() {
        if (ad()) {
            Log.e("CXCP", "Failed to close " + this + "! This indicates a memory leak and could cause the camera to stall, or images to be lost.");
        }
    }

    public final String toString() {
        return this.f5697e.toString();
    }
}
