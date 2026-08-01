package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ۠ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16551e extends AbstractC17557e implements RandomAccess, Serializable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ArrayList f32471e;

    public C16551e(List list) {
        this.f32471e = new ArrayList(list);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f32471e.get(i);
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        return this.f32471e.size();
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.f32471e.toArray(new Object[0]);
    }
}
