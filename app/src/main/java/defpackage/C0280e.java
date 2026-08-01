package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280e {
    public final Integer ad = 5;
    public final C0568e metrica;
    public final Set vip;

    public C0280e(Set set, C0568e c0568e) {
        this.vip = set;
        this.metrica = c0568e;
    }

    public final boolean equals(Object obj) {
        return obj instanceof C0280e;
    }

    public final int hashCode() {
        return (int) 398591036;
    }

    public final String toString() {
        Integer num = this.ad;
        if (num == null) {
            return "398591036 without alias";
        }
        return "398591036 with alias " + num.intValue();
    }
}
