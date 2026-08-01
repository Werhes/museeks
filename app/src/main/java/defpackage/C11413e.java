package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11413e implements Comparator, Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((C1548e) obj).metrica).compareTo(Long.valueOf(((C1548e) obj2).metrica));
    }
}
