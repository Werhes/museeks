package defpackage;

import java.util.AbstractSet;
import java.util.Collection;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16117e extends AbstractSet {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31714e;

    public /* synthetic */ AbstractC16117e(int i) {
        this.f31714e = i;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.f31714e) {
            case 0:
                return AbstractC6100e.amazon(this, collection);
            default:
                return AbstractC4107e.amazon(this, collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.f31714e) {
            case 0:
                collection.getClass();
                return super.retainAll(collection);
            default:
                collection.getClass();
                return super.retainAll(collection);
        }
    }
}
