package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6195e {
    public final List ad;
    public final List vip;

    public C6195e(List list, List list2) {
        this.ad = list;
        this.vip = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC13480e.m3608try(this.ad, ", ", null, null, null, 62));
        sb.append('(');
        return AbstractC4653e.applovin(sb, AbstractC13480e.m3608try(this.vip, ";", null, null, null, 62), ')');
    }
}
