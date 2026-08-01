package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10103e extends AbstractC10385e {
    public final ArrayList ad;

    public C10103e(ArrayList arrayList) {
        this.ad = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10103e) && this.ad.equals(((C10103e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "ArrayValue(" + this.ad + ')';
    }
}
