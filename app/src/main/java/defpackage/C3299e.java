package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؚؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3299e extends ArrayList implements InterfaceC13961e {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC0023e) {
            return super.contains((InterfaceC0023e) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC0023e) {
            return super.indexOf((InterfaceC0023e) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC0023e) {
            return super.lastIndexOf((InterfaceC0023e) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof InterfaceC0023e) {
            return super.remove((InterfaceC0023e) obj);
        }
        return false;
    }
}
