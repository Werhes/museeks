package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2380e extends AbstractC7118e {
    public static AbstractC7118e purchase(int i) {
        return i < 0 ? AbstractC7118e.vip : i > 0 ? AbstractC7118e.metrica : AbstractC7118e.ad;
    }

    @Override // defpackage.AbstractC7118e
    public final AbstractC7118e ad(int i, int i2) {
        return purchase(Integer.compare(i, i2));
    }

    @Override // defpackage.AbstractC7118e
    public final int appmetrica() {
        return 0;
    }

    @Override // defpackage.AbstractC7118e
    public final AbstractC7118e license(boolean z, boolean z2) {
        return purchase(Boolean.compare(z2, z));
    }

    @Override // defpackage.AbstractC7118e
    public final AbstractC7118e metrica(boolean z, boolean z2) {
        return purchase(Boolean.compare(z, z2));
    }

    @Override // defpackage.AbstractC7118e
    public final AbstractC7118e vip(Object obj, Object obj2, Comparator comparator) {
        return purchase(comparator.compare(obj, obj2));
    }
}
