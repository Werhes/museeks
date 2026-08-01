package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15363e {
    public final String ad;
    public final boolean metrica;
    public final List vip;

    public AbstractC15363e(String str, List list, boolean z) {
        this.ad = str;
        this.vip = DesugarCollections.unmodifiableList(list);
        this.metrica = z;
    }

    public abstract Object ad(List list);
}
