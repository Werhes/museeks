package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16064e extends LinkedHashMap {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f31631e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C4526e f31632e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11476e f31633e;

    public C16064e(C11476e c11476e, C4526e c4526e, int i) {
        super(10, 0.75f, true);
        this.f31633e = c11476e;
        this.f31632e = c4526e;
        this.f31631e = i;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (this.f31631e == 0) {
            return this.f31633e.invoke(obj);
        }
        synchronized (this) {
            Object obj2 = super.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            Object invoke = this.f31633e.invoke(obj);
            put(obj, invoke);
            return invoke;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        boolean z = super.size() > this.f31631e;
        if (z) {
            Object value = entry.getValue();
            this.f31632e.getClass();
            Unit unit = Unit.INSTANCE;
        }
        return z;
    }
}
