package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3131e extends AbstractC9359e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C0895e f7206e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7207e;

    public /* synthetic */ C3131e(C0895e c0895e, int i) {
        this.f7207e = i;
        this.f7206e = c0895e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f7207e) {
            case 0:
                throw new UnsupportedOperationException("CaseInsensitiveMap.entries does not support add");
            default:
                throw new UnsupportedOperationException("CaseInsensitiveMap.keys does not support add");
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f7207e) {
            case 0:
                if (AbstractC9476e.mopub(obj)) {
                    return super.contains((Map.Entry) obj);
                }
                return false;
            default:
                if (!(obj instanceof String)) {
                    return false;
                }
                return this.f7206e.containsKey((String) obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f7207e) {
            case 0:
                return new C14225e(this.f7206e, 0);
            default:
                return new C14225e(this.f7206e, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f7207e) {
            case 0:
                if (AbstractC9476e.mopub(obj)) {
                    return super.remove((Map.Entry) obj);
                }
                return false;
            default:
                if (obj instanceof String) {
                    return this.f7206e.remove((String) obj) != null;
                }
                return false;
        }
    }

    @Override // defpackage.AbstractC9359e
    public final int subs() {
        switch (this.f7207e) {
            case 0:
                return this.f7206e.f3290e;
            default:
                return this.f7206e.f3290e;
        }
    }
}
