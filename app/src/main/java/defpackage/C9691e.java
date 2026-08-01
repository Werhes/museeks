package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9691e extends AbstractC8592e implements Set {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C17249e f19186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9691e(C17249e c17249e, Object obj, Set set) {
        super(c17249e, obj, set, null);
        this.f19186e = c17249e;
    }

    @Override // defpackage.AbstractC8592e, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean amazon = AbstractC6100e.amazon((Set) this.f17413e, collection);
        if (amazon) {
            this.f19186e.f4931e += this.f17413e.size() - size;
            yandex();
        }
        return amazon;
    }
}
